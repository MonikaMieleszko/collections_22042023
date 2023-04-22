package org.example;

import java.util.Set;

import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
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
            for (int index2 : numbers2)
                if (index == index2) {
                    System.out.println(index);
                    intersection.add(index);
                    System.out.println(intersection);
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
            differenceAB.add(index);}
        for (int index : numbers1)
            for (int index2 : numbers2)
                if (index == index2) {
                    System.out.println(index);
                   differenceAB.remove(index);
                    System.out.println(differenceAB);
                }

        Set<Integer> differenceBA = new HashSet<>();
        for (int index : numbers2) {
            differenceBA.add(index);}
        for (int index : numbers2)
            for (int index2 : numbers1)
                if (index == index2) {
                 //   System.out.println(index);
                    differenceBA.remove(index);}
                    System.out.println(differenceBA);

        Set<Integer> diffSym = new HashSet<>();
        for (int index3 : differenceAB) {
            diffSym.add(index3);
        }
        for (int index3 : differenceBA) {
            diffSym.add(index3);
        }
        System.out.println(diffSym);

    /*    Set<Integer> unionMinusIntersect = new HashSet<>();
        // unionMinusIntersect=union;
        //if(intersection)
        for (int index4 : numbers1) {
            unionMinusIntersect.add(index4);
        }

        for (int index4 : numbers1) {
            //  unionMinusIntersect.add(index4);
            for (int index5 : numbers2)
                if (index4 != index5) {
                    unionMinusIntersect.add(index5);
                } else {
                    unionMinusIntersect.remove(index4);
                }
            //   System.out.println(index4);
            //  union.remove(index4);

        }System.out.println(unionMinusIntersect);*/

       // System.out.println(union.remove(intersection));
       // System.out.println(union);

      //  names.add("Mateusz");


       // Stwórz dwie HashMapy<String, Integer> (jak w liście zakupów) i zaimplementuj ich sumowanie. Np jedna mapa to Jajka: 3; Mleko: 1, a druga to Jajka: 2; Kiełbasa: 2, wynik to Jajka: 5; Mleko: 1; Kiełbasa: 2

    }
}
