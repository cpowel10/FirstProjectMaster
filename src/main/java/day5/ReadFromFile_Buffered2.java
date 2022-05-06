package day5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFile_Buffered2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\chris\\Desktop\\BloodbornePSX\\Manifest_NonUFSFiles_Win64.txt"));

        int i = 0;
        while((i=bis.read()) != -1){ //
            System.out.print((char)i);
        }

        bis.close();
    }
}
