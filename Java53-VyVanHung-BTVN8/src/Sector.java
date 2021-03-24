
import java.util.Scanner;

public class Sector {
	int id;
	String name;
	public Sector(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sector() {
		super();
	}
	
	public void input() {
		
		do {
			System.out.println("Input id");
			id = Integer.parseInt(Support.sc.nextLine());
			if(Sector.CheckInputSector(id)) {
				System.out.println("ID Sector found in list Sector \n Enter ID Sector Again !");
			}
		}while(Sector.CheckInputSector(id));
		System.out.println("Input name");
		name = Support.sc.nextLine();
		
	}
	public void display() {
		System.out.printf("%-10d %-10s %n",id,name);
	}
	
	public static boolean CheckInputSector(int idSector) {
		for(Sector i : SectorManagement.list) {
			if(idSector==i.id) {
				return true;
			}
		}
		return false;
		
	}
	
	
}
