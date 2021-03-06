package java53.bai2;

public class TamGiac {
	ToaDo a,b,c;
	public TamGiac(ToaDo A, ToaDo B, ToaDo C) {
		// TODO Auto-generated constructor stub
		a=A;
		b=B;
		c=C;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public double DoDai(ToaDo a, ToaDo b) {
		return Math.sqrt((a.x-b.x)*(a.x-b.x) + (a.y-b.y)*(a.y-b.y));
	}
	
	public double ChuVi() {
		return DoDai(a,b)+DoDai(b,c)+DoDai(a,c);
	}
	
	public double DienTich() {
		double p = ChuVi()/2.0;
		return Math.sqrt(p*(p-DoDai(a,b))*(p-DoDai(a,c))*(p-DoDai(b,c)));
	}
	
	public double BanKinhNgoaiTiep() {
		return (DoDai(a,b)*DoDai(b,c)*DoDai(a,c))/(4.0*DienTich());
	}
}
