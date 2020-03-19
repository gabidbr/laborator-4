package com.company;


import java.util.Random;

public class Sorting {
    private int[] array;
    private int[] randomArray;
    public void setArray(int[] array) {
        this.array = array;
    }

    public void ranArray(int[] array){
        Random rd = new Random();
        for(int i=0;i<array.length;i++){
            array[i] = rd.nextInt(50)+1;
        }
    }
    public void setRandomArray(int[] randomArray) {
        this.randomArray = randomArray;
    }


    public int getRandom(int[] array){
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    public void getRandomArray(int[] array){
        for(int i = 0;i < 6;i++){
            randomArray[i] =getRandom(array);
        }
    }

    public void sortRandomArray(int[] randomArray){
        int n = randomArray.length;
        for(int i = 0;i < n-1;i++){
            for(int j = 0; j<n-i-1;j++){
                if(randomArray[j]>randomArray[j+1]){
                    int temp = randomArray[j];
                    randomArray[j] = randomArray[j+1];
                    randomArray[j+1] = temp;
                }
            }
        }
    }

    public void printArray(int[] array){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
