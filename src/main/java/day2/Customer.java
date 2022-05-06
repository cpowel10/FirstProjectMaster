package day2;

public class Customer {
    String customerName;

    //default constructor
    private Customer(){
        customerName="Daniel";
    }
    //parameterized Constructor
    public Customer(String name){
        customerName=name;
    }
    public void changeName(String name){
        customerName=name;
    }
    //Method Overloading - technique by which we can have same method name but different signatures/parameters
    public void print(String message){
        System.out.println(message);
    }
    public void print(String message, String location){
        System.out.println(message + " and your location is " + location);
    }
    public void print(){
        System.out.println("Mohammad Tufail Ahmed - Trainer");
    }

    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.changeName("Andrew");
        System.out.println(cust1.customerName);
        Customer cust2 = new Customer();
        System.out.println(cust2.customerName);
        Customer cust3 = new Customer("Chris");
        System.out.println(cust3.customerName);

        cust1.print("Hi");
        cust1.print("Thanks for attending the session");
        cust1.print("Welcome to Revature");
        cust1.print();
        cust1.print("Hello","IN");
    }
}
