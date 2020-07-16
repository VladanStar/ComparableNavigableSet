package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // kreiranje hash seta
        Set<String> set = new HashSet<>();
        // dodavanje stringova u set
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("Roma");

        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println("Sorted tree set"+ treeSet);

        // upotreba metoda interfejsa SortedSet
        System.out.println("first: "+ treeSet.first());
        System.out.println("lasi: " + treeSet.last());
        System.out.println("head Set(\"New York\");" + treeSet.headSet("New York"));
        System.out.println("tailSet(\"New York\")"+treeSet.tailSet("New York"));

        // upotreba interfejsa
        // NavigableSet
        //vraca najveci element koji je manje od P
        System.out.println("Lower(\"P\")"+ treeSet.lower("P"));
        // vraca najmanji element koji je veci od P
        System.out.println("Higher(\"P\")"+ treeSet.higher("P"));
        // vraca najmanji element koji je veci ili jednak sa P u treeSet
        System.out.println("ceiling(\"P\")" + treeSet.ceiling("P"));
        // vraca najveci element koji je manji od P u treeSet
        System.out.println("floor(\"P\")"+ treeSet.floor("P"));
        // uklanja prvi element i vraca ukolnjeni element
        System.out.println("pollFirst()" + treeSet.pollFirst());
        // uklanja poslednji element i vraca uklonjeni element
        System.out.println("pollLast()"+ treeSet.pollLast());
        System.out.println("New treeSet" + treeSet);





    }
}
