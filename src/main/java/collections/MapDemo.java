package collections;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> data = new TreeMap<String,Integer>();

        data.put("Daniel",98000);
        data.put("Richard",18000);
        data.put("Sachin",58000);

        System.out.println(data);
        System.out.println("---------------------");

        Map<String,Integer> movieYearData = new TreeMap<String, Integer>();

        movieYearData.put("Top Gun",1995);
        movieYearData.put("La La Land",2014);
        movieYearData.put("The Muppets Christmas Carol",1966);

        System.out.println(movieYearData);
    }
}
