package day4;

// is-a test
abstract class Animal{
    int maxAge;
    public abstract void eat();

    public void party(){
        System.out.println("Party Hard");
    }

    public Animal(){
        this.maxAge=120;
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal{
    public Dog(){
        System.out.println("Dog constructor");
    }
    @Override
    public void eat() {
        System.out.println("Dog eats meat");
    }
    //must override eat method

}

public class InheritanceDemo {
    public static void main(String[] args) {
        //Animal a = new Animal(); //cannot create instance of an abstract class
        Dog d = new Dog();
        d.eat();
        d.party();
        d.maxAge = 15;
        System.out.println(d.maxAge);
    }
}
