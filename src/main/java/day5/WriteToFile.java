package day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        //FileReader rdr = new FileReader("C:\\Users\\chris\\Desktop\\BloodbornePSX\\Manifest_NonUFSFiles_Win64.txt"); //Character stream -preferred for big files
        FileOutputStream rdr = new FileOutputStream("C:\\Users\\chris\\Desktop\\reva.txt"); //byte stream

        rdr.write(97);

        rdr.close();
    }
}
