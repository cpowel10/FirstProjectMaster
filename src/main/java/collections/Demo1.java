package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        Set names = new TreeSet(); //sorted
        Set names2 = new LinkedHashSet(); //As is
        Set names3 = new HashSet(); //no order

        //TreeSet automatically gets sorted
        names.add("Sameer");
        names.add("Attaputta");
        names.add("Tufail");
        names.add("Daniel");
        names.add("Richard");
        names.add("Attaputta");

        names2.add("Sameer");
        names2.add("Attaputta");
        names2.add("Tufail");
        names2.add("Daniel");
        names2.add("Richard");
        names2.add("Attaputta");

        names3.add("Sameer");
        names3.add("Attaputta");
        names3.add("Tufail");
        names3.add("Daniel");
        names3.add("Richard");
        names3.add("Attaputta");

        System.out.println("TreeSet: "+names+"\n--------------");
        System.out.println("LinkedHashSet: "+names2+"\n--------------");
        System.out.println("HashSet: "+names3+"\n--------------");

    }
}
