import java.util.Scanner;

public class BaiTap2 {

	// TODO Auto-generated method stub
	static Scanner sc = new Scanner(System.in);
	static String[] vanDV = { "Thuong", "Binh", "Hung", "Duong", "Cong", "Truong", "Tung", "Giang", "Cuc", "Hue" }; // 1)
																													// tao
																													// ds																											// vdv
	static int[][] thanhTich = { { 2, 3, 4 }, { 7, 8, 2 }, { 8, 8, 5 }, { 9, 8, 3 }, { 2, 8, 2 }, { 8, 8, 8 },
			{ 9, 8, 10 }, { 10, 0, 2 }, { 6, 7, 7 }, { 7, 7, 6 }, };// 2) tao ds thanh tich

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int chon;
		do {
			System.out.println("Chon mot bai toan de giai quyet");
			System.out.println("\t 1. Hien thi DS");
			System.out.println("\t 2. Hien thi VDV co tong thanh tich cao nhat ");
			System.out.println("\t 3. Hien thi 3 VDV co tong thanh tich cao nhat ");
			System.out.println("\t 4. Sap xep danh sach theo bang chu cai");
			System.out.println("\t 5. Hien thi DS co ten vdv bat dau ki tu 'T' ");
			System.out.println("\t 6. Hien thi DS co ten vdv chua van 'an' ");
			System.out.println("\t 7. Sap xep danh sach theo chieu dai ten ");
			System.out.println("\t 8. Hien thi DS vdv co cung tong thanh tich va xep thu 2 ");
			System.out.println("\t 9. Hien thi DS vdv co lan cu ta 3 thap nhat ");
			System.out.println("\t 10. Hien thi DS vdv co lan cu ta 1 cao nhat ");
			System.out.println("\t 0. Thoat khoi chuong trinh");
			System.out.print("Nhap lua chon (bam so tuong ung): ");
			chon = Integer.parseInt(sc.nextLine().trim());
			switch (chon) {
			case 1:XuatAll(vanDV, thanhTich);break;
			
			case 2 : HienThiSVTTCaoNhat(vanDV, thanhTich); break;
			
			case 3 : HienThi3SVTTCaoNhat(vanDV, thanhTich); break;
			
			case 4 : SapXepTheoChuCai(vanDV, thanhTich);XuatAll(vanDV, thanhTich); break;
			
			case 5 : HienThiDSBatDauBangT(vanDV, thanhTich); break;
			
			case 6 : HienThiDSTenChuaVan_an(vanDV, thanhTich); break;
			
			case 7 : SapXepTangTheoChieuDaiTen(vanDV, thanhTich);XuatAll(vanDV, thanhTich); break;
			
			case 8 : HienThiDSCungTTVaXepT2(vanDV, thanhTich); break;
			
			case 9 : HienThiDSLanCuTa3Min(vanDV, thanhTich); break;
			
			case 10 : HienThiDSLanCuTa1Max(vanDV, thanhTich); break;
			case 0:
				System.out.println("Da thoat chuong trinh");
				return;
			default:
				System.out.printf("Lua chon khong hop le ! %nDa thoat chuong trinh");
				return;
			}
		} while (true);

	}

	// Ham tinh tong 3 thanh tich
		private static int TongTT(int [] tmp) {
			return tmp[0]+tmp[1]+tmp[2];
		}
		
	
	// Hien thi 1 thong tin 1 vdv
	private static void Xuat(String vanDV, int[] tmp) { 
	
		System.out.printf("%-12s  %-10d %-10d %-10d %-10d %n", vanDV, tmp[0], tmp[1], tmp[2],TongTT(tmp));
	}
	
	
	// 2) hien thi all thong tin
	private static void XuatAll(String[] vanDV, int[][] thanhTich) {
		for (int i = 0; i < vanDV.length; i++) {
			int[] tmp =  thanhTich[i];
			Xuat(vanDV[i], tmp);
		}
	}
	
	
	// Ham swap thanh tich
	private static void SwapTT(int [] tmp1 , int [] tmp2) {
		int tmp = tmp1[0];tmp1[0] = tmp2[0] ; tmp2[0] = tmp; // doi thanh thich lan 1
		tmp = tmp1[1];tmp1[1] = tmp2[1] ; tmp2[1] = tmp;  // 
		tmp = tmp1[2];tmp1[2] = tmp2[2] ; tmp2[2] = tmp; //
	}
	
	
	
	// Ham sap xep theo tong thanh tich giam dan
	private static void SapXepTongTTGiam(String [] vanDV , int[][] thanhTich) {
		for(int i=0;i<vanDV.length;i++) {
			for(int j=i+1;j<vanDV.length;j++) {
				if(TongTT(thanhTich[i]) < TongTT(thanhTich[j])) {
					String tmpStr = String.valueOf(vanDV[i]);
					vanDV[i] = String.valueOf(vanDV[j]);
					vanDV[j] = String.valueOf(tmpStr);
					
					SwapTT(thanhTich[i], thanhTich[j]);
				}
			}
		}
	}
	
	
	// 3) Hien thi thong tin van dong vien co t thanh tich cao nhat
	private static void HienThiSVTTCaoNhat(String[] vanDV, int[][] thanhTich) {
		
		SapXepTongTTGiam(vanDV, thanhTich);
		Xuat(vanDV[0],thanhTich[0]);
	}
	
	
	// 4) Hien thi 3 van dv co tong thanh tich cao nhat
	private static void HienThi3SVTTCaoNhat(String[] vanDV, int[][] thanhTich) {
		SapXepTongTTGiam(vanDV, thanhTich);
		Xuat(vanDV[0],thanhTich[0]);
		Xuat(vanDV[1],thanhTich[1]);
		Xuat(vanDV[2],thanhTich[2]);
	}
	
	// 5) sap xep ds vdv theo ten
	private static void SapXepTheoChuCai(String[] vanDV, int[][] thanhTich) {
		for(int i=0;i<vanDV.length;i++) {
			for(int j=i+1;j<vanDV.length;j++) {
				if(vanDV[i].compareTo(vanDV[j])>0) {
					String tmpStr = String.valueOf(vanDV[i]);
					vanDV[i] = String.valueOf(vanDV[j]);
					vanDV[j] = String.valueOf(tmpStr);
					
					SwapTT(thanhTich[i], thanhTich[j]);
				}
			}
		}
	}	
	
	// 6) hien thi danh sach co ten vdv bat dau bang chu 'T'
	private static void HienThiDSBatDauBangT(String[] vanDV, int[][] thanhTich) {
		for(int i=0;i<vanDV.length;i++) {
			if(Character.toString(vanDV[i].charAt(0)).equals("T")) {
				Xuat(vanDV[i], thanhTich[i]);
			}
		}
	}
	
	// 7) hien thi danh sach co ten vdv chua van 'an'
		private static void HienThiDSTenChuaVan_an(String[] vanDV, int[][] thanhTich) {
			for(int i=0;i<vanDV.length;i++) {
				if(vanDV[i].contains("an")) {
					Xuat(vanDV[i], thanhTich[i]);
				}
			}
		}
		
		
	// 8) sapp xep ds theo chieu dai ten tang dan
		
		private static void SapXepTangTheoChieuDaiTen(String[] vanDV, int[][] thanhTich) {
			for(int i=0;i<vanDV.length;i++) {
				for(int j=i+1;j<vanDV.length;j++) {
					if(vanDV[i].length() > vanDV[j].length()) {
						String tmpStr = String.valueOf(vanDV[i]);
						vanDV[i] = String.valueOf(vanDV[j]);
						vanDV[j] = String.valueOf(tmpStr);
						
						SwapTT(thanhTich[i], thanhTich[j]);
					}
				}
			}
		}	
		
	// 9) Hien thi DS vdv co cung thanh tich nhung xep thu 2
		private static void HienThiDSCungTTVaXepT2(String[] vanDV, int[][] thanhTich) {
			boolean[] visit = new boolean[vanDV.length];
			// khoi tao all false;
			for(int i=0;i<visit.length;i++) {
				visit[i]= false;
			}
			//
			for(int i=0;i<vanDV.length;i++) {
				for(int j=i+1;j<vanDV.length;j++) {
					if(TongTT(thanhTich[i])==TongTT(thanhTich[j]) ) {
						if(visit[i] == false ) {
							Xuat(vanDV[j], thanhTich[j]);
							
						}
						visit[i] = true;
						visit[j] = true;
					}
				}
			}
			
		}
		
		
	// 10) Hien thi DS cac vdv co lan cu ta 3 thap nhat 
		private static void HienThiDSLanCuTa3Min(String[] vanDV, int[][] thanhTich) {
			int minTT3 = thanhTich[0][2];
			for(int i=1;i<vanDV.length;i++) {
				if(minTT3 > thanhTich[i][2]) {
					minTT3 = thanhTich[i][2];
				}
			}
			
			for(int i=0;i<vanDV.length;i++) {
				if(thanhTich[i][2]==minTT3) {
					Xuat(vanDV[i], thanhTich[i]);
				}
			}
		}
		
		// 11) Hien thi DS cac vdv co lan cu ta 1 cao nhat 
				private static void HienThiDSLanCuTa1Max(String[] vanDV, int[][] thanhTich) {
					int maxTT1 = thanhTich[0][0];
					for(int i=1;i<vanDV.length;i++) {
						if(maxTT1 < thanhTich[i][0]) {
							maxTT1 = thanhTich[i][0];
						}
					}
					
					for(int i=0;i<vanDV.length;i++) {
						if(thanhTich[i][0]==maxTT1) {
							Xuat(vanDV[i], thanhTich[i]);
						}
					}
				}
		
}
