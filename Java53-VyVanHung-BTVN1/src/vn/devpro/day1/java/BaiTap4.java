package vn.devpro.day1.java;

import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double canhA = sc.nextDouble();
		double canhB = sc.nextDouble();
		double canhC =  sc.nextDouble();
		double chuVi = canhA + canhB + canhC;
		double nuaChuVi = chuVi/2.0;
		double dienTich = Math.sqrt(nuaChuVi*(nuaChuVi-canhA)*(nuaChuVi-canhB)*(nuaChuVi-canhC));
		System.out.printf("S = %.3f %nC = %.3f ",dienTich,chuVi);
	}

}
