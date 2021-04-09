import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class javaLessonSubFour {

    public static void main(String[] args) {
        //Scanner userinput = new Scanner(System.in);//

/* Program 1: CALCULATING PI VALUE USING WHILE LOOP
 :::Note::: Scanner is not used in for program 1 */

//        double myPi = 4.0;
//        double j = 3.0;
//
//        // To calculate Pi ---> 4 - 4/3 + 4/5 -4/7 + 4/9
//
//        while (j < 100001 ){
//            myPi = myPi - (4/j) + (4/(j+2));
//            j +=4;
//            System.out.println(myPi);
//
//
//        }
//        System.out.println("Value of PI:" + Math.PI);

        /*   Program 2:Running While Loop Until user wants to stop//
        //Scanner is used in program//  */

//        String contYorN = "Y";
//        int h = 1;
//        while (contYorN.equalsIgnoreCase ("y")){
//
//            System.out.println(h);
//            System.out.println("Continue y or n? ");
//            contYorN = userinput.nextLine();
//            h++;
//
//        }


        //Program 3: DO WHOLE LOOP
//        int k =100;
//
//        do{
//            System.out.println(k);
//            k++;
//        }
//        while (k < 100);


    // Program 4: FOR LOOP --->LayOut--> (declare iterator; condition statement; change iterator

        for(int l= 10; l>=0; l--){
            System.out.println(l);

        }


        // We can declare variable outside the for loop
        // if you want to use them//

        int m , n;
        for (m=1, n=2; m<= 9; m+=2, n+=2)
        {
            System.out.println(m+ "\n" +n);
        }
    }
}
