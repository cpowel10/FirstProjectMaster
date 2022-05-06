package objectclassdemo;

public class ProductClient {
    public static void main(String[] args) {
        Product p1 = new Product(12,"Lakme",99,100);
        Product p2 = new Product(12,"Lakme",99,100);
        Product p3 = p1;

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        System.out.println("##Printing all the products");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("##Printing hashcode");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
