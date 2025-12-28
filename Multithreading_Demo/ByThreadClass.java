class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Run Method.....");
    }

    
}

public class ByThreadClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}