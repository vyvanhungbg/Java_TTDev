package com.vn.pakage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySinhVien {

	static ArrayList<SinhVien> list = new ArrayList<SinhVien>();
//	public static void main(String[] args) {
//		QuanLy();
//	}

	protected static void QuanLy() {
		do {
			System.out.println("==========Quan Ly Thong Tin Sinh Vien=========");
			System.out.println("\t1.Them sinh vien moi");
			System.out.println("\t2.Sua thong tin sinh vien theo ma");
			System.out.println("\t3.Xoa thong tin sinh vien theo ma");
			System.out.println("\t4.Hien thi danh sach sinh vien ");
			System.out.println("\t5.Thoat chuong trinh !");
			System.out.println("\t0.Quay tro lai TRANG QUAN LY SV");
			int chon = Integer.parseInt(Support.sc.nextLine());
			switch(chon) {
			case 1 : Them();break;
			case 2 : Sua();break;
			case 3 : Xoa();break;
			case 4 : HienThi();break;
			case 5 : System.exit(0);
			case 0 : return ;
			}
		}while(true);
	}

	/// ham xu ly
	
		private static void HienThi() {

			Collections.sort(list, new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					// TODO Auto-generated method stub
					return o1.getTen().compareTo(o2.getTen());
				}
			});
			
			SinhVien.TieuDe();
			for(SinhVien i : list) {
				i.xuat();
			}
			
		}

		private static void Xoa() {
			System.out.println("\t-------Xoa Sinh Vien--------");
			System.out.println("Nhap ma sinh vien : ");
			String maSinhVien = Support.sc.nextLine();
			int index = Support.IndexOfMaSinhVien(list, maSinhVien);
			if(index==-1) {
				System.out.println("Ma Sinh Vien nay khong ton tai !");
				return;
			}
			
			if(Support.IndexOfMaSinhVienInDiem(QuanLyDiem.list, maSinhVien)!=-1) {
				System.out.println("Sinh vien nay da co diem khong the xoa !");
				return;
			}
			list.remove(index);
			System.out.println("Xoa sinh vien thanh cong !");
		}

		private static void Sua() {
			System.out.println("\t-------Sua Sinh Vien--------");
			System.out.println("Nhap ma sinh vien : ");
			String maSinhVien = Support.sc.nextLine();
			int index = Support.IndexOfMaSinhVien(list, maSinhVien);
			if(index==-1) {
				System.out.println("Ma Sinh Vien nay khong ton tai !");
				return;
			}
			do {
				System.out.println("\t------Menu Sua------");
				System.out.println("\t1.Sua ho dem sinh vien");
				System.out.println("\t2.Sua ten sinh vien");
				System.out.println("\t3.Sua nam sinh");
				System.out.println("\t4.Sua gioi tinh");
				System.out.println("\t0.Thoat !");
				int chon = Integer.parseInt(Support.sc.nextLine());
				switch(chon) {
				case 1 : System.out.println("Nhap ho dem sinh vien moi :");list.get(index).setHoDem(Support.sc.nextLine());System.out.println("Sua thanh cong !");break;
				case 2 : System.out.println("Nhap ten sinh vien moi :");list.get(index).setTen(Support.sc.nextLine());System.out.println("Sua thanh cong !");break;
				case 3 : System.out.println("Nhap nam sinh moi :");list.get(index).setNamSinh(Integer.parseInt(Support.sc.nextLine()));System.out.println("Sua thanh cong !");break;
				case 4 : System.out.println("Nhap gioi tinh moi :");list.get(index).setGioiTinh(Support.sc.nextLine());System.out.println("Sua thanh cong !");break;
				case 0 : return;
				}
			}while(true);
			
		}

		private static void Them() {
			System.out.println("\t-------Them Sinh Vien-------");
			System.out.println("\t---Nhap Thong tin sinh vien---");
			System.out.println("Nhap ma sinh vien : ");
			String maSinhVien = Support.sc.nextLine();
			int index = Support.IndexOfMaSinhVien(list, maSinhVien);
			if(index!=-1) {
				System.out.println("Ma Sinh Vien nay da ton tai !");
				return;
			}
			System.out.println("Nhap ho dem sinh vien : ");
			String hoDem = Support.sc.nextLine();
			System.out.println("Nhap ten sinh vien : ");
			String ten = Support.sc.nextLine();
			System.out.println("Nhap nam sinh : ");
			int namSinh = Integer.parseInt(Support.sc.nextLine());
			System.out.println("Nhap gioi tinh ");
			String gioiTinh = Support.sc.nextLine();
			list.add(new SinhVien(maSinhVien, hoDem, ten, namSinh, gioiTinh));
			System.out.println("Them sinh vien thanh cong ! ");
		}
		
		// hien thi bang diem theo sinh vien
	public static void HienThiBangDiem() {
		
		// sap xep theo ma
		Collections.sort(list, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				// TODO Auto-generated method stub
				return o1.getMaSinhVien().compareTo(o2.getMaSinhVien());
			}
		});
		int maBangDiem=0;
		System.out.println("===============HIEN THI BANG DIEM THEO TEN SINH VIEN===============");
		for(SinhVien i : list) {  // duyet list sv 
			System.out.println("-----------------------------------");
			System.out.printf("%n%-15s :","STT/MaBangDiem");
			System.out.printf("%-10d%n%n",++maBangDiem);
			System.out.println("=========BANG DIEM========");
			SinhVien.TieuDe();
			i.xuat();
			
			int stt=0;
			double tongdiemHeso=0;
			double tongHeSo=0;
			
			System.out.printf("%n%n%-10s  %-10s %-10s%n","STT","Ten MH","Diem");
			for(Diem j : QuanLyDiem.list) {  // tu moi ma sinh vien tim kiem xem sinh vien da có trong Database diem chua 
				if(j.getMaSinhVien().equals(i.getMaSinhVien())) {
					int index = Support.IndexOfMaMonHoc(QuanLyMonHoc.list, j.getMaMonHoc());
					String tenMonHoc = QuanLyMonHoc.list.get(index).getTenMonHoc();
					double heSoMon = QuanLyMonHoc.list.get(index).getHeSoMon();
					double diem = j.getDiemSo();
					System.out.printf("%-10d  %-10s %-10.3f%n",++stt,tenMonHoc,diem);
					tongdiemHeso+=diem*heSoMon;
					tongHeSo+=heSoMon;
					
				}
			}
			if(tongHeSo!=0)
			System.out.printf("%-10s%-10.3f%n","DIEM TK",tongdiemHeso/tongHeSo);
		}
	}	
	
	public static void TimKiemTheoMSV() {
		System.out.println("\t===========TIM KIEM THEO MA SINH VIEN==============");
		System.out.println("Nhap ma sinh vien : ");
		String maSinhVien = Support.sc.nextLine();
		int index = Support.IndexOfMaSinhVien(list, maSinhVien);
		if(index==-1) {
			System.out.println("Ma Sinh Vien nay khong ton tai !");
			return;
		}
		
		System.out.println("\t-------Tim Thay--------");
		System.out.printf("%-15s %-10s","Ten SV :",list.get(index).getTen());
		System.out.printf("%n%n%-10s  %-10s %-10s%n","STT","Ten MH","Diem");
		int stt=0;
		double tongdiemHeso=0;
		double tongHeSo=0;
		for(Diem j : QuanLyDiem.list) {  // tu moi ma sinh vien tim kiem xem sinh vien da có trong Database diem chua 
			if(j.getMaSinhVien().equals(maSinhVien)) {
				int indexOfMaMH = Support.IndexOfMaMonHoc(QuanLyMonHoc.list, j.getMaMonHoc());
				String tenMonHoc = QuanLyMonHoc.list.get(indexOfMaMH).getTenMonHoc();
				double heSoMon = QuanLyMonHoc.list.get(indexOfMaMH).getHeSoMon();
				double diem = j.getDiemSo();
				System.out.printf("%-10d  %-10s %-10.3f%n",++stt,tenMonHoc,diem);
				tongdiemHeso+=diem*heSoMon;
				tongHeSo+=heSoMon;
				
			}
		}
		if(tongHeSo!=0)
		System.out.printf("%-10s%-10.3f%n","DIEM TK",tongdiemHeso/tongHeSo);
	}
	
}
