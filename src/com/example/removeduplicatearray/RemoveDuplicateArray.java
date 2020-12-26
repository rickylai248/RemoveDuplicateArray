package com.example.removeduplicatearray;

import java.util.ArrayList;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        System.out.println("Initialization Line");
        ArrayList<String> names = new ArrayList<>();
        names.add("Angel");
        names.add("Bob");
        names.add("Angel");
        names.add("Carry");
        names.add("Daniel");
        names.add("Fiona");
        names.add("Fiona");
        System.out.println("Initial Names");
        for (String str : names) {
            System.out.println(str + " ");
        }
        System.out.println("Checking for duplicates...");
        int current = 0;
        while (current < names.size()) {
            int j = 0;
            boolean removed = false;
            while (j < current) {
                if (names.get(current).equals(names.get(j))) {
                    names.remove(current);
                    removed = true;
                    break;
                }
                else j++;
            }
            if (!removed) current++;
        }
        System.out.println("List of Names after filtering out duplicates");
        for (String str : names) {
            System.out.println(str + " ");
        }
    }
}
