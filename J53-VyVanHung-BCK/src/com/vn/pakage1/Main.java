package com.vn.pakage1;

public class Main {

	public static void main(String[] args) {
		// Du lieu test
		QuanLySinhVien.list.add(new SinhVien("1", "VY", "HUNG", 2001, "NAM")); // Nhap 3 Sinh vien
		QuanLySinhVien.list.add(new SinhVien("2", "NGUYEN", "LONG", 2001, "NAM"));
		QuanLySinhVien.list.add(new SinhVien("3", "TRAN", "HA", 2001, "NU"));
		
		QuanLyMonHoc.list.add(new MonHoc("1", "Toan", 2)); //Nhap 3 Mon hoc
		QuanLyMonHoc.list.add(new MonHoc("2", "Van", 2));
		QuanLyMonHoc.list.add(new MonHoc("3", "Anh", 1.5));
		
		QuanLyDiem.list.add(new Diem("1", "1", 10)); // Diem sinh vien 1
		QuanLyDiem.list.add(new Diem("1", "2", 10));
		QuanLyDiem.list.add(new Diem("1", "3", 10));
		
		QuanLyDiem.list.add(new Diem("2", "1", 8)); // Diem sinh vien 2
		QuanLyDiem.list.add(new Diem("2", "2", 7));
		
		QuanLyDiem.list.add(new Diem("3", "1", 2)); // Diem sinh vien 3
		QuanLyDiem.list.add(new Diem("3", "2", 5));
		QuanLyDiem.list.add(new Diem("3", "3", 3));
		
		/// Ham Main
		QuanLy();
		

	}

	private static void QuanLy() {
		do {
			System.out.println("==========QUAN LY SINH VIEN=========");
			System.out.println("\t1.CAP NHAT DANH SACH ");
			System.out.println("\t2.HIEN THI BANG DIEM ");
			System.out.println("\t3.TIM KIEM");
			System.out.println("\t0.Thoat chuong trinh !");
			int chon = Integer.parseInt(Support.sc.nextLine());
			switch(chon) {
			case 1 : CapNhatDanhSach();break;
			case 2 : HienThiBangDiem();break;
			case 3 : TimKiem();break;
			case 0 : System.out.println("Da Thoat Chuong trinh !"); System.exit(0) ;
			}
		}while(true);
	}

	private static void TimKiem() {
		do {
			System.out.println("==========TIM KIEM=========");
			System.out.println("\t1.TIM KIEM THEO MA SV");
			System.out.println("\t2.TIM KIEM THEO MA MH");
			System.out.println("\t3.Thoat chuong trinh !");
			System.out.println("\t0.Quay tre ve QUAN LY SINH VIEN");
			int chon = Integer.parseInt(Support.sc.nextLine());
			switch(chon) {
			case 1 : QuanLySinhVien.TimKiemTheoMSV();break;
			case 2 : QuanLyMonHoc.TimKiemTheoMaMH();break;
			case 3 : System.out.println("Da Thoat Chuong trinh !"); System.exit(0) ;	
			case 0 : return ;	
			}
		}while(true);
		
	}

	private static void HienThiBangDiem() {
		do {
			System.out.println("==========HIEN THI BANG DIEM=========");
			System.out.println("\t1.Hien Thi Bang Diem cua tat ca sinh vien theo sinh vien");
			System.out.println("\t2.Hien Thi Bang Diem cua tat ca sinh vien theo mon hoc ");
			System.out.println("\t3.Thoat chuong trinh !");
			System.out.println("\t0.Quay tre ve QUAN LY SINH VIEN");
			int chon = Integer.parseInt(Support.sc.nextLine());
			switch(chon) {
			case 1 : QuanLySinhVien.HienThiBangDiem();;break;
			case 2 : QuanLyMonHoc.HienThiBangDiem();break;
			case 3 : System.out.println("Da Thoat Chuong trinh !"); System.exit(0) ;	
			case 0 : return ;	
			}
		}while(true);
		
	}

	

	private static void CapNhatDanhSach() {
		do {
			System.out.println("==========CAP NHAT DANH SACH=========");
			System.out.println("\t1.CAP NHAT DANH SACH SINH VIEN");
			System.out.println("\t2.CAP NHAT DANH SACH MON HOC ");
			System.out.println("\t3.CAP NHAT DANH SACH BANG DIEM");
			System.out.println("\t4.Thoat chuong trinh !");
			System.out.println("\t0.Quay tre ve QUAN LY SINH VIEN");
			int chon = Integer.parseInt(Support.sc.nextLine());
			switch(chon) {
			case 1 : QuanLySinhVien.QuanLy();break;
			case 2 : QuanLyMonHoc.QuanLy();;break;
			case 3 : QuanLyDiem.QuanLy();;break;
			case 4 : System.out.println("Da Thoat Chuong trinh !"); System.exit(0) ;	
			case 0 : return ;	
			}
		}while(true);
		
	}

}
