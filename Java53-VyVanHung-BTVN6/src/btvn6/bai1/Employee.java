package btvn6.bai1;

import java.util.Scanner;

public class Employee {
	static Scanner sc = new Scanner(System.in);
	protected int code;
	protected String surname;
	protected String name;
	protected Date dateOfBirth = new Date();
	protected int yearWorking;
	
	public void input() {
		
		System.out.println("Nhap ma NV");
		code = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap ho Dem");
		surname = sc.nextLine();
		System.out.println("Nhap Ten");
		name = sc.nextLine();
		System.out.println("Nhap ngay sinh");
		dateOfBirth.nhap();
		System.out.println("Nhap Nam Lam Viec");
		yearWorking = Integer.parseInt(sc.nextLine());
	}
	
	public static void lable() {
		System.out.printf("%-10s %-10s %-10s %-15s %-15s","code","surname","name","dateOfBirth","yearWorking");
	}
	public void output() {
		System.out.printf("%-10d %-10s %-10s %-15s %-15d",code,surname,name,dateOfBirth.toString(),yearWorking);
		
	}
	
	// constructor
	public Employee(int code, String surname, String name, Date dateOfBirth, int yearWorking) {
		super();
		this.code = code;
		this.surname = surname;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.yearWorking = yearWorking;
	}

	public Employee() {
		super();
	}

	// setter and getter
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getYearWorking() {
		return yearWorking;
	}

	public void setYearWorking(int yearWorking) {
		this.yearWorking = yearWorking;
	}
	
	
	
	
}
