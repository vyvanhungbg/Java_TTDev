package devpro.btvn5;

import java.util.Scanner;

public class MonHoc {
	private  String maMonHoc;
	private  String tenMonHoc;
	private  double heSo;
	private  double diem;
	
	
	public double getHeSo() {
		return heSo;
	}

	public void setHeSo(double heSo) {
		this.heSo = heSo;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	static void Nhap(MonHoc mh) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap ma MH : ");
		mh.maMonHoc = scan.nextLine();
		System.out.println("Nhap ten MH : ");
		mh.tenMonHoc = scan.nextLine();
		System.out.println("Nhap he so MH : ");
		mh.heSo = Double.parseDouble(scan.nextLine().trim());
		System.out.println("Nhap diem MH : ");
		mh.diem = Double.parseDouble(scan.nextLine().trim());
	}
	
	static void Lable(){
		System.out.printf("%-10s  %-10s  %-5s %-5s","Ma MH","Ten MH","He so","Diem");
	}
	static void Xuat(MonHoc mh) {
		System.out.printf("%n%-10s  %-10s  %-5.3f %-5.3f",mh.maMonHoc,mh.tenMonHoc,mh.heSo,mh.diem);
		
	}
}
