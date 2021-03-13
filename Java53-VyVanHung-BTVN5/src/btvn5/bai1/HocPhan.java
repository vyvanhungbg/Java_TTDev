package btvn5.bai1;

import java.util.Scanner;

public class HocPhan {
	static Scanner sc = new Scanner(System.in);
	private String maHP;
	private String tenHP;
	private int soTC;
	private double diem;
	
	
	
	
	public String getMaHP() {
		return maHP;
	}

	public void setMaHP(String maHP) {
		this.maHP = maHP;
	}

	public String getTenHP() {
		return tenHP;
	}

	public void setTenHP(String tenHP) {
		this.tenHP = tenHP;
	}

	public int getSoTC() {
		return soTC;
	}

	public void setSoTC(int soTC) {
		this.soTC = soTC;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	
	
	public HocPhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HocPhan(String maHP, String tenHP, int soTC, double diem) {
		super();
		this.maHP = maHP;
		this.tenHP = tenHP;
		this.soTC = soTC;
		this.diem = diem;
	}

	public void nhap() {
		System.out.println("Nhap ma HP : ");
		maHP = sc.nextLine();
		System.out.println("Nhap ma ten HP : ");
		tenHP = sc.nextLine();
		System.out.println("Nhap so TC : ");
		soTC = Integer.parseInt(sc.nextLine()) ;
		System.out.println("Nhap diem : ");
		diem = Double.parseDouble(sc.nextLine());
	}
	
	public static  void lable() {
		System.out.printf("%-10s %-10s %-10s %-10s %n","maHP","tenHP","soTC","diem");
	}
	
	public void display() {
		System.out.printf("%-10s %-10s %-10d %-10.2f %n",maHP,tenHP,soTC,diem);
	}
	
	
}
