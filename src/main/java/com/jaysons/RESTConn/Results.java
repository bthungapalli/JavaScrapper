package com.jaysons.RESTConn;

import java.util.List;

public class Results {
	private int vehicleId;
	private int modelYear;
	private String make;
	private String vehicleModel;
	private String trim;
	private String series;
	private String safetyIssues;
	private List<Recalls> recalls;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getTrim() {
		return trim;
	}
	public void setTrim(String trim) {
		this.trim = trim;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public String getSafetyIssues() {
		return safetyIssues;
	}
	public void setSafetyIssues(String safetyIssues) {
		this.safetyIssues = safetyIssues;
	}
	public List<Recalls> getRecalls() {
		return recalls;
	}
	public void setRecalls(List<Recalls> recalls) {
		this.recalls = recalls;
	}
	
	

}
