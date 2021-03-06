package devpro.btvn5;

import java.util.Scanner;

public class SinhVien {
	private String maSV;
	private String hoDem;
	private String ten;
	private String ngaySinh;
	private MonHoc [] monHoc = new MonHoc[5];
	
	SinhVien() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<5;i++) {
			monHoc[i] = new MonHoc();
		}
	}
	
	static void Nhap(SinhVien sv) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap Ma SV : ");
		sv.maSV = scan.nextLine();
		System.out.println("Nhap Ho dem SV : ");
		sv.hoDem = scan.nextLine();
		System.out.println("Nhap Ten SV : ");
		sv.ten = scan.nextLine();
		System.out.println("Nhap Ngay Sinh SV : ");
		sv.ngaySinh = scan.nextLine();
		for(int i=0;i<5;i++) {
			sv.monHoc[i].Nhap(sv.monHoc[i]);
		}
	}
	
	static void Lable() {
		System.out.printf("%-10s  %-10s  %-10s %-10s  %n","Ma SV","Ho Dem SV","Ten SV","Ngay Sinh");
	}
	
	static void Xuat(SinhVien sv) {
		SinhVien.Lable();
		System.out.printf("%n%-10s  %-10s  %-10s %-10s  %n",sv.maSV,sv.hoDem,sv.ten,sv.ngaySinh);
		MonHoc.Lable();
		for(int i=0;i<5;i++) {
			sv.monHoc[i].Xuat(sv.monHoc[i]);
		}
		
	}
	
	static void DiemTB(SinhVien sv) {
		double Tu =0,Mau=0;
		for(int i=0;i<5;i++) {
			Tu+=sv.monHoc[i].getDiem()*sv.monHoc[i].getHeSo();
			Mau+=sv.monHoc[i].getHeSo();
		}
		System.out.printf("%nDiem TB Hoc Sinh La : %.3f",Tu/Mau);
	}
}
