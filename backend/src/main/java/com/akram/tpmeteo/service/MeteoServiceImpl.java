package com.akram.tpmeteo.service;

import com.akram.tpmeteo.model.Meteo;
import com.akram.tpmeteo.model.ReponseMeteo;
import com.akram.tpmeteo.model.ReponseVille;
import com.akram.tpmeteo.model.Ville;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MeteoServiceImpl implements MeteoService{

	private final RestClient restClient;
	public MeteoServiceImpl() {

		this.restClient = RestClient.create();
	}

	@Override
	public Ville getVille(String nom) {
		String url = "https://geocoding-api.open-meteo.com/v1/search?name="
				+ nom
				+ "&count=1&language=fr&format=json";
		ReponseVille reponseVille = restClient.get().uri(url).retrieve().body(ReponseVille.class);
		if(reponseVille == null || reponseVille.getResults() == null || reponseVille.getResults().isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ville introuvable");
		}
		return reponseVille.getResults().get(0);
	}

	@Override
	public ReponseMeteo getMeteo(double latitude, double longitude) {

		String url = "https://api.open-meteo.com/v1/forecast?latitude="+latitude+"&longitude="+longitude+"&current=temperature_2m,relative_humidity_2m,apparent_temperature,precipitation,wind_speed_10m,weather_code&daily=weather_code,temperature_2m_max,temperature_2m_min,precipitation_probability_max&timezone=auto";
		ReponseMeteo reponseMeteo = restClient.get().uri(url).retrieve().body(ReponseMeteo.class);
		return reponseMeteo;

	}

	@Override
	public ReponseMeteo getMeteoParVille(String nom) {
		Ville ville = getVille(nom);
		return getMeteo(ville.getLatitude(), ville.getLongitude());
	}


}
