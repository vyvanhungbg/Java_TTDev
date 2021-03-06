package vn.devpro.day1.java;

import java.util.Scanner;

public class BaiTap7 {
	private String maCanBo;
	private String hoVaTen;
	private String ngaySinh;
	private int soNgayLam;
	private double soGioLamThem;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ma CB : ");
		maCanBo = sc.nextLine();
		System.out.print("Nhap Ho va Ten : ");
		hoVaTen = sc.nextLine();
		System.out.print("Nhap Ngay Sinh : ");
		ngaySinh = sc.nextLine();
		System.out.print("Nhap So Ngay Lam : ");
		soNgayLam = Integer.parseInt(sc.nextLine().trim());
		System.out.print("Nhap So Gio Lam Them : ");
		soGioLamThem = Double.parseDouble(sc.nextLine().trim());
		
	}
	
	public void xuat() {
		double luong = soNgayLam*350000 + soGioLamThem*45000;
		System.out.printf("%-7s %-10s %-10s %-10s %-10s %-10s %n","MaCanBo","HoVaTen","NgaySinh","NgayLam","GioLmThem","Luong");
		System.out.printf("%-7s %-10s %-10s %-10d %-10.2f %-10.2f %n",maCanBo,hoVaTen,ngaySinh,soNgayLam,soGioLamThem,luong);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaiTap7 x = new BaiTap7();
		x.nhap();
		x.xuat();
	}

}
