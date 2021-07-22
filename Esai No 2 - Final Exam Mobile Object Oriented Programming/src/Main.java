
public class Main extends Thread{

	public void run() {
		System.out.println("Thread Active");
	}

	public static void main(String[] args) {

	Main M1 = new Main();
	M1.start();
	
	Test T1 = new Test("Thread Nomor");
	T1.start();
	
	Test T2 = new Test("Thread Umur");
	T2.start();
	
		
	}
}
