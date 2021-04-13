package com.vn.pakage1;

public class Main {

	public static void main(String[] args) {
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
			case 2 : HienThiDiemTheoMH();break;
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
