package day4;

//I have to add the numbers by using a function
public class VarArgsDemo {
    //varargs must be last in list, can only have one varargs parameter
    public int addNumbers(int id, int...marks){
        int sum = 0;
        for(int temp : marks){
            sum+=temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        VarArgsDemo v = new VarArgsDemo();
        System.out.println(v.addNumbers(89,67,77));
        System.out.println(v.addNumbers(2,2));
        System.out.println(v.addNumbers(12));
    }
}
