package devpro.btvn6;

import java.util.Scanner;

public class HangHoa {
	private String tenHang;
	private int soLuong;
	private double donGia;
	
	static void Nhap(HangHoa hh) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ten Hang : ");
		hh.tenHang = sc.nextLine();
		System.out.println("Nhap SL Hang : ");
		hh.soLuong = Integer.parseInt(sc.nextLine().trim());
		System.out.println("Nhap ĐG Hang : ");
		hh.donGia = Double.parseDouble(sc.nextLine().trim());
	}
	
	
	
	public int getSoLuong() {
		return soLuong;
	}


	public double getDonGia() {
		return donGia;
	}


	static void Lable(){
		System.out.printf("%n%-10s  %-10s  %-10s  %-10s","Ten Hang","SL Hang","Đon Gia","Thanh Tien");
	}
	
	static void Xuat(HangHoa hh) {
		System.out.printf("%n%-10s  %-10d  %-10.3f  %-10.3f",hh.tenHang,hh.soLuong,hh.donGia,hh.donGia*hh.soLuong);
	}
}
