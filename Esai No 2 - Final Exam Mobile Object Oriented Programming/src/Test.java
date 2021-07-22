
public class Test implements Runnable {
	
	private Thread t;
	private String NamaThread;
		
	public Test(String Nama) {
		NamaThread = Nama;
		System.out.println("Creating " + NamaThread);
	}

	@Override
	public void run() {
		System.out.println("Running " + NamaThread);
		try {
			for (int i = 0; i < 11; i++) {
				System.out.println("Thread: " + NamaThread + ":" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread: " + NamaThread + " Interrupted");
		}
			System.out.println("Thread: " + NamaThread + " Exiting");
		
	}
	
	public void start() {
		System.out.println("Starting" + NamaThread);
		if (t == null) {
			t = new Thread (this,NamaThread);
			t.start();
		}
	}

}
