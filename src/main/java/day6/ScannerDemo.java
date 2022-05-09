package day6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = scanner.next(); //wait for user input
        System.out.println("Please enter your age: ");
        try{
            age = scanner.nextInt();  //InputMismatchException
        }
        catch(InputMismatchException e){
            System.out.println("Please enter numbers only in age");
        }
        finally{
            //write the code here if you want to execute it 100%
            //Ex: closing
            System.out.println("Finally");
        }

        //store in persistent storage like files or database
        System.out.println("Welcome: "+name+" and your age is: "+age);
    }
}
