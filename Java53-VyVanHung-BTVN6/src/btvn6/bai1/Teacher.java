package btvn6.bai1;

public class Teacher extends Employee{
	private Subject subject = new Subject();
	private double coefficientsSalary;
	private int numberOfTeachingHours;
	
	// constructor
	public Teacher(int code, String surname, String name, Date dateOfBirth, int yearWorking, Subject subject,
			double coefficientsSalary,  int numberOfTeachingHours) {
		super(code, surname, name, dateOfBirth, yearWorking);
		this.subject = subject;
		this.coefficientsSalary = coefficientsSalary;
		this.numberOfTeachingHours = numberOfTeachingHours;
	}

	// getter and setter
	public Teacher() {
		super();
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}


	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}


	public int getNumberOfTeachingHours() {
		return numberOfTeachingHours;
	}


	public void setNumberOfTeachingHours(int numberOfTeachingHours) {
		this.numberOfTeachingHours = numberOfTeachingHours;
	}
	
	// phuong thuc
	public void input() {
		super.input();
		System.out.println("Nhap Thong tin Mon hoc");
		subject.nhap();
		System.out.println("Nhap he so luong");
		coefficientsSalary = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap so gio day");
		numberOfTeachingHours = Integer.parseInt(sc.nextLine());
		
	}
	
	public static void lable() {
		Employee.lable();
		System.out.printf("%-12s %-10s %-17s %-18s %-15s %n","CodeSJ","Subject","coefficient","salary","TeachingHours");
	}
	
	public void display() {
		super.output();
		System.out.printf("%-12s  %-15.3f %-18.3f %-15d %n",subject.toString(),coefficientsSalary,this.calcuSalary(),numberOfTeachingHours);
	}
	
	
	public void output() {
		lable();
		super.output();
		System.out.printf("%-12s  %-15.3f %-18.3f %-15d %n",subject.toString(),coefficientsSalary,this.calcuSalary(),numberOfTeachingHours);
	}
	
	public double calcuSalary() {
		return coefficientsSalary*1150000+numberOfTeachingHours*60000;
	}
}
