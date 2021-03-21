package btvn7.bai1;

import java.util.Scanner;

public abstract class NhanSu {
	static Scanner sc = new Scanner(System.in);
	protected int maNs;
	protected String hoDem;
	protected String ten;
	protected int namSinh;
	protected String gioiTinh;
	
	public abstract double luong();
	
	// input & output
	
	public  void input() {
		System.out.println("Nhap vao ma nhan su");
		maNs = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap vao ho dem");
		hoDem = sc.nextLine();
		System.out.println("Nhap vao ten");
		ten = sc.nextLine();
		System.out.println("Nhap vao Nam Sinh");
		namSinh = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap gioi tinh");
		gioiTinh = sc.nextLine();
	}
	
	public static void label() {
		System.out.printf("%-8s %-10s %-8s %-8s %-12s","MaNs","Ho Dem","Ten","Nam Sinh","Gioi Tinh");
		
	}
	
	public  void output() {
		System.out.printf("%-8d %-10s %-8s %-8d %-12s",maNs,hoDem,ten,namSinh,gioiTinh);
	}
	
	//constructor
	public NhanSu(int maNs, String hoDem, String ten, int namSinh, String gioiTinh) {
		super();
		this.maNs = maNs;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
	}
	 

	// getter and setter
	public NhanSu() {
		super();
	}

	public int getMaNs() {
		return maNs;
	}

	public void setMaNs(int maNs) {
		this.maNs = maNs;
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
	
	
	 





	
	
	
}
