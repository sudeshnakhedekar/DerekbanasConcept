import java.util.*;
import java.util.stream.IntStream;
public class JavaTut {

    static Scanner sc = new Scanner((System.in));
    final double SHORTPI = 3.14159;

    public static void main(String[] args) {

     //CASTING ---> Converting from one datatype to another.

        //Small to large
        int smInt = 10;
        long smLong = smInt;
        System.out.println(smLong);

        //Large to small
        double cDbl = 1.234;
        int cInt =(int) cDbl;
        System.out.println(cInt);

        long bigLong = 2147486470L;
        int bInt = (int) bigLong;
        System.out.println(bInt);

        String favNum = Double.toString(1.618);
        //Byte.parseByte
        int strInt = Integer.parseInt("10");
        System.out.println(strInt);

        double strDbl = Double.parseDouble("10.876476575");
        System.out.println(strDbl);
        //remaining datatypes can be done as above





    }
}
