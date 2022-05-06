package day3;

/**
 * Order of output:
 * order static
 * suborder static
 * order instance block, i=0
 * order constructor, i=10
 * suborder instance block, j=9
 * suborder constructor, j=15
 */
class Order {
    int i;
    static {
        System.out.println("Order class static block ");
    }
    Order() {
        i = 10;
        System.out.println("Order class constructor,i= " + i);
    }
    {
        System.out.println("Order class instance block,i= " + i);
    }
}
class SubOrder extends Order {
    int j = 9;
    static {
        System.out.println("SubOrder class static block");
    }
    SubOrder() {
        j = 15;
        System.out.println("SubOrder class constructor,j= " + j);
    }{
        System.out.println("SubOrder class instance block,j= " + j);}
    public static void main(String str[]) {
        new SubOrder();
    }
}
