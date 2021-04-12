import java.util.Arrays;
import  java.util.ArrayList;
import java.util.Iterator;

public class JavaLessonEleven {

    public static void main(String [] args){

        ArrayList arrayListOne;

        arrayListOne= new ArrayList();

        ArrayList  arrayListTwo = new ArrayList();

ArrayList<String> names = new ArrayList<String>();

           names.add("John Smith");
           names.add("Mohmand Alami");
           names.add("Oliva Chin");

           //Index val 2
           names.add(2,"Meena Kumari");

           names.set(0,"John Adams");

           names.remove(3);

//           names.removeRange(0,1); to remove the specific index numbers.

        //Type 1
        for (int i=0; i<names.size(); i++){

            System.out.println(names.get(i));


        }
        System.out.println(names);


        // Enhance for loop//Type 2
        for (String i : names){

            System.out.println(i);
        }


        //Type 3

        Iterator indivItems = names.iterator(); //creates new iterator objects:

        while (indivItems.hasNext()){

            System.out.println(indivItems.next());

        }




        ArrayList nameCopy =new ArrayList();
        ArrayList nameBackup =new ArrayList();

        nameCopy.addAll(names);  //Copied names to nameCopy

        String paulYoung ="Paul Young";

        names.add(paulYoung);//Added to names

        if (names.contains(paulYoung)){
            System.out.println("Paul is here");
        }

        if (names.containsAll(nameCopy)){

            System.out.println("Everything is nameCopy is in names. ");
        }

        names.clear();


        if(names.isEmpty()){
            System.out.println("Arraylist is Empty");
        }


      Object[] moreNames = new Object[4];
        moreNames= nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));




    }
}
