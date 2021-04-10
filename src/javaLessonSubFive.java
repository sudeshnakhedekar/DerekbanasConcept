import java.sql.SQLOutput;
import java.util.Scanner;

public class javaLessonSubFive {
    //Program 1:
//  static double myPi = 3.14159; //Class Variable

    //Program:  2
   static int randomNum; //Class Variable
    static  Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
//Program 1:
        //    int d = 5; // Local variable to main function
//    tryToChange(d);
//        System.out.println("main d = " + d);

 //Program 2:

        System.out.println(getRandomNum());
        int guessResult =1;
        int randomGuess = 0;

        while(guessResult != -1){
            System.out.println("Guess a number between 0 and 50:");

            randomGuess= userinput.nextInt();

            guessResult =checkGuess(randomGuess);

        }

        System.out.println("Yes the random is = " +randomGuess);

    }
    //Program 1:
   // public  static  void tryToChange (int d){

//        d = d + 1;
//        System.out.println("tryToChange d = " + d);

        //Program 2:
    public static int getRandomNum(){
 randomNum = (int) (Math.random() *51);
 return  randomNum;
    }

public static  int checkGuess(int guess){

        if(guess == randomNum){
            return -1;
        }
        else {
        return  guess;
        }

}
    }

