package java53.bai2;

import java.util.Scanner;

public class ToaDo {
	double x,y;
	
	public void nhap(ToaDo a) {
		Scanner sc = new Scanner(System.in);
		//a.x = Double.parseDouble(sc.nextLine().trim());
		//a.y = Double.parseDouble(sc.nextLine().trim());
		a.x = sc.nextInt();
		a.y = sc.nextInt();
	}
}
