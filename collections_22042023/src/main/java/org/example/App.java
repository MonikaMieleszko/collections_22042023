package org.example;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        //  System.out.println( "Hello Judyta!" );
        //  Stwórz dwa HashSety integerów i zaimplementuj dla nich następujące działania rachunków zbiorów: suma, część wspólna, różnica, suma bez części wspólnej. Wynik działania powinien trafić do trzeciego zbioru.
        Set<Integer> numbers1 = new HashSet<>();
        Set<Integer> numbers2 = new HashSet<>();
        numbers1.add(8);
        numbers1.add(9);
        numbers1.add(11);
        numbers2.add(8);
        numbers2.add(19);
        numbers2.add(121);
        Set<Integer> intersection = new HashSet<>();


        for (int index : numbers1) {
            for (int index2 : numbers2) {
                if (index == index2) {
                    System.out.println(index);
                    intersection.add(index);
                    System.out.println(intersection);
                }
            }
        }
        Set<Integer> union = new HashSet<>();
        for (int index3 : numbers1) {
            union.add(index3);
        }
        for (int index3 : numbers2) {
            union.add(index3);
        }
        System.out.println(union);

        Set<Integer> differenceAB = new HashSet<>();

        for (int index : numbers1) {
                if (numbers2.contains (index)) {
                }
                    else {
                    differenceAB.add(index);
                }
            }
        System.out.println(differenceAB);

        Set<Integer> differenceBA = new HashSet<>();

        for (int index2 : numbers2) {
            if (numbers1.contains(index2)) {
            } else {
                differenceBA.add(index2);
            }
        }
        System.out.println(differenceBA);

        Set<Integer> diffSym = new HashSet<>();
        for (int index : numbers1) {
           if (numbers2.contains(index)) {
                } else {
                    diffSym.add(index);
                }
            }
        for (int index2 : numbers2) {
            if (numbers1.contains(index2)) {
            } else {
                diffSym.add(index2);
            }
        }
            System.out.println(diffSym);

        // Task 3 - Stwórz dwie HashMapy<String, Integer> (jak w liście zakupów)
        //i zaimplementuj ich sumowanie. Np jedna mapa to Jajka: 3; Mleko: 1,
        // a druga to Jajka: 2; Kiełbasa: 2, wynik to Jajka: 5; Mleko: 1; Kiełbasa: 2
        Map<String, Integer> groceries1 = new HashMap<>();
        Map<String, Integer> groceries2 = new HashMap<>();
        groceries1.put("Jajka",3);
        groceries1.put("Mleko",1);
        groceries2.put("Jajka",2);
        groceries2.put("Kiełbasa",2);
        Map<String, Integer> groceries = new HashMap<>();

// Iterate over keys
        for (String key : groceries1.keySet()) {
            System.out.println(key);
            for (String key1 : groceries2.keySet()){
                if(key == key1){
                    int quantity1 = groceries1.get(key);
                    int quantity2 = groceries2.get(key1);
                        groceries.put(key, quantity1 + quantity2);
                    System.out.println(key+" "+ quantity2);}
                else {
                        groceries.put(key, 1);
                    }

                }
            }
        System.out.println(groceries);

      //  if (groceries2.containsKey(groceries1)){
       //     groceries.put(product, 1);

     //   }

//            if (shoppingList.containsKey(product)) {
//                int quantity = shoppingList.get(product);
//                shoppingList.put(product, quantity + 1);
//            } else {
//                shoppingList.put(product, 1);
//            }
//            System.out.println("Aktualna lista zakupów:");
//            for (String key : shoppingList.keySet()) {
//                int quantity = shoppingList.get(key);
//                System.out.println(key + ": " + quantity);
//            }
//        }
    }
}
