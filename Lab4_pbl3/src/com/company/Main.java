package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many planets do you have?");
        int nrPlanete = scanner.nextInt();
        scanner.nextLine();
        Planets[] arrayPlanets = new Planets[nrPlanete];
        for(int i = 0 ; i < nrPlanete ;i++){
            System.out.println("Nume planeta " + (i+1) + ":");
            String numePlaneta = scanner.nextLine();
            System.out.print("X planeta " + (i+1) +":");
            double xPlaneta = scanner.nextDouble();
            System.out.print("Y planeta " + (i+1) + ":");
            double yPlaneta = scanner.nextDouble();
            System.out.print("Z planeta " + (i+1) + ":");
            double zPlaneta = scanner.nextDouble();
            arrayPlanets[i] = new Planets(numePlaneta,xPlaneta,yPlaneta,zPlaneta);
            scanner.nextLine();
        }

        maxDistance(arrayPlanets,nrPlanete);
        minDistance(arrayPlanets,nrPlanete);
    }

    public static void maxDistance(Planets[] arrayPlanets,int nrPlanete){
        double max = arrayPlanets[0].calcDistance(arrayPlanets[1]);
        Planets planetaMax1 = new Planets("",0,0,0);
        Planets planetaMax2 = new Planets("",0,0,0);
        for(int i = 0 ; i < nrPlanete-1;i++){
            {
                for(int j = i+1; j < nrPlanete;j++){
                    if(max < arrayPlanets[i].calcDistance(arrayPlanets[j])){
                         planetaMax1 = new Planets(arrayPlanets[i].getNume(),arrayPlanets[i].getX(),arrayPlanets[i].getY(),arrayPlanets[i].getZ());
                         planetaMax2 = new Planets(arrayPlanets[j].getNume(),arrayPlanets[j].getX(),arrayPlanets[j].getY(),arrayPlanets[j].getZ());
                         max = planetaMax1.calcDistance(planetaMax2);
                    }
                }
            }
        }
        System.out.println("Distanta maxima este intre planeta " + planetaMax1.getNume() + " si " + " planeta " + planetaMax2.getNume() + ": " + max);
    }

    public static void minDistance(Planets[] arrayPlanets,int nrPlanete){
        double min = arrayPlanets[0].calcDistance(arrayPlanets[1]);
        Planets planetaMin1 = new Planets("",0,0,0);
        Planets planetaMin2 = new Planets("",0,0,0);
        for(int i = 0 ; i < nrPlanete-1;i++){
            {
                for(int j = i+1; j < nrPlanete;j++){
                    if(min > arrayPlanets[i].calcDistance(arrayPlanets[j])){
                        planetaMin1 = new Planets(arrayPlanets[i].getNume(),arrayPlanets[i].getX(),arrayPlanets[i].getY(),arrayPlanets[i].getZ());
                        planetaMin2 = new Planets(arrayPlanets[j].getNume(),arrayPlanets[j].getX(),arrayPlanets[j].getY(),arrayPlanets[j].getZ());
                        min = planetaMin1.calcDistance(planetaMin2);
                    }
                }
            }
        }
        System.out.println("Distanta minima este intre planeta " + planetaMin1.getNume() + " si " + " planeta " + planetaMin2.getNume() + ": " + min);
    }
}
