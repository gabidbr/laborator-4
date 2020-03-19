package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner userInput = new Scanner(System.in);
        //do{
        //    char option = userInput.next().charAt(0);
        //}while(true);
        Sorting sortingArray = new Sorting();
        int[] myArray = new int[10];
        int[] anotherArray = new int[10];
        sortingArray.setAnotherArray(anotherArray);
        sortingArray.setArray(myArray);

        sortingArray.selectOption();

    }
}
