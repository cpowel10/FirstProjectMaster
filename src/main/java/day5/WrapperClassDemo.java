package day5;

public class WrapperClassDemo {
    public static void main(String[] args) {
        //casting = converting one data type into another data type
        //implicit
        byte b = 10;
        int num1 = b;

        //explicit
        int num=65;
        char p = (char)num;
        System.out.println(p);

        int nn=12;
        byte bb1 = (byte) nn;

        byte grade1 = 121;
        byte grade2 = 121;
        byte sum = (byte) (grade1+grade2); //why?  reason : any arithmetic calculations will return int

        System.out.println(sum);

        //float salary = 90.8; // Will not work because cannot assign a double to a float because double is 8 bytes while float is 4 bytes
        float salary = 90.8f; //the f makes the double into a float

        String marks = "98";
        int marks1 = Integer.valueOf(marks);
        System.out.println(marks1);

        int maxMarks=90;
        Integer maxMarks1 = Integer.valueOf(maxMarks); //Boxing

        Integer maxMarks2 = maxMarks; //Auto Boxing

        Integer minMarks = 900;
        int minMarks1 = Integer.valueOf(minMarks); //Unboxing
        int minMarks2 = minMarks; //Auto Unboxing
    }

}
