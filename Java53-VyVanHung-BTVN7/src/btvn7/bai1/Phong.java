package btvn7.bai1;

import java.util.Scanner;

public class Phong {
	private String tenPhong;
	private String truongPhong;
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten Phong");
		tenPhong = sc.nextLine();
		System.out.println("Nhap truong Phong");
		truongPhong = sc.nextLine();
	}
	
	public static void label() {
		System.out.printf("%-13s %-10s ","Ten Phong","Trg Phong");
	}
	
	public void xuat() {
		System.out.printf("%-13s %-10s ",tenPhong,truongPhong);
	}
	
	//
	public Phong(String tenPhong, String truongPhong) {
		super();
		this.tenPhong = tenPhong;
		this.truongPhong = truongPhong;
	}
	public Phong() {
		super();
	}
	
	//
	public String getTenPhong() {
		return tenPhong;
	}
	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}
	public String getTruongPhong() {
		return truongPhong;
	}
	public void setTruongPhong(String truongPhong) {
		this.truongPhong = truongPhong;
	}
	
	
}
