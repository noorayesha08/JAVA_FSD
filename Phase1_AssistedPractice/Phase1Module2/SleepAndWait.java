package Phase1Module2;

public class SleepAndWait {

	private static Object o = new Object();

	public static void main(String[] args) {
		System.out.println("Thread Going to sleep...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread woke up after 1 second.");

		synchronized(o)
		{
			System.out.println("Thread will wait for notify...");
			try {
				o.wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread woken up after notify.");

	}

}
