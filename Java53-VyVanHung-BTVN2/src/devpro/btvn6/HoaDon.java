package devpro.btvn6;

import java.util.Scanner;

public class HoaDon {
	private String soHD;
	private String hoTen;
	private String ngayMua;
	private HangHoa [] hangHoa = new HangHoa[5];
	
	public HoaDon() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<5;i++) {
			hangHoa[i] = new HangHoa();
		}
	}
	
	static void Nhap(HoaDon hd) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so HD : ");
		hd.soHD = sc.nextLine();
		System.out.println("Nhap ho Ten : ");
		hd.hoTen = sc.nextLine();
		System.out.println("Nhap ngay Mua : ");
		hd.ngayMua = sc.nextLine();
		for(int i=0;i<5;i++) {
			hd.hangHoa[i].Nhap(hd.hangHoa[i]);
		}
	}
	
	static void Lable() {
		System.out.printf("%n%-10s  %-10s  %-10s","So HD","Ten","Ngay Mua");
	}
	
	static double TongTien(HoaDon hd) {
		double sum=0;
		for(int i=0;i<5;i++) {
			sum+= hd.hangHoa[i].getDonGia()*hd.hangHoa[i].getSoLuong();
		}
		return sum;
	}
	
	static void Xuat(HoaDon hd) {
		HoaDon.Lable();
		System.out.printf("%n%-10s  %-10s  %-10s",hd.soHD,hd.hoTen,hd.ngayMua);
		HangHoa.Lable();
		for(int i=0;i<5;i++) {
			hd.hangHoa[i].Xuat(hd.hangHoa[i]);
		}
		System.out.printf("%nTong Tien Hang : %24.3f",TongTien(hd));
		System.out.printf("%nTong Tien Tra : %25.3f",1.1*TongTien(hd));
		
	}
}
