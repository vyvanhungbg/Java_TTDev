package btvn5.bai1;

import java.util.Scanner;

public class SinhVien {
	static Scanner sc = new Scanner(System.in);
	private String maSV;
	private String hoDem;
	private String ten;
	private int namSinh;
	private String gioiTinh;
	private int soHP;
	private HocPhan [] hp;
	
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVien(String maSV, String hoDem, String ten, int namSinh, String gioiTinh, int soHP, HocPhan[] hp) {
		super();
		this.maSV = maSV;
		this.hoDem = hoDem;
		this.ten = ten;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soHP = soHP;
		this.hp = hp;
		
	}
	
	
	
	
	public String getHoDem() {
		return hoDem;
	}

	public void setHoDem(String hoDem) {
		this.hoDem = hoDem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
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
		System.out.println("Nhap Ho Dem : ");
		hoDem = sc.nextLine();
		System.out.println("Nhap ten : ");
		ten = sc.nextLine();
		System.out.println("Nhap nam sinh : ");
		namSinh= Integer.parseInt(sc.nextLine()) ;
		System.out.println("Nhap gioi tinh : ");
		gioiTinh = sc.nextLine();
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
		System.out.printf("%n%-10s %-10s %-10s %-10s %-10s %-10s %n","maSV","hoDem","ten","namSinh","gioiTinh","soHP");
	}
	
	public void display() {
		System.out.printf("%-10s %-10s %-10s %-10d %-10s %-10d %n",maSV,hoDem,ten,namSinh,gioiTinh,soHP);
		System.out.printf("%n%-10s","STT");
		HocPhan.lable();
		for(int i=0;i<soHP;i++) {
			System.out.printf("%-10d",i+1);
			hp[i].display();
		}
		System.out.printf("%n%-10s %-10.3f %n","DiemTK",this.diemTK());
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
			
			System.out.println("\t1. Sua Ho dem");
			System.out.println("\t2. Sua Ten");
			System.out.println("\t3. Sua Nam Sinh");
			System.out.println("\t4. Sua Gioi Tinh");
			System.out.println("\t0. Thoat sua !");
			System.out.println("Nhap lua chon tuong ung ! ");
			int chon = Integer.parseInt(sc.nextLine());
			switch (chon) {
			case 1: System.out.println("Nhap ho dem moi :");this.setHoDem(sc.nextLine());System.out.println("Sua ho dem thanh cong !");break;
			case 2: System.out.println("Nhap ten moi :");this.setTen(sc.nextLine());System.out.println("Sua ten thanh cong !");break;
			case 3: System.out.println("Nhap nam sinh moi :");this.setNamSinh(Integer.parseInt(sc.nextLine()));System.out.println("Sua nam sinh thanh cong !");break;
			case 4: System.out.println("Nhap gioi tinh moi :");this.setGioiTinh(sc.nextLine());System.out.println("Sua gioi tinh thanh cong !");break;
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
				System.out.println("Nhap diem can sua");
				hp[i].setDiem(Double.parseDouble(sc.nextLine()));
				System.out.println("Sua thanh cong diem !");
				break;
			}
			i++;
		}
		if(i==soHP) {
			System.out.println("Khong tim thay mahp nay ! Thoat sua diem!");
		}
	}
}
