import java.sql.SQLOutput;
import java.util.Scanner;
public class javaLessonTwo {

static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Your favorite number: ");

//STRING
//    if(userinput.hasNext()){
//
//        String StringEntered = userinput.nextLine();
//
//        System.out.println("You entered:" +StringEntered);
//
//    }
//    else{
//        System.out.println("You entered wrongly!");

// INTEGER
        if (userinput.hasNextInt()){
            int intEntered = userinput.nextInt();
            System.out.println("You entered:" +intEntered);

 int anotherNum = intEntered +intEntered;
 int someMinusNum = intEntered - 2;
 int andMulNum = intEntered * intEntered;
 int andDivNum = intEntered / 2;
 int andModNum = intEntered % 2;
            System.out.println("You entered:" +intEntered+ " + " +intEntered+ " = " +anotherNum);
            System.out.println("You entered:" +intEntered+ " - " + 2 + " = " +someMinusNum);
            System.out.println("YOu entered:" +intEntered+ " * " +intEntered + " = " +andMulNum);
            System.out.println("You entered:" +intEntered+ " / " + 2 + " = "+andDivNum);
            System.out.println("you entered:" +intEntered+ " % " + 2 + " = " +andModNum);

            int NumAbs = Math.abs(intEntered);
            int NumMax = Math.max(5,7); //7
            int NumMin = Math.min(8,4); //4
            double NumSqrt = Math.sqrt(5.45);
            int  NumCiel = (int) Math.ceil(5.23); //5
            int NumFloor = (int) Math.floor(5.23); //6
            int NumRound = (int) Math.round(5.55); //6
            int NumRandom = (int) (Math.random()* 100);
            System.out.println(NumRandom);


        }
    else {
        System.out.println("You entered  wrongly ,try again later! ");
        }

    }
}
