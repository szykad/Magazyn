package com.company.data;

public class Samochód extends Pojazd {
    private String paliwo;


    public Samochód(String nazwa, double rozmiar, String paliwo) {
        super(nazwa, rozmiar);
        this.paliwo = paliwo;
    }

    @Override
    public String toString() {
        return   "\n       "+super.toString()+" "+
                "paliwo='" + paliwo;
    }

    public String getPaliwo() {
        return paliwo;
    }

    public void setPaliwo(String paliwo) {
        this.paliwo = paliwo;
    }
}
