package day10_collections_framework.hashSetvsTreeSet;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetComparisonExample {
    private static final int INITIAL_CAPACITY = 100_000;
    private static final int NUM_OPERATIONS = 1_000_000;

    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>(INITIAL_CAPACITY);
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();

        //hashset insertions timing
        long startTime = System.nanoTime();
        for(int i = 0; i < NUM_OPERATIONS; i++){
            hashSet.add(random.nextInt());
        }
        long hashSetTime = System.nanoTime() - startTime;

        //hashset insertions timing
        startTime = System.nanoTime();
        for(int i = 0; i < NUM_OPERATIONS; i++){
            treeSet.add(random.nextInt());
        }
        long treeSetTime = System.nanoTime() - startTime;
        System.out.println("Insertion time for " + NUM_OPERATIONS + " elements:");
        System.out.println("HashSet: " + hashSetTime / 1_000_000 + " ms");
        System.out.println("TreeSet: " + treeSetTime / 1_000_000 + " ms");
        System.out.println();

        //storing of objects
        HashSet<Integer> smallHashSet = new HashSet<>();
        TreeSet<Integer> smallTreeSet = new TreeSet<>();

        for(int i = 0; i < 10; i++){
            int num = random.nextInt(1000000);
            smallHashSet.add(num);
            smallTreeSet.add(num);
        }

        System.out.println("Insertion of numbers with 10 random elements");
        System.out.println("Hashset: " + smallHashSet);
        System.out.println("TreeSet: " + smallTreeSet);
        System.out.println();




    }
}
