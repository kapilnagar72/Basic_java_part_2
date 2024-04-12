package Inheritance;

public class Human1  //parent class// base class // super class
{
    //private String name;
    int age;
    Human1()
    {
        System.out.println("human class constructor");
    }
    void sleep()
    {
        age =18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
    
}

class Student1 extends Human1 //child class // subclass // derived class 
{
void disp()
{
    System.out.println("the age is :" +age);
    //System.out.println("the name is:" +name);// this is error name is private ,private value are not extends
}
}
class Inheritance1{
    public static void main(String[]args)
    {
        Student1 st =new Student1();
        st.sleep();
        st.disp();
    }
}