package ThreadPool_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadTask implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    
}

public class TP {
    public static void main(String[] args) {

        MyThreadTask mt = new MyThreadTask();
        //Thread t = new Thread(mt);
        //t.start();

        ExecutorService es = Executors.newFixedThreadPool(10);
        es.execute(mt);

        es.shutdown();
    }
}
