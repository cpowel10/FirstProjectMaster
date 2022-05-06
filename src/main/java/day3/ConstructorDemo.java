package day3;

/**
 * QC : What is a Constructor?
 * Ans :
 * - special method
 * - gets called automatically whenever you create an object
 * - it has same name as the class name
 * - it not have any return type, not even void
 * - it is used for initialization
 * - can be overloaded
 * -java provides default constructor in every class if no constructor is there
 */
class Employees {
    String name;

    public Employees(String name) {
        this.name = name;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        //java provides default constructor in every class if no constructor is there
        Employees e2 = new Employees("Daniel");
    }
}
