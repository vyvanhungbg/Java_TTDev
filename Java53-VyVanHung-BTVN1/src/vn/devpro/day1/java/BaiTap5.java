package vn.devpro.day1.java;

import java.util.Scanner;

public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double chieuRong = sc.nextDouble();
		double chieuDai = sc.nextDouble();
		double chieuCao = sc.nextDouble();
		double sxq = 2*chieuDai*chieuCao + 2*chieuRong*chieuCao;
		double stp = sxq + chieuDai*chieuCao;
		double v = chieuDai*chieuRong*chieuCao;
		System.out.printf("sxq = %.3f %nstp = %.3f %nv = %.3f",sxq,stp,v);
	}

}
