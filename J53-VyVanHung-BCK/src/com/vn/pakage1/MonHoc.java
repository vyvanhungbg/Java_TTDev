package com.vn.pakage1;

import java.util.ArrayList;

public class MonHoc {
	private String maMonHoc ;
	private String tenMonHoc;
	private double heSoMon;
	public MonHoc() {
		super();
	}
	public MonHoc(String maMonHoc, String tenMonHoc, double heSoMon) {
		super();
		this.maMonHoc = maMonHoc;
		this.tenMonHoc = tenMonHoc;
		this.heSoMon = heSoMon;
	}
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}
	public String getTenMonHoc() {
		return tenMonHoc;
	}
	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}
	public double getHeSoMon() {
		return heSoMon;
	}
	public void setHeSoMon(double heSoMon) {
		this.heSoMon = heSoMon;
	}
	
	public static void TieuDe() {
		System.out.printf("%-10s %-10s %-10s %n","Ma MH","Ten MH","He So MH");
	}
	public void xuat() {
		System.out.printf("%-10s %-10s %-10.3f %n",maMonHoc,tenMonHoc,heSoMon);
	}
	 
	
}
