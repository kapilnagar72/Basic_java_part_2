package Multithreading;

class Printing implements Runnable {
    
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("Focus is important");
                Thread.sleep(3000);
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class Multi3 {
    public static void main(String[] args) throws InterruptedException
     {
        System.out.println("Main Thread started");
        Printing p = new Printing();
        Thread t1 = new Thread(p);
        
        System.out.println(t1.isAlive()); // Check if the thread is alive (not started yet)
        
        t1.start(); // Start the thread

      //  System.out.println("Focus is important");
      //  Thread.sleep(3000);
        
        System.out.println(t1.isAlive()); // Check if the thread is alive (running)
        
        t1.join(); // Wait for the thread to finish
        
        System.out.println("Main thread finished the work");
    }
}
