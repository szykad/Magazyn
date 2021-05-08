package com.company.data;

import java.util.ArrayList;
import java.util.List;

public class Składzik {

    private List<Samochód> listaSamochodow;
    private List <Rower> listaRowerow;
    private List <Motocykl> listaMotocykli;


    public Składzik() {

        this.listaSamochodow = new ArrayList<>();
        this.listaRowerow = new ArrayList<>();
        this.listaMotocykli = new ArrayList<>();
    }

    public Składzik(List<Samochód> listaSamochodow, List<Rower> listaRowerow, List<Motocykl> listaMotocykli) {

        this.listaSamochodow = listaSamochodow;
        this.listaRowerow = listaRowerow;
        this.listaMotocykli = listaMotocykli;
    }

    public Double calculateSize(){

        Double result = 0.0D;

        for (Samochód car : listaSamochodow){
           result = result + car.getRozmiar();
        }
        for (Rower bicycle : listaRowerow){
            result = result + bicycle.getRozmiar();
        }
        for (Motocykl motorcycle : listaMotocykli){
            result = result + motorcycle.getRozmiar();
        }
        return result;
    }

    @Override
    public String toString() {
        return "\n"+"listaSamochodow: " + listaSamochodow +"\n"+
                "listaRowerow: " + listaRowerow +"\n"+
                "listaMotocykli: " + listaMotocykli;
    }

    public List<Samochód> getListaSamochodow() {
        return listaSamochodow;
    }


    public List<Rower> getListaRowerow() {
        return listaRowerow;
    }


    public List<Motocykl> getListaMotocykli() {
        return listaMotocykli;
    }

}
