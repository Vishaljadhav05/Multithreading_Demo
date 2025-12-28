
public class Test {
    public static void main(String[] args) {
        
        String name = Thread.currentThread().getThreadGroup().getName();
        System.out.println( "Current Thread group name: "+ name); //Main Thread

        String name2 = Thread.currentThread().getThreadGroup().getParent().getName();
        System.out.println("Parent Thread group name: "+name2); //Root Thread is System
    }
}
