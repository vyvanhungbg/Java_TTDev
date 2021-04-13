package com.vn.pakage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyDiem {
	static ArrayList<Diem> list = new ArrayList<Diem>();
//	public static void main(String[] args) {
//		QuanLy();
//		// hien thi bang diem phai lien ket voi 2 bang kia
//	}

	protected static void QuanLy() {
		do {
			System.out.println("==========Quan Ly Bang Diem=========");
			System.out.println("\t1.Them Diem cho sinh vien : ");
			System.out.println("\t2.Sua Diem cua sinh vien : ");
			System.out.println("\t3.Xoa Diem cua sinh vien : ");
			System.out.println("\t4.Thoat chuong trinh !");
			System.out.println("\t0.Quay tro lai TRANG QUAN LY SV");
			int chon = Integer.parseInt(Support.sc.nextLine());
			switch(chon) {
			case 1 : Them();break;
			case 2 : Sua();break;
			case 3 : Xoa();break;
			case 4 : System.exit(0);
			case 0 : return ;
			}
		}while(true);
	}


	private static void Xoa() {
		System.out.println("\t-------Xoa Diem Cho Sinh Vien-------");
		System.out.println("Nhap ma sinh vien : ");
		String maSinhVien = Support.sc.nextLine();
		int indexSV = Support.IndexOfMaSinhVien(QuanLySinhVien.list, maSinhVien);
	
		System.out.println("Nhap ma Mon Hoc : ");
		String maMonHoc = Support.sc.nextLine();
		int indexMH = Support.IndexOfMaMonHoc(QuanLyMonHoc.list, maMonHoc);
		
		int index = Support.IndexOfMonHocVaSinhVien(list, maMonHoc, maSinhVien);
		if(index==-1) {
			System.out.println("Sinh vien chua co diem mon hoc nay !");
			return ;
		}
		
		list.remove(index);
		System.out.println("Xoa diem thanh cong !");
	}

	private static void Sua() {
		System.out.println("\t-------Sua Diem Cho Sinh Vien-------");
		System.out.println("Nhap ma sinh vien : ");
		String maSinhVien = Support.sc.nextLine();
		int indexSV = Support.IndexOfMaSinhVien(QuanLySinhVien.list, maSinhVien);
	
		System.out.println("Nhap ma Mon Hoc : ");
		String maMonHoc = Support.sc.nextLine();
		int indexMH = Support.IndexOfMaMonHoc(QuanLyMonHoc.list, maMonHoc);
		
		int index = Support.IndexOfMonHocVaSinhVien(list, maMonHoc, maSinhVien);
		if(index==-1) {
			System.out.println("Sinh vien chua co diem mon hoc nay !");
			return ;
		}
		
		double diem=0;
		do {
			System.out.println("Nhap diem cho sinh vien voi mon hoc nay : ");
			diem = Double.parseDouble(Support.sc.nextLine());
			if(diem<0 || diem >10) {
				System.out.println("Diem khong hop le !");
			}
		}while(diem<0 || diem >10);
		
		list.get(index).setDiemSo(diem);
		System.out.println("Sua Diem Thanh Cong !");
		
	}

	private static void Them() {
		System.out.println("\t-------Them Diem Cho Sinh Vien-------");
		System.out.println("Nhap ma sinh vien : ");
		String maSinhVien = Support.sc.nextLine();
		int indexSV = Support.IndexOfMaSinhVien(QuanLySinhVien.list, maSinhVien);
		if(indexSV == -1) {
			System.out.println("Ma Sinh Vien nay khong ton tai trong DS Sinh Vien !");
			return;
		}
		
		System.out.println("Nhap ma Mon Hoc : ");
		String maMonHoc = Support.sc.nextLine();
		int indexMH = Support.IndexOfMaMonHoc(QuanLyMonHoc.list, maMonHoc);
		if(indexMH == -1) {
			System.out.println("Ma Mon Hoc nay khong ton tai trong DS Mon Hoc !");
			return;
		}
		
		int index = Support.IndexOfMonHocVaSinhVien(list, maMonHoc, maSinhVien);
		if(index!=-1) {
			System.out.println("Sinh vien Da co diem voi Mon hoc nay Khong the them , co the sua , xoa !");
			return ;
		}
		
		double diem=0;
		do {
			System.out.println("Nhap diem cho sinh vien voi mon hoc nay : ");
			diem = Double.parseDouble(Support.sc.nextLine());
			if(diem<0 || diem >10) {
				System.out.println("Diem khong hop le !");
			}
		}while(diem<0 || diem >10);
		
		list.add(new Diem(maSinhVien, maMonHoc, diem));
		System.out.println("Them Diem Thanh cong !");
		
	}

	
}
