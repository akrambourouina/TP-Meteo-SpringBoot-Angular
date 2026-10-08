package com.akram.tpmeteo.model;

public class Ville {

	private  String  name;
	private  Double latitude;
	private  Double longitude;
	private String  country;

	public Ville() {
	}

	public Ville(Double latitude, String name, Double longitude, String country) {
		this.latitude = latitude;
		this.name = name;
		this.longitude = longitude;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Ville{" +
				"name='" + name + '\'' +
				", latitude=" + latitude +
				", longitude=" + longitude +
				", country='" + country + '\'' +
				'}';
	}
}
