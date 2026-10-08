package com.akram.tpmeteo.model;

public class Meteo {

	private String time;
	private  Integer interval;
	private Double  temperature_2m;
	private Integer relative_humidity_2m;
	private  Double apparent_temperature;
	private Double precipitation;
	private Double wind_speed_10m;
	private Integer weather_code;

	public Meteo() {
	}

	public Meteo(String time, Integer interval, Double  temperature_2m, Integer relative_humidity_2m, Double apparent_temperature, Double precipitation, Double wind_speed_10m, Integer weather_code) {
		this.time = time;
		this.interval = interval;
		this.temperature_2m = temperature_2m;
		this.relative_humidity_2m = relative_humidity_2m;
		this.apparent_temperature = apparent_temperature;
		this.precipitation = precipitation;
		this.wind_speed_10m = wind_speed_10m;
		this.weather_code = weather_code;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getRelative_humidity_2m() {
		return relative_humidity_2m;
	}

	public void setRelative_humidity_2m(Integer relative_humidity_2m) {
		this.relative_humidity_2m = relative_humidity_2m;
	}

	public Double  getTemperature_2m() {
		return temperature_2m;
	}

	public void setTemperature_2m(Double  temperature_2m) {
		this.temperature_2m = temperature_2m;
	}

	public Double getApparent_temperature() {
		return apparent_temperature;
	}

	public void setApparent_temperature(Double apparent_temperature) {
		this.apparent_temperature = apparent_temperature;
	}

	public Double getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(Double precipitation) {
		this.precipitation = precipitation;
	}

	public Double getWind_speed_10m() {
		return wind_speed_10m;
	}

	public void setWind_speed_10m(Double wind_speed_10m) {
		this.wind_speed_10m = wind_speed_10m;
	}

	public Integer getWeather_code() {
		return weather_code;
	}

	public void setWeather_code(Integer weather_code) {
		this.weather_code = weather_code;
	}
}
