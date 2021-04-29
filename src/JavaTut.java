import java.util.*;
import java.util.stream.IntStream;
public class JavaTut {

    static Scanner sc = new Scanner((System.in));
    final double SHORTPI = 3.14159;

    public static void main(String[] args) {

        //String builder

        StringBuilder sb = new StringBuilder("I'm a string builder");
        //num of char.
        System.out.println(sb.length());
       //size that is set aside for your StringBuilder
        System.out.println(sb.capacity());
        //append
        sb.append(" Yeah");
        System.out.println(sb.insert(6,"Big "));
        System.out.println(sb.replace(6,9 ,"wig"));
        System.out.println(sb.substring(6,10));
        System.out.println(sb.delete(6,10));
        System.out.println(sb.charAt(4));
        System.out.println(sb.indexOf("Yeah"));








    }
}
