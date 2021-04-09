

public class javaLessonFive {

    static double myPi = 3.14159; //Class Variable

    public static void main(String[] args) {

        // METHOD is call as ----->  acessModifer static returnTpe or void  methodName(parameter or arguments) //

        //first part
//       addThem(1,2);
//        System.out.println("Global " + myPi); // variable value doesnt change

        //second part
        System.out.println(addThem(1,2));
    }

    public  static  int addThem(int a, int b){
        // part 1
        double smallPI = 3.140; //Local variable

//        //Overridding variable value---> first statement
//        double myPi = 3.0;

        //second statement // & //part 1//
        //myPi =myPi + 3.0;
        //System.out.println("Local " + myPi); // value change to override value & if it
                                               // second statement then the 3.0 value with myPi value.

        //part 2 //

        int c= a + b;


        //part 1//
       // return 1;

        //part 2
        return c;
    }
}
