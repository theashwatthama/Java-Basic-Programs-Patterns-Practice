package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class a {
    static void main() {
        String str = "geeks";
        changeCase(str);

    }
    // User function Template for Java

    public static void changeCase(String s) {

       String first = s.substring(0,1).toUpperCase()+s.substring(1);
        System.out.println(first);
        String line=s.toUpperCase();
        System.out.println(line);
    }

}