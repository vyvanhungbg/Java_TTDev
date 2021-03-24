import java.util.ArrayList;



public class ProductInCart {
	int id;
	int idSector;
	String nameOfProduct;
	int numberOfProduct;
	double price;
	
	
	public ProductInCart() {
		super();
	}
	public ProductInCart(int id, int idSector, String nameOfProduct, int numberOfProduct, double price) {
		super();
		this.id = id;
		this.idSector = idSector;
		this.nameOfProduct = nameOfProduct;
		this.numberOfProduct = numberOfProduct;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdSector() {
		return idSector;
	}
	public void setIdSector(int idSector) {
		this.idSector = idSector;
	}
	public String getNameOfProduct() {
		return nameOfProduct;
	}
	public void setNameOfProduct(String nameOfProduct) {
		this.nameOfProduct = nameOfProduct;
	}
	public int getNumberOfProduct() {
		return numberOfProduct;
	}
	public void setNumberOfProduct(int numberOfProduct) {
		this.numberOfProduct = numberOfProduct;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	public static int InputIDSector() {
		int tmp;
		do {
			tmp = Integer.parseInt(Support.sc.nextLine());
			if(!Sector.CheckInputSector(tmp)) {
				System.out.println("ID Sector can not find in list Sector \n Enter ID Sector Again !");
			}
		}while(!Sector.CheckInputSector(tmp));
		return tmp;
		
	}
	public void input() {
		
		do {
			System.out.println("Input id Product");
			id = Integer.parseInt(Support.sc.nextLine());
			if(CheckInputIDProduct(id)) {
				System.out.println("ID Sector found in list Product \n Enter ID Product Again !");
			}
		}while(CheckInputIDProduct(id));
		System.out.println("Input ID Sector ");
		idSector = InputIDSector();
		System.out.println("Input Name of Product ");
		nameOfProduct = Support.sc.nextLine();
		System.out.println("Input Number of Product ");
		numberOfProduct = Integer.parseInt(Support.sc.nextLine());
		System.out.println("Input Price of Product ");
		price = Double.parseDouble(Support.sc.nextLine());
	}
	
	public void output() {
		System.out.printf("%-10d %-10d %-10s %-10d %-10.3f %n",id,idSector,nameOfProduct,numberOfProduct,price);
		
	}
	
	public static boolean CheckInputIDProduct(int idProduct) {
		for(ProductInCart i : ProductManagement.list) {
			if(idProduct==i.id) {
				return true;
			}
		}
		return false;
		
	}
}
