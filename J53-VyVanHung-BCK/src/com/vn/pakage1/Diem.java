package com.vn.pakage1;

import java.util.ArrayList;

public class Diem {
	
	private String maSinhVien;
	private String maMonHoc;
	private double diemSo;
	public Diem() {
		super();
	}
	public Diem(String maSinhVien, String maMonHoc, double diemSo) {
		super();
		this.maSinhVien = maSinhVien;
		this.maMonHoc = maMonHoc;
		this.diemSo = diemSo;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getMaMonHoc() {
		return maMonHoc;
	}
	public void setMaMonHoc(String maMonHoc) {
		this.maMonHoc = maMonHoc;
	}
	public double getDiemSo() {
		return diemSo;
	}
	public void setDiemSo(double diemSo) {
		this.diemSo = diemSo;
	}
	
	
}
