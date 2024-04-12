package Inheritance;

public class DemoA {           //   multilevel Inheritance example
    void disp()
    {
        System.out.println("disp written in demoA class : ");
    }
}
class DemoA1 extends DemoA
{

}
class DemoA2 extends DemoA1
{

}
class DemoA3 extends DemoA2
{

}
class Inheritance3
{
    public static void main(String[]args)
    {
        DemoA3 d = new DemoA3();
        d.disp();
    }
}