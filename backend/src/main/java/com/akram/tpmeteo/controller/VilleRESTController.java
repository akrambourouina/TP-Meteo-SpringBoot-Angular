package com.akram.tpmeteo.controller;

import com.akram.tpmeteo.model.Meteo;
import com.akram.tpmeteo.model.ReponseMeteo;
import com.akram.tpmeteo.model.Ville;
import com.akram.tpmeteo.service.MeteoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/meteo")
public class VilleRESTController {
	private final MeteoService meteoService;
	public VilleRESTController(MeteoService meteoService) {
		this.meteoService = meteoService;
	}

	@GetMapping("/{nom}")
	public Ville getVille( @PathVariable String nom){
		return meteoService.getVille(nom);
	}
	@GetMapping("/{latitude}"+"/{longitude}")
	public ReponseMeteo getMeteo(@PathVariable Double latitude, @PathVariable Double longitude){
		return meteoService.getMeteo(latitude,longitude);
	}

	@GetMapping("/ville/{nom}")
	public ReponseMeteo getMeteoParVille(@PathVariable String nom){
		return meteoService.getMeteoParVille(nom);
	}
}
