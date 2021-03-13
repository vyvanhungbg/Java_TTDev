package btvn5.bai2;

import java.util.Scanner;



public class SinhVien {
	static Scanner sc = new Scanner(System.in);
	private String maSV;
	private String hoTen;
	private String ngaySinh;
	private String nganh;
	private int soHP;
	private HocPhan [] hp;
	
	

	

	public SinhVien(String maSV, String hoTen, String ngaySinh, String nganh, int soHP, HocPhan[] hp) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.nganh = nganh;
		this.soHP = soHP;
		this.hp = hp;
	}

	
	
	public String getMaSV() {
		return maSV;
	}



	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}



	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public String getNgaySinh() {
		return ngaySinh;
	}



	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}



	public String getNganh() {
		return nganh;
	}



	public void setNganh(String nganh) {
		this.nganh = nganh;
	}



	public int getSoHP() {
		return soHP;
	}



	public void setSoHP(int soHP) {
		this.soHP = soHP;
	}



	public HocPhan[] getHp() {
		return hp;
	}



	public void setHp(HocPhan[] hp) {
		this.hp = hp;
	}



	public void nhap() {
		System.out.println("Nhap ma sv : ");
		maSV = sc.nextLine();
		System.out.println("Nhap Ho Ten : ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh : ");
		ngaySinh= sc.nextLine();
		System.out.println("Nhap Nganh : ");
		nganh = sc.nextLine();
		System.out.println("Nhap so hp : ");
		soHP = Integer.parseInt(sc.nextLine()) ;
		hp = new HocPhan[soHP];
		for(int i=0;i<soHP;i++) {
			System.out.println("Nhap hoc phan "+i);
			hp[i] = new HocPhan();
			hp[i].nhap();
		}
	}
	
	public static void lable() {
		System.out.printf("%n%-10s %-10s %-10s %-10s  %-10s %n","maSV","hoTen","ngay Sinh","nganh","soHP");
	}
	
	
	public void sapxepHP() {
		for(int i=0;i<soHP;i++) {
			for(int j=i+1;j<soHP;j++) {
				if(hp[i].getTenHP().compareTo(hp[j].getTenHP())>0) {
					HocPhan tmp = hp[i];
					hp[i]=hp[j];
					hp[j]=tmp;
				}
			}
		}
	}
	
	public void display() {
		this.sapxepHP();
		System.out.printf("%-10s %-10s %-10s %-10s %-10d %n",maSV,hoTen,ngaySinh,nganh,soHP);
		System.out.printf("%n%-10s","STT");
		HocPhan.lable();
		for(int i=0;i<soHP;i++) {
			System.out.printf("%-10d",i+1);
			hp[i].display();
		}
		System.out.printf("%n%-10s %-10.3f %n","DiemTK",this.diemTK());
	}
	
	
	public void displayduoi6() {
		System.out.println("DS HP duoi 6 : ");
		//System.out.printf("%-10s %-10s %-10s %-10s %-10d %n",maSV,hoTen,ngaySinh,nganh,soHP);
		System.out.printf("%n%-10s","STT");
		HocPhan.lable();
		int j=0;
		for(int i=0;i<soHP;i++) {
			if(hp[i].getDiem()<6.0) {
			System.out.printf("%-10d",j+1);
			hp[i].display();
			j++;
			}
		}
	}
	
	public double diemTK() {
		double tongDiem=0;
		int tongTC=0;
		for(int i=0;i<soHP;i++) {
			tongDiem+=hp[i].getDiem()*hp[i].getSoTC();
			tongTC += hp[i].getSoTC();
		}
		return tongDiem/tongTC;
	}
	
	
	public void suaTT() {
		do {
			System.out.println("\n\t===MENU SUA TTSV=====");
			System.out.println("\t1. Sua Ho Ten");
			System.out.println("\t2. Sua ngay Sinh");
			System.out.println("\t3. Sua nganh");
			System.out.println("\t0. Thoat sua !");
			System.out.println("Nhap lua chon tuong ung ! ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: System.out.println("Nhap Ho Ten moi :");this.setHoTen(sc.nextLine());System.out.println("Sua ho Ten thanh cong !");break;
			case 2: System.out.println("Nhap ngay sinh moi :");this.setNgaySinh(sc.nextLine());System.out.println("Sua ngay sinh thanh cong !");break;
			case 3: System.out.println("Nhap nganh moi :");this.setNganh(sc.nextLine());System.out.println("Sua nganh thanh cong !");break;
			case 0: System.out.println("Da Thoat sua thong tin sv !"); return;
			default: System.out.println("Nhap sai ! nhap lai");
				
			}
		}while(true);
	}
	
	public void suaDiem() {
		System.out.println("\nNhap ma hoc phan tuong ung can sua");
		String tmpmahp = sc.nextLine();
		
		int i=0;
		while(i<soHP) {
			if(hp[i].getMaHP().equals(tmpmahp)) {
				do {
					
					System.out.println("\n\t===MENU SUA HP=====");
					System.out.println("\t1. Sua Ten HP");
					System.out.println("\t2. Sua SO TC");
					System.out.println("\t3. Sua Diem");
					System.out.println("\t0. Thoat sua !");
					System.out.println("Nhap lua chon tuong ung ! ");
					int chon = Integer.parseInt(sc.nextLine());
					switch (chon) {
					case 1: System.out.println("Nhap Ho Ten HP moi :");hp[i].setTenHP(sc.nextLine());System.out.println("Sua Ten HP thanh cong !");break;
					case 2: System.out.println("Nhap SO TC moi :");hp[i].setSoTC(Integer.parseInt(sc.nextLine()));System.out.println("Sua SO TC thanh cong !");break;
					case 3: System.out.println("Nhap Diem moi :");hp[i].setDiem(Double.parseDouble(sc.nextLine()));System.out.println("Sua Diem thanh cong !");break;
					case 0: System.out.println("Da Thoat sua thong tin HP !"); return;
					default: System.out.println("Nhap sai ! nhap lai");
						
					}
				}while(true);
			}
			i++;
		}
		if(i==soHP) {
			System.out.println("Khong tim thay mahp nay ! Thoat sua diem!");
		}
	}
}
