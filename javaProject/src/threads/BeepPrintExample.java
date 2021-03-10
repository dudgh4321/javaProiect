package threads;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		for (int i = 0; i > 5; i++) {
			System.out.println("띵");
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// Thread 상속받아서새로운 WorkerThread 클래스 생성.
//			Thread thread = new WorkerThread();
//			thread.start();

// Runnable I/F 구현하는 클래스를 Thread(new Runnable())의 생성자 매개값.
//			Thread thread = new Thread(new NewThread());
//			thread.start();
//
//			// Runnable I/F 구현하는 익명 클래스를 생성.
//			thread = new Thread(new Runnable() {
//				
//			
//			
//			
//			
//			System.out.println("띵");
//		}
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}
