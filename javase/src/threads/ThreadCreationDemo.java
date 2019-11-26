package threads;

class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(this.getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class ThreadCreationDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1, t2, t3;

		t1 = new MyThread("First");// born state or new state
		t2 = new MyThread("Second");
		t3 = new MyThread("Third");

		t1.start();// ready
		t2.start();
		t3.start();

		t1.setPriority(Thread.MIN_PRIORITY);//1
		t2.setPriority(Thread.NORM_PRIORITY);//5
		t3.setPriority(10);//max

		for (int i = 1; i <= 5; i++) {
			Thread obj= Thread.currentThread();
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}