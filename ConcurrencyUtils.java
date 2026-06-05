// Concurrency utilities - java.util.concurrent package
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrencyUtils {
    public static void main(String[] args) {

        // create a thread pool with 3 threads
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // submit 5 tasks to the pool
        for (int i = 1; i <= 5; i++) {
            int taskNo = i;   // need final-ish variable for lambda
            pool.submit(() -> {
                System.out.println("Task " + taskNo + " running on "
                    + Thread.currentThread().getName());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    System.out.println("task interrupted");
                }
            });
        }

        // shutdown the pool - no new tasks accepted
        pool.shutdown();
        try {
            // wait upto 5 seconds for all tasks to finish
            pool.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("waiting interrupted");
        }
        System.out.println("All tasks done");
    }
}
