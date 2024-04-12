package JavaRevision;

import java.util.Scanner;

public class Part1 { 
    public static void main(String[] args) {
    try (Scanner myObj = new Scanner(System.in)) {
        System.out.println("Enter username");

        String userName = myObj.nextLine(); 
        System.out.println("Username is: " + userName);
    } 
    
    }
}
