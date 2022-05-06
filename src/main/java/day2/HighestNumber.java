package day2;

public class HighestNumber {
    public void highest(int num1, int num2, int num3){
        if (num1 > num2){
            if (num1 > num3){
                System.out.println("num1 is the highest number");
            }
            else if (num3 > num1){
                System.out.println("num3 is the highest number");
            }
            else{
                System.out.println("num1 and num3 are both the highest numbers");
            }
        }
        else if (num2 > num1){
            if (num2 > num3){
                System.out.println("num2 is the highest number");
            }
            else if (num3 > num2){
                System.out.println("num3 is the highest number");
            }
            else{
                System.out.println("num2 and num3 are both the highest numbers");
            }
        }
        else{
            if (num1 > num3){
                System.out.println("num1 and num2 are both the highest numbers");
            }
            else if (num3 > num1){
                System.out.println("num3 is the highest number");
            }
            else{
                System.out.println("num1, num2 and num3 are all equal");
            }
        }
    }
    public static void main(String[] args) { //args = ["20","21","19"]
        HighestNumber highest = new HighestNumber();
        System.out.println("Run 1 - 10,2,2");
        highest.highest(10,2,2);
        System.out.println();
        System.out.println("Run 2 - 0,20,0");
        highest.highest(0,20,0);
        System.out.println();
        System.out.println("Run 3 - 0,0,20");
        highest.highest(0,0,20);
        System.out.println();
        System.out.println("Run 4 - 20,0,20");
        highest.highest(20,0,20);
        System.out.println();
        System.out.println("Run 5 - 0,20,20");
        highest.highest(0,20,20);
        System.out.println();
        System.out.println("Run 6 - 20,20,0");
        highest.highest(20,20,0);
        System.out.println();
        System.out.println("Run 7 - 20,20,20");
        highest.highest(20,20,20);
        System.out.println();
    }
}
