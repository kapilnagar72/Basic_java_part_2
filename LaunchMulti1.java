package Multithreading;
class Demo10 implements Runnable
{
    public void run()
    {
        System.out.println("child Thread Executing");
        try {
            Thread.sleep(2000); // 1000 = 1 second
        } catch (Exception e) {
            
            System.out.println("Same problem");
        }
        System.out.println("child thread task completed");
    }
}
public class LaunchMulti1 {

    public static void main(String[]args)
    {
        System.out.println("main thread Stored");
        Demo10 d = new Demo10();
        Thread t1 = new Thread(d);
        t1.start();

    }
}
