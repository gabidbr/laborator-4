package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = new int[49];
	    int[] ranArr = new int[6];
	    Sorting sorting = new Sorting();
	    sorting.setArray(arr);
	    sorting.setRandomArray(ranArr);
	    sorting.ranArray(arr);
        System.out.println("Cele 49 numere:");
	    sorting.printArray(arr);
	    sorting.getRandomArray(arr);
        System.out.println("\nCele 6 numere random:");
	    sorting.printArray(ranArr);
	    sorting.sortRandomArray(ranArr);
        System.out.println("\nDupa sortare:");
        sorting.printArray(ranArr);

    }
}
