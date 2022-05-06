package day3;

public class Client {
    public static void main(String[] args) {
        Product p1 = new Product(98, "Mobile", 88, 90);

        p1.printProductDetails();

        p1.setPrice(100);
        p1.setProductName("Mobile Phone");
        p1.setQuantityOnHand(77);

        p1.printProductDetails();

        p1.calculateTax();

        Product p2 = p1.changeProductData(p1);
        p2.printProductDetails();
    }
}
