

public class LaunchMulti {
    
    public static void main(String[]args)
    {
        System.out.println("Main Thread");
        System.out.println("before changing");
        String name= Thread.currentThread().getName();
        System.out.println("The name of main thread is"+name);
        System.out.println("the priority of main thread is "+Thread.currentThread().getPriority());
         

        System.out.println("After change");
        Thread t = Thread.currentThread();
        t.setName("kapil");
        t.setPriority(7);

        String Name1 = Thread.currentThread().getName();
        System.out.println(" the name of main thread is "+Name1);
        System.out.println(" the priority of main thread is "+Thread.currentThread().getPriority());
        

    }
}
