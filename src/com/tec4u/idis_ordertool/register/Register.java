package com.tec4u.idis_ordertool.register;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named ("reg")
@RequestScoped
public class Register implements Serializable{

	
	private static final long serialVersionUID = -4044249485026031661L;
	
	private String strFirstName = "";
	private String strLastName = "";
	private String strMailAddress = "";
	private String strLanguage = "";
	private String strCompany = "";
	private String strPhone = "";
	private String strAddress = "";
	private String strZip = "";
	private String strCity = "";
	private String strCountry = "";
	private String strOrderAs = "";
	private String strActivity = "";
	private String strDate = "";
	private String nStatus = "8";
	/**
	 * @return the strFirstName
	 */
	
	private String[] makeArray() {
		strDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")).toString();
		String[] regARR = {strFirstName, strLastName, strMailAddress, strLanguage, strCompany, strPhone, strAddress, strZip, strCity, strCountry, strOrderAs, strActivity, strDate, nStatus};
		return regARR;
	}
	
	public void insertRegistration() {
		RegisterDAO.insertRegistration(makeArray());
	}
	
	
	public String getStrFirstName() {
		return strFirstName;
	}
	/**
	 * @param strFirstName the strFirstName to set
	 */
	public void setStrFirstName(String strFirstName) {
		this.strFirstName = strFirstName;
	}
	/**
	 * @return the strLastName
	 */
	public String getStrLastName() {
		return strLastName;
	}
	/**
	 * @param strLastName the strLastName to set
	 */
	public void setStrLastName(String strLastName) {
		this.strLastName = strLastName;
	}
	/**
	 * @return the strMailAddress
	 */
	public String getStrMailAddress() {
		return strMailAddress;
	}
	/**
	 * @param strMailAddress the strMailAddress to set
	 */
	public void setStrMailAddress(String strMailAddress) {
		this.strMailAddress = strMailAddress;
	}
	/**
	 * @return the strLanguage
	 */
	public String getStrLanguage() {
		return strLanguage;
	}
	/**
	 * @param strLanguage the strLanguage to set
	 */
	public void setStrLanguage(String strLanguage) {
		this.strLanguage = strLanguage;
	}
	/**
	 * @return the strCompany
	 */
	public String getStrCompany() {
		return strCompany;
	}
	/**
	 * @param strCompany the strCompany to set
	 */
	public void setStrCompany(String strCompany) {
		this.strCompany = strCompany;
	}
	/**
	 * @return the strPhone
	 */
	public String getStrPhone() {
		return strPhone;
	}
	/**
	 * @param strPhone the strPhone to set
	 */
	public void setStrPhone(String strPhone) {
		this.strPhone = strPhone;
	}
	/**
	 * @return the strAddress
	 */
	public String getStrAddress() {
		return strAddress;
	}
	/**
	 * @param strAddress the strAddress to set
	 */
	public void setStrAddress(String strAddress) {
		this.strAddress = strAddress;
	}
	/**
	 * @return the strZip
	 */
	public String getStrZip() {
		return strZip;
	}
	/**
	 * @param strZip the strZip to set
	 */
	public void setStrZip(String strZip) {
		this.strZip = strZip;
	}
	/**
	 * @return the strCity
	 */
	public String getStrCity() {
		return strCity;
	}
	/**
	 * @param strCity the strCity to set
	 */
	public void setStrCity(String strCity) {
		this.strCity = strCity;
	}
	/**
	 * @return the strCountry
	 */
	public String getStrCountry() {
		return strCountry;
	}
	/**
	 * @param strCountry the strCountry to set
	 */
	public void setStrCountry(String strCountry) {
		this.strCountry = strCountry;
	}
	/**
	 * @return the strOrderAs
	 */
	public String getStrOrderAs() {
		return strOrderAs;
	}
	/**
	 * @param strOrderAs the strOrderAs to set
	 */
	public void setStrOrderAs(String strOrderAs) {
		this.strOrderAs = strOrderAs;
	}
	/**
	 * @return the strActivity
	 */
	public String getStrActivity() {
		return strActivity;
	}
	/**
	 * @param strActivity the strActivity to set
	 */
	public void setStrActivity(String strActivity) {
		this.strActivity = strActivity;
	}
	
	
	
}


