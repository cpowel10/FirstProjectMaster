package collections;

//Creating class to implement Calculator functionality
class AhmedCalculator implements Calculator{


    @Override
    public int add(int num1, int num2) {
        return num1+num2;
    }
}

public class Client {
    public static void main(String[] args) {
        //1st way - normal way
        AhmedCalculator ac1 = new AhmedCalculator();
        System.out.println(ac1.add(12,12));

        //2nd way - Inner classes - Anonymous inner classes
        Calculator ac2 = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };
        System.out.println(ac2.add(33,33));

        //3rd way - Lambda expression
        //Lambdas can only be used with Functional Interfaces
        Calculator ac3 = (num1,num2) -> num1+num2;
        System.out.println(ac3.add(22,22));
    }
}
