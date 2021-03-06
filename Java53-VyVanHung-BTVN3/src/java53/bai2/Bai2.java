package java53.bai2;

import java.util.Scanner;

public class Bai2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;
		do {
		System.out.println("Chon mot bai toan de giai quyet");
		System.out.println("\t 1. Bai 1) Doc chu so");
		System.out.println("\t 2. Bai 2) Tinh gia tri bieu thuc");
		System.out.println("\t 3. Bai 3) Tinh Tien mua gao");
		System.out.println("\t 4. Bai 4) Tam giac");
		System.out.println("\t 0. Thoat khoi chuong trinh");
		System.out.print("Nhap lua chon (bam so tuong ung): ");
		chon = Integer.parseInt(sc.nextLine().trim());
			switch (chon) {
				case 1 : DocChuSo(); break;
				case 2 : TinhBieuThuc(); break;
				case 3 : TienMuaGao(); break;
				case 4 : TamGiac(); break;
				case 0: 
					System.out.println("Da thoat chuong trinh");
					return;
				default : System.out.printf("Lua chon khong hop le ! %nDa thoat chuong trinh");
					return ;
			} 
		}while(true);
	}
	
	// Bai 1 
	private static void DocChuSo() {
		System.out.print("Nhap so 1 chu so : ");
		int number = Integer.parseInt(sc.nextLine().trim());
		switch(number) {
		case 1: System.out.println("So mot");break;
		case 2: System.out.println("So hai");break;
		case 3: System.out.println("So ba");break;
		case 4: System.out.println("So bon");break;
		case 5: System.out.println("So nam");break;
		case 6: System.out.println("So sau");break;
		case 7: System.out.println("So bay");break;
		case 8: System.out.println("So tam");break;
		case 9: System.out.println("So chin");break;
		case 0: System.out.println("So khong");break;
		default : System.out.println("Vui Long ! Nhap so 1 chu so  !");
		}
	}
	
	// Bai 2 Tính giá trị biểu thức
	private static void TinhBieuThuc() {
		System.out.print("Nhap x = ");
		double y=1.0,x = Double.parseDouble(sc.nextLine().trim());
		
		if(x>2.0 && x<3.0) {
			y = 5*Math.cos(3*x+2) - Math.log(2*x + 2);
		}
		if(x >=3.0){
			y = (x + 3)*(x + 3);
		}
		System.out.printf("Gia tri cua bieu thuc la : %.3f %n",y);
	}
	
	// Bai  3 Tinh tien mua gao
	private static void TienMuaGao() {
		double money=0;
		System.out.print("Nhap so can gao : ");
		int m = Integer.parseInt(sc.nextLine().trim());
		if(m>=1 && m<=50) {
			money = m*14000;
		}else if (m>50 && m<=75) {
			money = m*14000 - (m-50)*500;
		}else if (m>75 && m<=90) {
			money = m*14000 - 25*500 - (m-75)*750;
		}else if (m>90 && m<=105) {
			money = m*14000 - 25*500 - 15*750 - (m-90)*1000;
		}else {
			money = m*14000 - 25*500 - 15*750 - 15*1000 - (m-105)*1500;
		}
		if(m>0) {
		System.out.printf("So tien phai tra cho %d can gao la : %.2f %n",m,money);
		}else {
			System.out.println("Nhập sai!, so can gạo la so nguyen : ");
		}
	}
	
	// Bai 4 Tam giác
	private static void TamGiac() {
		ToaDo A = new ToaDo();
		ToaDo B = new ToaDo();
		ToaDo C = new ToaDo();
		System.out.println("Nhap lan luot  x , y  cho toa do A");
		A.nhap(A);
		System.out.println("Nhap lan luot  x , y  cho toa do B");
		B.nhap(B);
		System.out.println("Nhap lan luot  x , y  cho toa do C");
		C.nhap(C);
		TamGiac X = new TamGiac(A,B,C);
		double ab = X.DoDai(A, B) , ac = X.DoDai(A, C),bc = X.DoDai(B, C);
		System.out.printf("AB = %.2f, BC = %.2f , AC = %.2f %n",ab,bc,ac);
		if(ab==bc && ab==ac) {
			System.out.println("Ba diem trung nhau !");
		}else if(ab+bc == ac || ab+ac == bc || ac+bc == ab) {
			System.out.println("Ba diem thang hang !");
		}else {
			System.out.printf("Chu Vi : %.3f %n",X.ChuVi());
			System.out.printf("Dien Tich : %.3f %n",X.DienTich());
			System.out.printf("Ban Kinh Ngoai Tiep : %.3f %n",X.BanKinhNgoaiTiep());
		}
		
	}
}
