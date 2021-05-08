package com.company.data;

public class Pojazd {

    private Long id;
    private String nazwa;
    private double rozmiar;

    private static Long counter = 0L;

    public Pojazd(String name, double rozmiar) {
        this.nazwa = name;
        this.rozmiar = rozmiar;
        this.id = counter++;
    }

    @Override
    public String toString() {
          return "id: " + id + " " +
                  "nazwa: '" + nazwa + " " +
                "rozmiar: " + rozmiar;
    }

    public Long getId() {
        return id;
    }

    public double getRozmiar() {
        return rozmiar;
    }

}

