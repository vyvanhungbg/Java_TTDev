package btvn6.bai1;

import java.util.Scanner;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ngay");
		day = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap thang");
		month = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap nam");
		year = Integer.parseInt(sc.nextLine());
	}
	
	public void display() {
		System.out.printf("%d//%d//%d",day,month,year);
	}

	@Override
	public String toString() {
		//String str = 
		return String.format("%d//%d//%d", day,month,year);
	}
	
	
	// constructor
	
	public Date() {
		super();
	}
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	// getter setter
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	

	
	
	
}
