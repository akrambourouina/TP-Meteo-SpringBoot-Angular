package com.akram.tpmeteo.model;

import java.util.List;

public class ReponseMeteo {

	private  Double latitude;
	private  Double longitude;
	private  Meteo current ;
	private Prevision daily;

	public ReponseMeteo() {
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Meteo getCurrent() {
		return current;
	}

	public void setCurrent(Meteo current) {
		this.current = current;
	}

	public Prevision getDaily() {
		return daily;
	}

	public void setDaily(Prevision daily) {
		this.daily = daily;
	}
}
