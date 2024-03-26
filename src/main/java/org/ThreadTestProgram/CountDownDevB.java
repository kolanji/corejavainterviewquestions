package org.ThreadTestProgram;

import java.util.concurrent.CountDownLatch;

public class CountDownDevB extends Thread {
	
	private CountDownLatch latch;

	public CountDownDevB(CountDownLatch count, String name) {
		super(name);
		this.latch = count;

	}

	public void run() {
		System.out.println("CountDownDEVB Task " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished the devtools" + Thread.currentThread().getName());
		latch.countDown();

	}

}
