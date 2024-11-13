package com.jb.model;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private String pcode, pname, pcomp;
	private double price;
	private Integer pqnt;
	private byte[] image;

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcomp() {
		return pcomp;
	}

	public void setPcomp(String pcomp) {
		this.pcomp = pcomp;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getPqnt() {
		return pqnt;
	}

	public void setPqnt(Integer pqnt) {
		this.pqnt = pqnt;
	}

	public ProductBean() {

	}

	@Override
	public String toString() {
		return "pcode=" + pcode + ", pname=" + pname + ", pcomp=" + pcomp + ", price=" + price + ", pqnt=" + pqnt;
	}

}
