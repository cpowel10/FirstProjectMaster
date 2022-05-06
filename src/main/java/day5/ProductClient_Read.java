package day5;

import java.io.*;

public class ProductClient_Read {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Product p1= new Product();

        //read the object info
        ObjectInputStream inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\chris\\Desktop\\reva.txt")));
        p1 = (Product) inputStream.readObject();

        System.out.println(p1);

        inputStream.close();
    }
}
