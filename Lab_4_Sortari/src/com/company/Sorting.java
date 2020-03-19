package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sorting {
    private int[] array;
    private int[] anotherArray;

    public void setAnotherArray(int[] anotherArray) {
        this.anotherArray = anotherArray;
    }

    public Sorting() {
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void generateArray(int[] array){
        Random rd = new Random();
        for(int i = 0 ; i <array.length ;i++){
            array[i] = rd.nextInt(50)+1;
        }
        System.out.println("Array generated. generateArray() called.");
        System.arraycopy(array, 0, anotherArray, 0, anotherArray.length);
    }

    public void reinitArray(int[] array,int[] anotherArray){
        System.arraycopy(anotherArray,0,array,0,array.length);
        System.out.println("reinitArray() called.");
    }

    public void insertSort(int[] array){
        int temp;
        for(int i = 1;i < array.length; i++){
            for(int j = i ; j > 0; j--){
                if(array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println("Insertion sort done.");
    }

    public void binaryInsertionSort(int[] array){
        for(int i = 1; i<array.length ; i++){
            int x = array[i];
            int j = Math.abs(Arrays.binarySearch(array,0,i,x)+1);

            System.arraycopy(array,j,array,j+1,i-j);
            array[j] = x;
        }
        System.out.println("Binary insertion sort done.");
    }

    public void selectionSort(int[] array){
       for(int i = 0; i < array.length-1; i++){
           int min_index = i;
           for(int j = i+1; j < array.length; j++){
               if(array[j] < array[min_index]){
                   min_index = j;
               }
           }
           int temp = array[min_index];
           array[min_index] = array[i];
           array[i] = temp;
       }
        System.out.println("Selection Sort done.");
    }

    public void bubbleSort(int[] array){
        int n = array.length;
        for(int i = 0; i < n-1;i++){
            for (int j = 0; j < n-i-1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble sort done.");
    }

    public void shackerSort(int[] array){
        boolean swapped = true;
        int start = 0;
        int end = array.length;
        while (swapped){
            swapped = false;
            for(int i=start; i<end-1;++i){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
            swapped = false;
            end = end-1;
            for(int i = end-1; i>= start;i--){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
            start = start+1;
        }
        System.out.println("Shacker Sort done.");
    }

    public void selectOption(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("C-initializare tablou\n" +
                    "V-vizualizare tablou\n" +
                    "R-reinitializare tablou\n" +
                    "I-sortare prin insertie\n" +
                    "T-sortare prin interschimbare\n" +
                    "H-sortare prin metoda Shackersort\n"+
                    "X-parasirea programului");
            System.out.println("Introduceti o optiune:");
            char option = scanner.next().charAt(0);
            option = Character.toLowerCase(option);
            if(option == 'c'){
                generateArray(array);
            }else if(option == 'v'){
                printArray(array);
            }else if(option == 'r'){
                reinitArray(array,anotherArray);
            }else if(option == 'i'){
                insertSort(array);
            }else if(option == 'b'){
                binaryInsertionSort(array);
            }else if(option == 's'){
                selectionSort(array);
            }else if(option == 't'){
                bubbleSort(array);
            }else if(option == 'h'){
                shackerSort(array);
            }else{
                break;
            }
        }
    }


    public void printArray(int[] array){
        for(int i = 0; i <array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
