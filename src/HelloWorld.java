import org.omg.CORBA.StringHolder;

public class HelloWorld {
    public static void main(String[] args) {
     byte bigByte = 127;
     short bigshort= 32767;
     int bigInt = 2100000000;
     long bigLong = 9220000000000000L;
     float bigFloat = 3.14F;
     double bigDouble = 3.148237948727347923748;
     boolean trueorfalse = true;

        String byteString =  Byte.toString(bigByte);
        String shortString =  Short.toString(bigshort);
        String intString =  Integer.toString(bigInt);
        String longString =  Long.toString(bigLong);
        String floatString =  Float.toString(bigFloat);
        String doubleString =  Double.toString(bigDouble);

        double aDoublenum = 3.1408904884930;
        int anothernum = (int) aDoublenum;

        String StringToInt = "65";
int dd = Integer.parseInt(StringToInt);

        System.out.println(dd);
    }
}
