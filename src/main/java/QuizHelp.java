import java.util.Collection;
import java.util.Map;

class Automobile{

}
class Car extends Automobile{
    public void drive(){
        System.out.println("Car drive");
    }
}

public class QuizHelp {
    public static void main(String[] args) {
        for(String t : args){
            System.out.print(t);
        }

        String S = "AAA";
        char c = S.charAt(0);
        S.length();
        S.toLowerCase();
        System.out.println(S.toLowerCase());
    }
}


