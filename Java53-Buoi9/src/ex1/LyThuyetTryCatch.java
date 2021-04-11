package ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LyThuyetTryCatch {
	public static void main(String[] args) {
		
		//--------------------------------------------------------------------------------//
		
		// stack trace
		// tạo hàm nhanh từ code khác, bôi đen -> refactor -> extract method 
		// bắt ngoại lệ try-catch
		try { // nơi bọc các dòng code gây lỗi ở trong khối try
			divide();
			sayHello("hung");
		}catch(ArithmeticException e){ // bắt lại lỗi , 
			System.out.println("Không thể chia cho 0");
		}catch(NullPointerException e) {
			System.out.println("loi gi do");
		}catch (Exception e) {
			// chốt chặn cuối cùng như default của switch case , 
			System.out.println("Lỗi !");
		}
		
		//--------------------------------------------------------------------------------//
		
		//try-catch-finally hay dùng khi làm việc với file hoặc database;
		//Checked Exception Những lỗi có thể được trình biên dịch phát hiện ra khi báo đỏ gạch chân -> ta phải bắt lỗi nó
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		
		try {
			fileReader = new FileReader(new File("D:\\a.txt"));
			buffer = new BufferedReader(fileReader);
			String line;
			while((line = buffer.readLine()) != null) {
				System.out.println("-> "+line);
			}
		}catch(IOException e){  // IOException luôn dùng khi làm việc với file
			e.printStackTrace();
		}finally {
			// các lệnh cần phải chắc chắn sẽ được thực thi , bởi vì khi try catch xảy ra bắt lỗi thì nhưng câu lệnh sau sẽ không được thực thi
			// do vậy những lệnh cần chạy không được để trong try mà để trong finally , cho dù chương trình có drop thì khối lệnh trong finally vẫn chạy trước khi ctr stop
			// ví dụ việc đóng file luôn là cần thiết và quan trọng . do vậy chắc chắn cần đóng file dù exception có xảy ra hay không
			try {
				if (fileReader != null) fileReader.close();
				if(buffer !=null) buffer.close();
			} catch (Exception e2) {
				// nếu không cho 2 dòng trên vào try catch thì sẽ lỗi checked exp nên ta lại bắt lỗi nó nhưng không cần catch vì mang tính hình thức vượt qua checked exp
			}
		}
		
		
		//--------------------------------------------------------------------------------//
		
		//throw
		// dùng để chủ động ném ra exception 
		// throw là đối tượng nên có thể tạo ra bằng new
		// tự tạo ra lỗi mà hệ thống không bắt , mà ta muốn bắt
		// vd: nhapSinhVien (ten,tuoi,sdt)
		try {
			
			nhapThongTin();
			
			
		} catch (Exception e) {
			e.printStackTrace();// in lỗi đỏ 
		}
	}


	private static void nhapThongTin() throws NhapTuoiException { // nếu hàm có ném ra throw thì phải có throws báo ném ra lỗi gì
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten");
		String name = sc.nextLine();
		System.out.println("Nhap tuoi");
		int tuoi = Integer.parseInt(sc.nextLine()); // nêu snull ctr báo lỗi , Nhưng nhập -5 thì ct vẫn cho chạy nhưng tuổi >0 => ta phải bắt
		if(tuoi < 0) {
			NhapTuoiException error1 = new NhapTuoiException("Số liệu không hợp lệ !");
			throw  error1;
		}
		System.out.println("Nhap std");
		String phone = sc.nextLine();
		
		
		System.out.println("Ten "+name);
		System.out.println("Tuoi "+tuoi);
		System.out.println("Sdt "+phone);
	}
		
	
	// throws : khai báo ném ngoại lệ ra khỏi hàm
	// khi có throws thì sẽ hiểu là không try catch trong nội bộ hàm mà để hàm ném ra ngoài trả về nơi gọi hàm
	// thực tế sẽ sử dụng throws vì xủ lí ngoại lệ là của người dùng hàm , không phụ thuộc vào người viết hàm , sửa lỗi như nào theo í muốn của người dùng
	// ví dụ hàm có sẵn trong thư viện hầu hết đều có throws để cho người dùng hàm bắt lỗi theo í muốn trì hoãn ngoại lệ về nơi gọi hàm 
	// nhưng khi ở hàm main thì không throws nữa vì nó là vô tác dụng main là nơi cuối cùng trả về
		
	private static void sayHello(String name) {
		name = name.trim(); //
		System.out.println("Hello " + name);
	}

	private static void divide() throws ArithmeticException { // thows giúp cho mình biết hàm này ném ra lỗi gì
		int a = 4, b = 2; // nếu b=0 lỗi chia cho 0 ném ra ArithmeticException
		int c = a / b;
		System.out.println(c);
	}
	
	// ĐÓNG GÓI JAVA CHẠY ĐỘC LẬP ECLIP
	// dóng gói cần kiểm tra
	// cmd java -version > 8 thì cần vào build path -> config buid path -> library -> 1.8
	// xuât : export -> java -> runable ...,Thiết lập chỗ lưu file và chọn laugh configuation  chọn main của file cần xuât , 
	// chuyển cmd đến chỗ lưu file jar viết : 'java -jar Tenfile.jar'
	// đưa dữ liệu cho ct , đưa qua biến args trong hàm main của ct Xem gói Docfile
}
