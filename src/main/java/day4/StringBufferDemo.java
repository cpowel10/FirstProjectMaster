package day4;

public class StringBufferDemo {
    public static void main(String[] args) {
        //capacity method of stringbuffer
        //QC: length vs capacity of Stringbuffer
        //capacity = 16
        StringBuffer data = new StringBuffer();

        data.append("Hello");
        //data.append("How are you today?");
        System.out.println(data);
        System.out.println(data.length()); //5
        System.out.println(data.capacity()); //16

        data.append("ppppppppppp");
        System.out.println(data.length()); //16
        System.out.println(data.capacity()); //16

        data.append("khh");
        System.out.println(data.length()); //19
        System.out.println(data.capacity()); //17*2=34 --(1 + Previous Capacity) * 2

        data.append("khhppppppppppppTT");
        System.out.println(data.length()); //36
        System.out.println(data.capacity()); //35*2=70
    }
}
