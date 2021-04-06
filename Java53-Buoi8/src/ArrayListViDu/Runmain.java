package ArrayListViDu;

import java.util.ArrayList;
import java.util.Scanner;

public class Runmain {
	static ArrayList<Bai1> list  = new ArrayList<Bai1>();
	static Scanner sc = new Scanner(System.in);
	public static void init() {
		list.add(new Bai1(102, "Vy", "Hung", "01", "12//09//2001", "Java"));
		list.add(new Bai1(103, "Ngoc", "KHAi", "01", "11//11//2001", "Python"));
		list.add(new Bai1(104, "NGUYEN", "LONG", "24", "23//10//2001", "C++"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		do {
			System.out.println("Pess to choose");
			System.out.println("\t1. Display");
			System.out.println("\t2. Insert");
			System.out.println("\t3. Modify");
			System.out.println("\t4. Replace");
			System.out.println("\t5. Remove");
			System.out.println("\t Your choose....?");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1: Display();break;
			case 2: Insert();break;
			case 3: Modify();break;
			case 4: Replace();break;
			case 5: Remove();break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}while(true);
		
	}
	private static void Remove() {
		// TODO Auto-generated method stub
		System.out.println("--------Remove--------");
		System.out.println("Enter id of student : ");
		int index = -1;
		int id = Integer.parseInt(sc.nextLine());
		for(int i=0;i< list.size();i++) {
			if(list.get(i).getId() == id) {
				index = i;
				break;
			}
			
		}
		if(index == -1) {
			System.out.println("The student is not in list");
			return ;
		}
		list.remove(index);
		System.out.println("Remove is successful ");
	}
	private static void Replace() {
		// TODO Auto-generated method stub
		
			System.out.println("--------Replace--------");
			System.out.println("Enter id of student : ");
			int index = -1;
			int id = Integer.parseInt(sc.nextLine());
			for(int i=0;i< list.size();i++) {
				if(list.get(i).getId() == id) {
					index = i;
					break;
				}
				
			}
			if(index == -1) {
				System.out.println("The student is not in list");
				return ;
			}
			Bai1 newStudent = new Bai1(000, "000", "000", "000", "000", "0000");
			list.set(index, newStudent);
			System.out.println("Replace is successful ");
}
	private static void Modify() {
		// TODO Auto-generated method stub
		do {
			System.out.println("--------Modify--------");
			System.out.println("Enter id of student : ");
			int index = -1;
			int id = Integer.parseInt(sc.nextLine());
			for(int i=0;i< list.size();i++) {
				if(list.get(i).getId() == id) {
					index = i;
					break;
				}
				
			}
			if(index == -1) {
				System.out.println("The student is not in list");
				return ;
			}
			System.out.println("\n Press a key to modify ....");
			System.out.println("\t1. Name");
			System.out.println("\t2.Date of birth ");
			System.out.println("\t0. Exit ");
			System.out.println("You choose");
			int choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1: System.out.println(" New Name : ");list.get(index).setLastName(sc.nextLine());break;
			case 2: System.out.println(" New Date of birth : ");list.get(index).setBirth(sc.nextLine());break;
			case 0: return ;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choose);
			}
		}while (true);
		
	}
	
	private static void Insert() {
		// TODO Auto-generated method stub
		System.out.println("Insert a student into list");
		System.out.println("\tEnter your index 0 to " + (list.size()-(1)) +": ");
		int index = Integer.parseInt(sc.nextLine());
		Bai1 newStudent = new Bai1(113, "ABC", "DEF", "GHE", "NN", "lll");
		if(index <0 || index >list.size()-1 ) {
			System.err.println("Looi cmnr :( ");
		}else {
			list.add(index,newStudent);
			System.out.println("Insert is successful .....!");
		}
		
	}
	
	
	private static void Display() {
		// TODO Auto-generated method stub
		for(Bai1 i : list) {
			System.out.println(i.toString());
		}
	}
	
}
