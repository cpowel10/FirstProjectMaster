package day5;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

//Serializable is marker interface
//
public class Product implements Serializable {
    private int productId;
    private String productName;
    private int quantityOnHand;
    private int price;

    public Product() {
        productId = -1;
        productName = "NotAvailable";
        quantityOnHand = -1;
        price = -1;
    }

    public Product(int productId, String productName, int quantityOnHand, int price) {
        this();
        this.productId = productId;
        this.productName = productName;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public Product(int productId, String productName) {
        this();
        this.productId = productId;
        this.productName = productName;
    }

    public Product(int productId, int quantityOnHand, int price) {
        this();
        this.productId = productId;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public void acceptProductDetails(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product id: ");
        productId= scan.nextInt();
        System.out.println("Enter product name: ");
        productName = scan.next();
        System.out.println("Enter Quantity On Hand: ");
        quantityOnHand = scan.nextInt();
        System.out.println("Enter price: ");
        price= scan.nextInt();
        System.out.println();
    }
    public void printProductDetails() {
        System.out.println("Product Id :" + getProductId());
        System.out.println("Product Name :" + getProductName());
        System.out.println("Product QOH :" + getQuantityOnHand());
        System.out.println("Product Price :" + getPrice() + "\n-----------------------");
    }

    public void calculateTax() {
        int price = 99;
        //System.out.println(price);          //99
        //System.out.println(this.price);     //199
        //this keyword in java is used to refer to instance variable
        //when you have same name local variable as instance variable

    }

    public Product changeProductData(Product product) {
        int originalPrice = product.getPrice();
        int modifiedPrice = (int) (originalPrice * .2); //increasing the price of the product
        product.setPrice(modifiedPrice);
        return product;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Details{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", quantityOnHand=" + quantityOnHand +
                ", price=" + price +
                '}';
    }

    //override equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && quantityOnHand == product.quantityOnHand && price == product.price && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, quantityOnHand, price);
    }
}
