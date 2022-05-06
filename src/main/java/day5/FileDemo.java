package day5;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Users\\chris\\IdeaProjects\\FirstProject\\src\\main\\java\\day5\\data");
        if(!folder.exists()){
            folder.mkdir();
        }
        File file = new File("C:\\Users\\chris\\IdeaProjects\\FirstProject\\src\\main\\java\\day5\\data\\data.txt");
        if(file.exists()){
            System.out.println("File data.txt exists");
        }
        else{
            System.out.println("File does not exist and created");
            file.createNewFile();
        }

        String[] allFileContents = folder.list();

        for(String temp : allFileContents){
            System.out.println(temp);
        }
    }
}
