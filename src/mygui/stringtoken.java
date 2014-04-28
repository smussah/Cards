package mygui;

import java.util.StringTokenizer;

/**
 * Created by sadikmussah on 4/27/14.
 */
public class stringtoken {
    public static void main(String[] args) {
        String s = " ";
        String x = "today is sunday";
        x = x.replaceAll("\\s+","");
       // x = x.trim();
        System.out.println(x);
    }
}
