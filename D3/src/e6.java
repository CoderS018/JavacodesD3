public class e6 extends Thread {
    
    public void run() {
       for (int i = 0; i < 5; i++) {
            System.out.println("method" + i);
        }
    } 
    public static void main(String[] args) {
        e6 bb = new e6();
        bb.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main method" + i);
        }
    }
}
