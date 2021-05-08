package com.company.data;

public class Motocykl extends Pojazd {
    private boolean homologacja;

    public Motocykl(String name, double rozmiar, boolean homologacja) {
        super(name, rozmiar);
        this.homologacja = homologacja;
    }

    @Override
    public String toString() {
        return "\n      " + super.toString() + " " +
                "homologacja=" + homologacja;
    }
}

