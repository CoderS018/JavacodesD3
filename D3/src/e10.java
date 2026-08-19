class Resource {
    private static void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    synchronized void method1(Resource r) {
        System.out.println(Thread.currentThread().getName() + " entered method1");
        pause();
        System.out.println(Thread.currentThread().getName() + "is waiting for method2");
    }
    synchronized void method2(Resource r) {
        System.out.println(Thread.currentThread().getName() + " entered method2");
        pause();
    }
}
public class e10 {
    public static void main(String[] args) {
		Resource r1 = new Resource();
		Resource r2 = new Resource();

		Thread t1 = new Thread(() -> r1.method1(r2), "Thread-1");
		Thread t2 = new Thread(() -> r2.method2(r1), "Thread-2");

		t1.start();
		t2.start();
	}
} 
