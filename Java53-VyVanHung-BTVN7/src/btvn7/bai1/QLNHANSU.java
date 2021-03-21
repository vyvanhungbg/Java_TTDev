package btvn7.bai1;

import java.util.Scanner;



public class QLNHANSU {

	static NhanSu[] list = {
			new CanBo(111, "Tran Van", "Long", 2001, "Nam", new Phong("Hanh Chinh", "Hung"), "QLNS", 5.5, "A"),
			new CanBo(113, "NGUYEN THI", "C", 2001, "Nu", new Phong("Ke Toan", "HA"), "NV", 4.5, "B"),
			new CongNhan(115, "NGUYEN V", "Khanh", 2001, "Nam", new XuongSX("Xuong 3", "HAI", 30), "NV", 25),
			new CanBo(114, "N Van", "B", 2001, "Nam", new Phong("Hanh Chinh", "Hung"), "NV", 5.5, "C"),
			new CongNhan(112, "TRAN THI", "HONG", 2001, "Nu", new XuongSX("Xuong 1", "Long", 40), "Truong P", 27),
			new CongNhan(116, "VY THI", "CUC", 2001, "Nu", new XuongSX("Xuong 1", "Long", 40), "Pho P", 21)
	};
	static Scanner sc = new Scanner(System.in);
	static void nhapds() {
		int n;
		System.out.print("Nhap so luong nhan su: ");
		n = Integer.parseInt(sc.nextLine());
		list = new NhanSu[n];
		System.out.println("Nhap danh sach nhan su");
		int chon;
		for(int i = 0; i <list.length; i++) {
			System.out.print("Nhap nhan su thu: " + (i + 1));
			System.out.println("(Chon \n 1 - Can Bo, 2 - CongNhan");
			System.out.println("Bam chon: ");
			chon=Integer.parseInt(sc.nextLine());
			if(chon==1) {
				list[i] = new CanBo();
			}
			else {
				list[i]= new CongNhan();
			}
			
			list[i].input();
		}
	}
	
	// xuat
	public static void label() {
		System.out.printf("%-8s %-10s %-8s %-8s %-8s |CN|","MaNs","Ho Dem","Ten","Nam Sinh","Gioi Tinh");
		XuongSX.label();
		System.out.printf("%-10s %-10s |CB|","Cong Viec","So Ngay Lam");
		Phong.label();
		System.out.printf("%-10s %-8s %-7s %-9s %n" ,"Chuc Vu","HS Luong","XepLoai","Luong");
	}
	public static void output() {
		System.out.println("========DS NHAN SU LA========= ");
		int i=0;
		System.out.printf("%-5s","STT");
		label();
	
		System.out.println("");
		for(NhanSu ns : list) {
			System.out.printf("%-5d",++i);
			ns.output();
		}
		
	}
	
	// hien thi ds cong nhan nam
	public static void CNNam() {
		int i=0;
		System.out.println("DS CONG NHAN NAM LA ");
		System.out.printf("%-5s","STT");
		label();
		System.out.println("");
		for(NhanSu ns : list) {
			if(ns instanceof CongNhan && ns.getGioiTinh().toUpperCase().equals("NAM")) {
				System.out.printf("%-5d",++i);
				ns.output();
			}
		}
	}
	// hien thi ds can bo nu
	public static void CBNu() {
		int i=0;
		System.out.println("DS CAN BO NU LA ");
		System.out.printf("%-5s","STT");
		label();
		System.out.println("");
		for(NhanSu ns : list) {
			if(ns instanceof CanBo && ns.getGioiTinh().toUpperCase().equals("NU")) {
					System.out.printf("%-5d",++i);
					ns.output();
			}
		
		}
	}
	
	// hien thi can bo cao nhat
	
	public static void CBLuongCaoNhat() {
		int i=0;
		double max =0;
		for(NhanSu ns : list) {
			if(ns instanceof CanBo && max < ns.luong()) {
				max = ns.luong();
			}
		}
		System.out.println("CAN BO LUONG CAO NHAT LA ");
		System.out.printf("%-5s","STT");
		label();
		for(NhanSu ns : list) {
			if(ns instanceof CanBo && max == ns.luong()) {
				System.out.printf("%-5d",++i);
				ns.output();
			}
		}
	}
	
	// hien thi cong nhan luong thap nhat
	public static void CNLuongThapNhat() {
		int i=0,j=0;
		 double min =0;
		for( j=0;j<list.length;j++) {
			if(list[j] instanceof CongNhan) {
				min = list[j].luong();
				break;
			}
		}
		
		for(; j<list.length;j++) {
			if(list[j] instanceof CongNhan && list[j].luong()<min) {
				min = list[j].luong();
			}
		}
		System.out.println("CONG NHAN LUONG THAP NHAT LA ");
		System.out.printf("%-5s","STT");
		label();
		
		for(NhanSu ns : list) {
			if(ns instanceof CongNhan && min == ns.luong()) {
				System.out.printf("%-5d",++i);
				ns.output();
				
			}
		}
	}
	
	// tong luong
	public static void TongLuongCB() {
		double luong=0;
		for(NhanSu ns : list) {
			if(ns instanceof CanBo) {
				luong+=ns.luong();
			}
		}
		System.out.printf("Tong Luong CB La %.3f%n",luong);
	}
	
	
	public static void TongLuongCN() {
		double luong=0;
		for(NhanSu ns : list) {
			if(ns instanceof CongNhan) {
				luong+=ns.luong();
			}
		}
		System.out.printf("Tong Luong CN La %.3f%n",luong);
	}
	//
	public static void ChangeList() {
		NhanSu [] tmp = new NhanSu[list.length]; 
		int end=list.length-1,start=0;
		for(int i=0;i<list.length;i++) {
			if(list[i] instanceof CongNhan) {
				tmp[end--]=list[i];
			}else {
				tmp[start++]=list[i];
			}
			
		}
		
		list = tmp.clone();
	}
	
	
	// sort name
	public static void SortByName() { 
		for(int i=0;i<list.length;i++) {
			for(int j=i+1;j<list.length;j++) {
				if(list[i].getTen().compareTo(list[j].getTen())>0) {
					NhanSu tmp = list[i];
					list[i]= list[j];
					list[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;
		do {
		System.out.println("==========Quan Ly NHAN SU=========");
		System.out.println("\t 1. Hien thi Thong Tin Tat ca NS");
		System.out.println("\t 2. Hien thi DS Cong Nhan Nam ");
		System.out.println("\t 3. Hien thi DS Can Bo Nu  ");
		System.out.println("\t 4. Hien thi DS Can Bo co Luong Cao Nhat");
		System.out.println("\t 5. Hien thi DS Cong nhan co Luong Thap nhat ");
		System.out.println("\t 6. Hien thi Tong Luong CB ");
		System.out.println("\t 7. Hien thi Tong Luong CN ");
		System.out.println("\t 8. Chuyen CN xuong cuoi DS ");
		System.out.println("\t 9. Sap xep theo ten ");
		System.out.println("\t 0. Thoat chuong trinh ! ");
		System.out.print("Nhap lua chon (bam so tuong ung): ");
		chon = Integer.parseInt(sc.nextLine().trim());
			switch (chon) {
				case 1 : output(); break;
				case 2 : CNNam(); break;
				case 3 : CBNu(); break;
				case 4 : CBLuongCaoNhat();break;
				case 5 : CNLuongThapNhat();break;
				case 6 : TongLuongCB();break;
				case 7 : TongLuongCN();break;
				case 8 : ChangeList();break;
				case 9 : SortByName();break;
				case 0: 
					System.out.println("Da thoat chuong trinh");
					return;
				default : System.out.printf("Lua chon khong hop le ! %nDa thoat chuong trinh");
					return ;
			} 
		}while(true);
	}

}
