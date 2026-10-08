package com.akram.tpmeteo.service;

import com.akram.tpmeteo.model.Meteo;
import com.akram.tpmeteo.model.ReponseMeteo;
import com.akram.tpmeteo.model.Ville;

public interface MeteoService {
	Ville getVille(String nom);
	ReponseMeteo getMeteo(double latitude, double longitude);
	ReponseMeteo getMeteoParVille(String nom);
}
