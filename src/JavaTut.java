import java.util.*;
import java.util.stream.IntStream;
public class JavaTut {

    static Scanner sc = new Scanner((System.in));
    final double SHORTPI = 3.14159;

    public static void main(String[] args) {


        //Array
        int[] a1 = new int[10];
        a1[0]=1;
        Arrays.fill(a1,2);
        System.out.println(a1[0]);
        System.out.println(a1.length);
        String[] a2 = {"one","two"};
        int[] oneTo10 = IntStream.rangeClosed(2,10).toArray();
        for(int x: oneTo10) System.out.println(x);
        









    }
}
