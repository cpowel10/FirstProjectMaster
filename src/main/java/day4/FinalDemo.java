package day4;

class A{
    final int MAX_AGE=120; //cannot be changed
    void display(){
        System.out.println("In A.display()");
        System.out.println("MAX_AGE= "+MAX_AGE);
    }
}
class B extends A{
    @Override
    void display(){
        System.out.println("In B.display()");
        super.display();
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
