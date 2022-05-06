package day5;

import java.io.*;
import java.util.Scanner;

/**
 * Enter the file name to copy : h:\\home.txt
 *
 * 1) Not there h:\\ah.txt does not exist, Hence cannot continue
 *
 * 2) Enter the file name to paste : h:\\house.txt
 *
 * Successfully copied h:\\home.txt to h:\\house.txt
 */
public class IOAndScannerExercise {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name to be copied: ");
        File copy = new File(scan.nextLine());
        if (!copy.exists()) {
            System.out.println("Not there " + copy + " does not exist, Hence cannot continue");
        }
        else {
            System.out.println("Enter the file name to be pasted :");
            File paste = new File(scan.nextLine());
            if (!paste.exists()) {
                System.out.println("Not there " + paste + " does not exist, Hence cannot continue");
            }
            else {
                FileInputStream reader = new FileInputStream(copy);
                FileOutputStream writer = new FileOutputStream(paste);

                int i = 0;
                while ((i = reader.read()) != -1) { //-1 indicates end of line
                    writer.write(i);
                }

                System.out.println("Successfully copied " + copy + " to " + paste);
                reader.close();
                writer.close();
            }
        }
    }
}