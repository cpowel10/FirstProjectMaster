package day5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File readFile = new File("C:\\Users\\chris\\Desktop\\BloodbornePSX\\Manifest_NonUFSFiles_Win64.txt");
        File writeFile = new File("C:\\Users\\chris\\Desktop\\reva.txt");

        FileInputStream readStream = new FileInputStream(readFile);
        FileOutputStream writeStream = new FileOutputStream(writeFile);
        int i = 0;
        while((i=readStream.read()) != -1){ //-1 indicates end of line
            writeStream.write(i);
        }

        readStream.close();
        writeStream.close();

    }
}
