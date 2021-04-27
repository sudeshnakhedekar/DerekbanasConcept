import java.util.*;
import java.util.stream.IntStream;
public class JavaTut {

    static Scanner sc = new Scanner((System.in));
    final double SHORTPI = 3.14159;

    public static void main(String[] args) {

    //Strings

    String name ="Sudeshna";
    String wName =name +" Khedekar";
    wName +=" is my name";
        System.out.println(wName);
        String drDog ="K" +9;

        System.out.println(wName.charAt(10) );
        System.out.println(wName.contains("sudeshna"));// prints false
        System.out.println(wName.contains("Sudeshna"));//prints true
        System.out.println(wName.indexOf("Sudeshna"));
        System.out.println(wName.length());

        System.out.println("dog equals cat : " +("dog").equals("cat"));

        //if it gives 0 then values are same
        //if it gives -1 then String comes before
        //if it gives anything above String comes after
        System.out.println(wName.compareTo("ABC"));

        System.out.println(wName.replace("Sudeshna" , "Sudu"));

        System.out.println(wName.substring(0,8));

        for (String x: wName.split(" "))//Space after avery String word
        System.out.println(x);

        //delete the white space from the begining and ending of the String

        System.out.println();
        System.out.println("TrimFunction: ");
        System.out.println(wName.trim().toUpperCase());
        System.out.println(wName.trim().toLowerCase());








    }
}
