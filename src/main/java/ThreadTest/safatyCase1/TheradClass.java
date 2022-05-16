package main.java.ThreadTest.safatyCase1;

public class TheradClass extends Thread {
    private Account acc;

    public TheradClass(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        acc.drawMoney(100);
    }
}
