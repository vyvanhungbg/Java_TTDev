import java.util.Scanner;

public class BaiTap1 {
	static Scanner sc = new Scanner(System.in);
	static String[] chuHo = {"Thuong","Binh","Hung","Duong","Cong","Truong","Tung","Giang","Cuc","Truong","Hue"}; //1) tao ds ho su dung
	static int[] soDien = {325,675,785,455,795,375,675,985,545,435,155};//2) tao ds so Kwh
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;
		do {
		System.out.println("Chon mot bai toan de giai quyet");
		System.out.println("\t 1. Hien thi DS");
		System.out.println("\t 2. Hien thi 3 ho nhieu Kwh dien nhat");
		System.out.println("\t 3. Hien thi cac chu ho ten 'Truong'");
		System.out.println("\t 4. Sap xep danh sach theo bang chu cai");
		System.out.println("\t 5. Sap xep theo Kwh tang dan");
		System.out.println("\t 0. Thoat khoi chuong trinh");
		System.out.print("Nhap lua chon (bam so tuong ung): ");
		chon = Integer.parseInt(sc.nextLine().trim());
			switch (chon) {
				case 1 : XuatAll(chuHo, soDien); break;
				case 2 : BaHoNhieuNhat(chuHo, soDien); break;
				case 3 : HienThiTenTruong(chuHo, soDien); break;
				case 4 : SapXepTheoChuCai(chuHo, soDien);XuatAll(chuHo, soDien); break;
				case 5 : SapXepTheoKwhTang(chuHo, soDien);XuatAll(chuHo, soDien); break;
				case 0: 
					System.out.println("Da thoat chuong trinh");
					return;
				default : System.out.printf("Lua chon khong hop le ! %nDa thoat chuong trinh");
					return ;
			} 
		}while(true);
	}
	
	
	// 3) Tinh so  tien dien
	private static int TinhTien(int sodien) {
		int t = 0;
		if(sodien <= 50)
			t = sodien * 1678;
		else if(sodien <= 100)
			t = 50*1678 + (sodien-50)*1734;
		else if(sodien <= 200)
			t = 50*1678 + 50*1734 + (sodien-100)*2014;
		else if(sodien <= 300)
			t = 50*1678 + 50*1734 + 100*2014 + (sodien-300)*2536;
		else if(sodien <= 400) 
			t = 50*1678 + 50*1734 + 100*2014 + 100*2536 + (sodien-300)*2834;
		else
			t = 50*1678 + 50*1734 + 100*2014 + 100*2536 + 300*2834 + (sodien-400)*2927;
		return t;
	}
	
	
	// 4) Hien thi danh sach ho gia dinh va so tien dien
	private static void Xuat( String chuHo , int soDien ) {
		System.out.printf("%-10s %-10d %-15d %n",chuHo,soDien,TinhTien(soDien));
	}
	
	private static void XuatAll(String[] chuHo , int[] soDien) {
		for(int i=0;i<chuHo.length;i++) {
			Xuat(chuHo[i],soDien[i]);
		}
	}
	
	//5) Hien thi 3 ho gia dinh co so Kwh tieu thu nhieu nhat
	private static void BaHoNhieuNhat(String[] chuHo , int[] soDien) {
		int n = chuHo.length;
		int [] tmpsoDien = new int[n];
		String [] tmpchuHo = new String[n];
		// copy tmp
		for(int i=0;i<n;i++) {
			tmpsoDien[i] = soDien[i];
			tmpchuHo[i] = chuHo[i];
		}
		// sap xep giam dan theo so dien;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(tmpsoDien[i]<tmpsoDien[j]) {
					int tmp1=tmpsoDien[i];
						tmpsoDien[i] = tmpsoDien[j];
						tmpsoDien[j] = tmp1;
					String tmpStr = String.valueOf(tmpchuHo[i]);
					tmpchuHo[i] = String.valueOf(tmpchuHo[j]);
					tmpchuHo[j] = String.valueOf(tmpStr);
				}
			}
		}
		
		// in 3 ho co so dien max
		for(int i=0;i<3;i++) {
			Xuat(tmpchuHo[i],tmpsoDien[i]);
		}
		
		
	}
	
	//6) hien thi cac ho gia dinh tien truong
	private static void HienThiTenTruong(String[] chuHo , int[] soDien) {
		for(int i=0;i<chuHo.length;i++) {
			if(chuHo[i].compareToIgnoreCase("Truong")==0) {
				Xuat(chuHo[i],soDien[i]);
			}
		}
	}
	
	//7) Sap xep cac ho gia dinh theo bang chu cai
	private static void SapXepTheoChuCai(String[] chuHo , int[] soDien) {
		for(int i=0;i<chuHo.length;i++) 
			for(int j=i+1;j<chuHo.length;j++) {
				if(chuHo[i].compareTo(chuHo[j])>0) {
					int tmp1=soDien[i];
						soDien[i] = soDien[j];
						soDien[j] = tmp1;
					String tmpStr = String.valueOf(chuHo[i]);
					chuHo[i] = String.valueOf(chuHo[j]);
					chuHo[j] = String.valueOf(tmpStr);
				}
			}
	}	
	
	
	//8) Sap xep cac ho gia dinh theo kwh tang dan 
	private static void SapXepTheoKwhTang(String[] chuHo , int[] soDien) {
		for(int i=0;i<chuHo.length;i++) 
			for(int j=i+1;j<chuHo.length;j++) {
				if(soDien[i]>soDien[j]) {
					int tmp1=soDien[i];
						soDien[i] = soDien[j];
						soDien[j] = tmp1;
					String tmpStr = String.valueOf(chuHo[i]);
					chuHo[i] = String.valueOf(chuHo[j]);
					chuHo[j] = String.valueOf(tmpStr);
				}
			}
	}	
}
