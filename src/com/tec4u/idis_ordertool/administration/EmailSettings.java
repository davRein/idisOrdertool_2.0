/**
 * 
 */
package com.tec4u.idis_ordertool.administration;

import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * @author d.reinerts
 *
 */
@Named ("mail")
@SessionScoped
public class EmailSettings implements Serializable{

	private static final long serialVersionUID = -1453384931994008879L;
	private String strSMTP_Host = "";
	private String strProvider = "";
	private String strPort = "";
	private String strSourceMail = "";
	private String strPassword = "";
	private String strTargetMail = "";
	private String strSelectedServer = "";
	private boolean isChangeVisable = false;
	
	private String _strSMTP_Host = "";
	private String _strProvider = "";
	private String _strPort = "";
	private String _strSourceMail = "";
	private String _strPassword = "";
	
	public void getSelectedServer() {
		System.out.println(strSelectedServer);
	}
	
	public String getCurrentServer() {
		List<Mail> list = EmailDAO.getCurrentMailserver();
		if(list.isEmpty()) {
			System.out.println("EMPTY");
			return "None";
		} else {
			String strCurServer = list.get(0).getStrSMTP_Host() + " | " + list.get(0).getStrProvider();
			return strCurServer;
		}
	}
	
	public void changeFlag() {
		isChangeVisable = !isChangeVisable;
	}
	
	public void changeMailServer() {
		EmailDAO.changeMailServer(new Mail(_strSMTP_Host, _strProvider, _strPort, _strSourceMail, _strPassword), strSelectedServer);
	}
	
	public void splitServerDetailsList() {
		List<Mail> mailServerDetails = EmailDAO.getMailServerDetails();
		for (Mail mail : mailServerDetails) {
			_strSMTP_Host = mail.getStrSMTP_Host();
			_strProvider = mail.getStrProvider();
			_strPort = mail.getStrPort();
			_strSourceMail = mail.getStrSourceMail();
			_strPassword = mail.getStrPwd();
		}
	}
	
	
	
	public void activateMailServer() {
		EmailDAO.activateMailSettings(strSelectedServer);
	}
	
	public List<Mail> getEmailServerConfigurations(){
		List<Mail> settingsList = EmailDAO.getMailSettings();
		return settingsList;
	}
	
	public void addMailServer() {
		System.out.println("EMAIL SETTINGS");
		EmailDAO.addMailServer(strSMTP_Host, strProvider, strPort, strSourceMail, strPassword);
	}

	/**
	 * @return the strSMTP_Host
	 */
	public String getStrSMTP_Host() {
		return strSMTP_Host;
	}

	/**
	 * @param strSMTP_Host the strSMTP_Host to set
	 */
	public void setStrSMTP_Host(String strSMTP_Host) {
		this.strSMTP_Host = strSMTP_Host;
	}

	/**
	 * @return the strProvider
	 */
	public String getStrProvider() {
		return strProvider;
	}

	/**
	 * @param strProvider the strProvider to set
	 */
	public void setStrProvider(String strProvider) {
		this.strProvider = strProvider;
	}

	/**
	 * @return the strPort
	 */
	public String getStrPort() {
		return strPort;
	}

	/**
	 * @param strPort the strPort to set
	 */
	public void setStrPort(String strPort) {
		this.strPort = strPort;
	}

	/**
	 * @return the strSourceMail
	 */
	public String getStrSourceMail() {
		return strSourceMail;
	}

	/**
	 * @param strSourceMail the strSourceMail to set
	 */
	public void setStrSourceMail(String strSourceMail) {
		this.strSourceMail = strSourceMail;
	}

	/**
	 * @return the strPassword
	 */
	public String getStrPassword() {
		return strPassword;
	}

	/**
	 * @param strPassword the strPassword to set
	 */
	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	/**
	 * @return the strTargetMail
	 */
	public String getStrTargetMail() {
		return strTargetMail;
	}

	/**
	 * @param strTargetMail the strTargetMail to set
	 */
	public void setStrTargetMail(String strTargetMail) {
		this.strTargetMail = strTargetMail;
	}

	/**
	 * @return the strSelectedServer
	 */
	public String getStrSelectedServer() {
		return strSelectedServer;
	}

	/**
	 * @param strSelectedServer the strSelectedServer to set
	 */
	public void setStrSelectedServer(String strSelectedServer) {
		this.strSelectedServer = strSelectedServer;
	}

	/**
	 * @return the isChangeVisable
	 */
	public boolean isChangeVisable() {
		return isChangeVisable;
	}

	/**
	 * @param isChangeVisable the isChangeVisable to set
	 */
	public void setChangeVisable(boolean isChangeVisable) {
		this.isChangeVisable = isChangeVisable;
	}

	/**
	 * @return the _strSMTP_Host
	 */
	public String get_strSMTP_Host() {
		return _strSMTP_Host;
	}

	/**
	 * @return the _strProvider
	 */
	public String get_strProvider() {
		return _strProvider;
	}

	/**
	 * @return the _strPort
	 */
	public String get_strPort() {
		return _strPort;
	}

	/**
	 * @return the _strSourceMail
	 */
	public String get_strSourceMail() {
		return _strSourceMail;
	}

	/**
	 * @return the _strPassword
	 */
	public String get_strPassword() {
		return _strPassword;
	}

	/**
	 * @param _strSMTP_Host the _strSMTP_Host to set
	 */
	public void set_strSMTP_Host(String _strSMTP_Host) {
		this._strSMTP_Host = _strSMTP_Host;
	}

	/**
	 * @param _strProvider the _strProvider to set
	 */
	public void set_strProvider(String _strProvider) {
		this._strProvider = _strProvider;
	}

	/**
	 * @param _strPort the _strPort to set
	 */
	public void set_strPort(String _strPort) {
		this._strPort = _strPort;
	}

	/**
	 * @param _strSourceMail the _strSourceMail to set
	 */
	public void set_strSourceMail(String _strSourceMail) {
		this._strSourceMail = _strSourceMail;
	}

	/**
	 * @param _strPassword the _strPassword to set
	 */
	public void set_strPassword(String _strPassword) {
		this._strPassword = _strPassword;
	}
	
	
	
}
