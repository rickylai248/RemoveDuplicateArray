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
        System.out.println("Checking for duplicates...");
        for (String str : names) {
            System.out.println(str + " ");
        }
    }
}
