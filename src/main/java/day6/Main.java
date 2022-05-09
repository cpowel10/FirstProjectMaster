package day6;

public class Main {
    public static void main(String[] args) {
        try {
            int arr[] = new int[10];
            System.out.println(arr[40]);
            int a=1;
            int b=0;
            System.out.println(a/b);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getClass());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }
        catch(ArithmeticException e){
            System.out.println(e.getClass());
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Thank you for using my program");
    }
}
