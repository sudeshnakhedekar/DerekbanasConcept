import java.util.Arrays;

public class JavaLessonThirteen {

    public static void main(String[] args) {

        String randomString ="I'm just a randomString";

        // If you want to use quotes in a string escape it with \
        // Always surround Strings with quotes " " and not Apostrophes ' '

        String gotToQuote ="He said, \"I'm here\"";

        // You combine Strings with a +
        System.out.println(randomString + " " + gotToQuote);



        /* Other common Escape Codes
         * \n : Newline
         * \b : Backspace
         * \' : Apostrophe
         * \" : Quote
         * \\ : Backslash
         */


        int numTwo =2;
        // You can add other data type to the string with a +
        System.out.println(randomString + " " + numTwo);


        /* You convert primitive types to a string with toString
         * String byteString = Byte.toString(bigByte);
         * String shortString = Short.toString(bigByte);
         * String intString = Integer.toString(bigInt);
         * String longString = Long.toString(bigByte);
         * String floatString = Float.toString(bigByte);
         * String doubleString = Double.toString(bigByte);
         * String booleanString = Boolean.toString(bigByte);
         *
         * * You convert from String to primitives with parse
         * int stringToInt = Integer.parseInt(intString);
         * parseSort, parseLong, parseByte, parseDouble,
         * parseBoolean, parseFloat
         */

        // You compare strings with equals or equalsIgnoreCase

        String uppercaseStr = "BIG";
        String lowercaseStr = "big";

        if (uppercaseStr.equals(lowercaseStr)){

            System.out.println("They're equal");
        } //------> it wont print

        if (uppercaseStr.equalsIgnoreCase(lowercaseStr)){

            System.out.println("They're equal");
        } //------> it will print

        //Quality comparison with two different String.
       String letters = "abcde";
       String moreLetters = "fghijk";

       String randString = "         abfgfhfj    ";

       // Find Out what char is on what excat position.
        System.out.println("\nSecond Char :" + letters.charAt(1));

        // compareTo returns 0 if strings are equal
        // Returns a negative number if letters comes before moreLetters
        // Returns a positive number if letters comes after moreLetters
        // There is also a compareToIgnoreCase()
        System.out.println(letters.compareTo(moreLetters));

        System.out.println(letters.contains("abc"));
        System.out.println(letters.endsWith("de"));
        // starstWith method i also available just like endsWith.

        System.out.println(letters.indexOf("cd"));

        //You can alse specify the index to start searching from
        // indexOf(StringToLookFor, IndexStartPosition)
        //LastIndexOf() works like indexOf except it starts from the
        //end of the String you are searching.


        System.out.println("Length is :" +letters.length());
        System.out.println("Replace by :"+letters.replace("abc" ,"xyz"));


        String[] letterArray = letters.split("");

        System.out.println(Arrays.toString(letterArray));



        char[] charArray =letters.toCharArray();

        System.out.println(Arrays.toString(charArray));

        System.out.println(letters.substring(1,4));

    StringBuilder randSB = new StringBuilder("A random value");

        System.out.println(randSB.append(" again "));

        System.out.println(randSB.capacity());

        randSB .ensureCapacity(60);

        System.out.println(randSB.capacity());

        System.out.println(randSB.length());

        randSB.trimToSize();

        System.out.println(randSB.capacity());

        System.out.println(randSB.insert(1, "nother"));

        String oldSB = randSB.toString();









    }



}
