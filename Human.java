package Inheritance;

public class Human {
    int age;
    void sleep(){
        age =20;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
    
}
class Student extends Human
{

}
class Inheritance{
    public static void main(String[]args){
        Student st = new Student();
        st.sleep();
    }
}
