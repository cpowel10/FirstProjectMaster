package day4;

public class StringBuilderPractice {
    public static void main(String[] args) {
        //Similar to StringBuffer, but faster and preferred for single-threaded programs
        //However, if thread safety is needed, StringBuffer should be used
        StringBuilder builder = new StringBuilder(); //Default capacity = 16

        builder.append("Hello");
        System.out.println(builder); //Hello
        System.out.println(builder.length()); //5
        System.out.println(builder.capacity()); //16

        builder.append("pppppppppppTTT");
        System.out.println(builder); //HellopppppppppppTTT
        System.out.println(builder.length()); //19
        System.out.println(builder.capacity()); //34
    }
}
