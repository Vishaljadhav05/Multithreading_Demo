package Callable_Interface;

class ThreadTask2 implements Runnable{

    ThreadLocal<String> tl = new ThreadLocal<>(); 

    public void run(){
        tl.set("Vishal");

        display();
        
    }

    void display(){
        System.out.println("hi " + tl.get());

        tl.remove();

        System.out.println("hi " + tl.get());
    }


}
public class ThreadLocal1 {
    public static void main(String[] args) {
        ThreadTask2 tt2 = new ThreadTask2();

        Thread t2 = new Thread(tt2);
        t2.start();
    }
}
