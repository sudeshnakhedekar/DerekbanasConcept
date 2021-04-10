//  Two types of Exceptions:
// java.lang.RunTimeException
// java.lang.Exception

// Some Common Exception:
//ArithmeticException
//ClassNotFoundExxception
//IllegalArgumentException
//InputMismatchexception
//IOException



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class javaLessonSix {

    //Program 1: Explained about ArithmeticException.
//    public static void main(String[] args) {
//
//        divideByZero(2);
//
//    }
// public  static void divideByZero(int a){
//        try{
//
//            System.out.println(a/0);
//
//        }
//        catch (ArithmeticException e){
//            System.out.println("You can't do that");
//
//            System.out.println(e.getMessage()); // ---> / by zero is print
//
//          //  System.out.println(e.toString()); //---> it gives this message "java.lang.ArithmeticException: / by zero"
//            e.printStackTrace();
//        }
//
// }



   // Program 2 :Explained about InputMismatchexception.
//
//static Scanner userInput = new Scanner(System.in);
//
//    public static void main(String[] args) {
//
//        System.out.println("How old are you?");
//        int age = checkValidAge();
//        if(age !=0){
//            System.out.println("You are " +age+ " years old ");
//        }
//    }
//
//    public static int checkValidAge() {
//try{
//
//return userInput.nextInt();
//}
//catch (InputMismatchException e){
//    userInput.next();
//    System.out.println("That is'nt a whole number");
//
//   // System.out.println(e.toString());// just to print exception type.
//    return 0;
//}
//
//    }

     //Program 3: Explained about FileNotFoundexception

//    public static void main(String[] args) {
//
//getAFile("./somestuff.txt");
//    }
// public static void  getAFile(String fileName){
//  try{
//
//     FileInputStream file = new FileInputStream(fileName);
//
//  }
//  catch (FileNotFoundException e){
//      System.out.println("Sorry cant find that file");
//
//  }
////Note: catch (ClassNotFoundException e ) {}  //----->to ignore the exception its is done in this way
//
//  catch (IOException e) {
//      System.out.println("Some unknow IO Error");
//  }
//
//  //Multiple catch can be there in one try block.
//  catch (Exception e){
//      System.out.println("Error Ocurred");
//  }
//finally {
//      System.out.println(""); // it will execute whether the exception trigger or not
//                              // finally will execute
//  }
// }

    //Program 4: Explain about how expections are catch in main function using 'throws' .

    public static void main(String[] args) {
try {
    getAFile("./somestuff.txt");
}
catch (IOException e){
    System.out.println("An IO Error Occured");

}
  }

    public static void  getAFile(String fileName) throws IOException, FileNotFoundException{

        FileInputStream file = new FileInputStream(fileName);

    }

}
