package vidu1;

public class MyThread extends Thread{
	// viết run + strl + space + enter
	@Override
	public void run() { // entry point // điểm bắt đầu để chạy của luồng chính (MAin thread
		// những gì cần thực hiện trên hàm (luồng) phụ
		for (int i = 0; i < 50; i++) {
			System.out.println("Phu : = "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
