public class Test4 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getMaxPriority());
        System.out.println(Thread.currentThread().getPriority());



        System.out.println("--------------------------------------------------------------------------");

        ThreadGroup tg = new ThreadGroup(" sub-tg");

         Thread t1 = new Thread(tg, "Vishal-Thread");
         t1.start();

         Thread t2 = new Thread(tg, "VJ-Thread");
         t2.start();

         System.out.println(tg.getMaxPriority());
         System.out.println(t1.getPriority());

         tg.setMaxPriority(7);

         System.out.println(tg.getMaxPriority());
         System.out.println(t1.getPriority());

        ThreadGroup sub_tg = new ThreadGroup(tg, "Sub-sub-tg");
        System.out.println(sub_tg.getMaxPriority());
         
    }
}
