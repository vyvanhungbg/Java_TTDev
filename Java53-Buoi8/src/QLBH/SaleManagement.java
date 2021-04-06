package QLBH;

public class SaleManagement {
	public static void main(String[] args) {
		System.out.println("\n==========Sale Mangenment Program");
		System.out.println("Press to chooes a function");
		System.out.println("\t1. Update the list of Sector");
		System.out.println("\t2. Update the list of Product");
		System.out.println("\t3. Update the list of Customers");
		System.out.println("\t4. Sales management");
		System.out.println("\t0. Exit !");
		int choose = Integer.parseInt(Support.sc.nextLine());
		switch (choose) {
		case 1: SectorManagement.execute(); break;
		case 2: ProductManagement.execute();break;
		case 3: CustomerManagement.execute();break;
		case 4: CartManagement.execute();break;
		case 0: System.exit(0);
		default:
			throw new IllegalArgumentException("Unexpected value: " + choose);
		}
		
	}
}
