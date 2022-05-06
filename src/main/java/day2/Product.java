package day2;

public class Product {
    int productId;
    String productName;
    int quantityOnHand;
    int price;
    static int count;

    {
        productId=0;
        productName="";
        quantityOnHand=0;
        price=0;
        count++;
    }

    static{
        count = 0;
    }

    public Product(){
        productId=100;
        productName="Lakme";
        quantityOnHand=100;
        price=90;
    }

    public Product(int productId, String productName, int quantityOnHand, int price) {
        this.productId = productId;
        this.productName = productName;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public int calculatePrice(Product product){
        int total = product.quantityOnHand * product.price;
        return total;
    }

    public void display(int total){
        System.out.println(productName + " : " + total);
    }
    public static void main(String[] args) {
        Product p1= new Product();
        Product p2 = new Product(201,"Aroma",900,899);
        Product p3 = new Product(202,"Pendrive",877,99);

        p1.display(p1.calculatePrice(p1));
        p2.display(p2.calculatePrice(p2));
        p3.display(p3.calculatePrice(p3));

        System.out.println("-------------------------------\nTotal products : "+count);
        //sout+Enter to autogenerate Print statement;
    }
}
