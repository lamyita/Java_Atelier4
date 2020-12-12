package com.Atelier4.Polymorphism;

public class Abonne {
    private int num;
    private String nom;
    private int numAb;

    public Abonne(int num,String nom,int numAb) {
        this.num=num;
        this.nom=nom;
        this.numAb=numAb;
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num=num;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom=nom;
    }


    public int getNumAb() {
        return numAb;
    }

    public void setNumAb(int numAb) {
        this.numAb=numAb;
    }

}
