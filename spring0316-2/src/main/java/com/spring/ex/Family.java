package com.spring.ex;

public class Family {
	String papaName;
	String mamaName;
	String sisName;
	String broName;
	public Family(String papaName, String mamaName) {
		super();
		this.papaName = papaName;
		this.mamaName = mamaName;
	}
	public String getPapaName() {
		return papaName;
	}
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	public String getMamaName() {
		return mamaName;
	}
	public void setMamaName(String mamaName) {
		this.mamaName = mamaName;
	}
	public String getSisName() {
		return sisName;
	}
	public void setSisName(String sisName) {
		this.sisName = sisName;
	}
	public String getBroName() {
		return broName;
	}
	public void setBroName(String broName) {
		this.broName = broName;
	}
}
