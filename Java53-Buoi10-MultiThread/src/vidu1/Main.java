package vidu1;

public class Main {
	public static void main(String[] args) {
		// tạo luồng dùng class Thread
		
		//1 tạo class mới
		//2 cho class kế thừa claass Thread
		//3 Override hàm run()
		//4 triển khai cv của luồng phụ trong hàm run
		
		// dùng class mới để tạo luồng
		MyThread t1 = new MyThread();
		// khởi chạy
		t1.start();
		
		
		
		
		
		
		
		// DÙNG INTERFACE RUNABLE
		//1 tạo một class mới
		//2 inplement interface runable trên class mới
		//3 override hàm run
		// triển khai cv của luông phụ trong hàm run
		
		MyRun run = new MyRun();
		Thread t2 = new Thread(run);
		//
		t2.start();
		
		int numCores = Runtime.getRuntime().availableProcessors();
		System.out.println("Core :"+numCores);
		
		
		/// cv hàm main
		for (int i = 0; i < 50; i++) {
			System.out.println("Main : = "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
