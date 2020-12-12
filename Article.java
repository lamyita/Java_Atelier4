package com.Atelier4;

public class Article {

   private String nom;
   private int prix;


    public Article(String nom , int prix) {
        setNom(nom);
        setPrix(prix);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrix() {

        return prix;
    }

    public void afficher(){

       System.out.println("le nom est " + nom +" le prix est "+ prix);
   }





}
