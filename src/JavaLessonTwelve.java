import java.util.LinkedList;
import java.util.Arrays;

public class JavaLessonTwelve {

    public static void main(String[] args) {
        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("Ahmed Bennani");
        names.add("Ali Syed");


        //It Add in Very last Position.
        names.addLast("Nathan Martin");
        //It Add in Very first Position
        names.addFirst("Joshua Smith");

        //Adding at specific location.
        names.add(0,"Noah Peeters");
        //Setting value a specific location.
        names.set(2,"Paul Newman");

        //Remove values
        names.remove(4);
        names.remove("Joshua Smith");



    //Type1
    for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));

    }
//        System.out.println(names)
        System.out.println("\nIndex: " +names.get(0));
        System.out.println("\nFirst Index: " +names.getFirst());
        System.out.println("\nLast Index: " +names.getLast());

        System.out.println();

    //Type2 //Enhance for loop
        for (String name : names){

            System.out.println(name);
        }


        LinkedList<String> nameCopy = new LinkedList<String>(names);

        System.out.println("\n nameCopy:" +nameCopy);

        if(names.contains("Noah Peeters")){

            System.out.println("\nNoah is here");
        }else{

            System.out.println("Wrong search");
        }

        if (names.containsAll(nameCopy)){

            System.out.println("Collection are same here");
        }

        System.out.println("\nAli Index: " +names.indexOf("Ali Syed"));

        if(names.isEmpty()){

            System.out.println("List is empty");
        }
        //OR , Other wise to check list is empty or not.

        System.out.println("\nList Emty: " +names.isEmpty());


//        System.out.println("\nHow Many :" +names.size());
//
//        System.out.println("\nLook without Error :" +names.peek());
//
//        System.out.println("\nremove first element :" + nameCopy.poll());
//
//        System.out.println("\nremove last element :" + nameCopy.pollLast());

        nameCopy.push("Peeters");


        for (String name : nameCopy ){

            System.out.println(name);
        }

        nameCopy.pop();


        for (String name : nameCopy ){

            System.out.println("\n" +name);
        }

Object[] nameArray = new Object[4];

        nameArray =names.toArray();

        System.out.println(Arrays.toString(nameArray));


        //clears the linked list:-
        //names.clear();


    }


}
