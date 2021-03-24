import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManagement {
	protected static ArrayList<ProductInCart> list = new ArrayList<ProductInCart>();
	
	public static void execute() {
		list.add(new ProductInCart(102, 345, "BMW", 20, 5000)); // khoi tao test
		list.add(new ProductInCart(103, 347, "ABC", 10, 5000));
		list.add(new ProductInCart(104, 346, "Iphone", 14, 5000));
		do {
			
			System.out.println("\n==========Product Mangenment Program============");
			System.out.println("Press to chooes a function");
			System.out.println("\t1. Display All Product");
			System.out.println("\t2. Add a Product");
			System.out.println("\t3. Modify Product");
			System.out.println("\t4. Delete Product");
			System.out.println("\t5. Sort By Name Product");
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
	private static void Display() {
		int stt=0;
		System.out.printf("%-10s","STT");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %n","id","idSector","name","numberOfPr","price");
		for(ProductInCart i : list) {
			System.out.printf("%-10d",++stt);
			i.output();
		}
		
	}
	private static void SortByName() {
		Collections.sort(list, new Comparator<ProductInCart>() {
		
			@Override
			public int compare(ProductInCart o1, ProductInCart o2) {
				// TODO Auto-generated method stub
				return o1.getNameOfProduct().compareTo(o2.getNameOfProduct()) > 0? 1:-1;
			}
		});
		System.out.println("Successfully!");
	}
	private static void Delete() {
		System.out.println("Input id of the product to delete ");
		int idInput = Integer.parseInt(Support.sc.nextLine());
		int index=-1;
		for(int i=0;i<list.size();i++) {
			if(idInput == (list.get(i).id)) {
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
		System.out.println("Input id of the Product to modify ");
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
		do {
			System.out.println("\t1. Modify ID_Sector");
			System.out.println("\t2. Modify Name Of Product");
			System.out.println("\t3. Modify Number Of Product ");
			System.out.println("\t4. Modify Price Of Product");
			int choose = Integer.parseInt(Support.sc.nextLine());
			switch(choose) {
			case 1 : list.get(index).setIdSector(ProductInCart.InputIDSector());System.out.println("Modify id Sector is Success");break;
			case 2 : list.get(index).setNameOfProduct(Support.sc.nextLine());System.out.println("Modify Name of Procduct is Success");break;
			case 3 : list.get(index).setNumberOfProduct(Integer.parseInt(Support.sc.nextLine()));System.out.println("Modify Number of Procduct is Success");break;
			case 4 : list.get(index).setPrice(Double.parseDouble(Support.sc.nextLine()));System.out.println("Modify Price of Procduct is Success");break;
			default : System.out.println("Eror !");
			}
		}while(true);
		
		
	}
	private static void Add() {
		System.out.println("Input a Product");
		ProductInCart tmp = new ProductInCart();
		tmp.input();
		list.add(tmp);
		System.out.println("Successfully!");
		
	}
	

}
