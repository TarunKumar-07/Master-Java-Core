package com.masterCore;

public class P20_Synchronization implements Runnable {
	public static int a, b;

	public static void main(String[] args) {
		a = 100;
		b = 101;
		// Check the total amount shared between a and b before the transfers
		System.out.println("Total Before: " + (a + b));

		// Run threads which will transfer amounts between a and b
		Thread t1 = new Thread(new P20_Synchronization());
		Thread t2 = new Thread(new P20_Synchronization());
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		// Check the total amount shared between a and b after the transfers
		// It should be the same amount as before
		System.out.println("Total After: " + (a + b));
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			transfer();
		}
	}

	public static synchronized void transfer() {
		// Choose a random amount to transfer
		int amount = (int) (5.0 * Math.random());

		// Transfer between a and b
		if (a > b) {
			a -= amount;
			b += amount;
		} else {
			a += amount;
			b -= amount;
		}
	}

}
