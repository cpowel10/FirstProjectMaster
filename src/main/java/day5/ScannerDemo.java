package day5;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        name = scanner.next(); //wait for user input
        System.out.println("Please enter your age: ");
        age = scanner.nextInt();

        //store in persistent storage like files or database
        System.out.println("Welcome: "+name+" and your age is: "+age);
    }
}
