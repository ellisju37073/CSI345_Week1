import java.util.ArrayList;
import java.util.Iterator;

public class pracArrayList {
    //ADT https://www.geeksforgeeks.org/abstract-data-types/
    //https://techvidvan.com/tutorials/java-abstract-data-type/
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<String> lst = new ArrayList<String>();

        lst.add("Red");
        lst.add("Yellow");
        lst.add("Green");
        lst.add("Blue");
        lst.add("Orange");
        lst.add("Purple");
        lst.add("Pink");
        lst.add("Black");

        //System.out.println(lst);

//        Iterator<String> it = lst.iterator();
//        while (it.hasNext()) {
//               System.out.println(it.next());
//         }

        for(String s: lst) {
            System.out.println(s);
        }

        //you can use a loop. https://www.geeksforgeeks.org/iterate-through-list-in-java/
        //this can be used in almost any collection
        //// Java Program to iterate over the list
        //// using iterator
        //
        //// Importing all classes of
        //// java.util package
        //import java.util.*;
        //
        //// Class
        //class GFG {
        //
        //    // Main driver method
        //    public static void main(String args[])
        //    {
        //        // Creating an ArrayList
        //        List<String> myList = new ArrayList<String>();
        //
        //        // Adding elements to the List
        //        // Custom inputs
        //        myList.add("A");
        //        myList.add("B");
        //        myList.add("C");
        //        myList.add("D");
        //
        //        // Iterator
        //        Iterator<String> it = myList.iterator();
        //
        //        // Condition check for elements in List
        //        // using hasNext() method returning true till
        //        // there is single element in a List
        //        while (it.hasNext()) {
        //
        //            // Print all elements of List
        //            System.out.println(it.next());
        //        }
        //    }
        //}


    }

}