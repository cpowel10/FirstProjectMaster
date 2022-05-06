package day4;

class Apple{
    @Override
    public String toString() {
        return "Hello";
    }
}
public class ProductClient {
    public static void main(String[] args) {
        Apple a = new Apple();
        System.out.println(a);
        System.out.println(a.toString());

        Product p1 = new Product(12, "Mobile",98,98);
        System.out.println(p1);

        //equals and hashCode
        Product p2 = new Product(12,"Mobile", 98,98);
        Product p3 = p1;

        //calling object class method -- checking hashCode
        System.out.println(p1.equals(p2)); //T
        System.out.println(p1.equals(p3)); //T

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
