package day3;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Product p1 = new Product();
        //Product p2 = new Product();
        //Product p3 = new Product();

        Product products[] = new Product[5];
        for (int i = 0 ; i < products.length ; i++){
            products[i] = new Product();
        }
        p1.setProductName("Lakme");
        products[0].setProductName("Aroma");

        System.out.println("p1 name is :"+p1.getProductName());
        System.out.println("Product array 0 index name is :"+ products[0].getProductName());
    }
}
