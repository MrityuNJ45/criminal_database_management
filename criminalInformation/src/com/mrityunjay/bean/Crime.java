package com.mrityunjay.bean;

public class Crime {
	
	
	private String date;
	private String place;
	private String description;
	private String victims;
	private String detailDescription;
	private String suspect;
	

	public Crime() {
		super();
	}
	public Crime(String date, String place, String description, String victims, String detailDescription,
			String suspect) {
		super();
		this.date = date;
		this.place = place;
		this.description = description;
		this.victims = victims;
		this.detailDescription = detailDescription;
		this.suspect = suspect;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVictims() {
		return victims;
	}
	@Override
	public String toString() {
		return "Crime [date=" + date + ", place=" + place + ", description=" + description + ", victims=" + victims
				+ ", detailDescription=" + detailDescription + ", suspect=" + suspect + "]";
	}
	public void setVictims(String victims) {
		this.victims = victims;
	}
	public String getDetailDescription() {
		return detailDescription;
	}
	public void setDetailDescription(String detailDescription) {
		this.detailDescription = detailDescription;
	}
	public String getSuspect() {
		return suspect;
	}
	public void setSuspect(String suspect) {
		this.suspect = suspect;
	}
	
	
}
