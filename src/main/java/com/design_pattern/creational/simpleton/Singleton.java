package com.design_pattern.creational.simpleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

// lazy version
class NaiveSingleThread {
    private static NaiveSingleThread instance;
    private List<String> value;

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    private NaiveSingleThread() {
        this.value = new ArrayList<>();
    }

    public static NaiveSingleThread getInstance() {
        if (instance == null) {
            instance = new NaiveSingleThread();
        }
        return instance;
    }

}


// worst performance
class NaiveMultiThread {
    private static NaiveMultiThread instance;
    private List<String> value;

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public void reset() {
        instance = null;
    }

    private NaiveMultiThread() {
        this.value = Collections.synchronizedList(new ArrayList<>());
    }

    public static synchronized NaiveMultiThread getInstance() {
        if (instance == null) {
            instance = new NaiveMultiThread();
        }
        return instance;
    }
}


// best performance
class SingletonMultiThread {
    private static volatile SingletonMultiThread instance;
    private List<String> value;

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public void reset() {
        instance = null;
    }

    private SingletonMultiThread() {
        this.value = Collections.synchronizedList(new ArrayList<>());
    }

    public static SingletonMultiThread getInstance() {
        if (instance == null) {
            synchronized (SingletonMultiThread.class) {
                if (instance == null) {
                    instance = new SingletonMultiThread();
                }
            }
        }
        return instance;
    }
}


public class Singleton {
    private static volatile int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.nanoTime();
        // this example show how to break the naive
        var thread1 = CompletableFuture.runAsync(() -> {
            NaiveSingleThread.getInstance().getValue().add("value1");
        });
        var thread2 = CompletableFuture.runAsync(() -> {
            NaiveSingleThread.getInstance().getValue().add("value2");
        });
        CompletableFuture.allOf(thread1, thread2).join();
        System.out.println(NaiveSingleThread.getInstance().getValue());
        // naive multi thread
        for (int i = 0; i < 100; i++) {
            var thread3 = CompletableFuture.runAsync(() -> {
                NaiveMultiThread.getInstance().getValue().add("value1");
            });
            var thread4 = CompletableFuture.runAsync(() -> {
                NaiveMultiThread.getInstance().getValue().add("value2");
            });
            CompletableFuture.allOf(thread3, thread4).get();
            if (NaiveMultiThread.getInstance().getValue().size() < 2) {
                System.out.println("<--------------------------------------->");
                System.out.println("<--------------------------------------->");
                System.out.println(NaiveMultiThread.getInstance().getValue());
                System.out.println("<--------------------------------------->");
                System.out.println("<--------------------------------------->");
            }
            NaiveMultiThread.getInstance().reset();
        }
        // multi thread best practice
        for (int i = 0; i < 1000; i++) {
            List<CompletableFuture<Void>> list = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                list.add(CompletableFuture.runAsync(() -> {
                    SingletonMultiThread.getInstance().getValue().add("s");
                }));
            }
            CompletableFuture<Void>[] futuresArray = list.toArray(new CompletableFuture[0]);

            CompletableFuture.allOf(futuresArray).get();
            if (SingletonMultiThread.getInstance().getValue().size() < 100) {
                System.out.println("<--------------------------------------->");
                System.out.println("<--------------------------------------->");
                System.out.println(SingletonMultiThread.getInstance().getValue().size());
                System.out.println("<--------------------------------------->");
                System.out.println("<--------------------------------------->");
            }
            SingletonMultiThread.getInstance().reset();
        }
        long endTime = System.nanoTime();
        long elapsedTimeInNanos = endTime - startTime;

        // Convert nanoseconds to milliseconds for better readability
        long elapsedTimeInMilliseconds = TimeUnit.NANOSECONDS.toMillis(elapsedTimeInNanos);

        // example show static volatile doesn't ensure atomicity for compound operations
        // https://stackoverflow.com/questions/42412311/java-volatile-keyword-not-working-as-expected
        System.out.println("Program executed in: " + elapsedTimeInMilliseconds + " milliseconds");
        for (int i = 0; i < 5; i++) {
            CompletableFuture.runAsync(() -> {
                System.out.println(Thread.currentThread().getName());
                for (int j = 0; j < 10000; j++) {
                    counter++;
                }
            }).whenComplete((a, b) -> {
                System.out.println("done");
            });
        }

        // Sleep for a while to allow threads to finish
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final Counter Value: " + counter);
    }
}
