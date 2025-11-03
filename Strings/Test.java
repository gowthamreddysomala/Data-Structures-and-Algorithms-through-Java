package Strings;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;


public class Test {
    public static void main(String[] a){
         // collections

        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(3);
        System.out.println(arraylist);
        for(int k:arraylist){
            System.out.print(k+" ");
        }
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Somala");
        linkedList.add("Gowtham");
        linkedList.add("Kumar");
        linkedList.add("Reddy");
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeFirst();
        for(String name : linkedList){
            System.out.print(name+" ");
        }
        Set<String> setofnames = new HashSet<>();
        setofnames.add("Gowtham Reddy");
        setofnames.add("Somala");
        setofnames.add("Somala"); // this ain't added cuz it a duplicate
        System.out.println(setofnames); // the order is fuckedup
        System.out.println(setofnames.contains("Gowtham Reddy"));


    }
}
