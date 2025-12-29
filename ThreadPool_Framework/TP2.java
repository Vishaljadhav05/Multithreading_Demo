package ThreadPool_Framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadTask2 implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
            System.out.println("-----------------------------");
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }

    
}

public class TP2 {
    public static void main(String[] args) {

        MyThreadTask2 mt2 = new MyThreadTask2();
        //Thread t = new Thread(mt);
        //t.start();

        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            es.execute(mt2);
        }

        es.shutdown();
    }
}
