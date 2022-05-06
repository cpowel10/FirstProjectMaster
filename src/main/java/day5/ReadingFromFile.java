package day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        //FileReader rdr = new FileReader("C:\\Users\\chris\\Desktop\\BloodbornePSX\\Manifest_NonUFSFiles_Win64.txt"); //Character stream -preferred for big files
        FileInputStream rdr = new FileInputStream("C:\\Users\\chris\\Desktop\\BloodbornePSX\\Manifest_NonUFSFiles_Win64.txt"); //byte stream
        int i = 0;
        while((i=rdr.read()) != -1){ //-1 indicates end of line
            System.out.print((char)i);
        }

        rdr.close();
    }
}
