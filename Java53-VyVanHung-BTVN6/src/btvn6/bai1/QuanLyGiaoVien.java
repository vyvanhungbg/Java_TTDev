package btvn6.bai1;

import java.util.Scanner;

public class QuanLyGiaoVien {
	static Scanner sc = new Scanner(System.in);
	static Teacher[] list = {
			new Teacher(001, "NGUYEN V", "Long", new Date(29, 9, 2001), 6, new Subject(102, "VAN"), 7.5, 10),
			new Teacher(002, "TRAN V", "HAI", new Date(27, 5, 2001), 4, new Subject(101, "TOAN"), 5.2, 8),
			new Teacher(003, "TRAN T", "TU", new Date(13, 3, 2001), 5, new Subject(103, "ANH"), 2.4, 0),
			new Teacher(004, "VY V", "HUNG", new Date(22, 9, 2001), 7, new Subject(104, "LY"), 8.2, 0),
			new Teacher(005, "NGO Q", "KHANH", new Date(7, 2, 2001), 4, new Subject(105, "HOA"), 5.8, 10),
			new Teacher(006, "NGOC M", "PHAM", new Date(3, 11, 2001), 5, new Subject(106, "SINH"), 6, 8)
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;
		do {
		System.out.println("==========Quan Ly GIAO VIEN=========");
		System.out.println("\t 1. Hien thi Thong Tin Tat ca GV");
		System.out.println("\t 2. Hien thi Thong Tin GV Luong <5.000.000 ");
		System.out.println("\t 3. Them 1 GV mơi vao vi tri K ");
		System.out.println("\t 4. In ra Tong luong tat ca GV");
		System.out.println("\t 5. Chuyen cac GV khong co gio day xuong cuoi");
		System.out.println("\t 6. Sap xep DS GV theo Ten ");
		System.out.println("\t 0. Thoat chuong trinh ! ");
		System.out.print("Nhap lua chon (bam so tuong ung): ");
		chon = Integer.parseInt(sc.nextLine().trim());
			switch (chon) {
				case 1 : display(); break;
				case 2 : displaya_condition(); break;
				case 3 : Insert_K(); break;
				case 4 : SumSalary();break;
				case 5 : ChangeList();display();break;
				case 6 : SortByName();display();break;
				case 0: 
					System.out.println("Da thoat chuong trinh");
					return;
				default : System.out.printf("Lua chon khong hop le ! %nDa thoat chuong trinh");
					return ;
			} 
		}while(true);
	}
	
	// Hien thi All DS
	public static void display() {
		System.out.printf("%-10s","STT");
		Teacher.lable();
		int stt=0;
		for(Teacher i : list) {
			System.out.printf("%-10d",++stt);
			i.display();
		}
	}
	// Hien thi danh sach teacher luong <5000000
	public static void displaya_condition() {
		System.out.printf("%-10s","STT");
		Teacher.lable();
		int stt=0;
		for(Teacher i : list) {
			if(i.calcuSalary()<5000000) {
				System.out.printf("%-10d",++stt);
				i.display();
			}
		}
	}
	
	//Them 1 teacher vao ds
	public static void  Insert_K() {
		
		//nhap vi tri k
		int k;
		Teacher [] tmp = new Teacher[list.length+1]; 
		do {
			System.out.println("Nhap vi tri K chen");
			k = Integer.parseInt(sc.nextLine());
		} while (k<=0 || k> list.length+1);
		
		// nhap gv
		System.out.println("Nhap TT Giao Vien Them ");
		Teacher x = new Teacher();
		x.input();
		
		// chen
		int i=0,j=0;
		while(j<list.length+1) {
			if(j==k-1) {
				tmp[j] = x;
			}else {
				tmp[j] = list[i];
				i++;
			}
			j++;
		}
		list = tmp.clone();
		System.out.println("Chen Thanh Cong !");
	}
	
	// Tinh Tong salary all gv
	public static void SumSalary() {
		double sumSalary=0;
		for(Teacher i : list) {
			sumSalary+=i.calcuSalary();
		}
		System.out.printf("%nTong Luong cua tat ca gv : %-10.3f%n",sumSalary);
	}
	
	// Chuyen cac teacher khong co gio day xuong cuoi ds
	public static void ChangeList() {
		Teacher [] tmp = new Teacher[list.length]; 
		int end=list.length-1,start=0;
		for(int i=0;i<list.length;i++) {
			if(list[i].getNumberOfTeachingHours()==0) {
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
				if(list[i].getName().compareTo(list[j].getName())>0) {
					Teacher tmp = list[i];
					list[i]= list[j];
					list[j] = tmp;
				}
			}
		}
		
	}
}
