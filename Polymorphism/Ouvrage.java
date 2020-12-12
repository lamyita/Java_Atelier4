package com.Atelier4.Polymorphism;


public class Ouvrage {


    private String titre;
    private String dateCreation;
    private boolean index;

    public Ouvrage(String titre,String date,boolean index) {
        this.titre=titre;
        this.dateCreation=date;
        this.index=index;

    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre=titre;
    }

    public String getDate() {
        return dateCreation;
    }
    public void setDate(String date) {
        this.dateCreation=date;
    }

    public boolean getIndex() {
        return index;
    }

    public void setIndex(boolean index) {
        this.index=index;
    }

    public void afficher() {
        System.out.printf("the title of this work is :"+titre +" the creation date is :"+dateCreation+"  the availability "+index);


    }
}
