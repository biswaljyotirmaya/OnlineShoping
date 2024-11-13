package com.jb.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AdminBean implements Serializable {
	private String aname, apass, afname, alname, amail, adddress, aphone;

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApass() {
		return apass;
	}

	public void setApass(String apass) {
		this.apass = apass;
	}

	public String getAfname() {
		return afname;
	}

	public void setAfname(String afname) {
		this.afname = afname;
	}

	public String getAlname() {
		return alname;
	}

	public void setAlname(String alname) {
		this.alname = alname;
	}

	public String getAmail() {
		return amail;
	}

	public void setAmail(String amail) {
		this.amail = amail;
	}

	public String getAdddress() {
		return adddress;
	}

	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}

	public String getAphone() {
		return aphone;
	}

	public void setAphone(String aphone) {
		this.aphone = aphone;
	}

	public AdminBean() {
	}

}
