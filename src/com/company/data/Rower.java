package com.company.data;


public class Rower extends Pojazd {
    private int przerzutki;
    private String stan;

    public Rower(String name, double rozmiar, int przerzutki, String stan) {
        super(name, rozmiar);
        this.przerzutki = przerzutki;
        this.stan = stan;
    }

    @Override
    public String toString() {
        return "\n      "+super.toString() + " "+
                "przerzutki: " + przerzutki +" "+
                "stan: " + stan;
    }
}
