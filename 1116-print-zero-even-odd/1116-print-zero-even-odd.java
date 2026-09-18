class ZeroEvenOdd {
    private int n;
    private int num = 1;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }
    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            while (num != 1) {
                wait();
            }
            printNumber.accept(0);
            if (i % 2 == 1) {
                num = 2;   
            } else {
                num = 3;  
            }
            notifyAll();
        }
    }
    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            while (num != 2) {
                wait();
            }
            printNumber.accept(i);
            num = 1;      
            notifyAll();
        }
    }
    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            while (num != 3) {
                wait();
            }
            printNumber.accept(i);
            num = 1;       
            notifyAll();
        }
    }
}