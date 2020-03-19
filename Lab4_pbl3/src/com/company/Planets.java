package com.company;

public class Planets {
    private String nume;
    private double x;
    private double y;
    private double z;

    public Planets(String nume, double x, double y, double z) {
        this.nume = nume;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getNume() {
        return nume;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double calcDistance(Planets test){
        double eq = (x-test.x)*(x-test.x)+(y-test.y)*(y-test.y)+(z-test.z)*(z-test.z);
        return Math.pow(eq,0.5);
    }

}

