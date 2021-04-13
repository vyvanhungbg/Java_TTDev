package vidu1;

public class MyRun implements Runnable{

	@Override
	public void run() {
		// cong việc của luồng phụ ở đây
		// 
		for (int i = 0; i < 50; i++) {
			System.out.println("Phu 2: = "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
