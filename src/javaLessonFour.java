public class javaLessonFour {
    public static void main(String[] args) {

        int i = 1;
        //While Loop

        while (i <=20){
            if(i == 3){
                i+=2;
                continue; //it will start running the while loop
                          // from the beginning
            }
            System.out.println(i);
            i++;

            if (i%2==0){
            i++;

            if(i > 10){
                break;
            }
            }
        }

    }
}
