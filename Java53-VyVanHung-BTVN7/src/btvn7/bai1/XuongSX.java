package btvn7.bai1;

import java.util.Scanner;



public class XuongSX {
	private String tenXuong;
	private String quanDoc;
	private int soCongNhan;
	
	public void nhap() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap ten Xuong");
		tenXuong = sc.nextLine();
		System.out.println("Nhap Quan Doc");
		quanDoc = sc.nextLine();
		System.out.println("Nhap so Cong Nhan");
		soCongNhan = Integer.parseInt(sc.nextLine());
	}
	
	public static void label() {
		System.out.printf("%-10s %-8s %-7s ","Ten Xuong","Quan Doc","So CN");
	}
	
	public void xuat() {
		System.out.printf("%-13s %-10s %-7d ",tenXuong,quanDoc,soCongNhan);
	}
	
	//
	public XuongSX(String tenXuong, String quanDoc, int soCongNhan) {
		super();
		this.tenXuong = tenXuong;
		this.quanDoc = quanDoc;
		this.soCongNhan = soCongNhan;
	}
	
	//
	public XuongSX() {
		super();
	}

	public String getTenXuong() {
		return tenXuong;
	}

	public void setTenXuong(String tenXuong) {
		this.tenXuong = tenXuong;
	}

	public String getQuanDoc() {
		return quanDoc;
	}

	public void setQuanDoc(String quanDoc) {
		this.quanDoc = quanDoc;
	}

	public int getSoCongNhan() {
		return soCongNhan;
	}

	public void setSoCongNhan(int soCongNhan) {
		this.soCongNhan = soCongNhan;
	}
	
	
	
	
}
