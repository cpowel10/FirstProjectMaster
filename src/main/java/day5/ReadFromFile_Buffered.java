package day5;

import java.io.*;

public class ReadFromFile_Buffered {
    public static void main(String[] args) throws IOException {
        FileInputStream rdr = new FileInputStream("C:\\Users\\chris\\Desktop\\BloodbornePSX\\Manifest_NonUFSFiles_Win64.txt");
        BufferedInputStream bis = new BufferedInputStream(rdr); //more efficient than FileInputStream

        int i = 0;
        while((i=bis.read()) != -1){ //
            System.out.print((char)i);
        }

        rdr.close();
        bis.close();
    }
}
