package btvn5.bai2;

import java.util.Scanner;

import btvn5.bai2.HocPhan;
import btvn5.bai2.SinhVien;

public class Phieu {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		HocPhan[] hp = new HocPhan[7];
		hp[0] = new HocPhan("HP01", "Toan", 3, 8);
		hp[1] = new HocPhan("HP02", "Anh", 2, 7);
		hp[2] = new HocPhan("HP03", "Van", 3, 5);
		hp[3] = new HocPhan("HP04", "Sinh", 2, 9);
		hp[4] = new HocPhan("HP05", "Ly", 3, 10);
		hp[5] = new HocPhan("HP06", "Hoa", 3, 8.5);
		hp[6] = new HocPhan("HP07", "GDCD", 2, 7.75);
		SinhVien sv = new SinhVien("SV01", "VY HUNG", "28/08/2001", "CNTT", 7, hp);
		
		
		int chon;
		do {
		System.out.println("==========Quan Ly Sinh Vien=========");
		System.out.println("\t 1. Hien thi Thong Tin SV va DS HP theo thu tu ten");
		System.out.println("\t 2. Hien thi ds hoc phan duoi 6 ");
		System.out.println("\t 3. Sua thong tin sv ");
		System.out.println("\t 4. Sua ma hoc phan theo ma HP ");
		System.out.println("\t 0. Thoat chuong trinh ! ");
		System.out.print("Nhap lua chon (bam so tuong ung): ");
		chon = Integer.parseInt(sc.nextLine().trim());
			switch (chon) {
				case 1 : SinhVien.lable();sv.display(); break;
				case 2 : sv.displayduoi6(); break;
				case 3 : sv.suaTT();; break;
				case 4 : sv.suaDiem();; break;
			
				case 0: 
					System.out.println("Da thoat chuong trinh");
					return;
				default : System.out.printf("Lua chon khong hop le ! %nDa thoat chuong trinh");
					return ;
			} 
		}while(true);
	}


}
