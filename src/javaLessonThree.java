public class javaLessonThree {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 50);

        /* Relational Operator:
         *Java has 6 relational operators
         * > : Greater than
         * < : Less than
         * == : Equal to
         * != : Not Equal to
         * >= : Greater than equal to
         * <= : Less than equal to
         */

        if (randomNum < 25) {

            System.out.println("The random number is less than 25");
        } else if (randomNum > 40) {
            System.out.println("The random number is greater than 40");
        }

        //Equal to Operator
//        else if (randomNum == 18){
//            System.out.println("The random number is equal  to 18");
//
//        }

        //Not Equal to Operator
//        else if (randomNum != 40){
//            System.out.println("The random number is not equal  to 40");
//        }

        else if (randomNum <= 18) {

            System.out.println("The random number is less  than eaual to 18");
        } else if (randomNum >= 40) {
            System.out.println("The random number is greater than eaual to 40");
        } else {
            System.out.println("Nothing worked");
        }
        System.out.println("The random number is" + randomNum);

        //LOGICAL OPERATORS:
        //Java has 6 logical operators
        //&
        //&& 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
        //|
        //|| 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
        //!  	Logical not	Reverse the result, returns false if the result is true
        //^

        if (!(false)) { // if it is true it w'nt print
            System.out.println("\nI turned false into true");
        }

        if ((false) && (true)) { // both are true it will print the sout statement.

            System.out.println("Both are true");
        }

        if ((false) & (true)) { //&& checked if its false the second one is false
            // but the & oerator will check the second even if the first is false.

            System.out.println("value to be true");
        }

            if ((false) || (true)) { // if either of one is true it will print the sout statement.

                System.out.println("One is  true");
            }
        if ((false) ^ (true)){ // only print if one is true and other is false
            System.out.println("Either one is true and other is false");
        }
        }



}

