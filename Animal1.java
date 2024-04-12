package Inheritance;

public class Animal1 {   
    // Hierarchical Inheritance  
    
void sleep()
{
System.out.println(" animal long sleep");
}
}
class monkey extends Animal1
{

}
class deer extends Animal1
{

}
class cat extends Animal1
{

}
class Dog extends Animal1
{

}
class Inheritance4
{
    public static void main(String [] args)
    {
        Dog g = new Dog();
        g.sleep();
    }
}