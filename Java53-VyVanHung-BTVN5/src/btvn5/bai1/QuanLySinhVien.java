package btvn5.bai1;

import java.util.Scanner;

public class QuanLySinhVien {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HocPhan[] hp = new HocPhan[3];
		hp[0] = new HocPhan("HP01", "Toan", 3, 8);
		hp[1] = new HocPhan("HP02", "Anh", 2, 7);
		hp[2] = new HocPhan("HP03", "Van", 3, 6);
		SinhVien sv = new SinhVien("SV01", "VY", "HUNG", 2001, "NAM", 3, hp);
		
		//sv.nhap();
		
		
		int chon;
		do {
		System.out.println("==========Quan Ly Sinh Vien=========");
		System.out.println("\t 1. Hien thi Thong Tin SV");
		System.out.println("\t 2. Sua Thong tin cua sinh vien ");
		System.out.println("\t 3. Sua ma hoc phan theo ma HP ");
		System.out.println("\t 0. Thoat chuong trinh ! ");
		System.out.print("Nhap lua chon (bam so tuong ung): ");
		chon = Integer.parseInt(sc.nextLine().trim());
			switch (chon) {
				case 1 : SinhVien.lable();sv.display(); break;
				case 2 : sv.suaTT(); break;
				case 3 : sv.suaDiem(); break;
			
				case 0: 
					System.out.println("Da thoat chuong trinh");
					return;
				default : System.out.printf("Lua chon khong hop le ! %nDa thoat chuong trinh");
					return ;
			} 
		}while(true);
	}

}
