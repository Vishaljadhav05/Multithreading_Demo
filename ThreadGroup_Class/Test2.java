public class Test2 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("Main-sub-thread-group");

        // Thread t1 = new Thread(tg, "Vishal-Thread");
        // Thread t2 = new Thread(tg, "VJ-Thread");

         System.out.println("Current threadgroup: "+ tg.getName());
         System.out.println("Parent threadgroup: "+ tg.getParent().getName());

         System.out.println("Old priority of thread-Group: "+ tg.getMaxPriority());
         tg.setMaxPriority(7);
         System.out.println("New priority of thread-Group: "+ tg.getMaxPriority());

         tg.list();
         


    }
}
