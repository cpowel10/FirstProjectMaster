package day5;

import java.util.Scanner;

public class ExerciseScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[5];
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Please enter five positive integers: ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
            if (numbers[i] < 0) {
                System.out.println("Sorry, exiting loop because you entered a negative integer");
                break;
            } else if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even number count: " + evenCount);
        System.out.println("Odd number count: " + oddCount);
    }
}
