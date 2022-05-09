package day6;

import java.io.File;
import java.io.IOException;

public class FileExercise {
    public void file1() throws IOException {
        File f1 = new File("h:\\Batch\\BatchMates.txt");
        File f2 = new File("h:\\Batch");
        if(f2.exists() && f2.isDirectory()){
            System.out.println("Folder batch already exists");
        }
        else {
            f2.mkdir();
            System.out.println("Successfully created the folder -Batch");
        }
        System.out.println("Creating BatchMates.txt inside "+f2.getAbsolutePath());
        f1.createNewFile();
    }
    public void file2() throws IOException {
        File f1 = new File("h:\\Batch\\BatchMates.txt");
        File f2 = new File("h:\\Batch");
        if(f2.exists() && f2.isDirectory()){
            System.out.println("Folder batch already exists");
        }
        else {
            f2.mkdir();
            System.out.println("Successfully created the folder -Batch");
        }
        System.out.println("Creating BatchMates.txt inside "+f2.getAbsolutePath());
        f1.createNewFile();
    }
    public void callMethods() throws IOException {
        FileExercise fileExercise = new FileExercise();
        fileExercise.file1();
        fileExercise.file2();
    }
    public static void main(String[] args)  {
        FileExercise fileExercise = new FileExercise();
        try {
            fileExercise.callMethods();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}