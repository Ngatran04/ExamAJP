package Exam2;

public class Thread2 extends Thread {
	@Override
	public void run() {
		super.run();
		super.run();
		try {
			for (int i = 1; i <= 99; i++) {
				if (i % 2 != 0) {
					System.out.println("--"+i);
				}
				Thread.sleep(50);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
