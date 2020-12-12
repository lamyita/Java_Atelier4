package com.Atelier4.Polymorphism;

public class Video extends Ouvrage {
    private String editeur;
    private double duree;

    public Video(String title, String date, boolean index,String editeur,double duree) {
        super(title, date, index);
        this.editeur=editeur;
        this.duree=duree;
    }


    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String edit) {
        this.editeur=edit;
    }

    public double getDuree() {
        return duree;
    }
    public void  setDuree(double duree) {
        this.duree=duree;
    }

    public void afficher() {
        System.out.printf("the title of this work is :"+getTitre()," the creation date is :"+getDate()+"  the availability "+getIndex()+" the editor is "+editeur+" the duration is "+duree);

    }

}
