// Multithreading - creating threads two ways, and synchronization

// way 1 - extending Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread (extends) count: " + i);
            try {
                Thread.sleep(200);   // pause for 200 ms
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }
    }
}

// way 2 - implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable count: " + i);
        }
    }
}

// synchronization example - shared counter
class Counter {
    int count = 0;
    // synchronized so two threads dont mess it up
    synchronized void increment() {
        count++;
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) throws InterruptedException {

        // start thread way 1
        MyThread t1 = new MyThread();
        t1.start();

        // start thread way 2
        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        // wait for both to finish before doing counter part
        t1.join();
        t2.join();

        // synchronization demo
        Counter c = new Counter();
        // two threads both increment 1000 times
        Thread a = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });
        Thread b = new Thread(() -> {
            for (int i = 0; i < 1000; i++) c.increment();
        });
        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println("Final count (should be 2000): " + c.count);
    }
}
