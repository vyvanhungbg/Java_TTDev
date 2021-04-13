package com.vn.pakage1;

import java.util.ArrayList;

public class SinhVien {
	
	private String maSinhVien;
	private String hoDem;
	private String ten;
	private int namSinh;
	private String gioiTinh;
	
	
	public SinhVien() {
		super();
	}


	public SinhVien(String maSinhVien, String hoDem, String ten, int namSinh, String gioiTinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}


	public String getMaSinhVien() {
		return maSinhVien;
	}


	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}


	public String getHoDem() {
		return hoDem;
	}


	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public int getNamSinh() {
		return namSinh;
	}


	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	public static void TieuDe() {
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %n","Ma SV","Ho Dem","Ten","Nam Sinh","Gioi Tinh");
	}
	public void xuat() {
		System.out.printf("%-10s %-10s %-10s %-10d %-10s %n",maSinhVien,hoDem,ten,namSinh,gioiTinh);
	}
	
}
