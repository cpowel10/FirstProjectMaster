package day2;

public class InitializerDemo {
    int num=10;
    //Initializer/anonymous block
    {
        num++;
        System.out.println("3.INITIALIZER CALLED");
    }

    public InitializerDemo() {
        num++;
        System.out.println("4.InitializerDemo Constructor CALLED");
    }

    //static block - can only access static variables
    static{
        System.out.println("1.STATIC INITIALIZER CALLED");
    }
    public static void main(String[] args) {
        System.out.println("2.MAIN CALLED");
        InitializerDemo i1 = new InitializerDemo();
        new InitializerDemo();
        System.out.print(i1.num);
    }
}
