package com.jaysons.RESTConn;

import java.util.Date;
import java.util.List;

public class Recalls {
	private int id;
	  private String manufacturer;
	  private String mfrCampaignNumber;
	  private String nhtsaCampaignNumber;
	  private Date reportReceivedDate;
	  private String subject;
	  private String summary;
	  private String consequence;
	  private String correctiveAction;
	  private int potentialNumberOfUnitsAffected;
	  private String notes;
	  private int associatedDocumentsCount;
	  private String associatedDocuments;
	  private int associatedProductsCount;
	  private String associatedProducts;
	private List<Components> components;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getMfrCampaignNumber() {
		return mfrCampaignNumber;
	}
	public void setMfrCampaignNumber(String mfrCampaignNumber) {
		this.mfrCampaignNumber = mfrCampaignNumber;
	}
	public String getNhtsaCampaignNumber() {
		return nhtsaCampaignNumber;
	}
	public void setNhtsaCampaignNumber(String nhtsaCampaignNumber) {
		this.nhtsaCampaignNumber = nhtsaCampaignNumber;
	}
	public Date getReportReceivedDate() {
		return reportReceivedDate;
	}
	public void setReportReceivedDate(Date reportReceivedDate) {
		this.reportReceivedDate = reportReceivedDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getConsequence() {
		return consequence;
	}
	public void setConsequence(String consequence) {
		this.consequence = consequence;
	}
	public String getCorrectiveAction() {
		return correctiveAction;
	}
	public void setCorrectiveAction(String correctiveAction) {
		this.correctiveAction = correctiveAction;
	}
	public int getPotentialNumberOfUnitsAffected() {
		return potentialNumberOfUnitsAffected;
	}
	public void setPotentialNumberOfUnitsAffected(int potentialNumberOfUnitsAffected) {
		this.potentialNumberOfUnitsAffected = potentialNumberOfUnitsAffected;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getAssociatedDocumentsCount() {
		return associatedDocumentsCount;
	}
	public void setAssociatedDocumentsCount(int associatedDocumentsCount) {
		this.associatedDocumentsCount = associatedDocumentsCount;
	}
	public String getAssociatedDocuments() {
		return associatedDocuments;
	}
	public void setAssociatedDocuments(String associatedDocuments) {
		this.associatedDocuments = associatedDocuments;
	}
	public int getAssociatedProductsCount() {
		return associatedProductsCount;
	}
	public void setAssociatedProductsCount(int associatedProductsCount) {
		this.associatedProductsCount = associatedProductsCount;
	}
	public String getAssociatedProducts() {
		return associatedProducts;
	}
	public void setAssociatedProducts(String associatedProducts) {
		this.associatedProducts = associatedProducts;
	}
	public List<Components> getComponents() {
		return components;
	}
	public void setComponents(List<Components> components) {
		this.components = components;
	}
	
	

}
