package Callable_Interface;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadTask1 implements Callable<Integer>{
    public Integer call(){
        int a = 10, b=20,c;
        c=a+b;
        return c;
    }
}

public class Clb {
    public static void main(String[] args) throws Exception {

        ThreadTask1 tt = new ThreadTask1();
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f = es.submit(tt);
        System.out.println(f.get());

        es.shutdown();
    }
}