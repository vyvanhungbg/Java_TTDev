package java53.bai3;

import java.util.Scanner;

public class Bai3 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;
		do {
		System.out.println("Chon mot bai toan de giai quyet");
		System.out.println("\t 1. Bai 1) Giai thua so  khong am");
		System.out.println("\t 2. Bai 2) Tim so dao nguoc ");
		System.out.println("\t 3. Bai 3) Tinh e^x");
		System.out.println("\t 4. Bai 4) Phan so toi gian");
		System.out.println("\t 0. Thoat khoi chuong trinh");
		System.out.print("Nhap lua chon (bam so tuong ung): ");
		chon = Integer.parseInt(sc.nextLine().trim());
			switch (chon) {
				case 1 : Bai1();; break;
				case 2 : Bai2(); break;
				case 3 : Bai3(); break;
				case 4 : Bai4(); break;
				case 0: 
					System.out.println("Da thoat chuong trinh");
					return;
				default : System.out.printf("Lua chon khong hop le ! %nDa thoat chuong trinh");
					return ;
			} 
		}while(true);
	}
	
	private static int GiaiThua(int n) {
		if (n<0) {
			return -1;
		}
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*GiaiThua(n-1);
		}
	}
	
	// bai 1
	
	private static void Bai1() {
		System.out.println("Nhap n khong am : ");
		int n = Integer.parseInt(sc.nextLine().trim());
		System.out.printf("%d! = %d %n",n,GiaiThua(n));
	}
	// bai 2 
	private static void Bai2() {
		System.out.println("Nhap n nguyen duong : ");
		int m=0,n = Integer.parseInt(sc.nextLine().trim());
		while(n%10!=0){
			m = m*10 + n%10;
			n /= 10;
		}
		System.out.printf("So dao nguoc la %d %n",m);
	}
	// bai 3
	private static double E(double x,int i) {
		return Math.pow(x, i)/(1.0*GiaiThua(i));
	}
	private static void Bai3() {
		System.out.println("Nhap x : ");
		double x = Double.parseDouble(sc.nextLine().trim());
		double e=0;
		double epsilon=0.0000001;
		int i=0;
		do {
			e += E(x,i++);
		}while(Math.abs(e+E(x,i))-Math.abs(e)>epsilon);
		System.out.printf("e^%.2f = %.4f %n",x,e);
		
	}
	
	// bai 4
	private static int UCLN (int a, int b) {
		if(b == 0) return a;
		if (a%b == 0) return b;
		return UCLN(b,a % b);
	}
	
	private static void Bai4() {
		System.out.println("Nhap  tu so : ");
		int tuSo =  Integer.parseInt(sc.nextLine().trim());
		System.out.println("Nhap  mau so : ");
		int mauSo =  Integer.parseInt(sc.nextLine().trim());
		System.out.printf("%d/%d = ",tuSo,mauSo);
			int ucln = UCLN(tuSo,mauSo);
			tuSo /= ucln;
			mauSo /= ucln;
		System.out.printf("%d/%d %n",tuSo,mauSo);
	}
}
