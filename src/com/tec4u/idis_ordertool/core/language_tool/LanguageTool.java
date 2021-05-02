package com.tec4u.idis_ordertool.core.language_tool;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named ("lang")
@RequestScoped
public class LanguageTool implements Serializable{
	
	private static final long serialVersionUID = 4769509204558723764L;
	private String strIdentifier = "";
	private String strValue_en = "";
	private String strValue_ger = "";
	/**
	 * @return the strIdentifier
	 */
	public String getStrIdentifier() {
		return strIdentifier;
	}
	/**
	 * @param strIdentifier the strIdentifier to set
	 */
	public void setStrIdentifier(String strIdentifier) {
		this.strIdentifier = strIdentifier;
	}
	/**
	 * @return the strValue_en
	 */
	public String getStrValue_en() {
		return strValue_en;
	}
	/**
	 * @param strValue_en the strValue_en to set
	 */
	public void setStrValue_en(String strValue_en) {
		this.strValue_en = strValue_en;
	}
	/**
	 * @return the strValue_ger
	 */
	public String getStrValue_ger() {
		return strValue_ger;
	}
	/**
	 * @param strValue_ger the strValue_ger to set
	 */
	public void setStrValue_ger(String strValue_ger) {
		this.strValue_ger = strValue_ger;
	}
	
	public void saveToDb() {
		LanguageToolDAO.addTranslation(strIdentifier, strValue_en, strValue_ger);
	}
}
