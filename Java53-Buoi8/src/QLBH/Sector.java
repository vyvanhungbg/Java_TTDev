package QLBH;
import java.util.Scanner;

import QLBH.*;
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
		System.out.println("Nhap id");
		id = Integer.parseInt(Support.sc.nextLine());
		System.out.println("Nhap name");
		name = Support.sc.nextLine();
		
	}
	public void display() {
		System.out.printf("%-10d %-10s ",id,name);
	}
}
