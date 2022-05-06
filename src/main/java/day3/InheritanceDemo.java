package day3;
// is-a test
class Animal{
    int maxAge=120;

    public Animal(int maxAge) {
        System.out.println("Animal class default constructor");
    }

    public Food eat(){
        System.out.println("Animal eats food");
        return null;
    }

    public static void drink(){
        System.out.println("Animal drinks WATER");
    }
}

class Dog extends Animal{
    int maxAge=30; //hiding

    public Dog() {
        super(90); //super() must be first statement in constructor
        System.out.println("Dog class default constructor");
    }

    public void displayDetails(){
        int maxAge=10;
        System.out.println("Maximum age is :"+maxAge);
        System.out.println("Maximum age of Dog is :"+this.maxAge);
        System.out.println("Maximum age of Animal is :"+super.maxAge);
    }

    //**Overriding- when child class rewrites the super class method
    public Food eat(){
        System.out.println("Dog eats meat");
        super.eat();
        return null;
    }

    //hiding, not overriding
    public static void drink(){
        System.out.println("Dog drinks WATER");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayDetails();
        d.eat();
        d.drink();
    }
}
