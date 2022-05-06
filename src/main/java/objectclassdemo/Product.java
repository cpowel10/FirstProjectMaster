package objectclassdemo;

import java.util.Objects;

public class Product {
    private int productId;
    private String productName;
    private int quantityOnHand;
    private int price;

    public Product() {
    }

    public Product(int productId, String productName, int quantityOnHand, int price) {
        this.productId = productId;
        this.productName = productName;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", quantityOnHand=" + quantityOnHand +
                ", price=" + price +
                '}';
    }
}
