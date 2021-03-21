package btvn7.bai1;

public class CanBo extends NhanSu{
	Phong phong = new Phong();
	String chucVu;
	double heSoLuong;
	String xepLoai;
	
	public void input() {
		super.input();
		phong.nhap();
		System.out.println("Nhap chuc Vu");
		chucVu = sc.nextLine();
		System.out.println("Nhap he So Luong");
		heSoLuong = Double.parseDouble(sc.nextLine());
		System.out.println("Nhap Xep loai");
		xepLoai = sc.nextLine();
	}
	
	public static void label() {
		
		NhanSu.label();
		Phong.label();
		System.out.printf("%-10s %-8s %-7s %-9s %n" ,"","Chuc Vu","HS Luong","XepLoai","Luong");
	}
	
	public void output() {
		super.output();
		System.out.printf("%60s","");
		phong.xuat();
		System.out.printf("%-10s %-8.3f %-7s %-9.3f %n" ,chucVu,heSoLuong,xepLoai,this.luong());
	}
	@Override
	public double luong() {
		// TODO Auto-generated method stub
		double luong =0;
		if(xepLoai.equals("A")) {
			luong = heSoLuong*1150000 + 1000000;
		}else if (xepLoai.equals("B")) {
			luong = heSoLuong*1150000;
		}else if (xepLoai.equals("C")) {
			luong = heSoLuong*1150000-400000;
		}else {
			luong = heSoLuong*1150000-1000000;
		}
		return luong;
	}

	public CanBo(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, Phong phong, String chucVu,
			double heSoLuong, String xepLoai) {
		super(maNs, hoDem, ten, namSinh, gioiTinh);
		this.phong = phong;
		this.chucVu = chucVu;
		this.heSoLuong = heSoLuong;
		this.xepLoai = xepLoai;
	}

	public CanBo() {
		super();
	}

	public Phong getPhong() {
		return phong;
	}

	public void setPhong(Phong phong) {
		this.phong = phong;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public String getXepLoai() {
		return xepLoai;
	}

	public void setXepLoai(String xepLoai) {
		this.xepLoai = xepLoai;
	}

	
	
	
}
