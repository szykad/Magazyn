package com.company.data;

import com.company.data.exception.NeverRentException;

import java.util.List;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private String adres;
    private String dataUrodzenia;
    private String dataPierwszegoNajmu;
    private List<Pomieszczenie> pomieszczenia;

    public Osoba(String imie, String nazwisko, String pesel, String adres, String dataUrodzenia, String dataPierNajmu, List<Pomieszczenie> pomieszczenia) throws NeverRentException {
        if(pomieszczenia.isEmpty()){
                throw new NeverRentException();
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.adres = adres;
        this.dataUrodzenia = dataUrodzenia;
        this.dataPierwszegoNajmu = dataPierNajmu;
        this.pomieszczenia = pomieszczenia;
    }

    @Override
    public String toString() {
        return "\n"+"imie: " +imie+ " "+
                "nazwisko: "+nazwisko+ " "+
                "pesel: "+pesel+ " "+
                "adres: "+adres+ " "+
                "dataUrodzenia: "+dataUrodzenia+ " "+
                "dataNajmu: "+ dataPierwszegoNajmu + " "+
                "\n"+"  pomieszczenia: "+ pomieszczenia.toString();

    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setDataPierwszegoNajmu(String dataPierwszegoNajmu) {
        this.dataPierwszegoNajmu = dataPierwszegoNajmu;
    }

    public List<Pomieszczenie> getPomieszczenia() {
        return pomieszczenia;
    }


}