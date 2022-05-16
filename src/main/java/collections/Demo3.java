package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        Product product = new Product(1,"Lakme",12,88);
        products.add(product);
        products.add(new Product(90,"Books",55,20));

        Iterator<Product> i = products.iterator();

        while(i.hasNext()){
            Product temp = i.next();
            System.out.println(temp);
        }
    }
}
