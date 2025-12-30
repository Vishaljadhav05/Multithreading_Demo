package Callable_Interface;

class ThreadTask3 implements Runnable{

    ThreadLocal<Integer> tl;

    public ThreadTask3(ThreadLocal<Integer> tl){
        this.tl = tl;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " : " + tl.get());
        
    }

}

public class ThreadLoal2 {
    public static void main(String[] args) {
        ThreadLocal<Integer> t1 = new ThreadLocal<>();
        t1.set(100);

        System.out.println(Thread.currentThread().getName() + " : " + t1.get());

        ThreadTask3 tt = new ThreadTask3(t1);

        Thread t = new Thread(tt);
        t.start();
        
    }
}
