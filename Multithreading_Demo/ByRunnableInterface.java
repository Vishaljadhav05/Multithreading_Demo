class MyThread2 implements Runnable{
    public void run(){
        System.out.println("Inside the run method...");
    }
}

public class ByRunnableInterface {
    public static void main(String[] args) {
        MyThread2 mt2 = new MyThread2();

        Thread t2 = new Thread(mt2);
        t2.start();
    }
}
