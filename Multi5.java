package Multithreading;

//Synchronized this
class Car implements Runnable
{
    public void run()
    {
        try{
           System.out.println(Thread.currentThread().getName()+ " has entered parking lots");
           Thread.sleep(2000);
           synchronized(this)
           {
            System.out.println(Thread.currentThread().getName()+ " go into car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+ " started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+ " come back and park the car");
            
           }      
          }
          catch(Exception e)
          {
            System.out.println("some problem");
          }
    }
}
public class Multi5 {
    public static void main (String[]args) 
    {
        Car c = new Car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("son-1");
        t2.setName("son-2");
        t3.setName("son-3");

        t1.start();
        t2.start();
        t3.start();

    }
    
}
