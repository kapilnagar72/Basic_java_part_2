package Inheritance;

// example single level inheritance

public class Animal
{
    void sleep()
    {
        System.out.println("animal needs sleep");
    }
} 
class Tiger extends Animal
{

}   
class Inheritance2
{
    public static void main(String[] args)
    {
        Tiger t= new Tiger();
        t.sleep();
    }
}
