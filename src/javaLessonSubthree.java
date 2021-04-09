public class javaLessonSubthree {
    public static void main(String[] args) {
        //Condition and ternary operators

        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue =( valueOne > valueTwo) ? valueOne : valueTwo;
        System.out.println(biggestValue);

        // switch statement

        char theGrade = 'b';
        switch (theGrade)
        {
            case'A' :
                System.out.println("Great job");
                break;
                //break; is  used as basically it says not using the switch statement
                // and jump down underneath get rid of break statement

                //continue is to continue running the switch statement.
            case 'b':
            case 'B' :
                System.out.println("Wow");
                break;
            case'C' :
                System.out.println("ok");
                break;
            case'D' :
                System.out.println("nice");
                break;
            default:
                System.out.println("Check again");
        }

    }
}
