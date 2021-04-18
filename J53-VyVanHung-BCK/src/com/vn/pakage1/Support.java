package com.vn.pakage1;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Support {

	static Scanner sc = new Scanner(System.in);
	
	// kiem tra su ton tai  cua ma sinh vien trong danh sach sinh vien
	public static int IndexOfMaSinhVien(ArrayList<SinhVien> list , String maSinhVien) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getMaSinhVien().equals(maSinhVien)) {
				return i;
			}
		}
		return -1;	
	}
	
	// kiem tra su ton tai cua ma sinh vien trong danh sach Bang Diem

	public static int IndexOfMaSinhVienInDiem(ArrayList<Diem> list , String maSinhVien) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getMaSinhVien().equals(maSinhVien)) {
				return i;
			}
		}
		return -1;	
	}
	
	// kiem tra su ton tai cua ma mon hoc trong danh sach mon hoc
	
	public static int IndexOfMaMonHoc(ArrayList<MonHoc> list , String maMonHoc) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getMaMonHoc().equals(maMonHoc)) {
				return i;
			}
		}
		return -1;	
	}
	
	// kiem tra su ton tai cua ma mon hoc trong danh sach Bang Diem

		public static int IndexOfMaMonHocInDiem(ArrayList<Diem> list , String maMonHoc) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getMaMonHoc().equals(maMonHoc)) {
					return i;
				}
			}
			return -1;	
		}
		
	// kiem tra su ton tai cua khoa chinh trong ban diem
		public static int IndexOfMonHocVaSinhVien(ArrayList<Diem> list , String maMonHoc , String maSinhVien) {
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getMaMonHoc().equals(maMonHoc)) {
					for(int j=0;j<list.size();j++) {
						if(list.get(j).getMaSinhVien().equals(maSinhVien)) {
							return i;
						}
					}
				}
			}
			return -1;	
		}
		
	// Tong diem cua mon hoc theo ma mon hoc
		public static double TBDiemTheoMaMH(ArrayList<Diem> list , String maMonHoc) {
			double tongDiem =0;
			int soSVHoc = 0;
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getMaMonHoc().equals(maMonHoc)) {
						tongDiem+=list.get(i).getDiemSo();
						soSVHoc++;
					}
				}
			
			if(soSVHoc!=0) return tongDiem/soSVHoc;
			else
				return 0;
		}
		
}
