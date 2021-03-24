

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SectorManagement {
	protected static ArrayList<Sector> list = new ArrayList<Sector>();
	public static void execute() {
		list.add(new Sector(345, "Car")); // khoi tao de test
		list.add(new Sector(347, "Book"));
		list.add(new Sector(346, "Mobile phone"));
		// TODO Auto-generated method stub
		do {
			
			System.out.println("\n==========Sector Mangenment Program============");
			System.out.println("Press to chooes a function");
			System.out.println("\t1. Display All Sector");
			System.out.println("\t2. Add a Sector");
			System.out.println("\t3. Modify Sector");
			System.out.println("\t4. Delete Sector");
			System.out.println("\t5. Sort By Name Sector");
			System.out.println("\t0. Exit !");
			int choose = Integer.parseInt(Support.sc.nextLine());
			switch (choose) {
			case 1: Display(); break;
			case 2: Add();break;
			case 3: Modify();break;
			case 4: Delete();break;
			case 5: SortByName();break;
			case 0: return ;
			default:
				System.out.println("Unexpected value: " + choose);
				return ;
			}
		}while(true);
	}
	private static void SortByName() {
		Collections.sort(list, new Comparator<Sector>() {
			@Override
			public int compare(Sector o1, Sector o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName()) > 0? 1:-1;
			}
		});
		System.out.println("Successfully!");
	}
	private static void Delete() {
		System.out.println("Input id of the sector to delete ");
		int idInput = Integer.parseInt(Support.sc.nextLine());
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(idInput==(list.get(i).id)) {
				index = i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("The id not invalid ! ");
			return;
		}
		list.remove(index);
		System.out.println("Successfully!");
	}
	private static void Modify() {
		System.out.println("Input id of the sector to modify ");
		int idInput = Integer.parseInt(Support.sc.nextLine());
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(idInput==(list.get(i).id)) {
				index = i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("The id not invalid ! ");
			return;
		}
		System.out.println("Input Name Sector");
		list.get(index).setName(Support.sc.nextLine());
		System.out.println("Successfully!");
	}
	private static void Add() {
		
		System.out.println("Input a sector");
		Sector tmp = new Sector();
		tmp.input();
		list.add(tmp);
		System.out.println("Successfully!");
		
	}
	private static void Display() {
		System.out.printf("%-10s %-10s %n","ID Sector","Name Sector");
		for(Sector i : list) {
			i.display();
		}
		
	}

}
