package btvn7.bai1;

public class CongNhan extends NhanSu{
	XuongSX xuongSX = new XuongSX();
	String congViec;
	int soNgayCong;
	
	public void input() {
		super.input();
		xuongSX.nhap();
		System.out.println("Nhap cong Viec");
		congViec = sc.nextLine();
		System.out.println("Nhap so Ngay cong");
		soNgayCong = Integer.parseInt(sc.nextLine());
	}
	
	public static void label() {
		NhanSu.label();
		XuongSX.label();
		System.out.printf("%-10s %-12s %-9s %n","Cong Viec","So Ngay Lam","Luong");
	}
	
	public void output() {
		super.output();
		xuongSX.xuat();
		System.out.printf("%-10s %-12d %67.3f%n" ,congViec,soNgayCong,this.luong());
	}
	
	@Override
	public double luong() {
		// TODO Auto-generated method stub
		double luong=0;
		if(soNgayCong >= 23) {
			luong = soNgayCong *250000 + 500000;
		}else if(soNgayCong >=20) {
			luong = soNgayCong*250000+300000;
		}else if (soNgayCong>= 18) {
			luong = soNgayCong*250000;
		}else {
			luong = soNgayCong*250000-200000;
		}
		return luong;
	}

	public CongNhan(int maNs, String hoDem, String ten, int namSinh, String gioiTinh, XuongSX xuongSX, String congViec,
			int soNgayCong) {
		super(maNs, hoDem, ten, namSinh, gioiTinh);
		this.xuongSX = xuongSX;
		this.congViec = congViec;
		this.soNgayCong = soNgayCong;
	}

	public CongNhan() {
		super();
	}

	public XuongSX getXuongSX() {
		return xuongSX;
	}

	public void setXuongSX(XuongSX xuongSX) {
		this.xuongSX = xuongSX;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

	public int getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	
	
}
