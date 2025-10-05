package com.teddyjones.digimon;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;

/**
 * A Java application to demonstrate the performance of different data structures,
 * themed around a Digimon data battle!
 *
 * @author Teddy Jones
 */

public class DigimonDataBattle {

    // The number of integers to add and delete, representing the digital data packets.
    private static final int DATA_PACKETS = 2_000_000;
    private static final Random randomGenerator = new Random();

    /**
     * The main method, serving as the Digital World's battle arena.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Digital World Battle Arena!");
        System.out.println("Today's challenge: Processing " + String.format("%,d", DATA_PACKETS) + " data packets.");
        System.out.println("====================================================\n");

        // Call each Digimon's method to perform the test.
        veemonArrayListAttack();
        wormmonLinkedListAttack();
        patamonHashtableAttack();

        System.out.println("\n====================================================");
        System.out.println("The data battle is complete!");
    }

    /**
     * Veemon uses an ArrayList to process the data packets.
     *
     * ArrayLists are fast for adding and fast for removing from the end.
     */
    public static void veemonArrayListAttack() {
        System.out.println("The battle begins!"); // <-- ADDED THIS LINE
        System.out.println("--- Veemon's Turn: ArrayList ---");
        ArrayList<Integer> dataList = new ArrayList<>();
        long startTime, endTime;

        // --- ADDITION ---
        System.out.println("Veemon, Vee Headbutt! (Adding data...)");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < DATA_PACKETS; i++) {
            dataList.add(randomGenerator.nextInt());
        }
        endTime = System.currentTimeMillis();
        System.out.printf(">> Data added in: %d milliseconds.\n\n", (endTime - startTime));

        // --- DELETION ---
        System.out.println("Veemon, clear the data! (Deleting...)");
        startTime = System.currentTimeMillis();
        // Deleting from the end of an ArrayList is much faster (O(1)) than from the start.
        for (int i = DATA_PACKETS - 1; i >= 0; i--) {
            dataList.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.printf(">> Data deleted in: %d milliseconds.\n", (endTime - startTime));
    }

    /**
     * Wormmon uses a LinkedList to process the data packets.
     *
     * LinkedLists are also fast for adding and removing from the ends.
     */
    public static void wormmonLinkedListAttack() {
        System.out.println("\nThe battle begins!"); // <-- ADDED THIS LINE
        System.out.println("--- Wormmon's Turn: LinkedList ---");
        LinkedList<Integer> dataList = new LinkedList<>();
        long startTime, endTime;

        // --- ADDITION ---
        System.out.println("Wormmon, Silk Thread! (Adding data...)");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < DATA_PACKETS; i++) {
            dataList.add(randomGenerator.nextInt());
        }
        endTime = System.currentTimeMillis();
        System.out.printf(">> Data added in: %d milliseconds.\n\n", (endTime - startTime));

        // --- DELETION ---
        System.out.println("Wormmon, clean up the web! (Deleting...)");
        startTime = System.currentTimeMillis();
        // Removing the last element from a LinkedList is very efficient (O(1)).
        for (int i = 0; i < DATA_PACKETS; i++) {
            dataList.removeLast();
        }
        endTime = System.currentTimeMillis();
        System.out.printf(">> Data deleted in: %d milliseconds.\n", (endTime - startTime));
    }

    /**
     * Patamon uses a Hashtable to process the data packets.
     *
     * Hashtables use a key-value system and are very fast for lookups, adds, and removes.
     */
    public static void patamonHashtableAttack() {
        System.out.println("\nThe battle begins!"); // <-- ADDED THIS LINE
        System.out.println("--- Patamon's Turn: Hashtable ---");
        Hashtable<Integer, Integer> dataTable = new Hashtable<>();
        long startTime, endTime;

        // --- ADDITION ---
        System.out.println("Patamon, Boom Bubble! (Adding data...)");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < DATA_PACKETS; i++) {
            // We use the loop counter 'i' as the key and a random int as the value.
            dataTable.put(i, randomGenerator.nextInt());
        }
        endTime = System.currentTimeMillis();
        System.out.printf(">> Data added in: %d milliseconds.\n\n", (endTime - startTime));

        // --- DELETION ---
        System.out.println("Patamon, clear the air! (Deleting...)");
        startTime = System.currentTimeMillis();
        // Removing by key in a Hashtable is very efficient (average O(1)).
        for (int i = 0; i < DATA_PACKETS; i++) {
            dataTable.remove(i);
        }
        endTime = System.currentTimeMillis();
        System.out.printf(">> Data deleted in: %d milliseconds.\n", (endTime - startTime));
    }
}