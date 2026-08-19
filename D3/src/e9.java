class Bank {

    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing " + amount);
        System.out.println("Withdrawal completed");
    }
}

class MyThread extends Thread {
    Bank bank;
    MyThread(Bank bank) {
        this.bank = bank;
    }
    
    public void run() {
        bank.withdraw(500);
    }
}
public class e9 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        MyThread t1 = new MyThread(bank);
        MyThread t2 = new MyThread(bank);

        t1.start();
        t2.start();
    }
}