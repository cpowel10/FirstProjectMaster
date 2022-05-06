package day3;

/**
 *
 */
public class Assignment {
    int num1=10;
    int num2=20;

    public void display(){
        System.out.println("Num1 :"+num1);
        System.out.println("Num2 :"+num2);
    }

    public void change(int num1, Assignment assignment){
        num1--; //param num1=99
        this.num1--;//instance num1=9
        assignment.num1++;//instance num1=10
        num2=99; //instance num2=99
    }
    public static void main(String[] args) {
        Assignment assignment = new Assignment(); //instance num1=10, instance num2=20
        int num1=100;//local num1=100
        assignment.change(num1,assignment); //param num1=100, assignment num1=10, assignment num2=20
        assignment.display(); //print Num1=10, Num2=99
    }
}
