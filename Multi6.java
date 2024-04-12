package Multithreading;

// interrupted method
class Example implements Runnable
{
    public void run()
        {
            int n=10;
            for (int i=0 ; i<n;i++)
            {
                try
                {
                    System.out.println("focus important");
                    Thread.sleep(1000);

                }
                catch(Exception e)
                {
                    System.out.println("Thread in interrupted");
                }
            }
        }
}
public class Multi6 {
    public static void main(String[]args)
    {
        Example e = new Example();
        Thread t = new Thread(e);
        t.start();
        t.interrupt();
    }
    
}
