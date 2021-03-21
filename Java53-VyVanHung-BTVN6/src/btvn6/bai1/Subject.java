package btvn6.bai1;

import java.util.Scanner;



public class Subject {
	private int code;
	private String name;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma MH");
		code = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ten MH");
		name = sc.nextLine();
	}
	
	public void display() {
		System.out.printf("%-10d %-10s",code,name);
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%-13d %-10s", code,name);
	}

	// constructor
	public Subject(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	public Subject() {
		super();
	}

	// getter and setter
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
