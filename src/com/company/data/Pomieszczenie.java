package com.company.data;

import com.company.data.exception.TooManyThingsException;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pomieszczenie {

    private Integer id;
    private double rozmiar;
    private Składzik składzik;
    private static int counter = 1;

    public Pomieszczenie(double rozmiar, Składzik składzik) {
        this.id = counter++;
        this.rozmiar = rozmiar;
        this.składzik = składzik;
    }

    public boolean isFull() {
        if (rozmiar > składzik.calculateSize()) {
            return false;
        }
        return true;
    }

    public void validateAvailableSize(Double sizeToBeAdded) throws TooManyThingsException {
        if (rozmiar > składzik.calculateSize() + sizeToBeAdded) {
            return;
        }
        throw new TooManyThingsException("Brak miejsca w pomieszczeniu");
    }

    @Override
    public String toString() {
        return "\n    " + "id: " + id + " " +
                "rozmiar: " + rozmiar + " " +
                "składzik: " + składzik.toString();
    }


    public Integer getId() {
        return id;
    }

    public Składzik getSkładzik() {
        return składzik;
    }

}

