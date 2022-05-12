public class Calculator{
    interface IntegerMath{
        int operation(int a, int b);
    }
    public int operateBinary(int a, int b, IntegerMath op){
        return op.operation(a,b);
    }
    public static void main(String... args) {
        Calculator myApp = new Calculator();
        IntegerMath add = (a,b) -> a+b;
        IntegerMath sub = (a,b) -> a-b;
        System.out.println(myApp.operateBinary(40,2,add));
        System.out.println(myApp.operateBinary(20,10,sub));
    }
}
