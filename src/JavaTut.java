import java.util.*;
import java.util.stream.IntStream;
public class JavaTut {

    static Scanner sc = new Scanner((System.in));
    final double SHORTPI = 3.14159;

    public static void main(String[] args) {

        //Random Num
        int minNum = 5;
        int maxNum = 20;
        int randNum = minNum + (int)(Math.random() *
                ((maxNum - minNum) +1));
        System.out.println("Rand :" + randNum);

        //Another rand num between  from 0 to 50
        int randnum = (int) (Math.random() * 50);
        System.out.println("Rand :" + randnum);




    }
}
