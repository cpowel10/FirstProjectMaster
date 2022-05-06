package day5;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numbers[] = new int[5];
        int sum = 0;
        int negCount = 0;

        System.out.println("Please enter 5 numbers: ");

        for (int i = 0 ; i<numbers.length;i++){
            numbers[i]=scan.nextInt();
            if(numbers[i] < 0){
                negCount++;
                continue;
            }
            else if (numbers[i] > 10000){
                System.out.println("Sorry, exiting loop because you entered a number greater than 10,000");
                break;
            }
            sum+=numbers[i];
        }
        System.out.println("Sum of all positive integers is: "+sum);
        System.out.println("You entered "+negCount+" negative integers");
    }
}
