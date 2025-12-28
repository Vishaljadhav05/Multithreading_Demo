public class Test3 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Main-sub-thread-group");

         Thread t1 = new Thread(tg, "Vishal-Thread");
         Thread t2 = new Thread(tg, "VJ-Thread");

         System.out.println("Current threadgroup: "+ tg.getName());
         System.out.println("Parent threadgroup: "+ tg.getParent().getName());

         t1.start();
         t2.start();
         System.out.println(tg.activeCount());//2 threads are active

         System.out.println(tg.getParent().activeCount()); //3 threads are active

         System.out.println(tg.activeGroupCount()); //0 threads are active

         System.out.println(tg.getParent().activeGroupCount()); //1 threads are active

         System.out.println(tg.getParent().getParent().activeGroupCount()); //3 threads are active

    }
}
