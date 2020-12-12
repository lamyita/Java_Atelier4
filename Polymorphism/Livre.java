package com.Atelier4.Polymorphism;

public class Livre  extends Ouvrage{

    private String author;

    public Livre(String title, String date, boolean index,String author) {
        super(title, date, index);
        this.author=author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String auth) {
        this.author=auth;

    }

    public void afficher() {
        System.out.printf("the title of this work is :"+getTitre()," the creation date is :"+getDate()+"  the availability "+getIndex()+" book author "+author);
    }

}
