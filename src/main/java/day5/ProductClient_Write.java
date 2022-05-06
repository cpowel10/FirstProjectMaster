package day5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ProductClient_Write {
    public static void main(String[] args) throws IOException {
        Product p1= new Product();
        p1.acceptProductDetails();

        System.out.println(p1.toString());
        //save the object
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\chris\\Desktop\\reva.txt"));
        outputStream.writeObject(p1);



        outputStream.close();
    }
}
