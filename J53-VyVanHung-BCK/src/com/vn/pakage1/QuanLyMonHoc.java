package com.vn.pakage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class QuanLyMonHoc {

	static ArrayList<MonHoc> list = new ArrayList<MonHoc>();
//	public static void main(String[] args) {
//		QuanLy();
//	}

	protected static void QuanLy() {
		do {
			System.out.println("==========Quan Ly Thong Tin Mon Hoc=========");
			System.out.println("\t1.Them mon hoc moi");
			System.out.println("\t2.Sua thong tin mon hoc theo ma");
			System.out.println("\t3.Xoa thong tin mon hoc theo ma");
			System.out.println("\t4.Hien thi danh sach mon hoc ");
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

			Collections.sort(list, new Comparator<MonHoc>() {

				@Override
				public int compare(MonHoc o1, MonHoc o2) {
					// TODO Auto-generated method stub
					return o1.getTenMonHoc().compareTo(o2.getTenMonHoc());
				}
			});
			
			MonHoc.TieuDe();
			for(MonHoc i : list) {
				i.xuat();
			}
			
		}

		private static void Xoa() {
			System.out.println("\t-------Xoa Mon Hoc--------");
			System.out.println("Nhap ma Mon Hoc : ");
			String maMonHoc = Support.sc.nextLine();
			int index = Support.IndexOfMaMonHoc(list, maMonHoc);
			if(index==-1) {
				System.out.println("Ma Mon Hoc nay khong ton tai !");
				return;
			}
			
			if(Support.IndexOfMaMonHocInDiem(QuanLyDiem.list, maMonHoc)!=-1) {
				System.out.println("Sinh vien nay da co diem khong the xoa !");
				return;
			}
			list.remove(index);
			System.out.println("Xoa Mon Hoc thanh cong !");
		}

		private static void Sua() {
			System.out.println("\t-------Sua Mon Hoc--------");
			System.out.println("Nhap ma Mon Hoc : ");
			String maMonHoc = Support.sc.nextLine();
			int index = Support.IndexOfMaMonHoc(list, maMonHoc);
			if(index==-1) {
				System.out.println("Ma Mon Hoc nay khong ton tai !");
				return;
			}
			do {
				System.out.println("\t------Menu Sua------");
				System.out.println("\t1.Sua ten Mon Hoc : ");
				System.out.println("\t2.Sua he so Mon Hoc : ");
				System.out.println("\t0.Thoat !");
				int chon = Integer.parseInt(Support.sc.nextLine());
				switch(chon) {
				case 1 : System.out.println("Nhap ten Mon Hoc moi :");list.get(index).setTenMonHoc(Support.sc.nextLine());System.out.println("Sua thanh cong !");break;
				case 2 : System.out.println("Nhap he so Mon Hoc moi :");list.get(index).setHeSoMon(Double.parseDouble(Support.sc.nextLine()));System.out.println("Sua thanh cong !");break;
				case 0 : return;
				}
			}while(true);
			
		}

		private static void Them() {
			System.out.println("\t-------Them Mon Hoc-------");
			System.out.println("\t---Nhap Thong tin Mon Hoc---");
			System.out.println("Nhap ma Mon Hoc : ");
			String maMonHoc = Support.sc.nextLine();
			int index = Support.IndexOfMaMonHoc(list, maMonHoc);
			if(index!=-1) {
				System.out.println("Ma Mon Hoc nay da ton tai !");
				return;
			}
		
			System.out.println("Nhap ten Mon Hoc : ");
			String tenMonHoc = Support.sc.nextLine();
			System.out.println("Nhap he so Mon Hoc : ");
			double heSoMon = Double.parseDouble(Support.sc.nextLine());
			
			list.add(new MonHoc(maMonHoc, tenMonHoc, heSoMon));
			System.out.println("Them Mon Hoc thanh cong ! ");
		}
		
		public static void HienThiBangDiem() {
			System.out.println("===================HIEN THI BANG DIEM THEO MON HOC==============");
			int maBangDiem=0;
			for(int i=0;i<list.size();i++) {   // list mon hoc
				System.out.println("----------------------------------------");
				System.out.printf("%n%n%-15s :","STT/MaBangDiem");
				System.out.printf("%-10d %n",++maBangDiem);
				System.out.println("=========BANG DIEM========");
				MonHoc.TieuDe();
				list.get(i).xuat();
				System.out.printf("%-10s : %-10.3f %n","DIEM TB MH",Support.TBDiemTheoMaMH(QuanLyDiem.list, list.get(i).getMaMonHoc()));
				System.out.println("\t---------DANH SACH SINH VIEN HOC MON HOC -------");
				System.out.printf("%-10s %-10s %-10s %-10s %n","STT","ma SV","ten SV","diem");
				int stt=0;
				for(int j=0;j<QuanLyDiem.list.size();j++) { // list diem
					String maMH = QuanLyDiem.list.get(j).getMaMonHoc();
					if(list.get(i).getMaMonHoc().equals(maMH)) {
						int index = Support.IndexOfMaSinhVien(QuanLySinhVien.list,QuanLyDiem.list.get(j).getMaSinhVien());
						String maSV = QuanLySinhVien.list.get(index).getMaSinhVien();
						String tenMH = QuanLySinhVien.list.get(index).getTen();
						double diem = QuanLyDiem.list.get(j).getDiemSo();
						System.out.printf("%-10d %-10s %-10s %-10.3f %n",++stt,maSV,tenMH,diem);
					}
				}
			}
		}
		
		public static void TimKiemTheoMaMH() {
			System.out.println("\t-------TIM KIEM THEO MA MON HOC--------");
			System.out.println("Nhap ma Mon Hoc : ");
			String maMonHoc = Support.sc.nextLine();
			int index = Support.IndexOfMaMonHoc(list, maMonHoc);
			if(index==-1) {
				System.out.println("Ma Mon Hoc nay khong ton tai !");
				return;
			}
			
			System.out.println("\t-------Tim Thay--------");
			System.out.printf("%-15s %-10s %n","Ten MH :",list.get(index).getTenMonHoc());
			
			
			System.out.println("\t---------DANH SACH SINH VIEN HOC MON HOC -------");
			System.out.printf("%-10s %-10s %-10s %-10s %n","STT","ma SV","ten SV","diem");
			int stt=0;
			for(int j=0;j<QuanLyDiem.list.size();j++) { // list diem
				String maMH = QuanLyDiem.list.get(j).getMaMonHoc();
				if(list.get(index).getMaMonHoc().equals(maMH)) {
					int indexofMaSV = Support.IndexOfMaSinhVien(QuanLySinhVien.list,QuanLyDiem.list.get(j).getMaSinhVien());
					String maSV = QuanLySinhVien.list.get(indexofMaSV).getMaSinhVien();
					String tenMH = QuanLySinhVien.list.get(indexofMaSV).getTen();
					double diem = QuanLyDiem.list.get(j).getDiemSo();
					System.out.printf("%-10d %-10s %-10s %-10.3f %n",++stt,maSV,tenMH,diem);
				}
			}
			System.out.printf("%-10s : %-10.3f %n","DIEM TB MH",Support.TBDiemTheoMaMH(QuanLyDiem.list, maMonHoc));
		}
}
