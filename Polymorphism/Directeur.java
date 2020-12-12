package com.Atelier4.Polymorphism;

public class Directeur extends Personne{
    public String society;

    public Directeur(String nome, String prenom, String adresse, String ville, int dateNaissance, String society) {
        super(nome, prenom, adresse, ville, dateNaissance);
        this.society = society;
    }

    @Override

    public void Afficher(){
        System.out.println("Directeur :" +nome +  prenom +  dateNaissance  + ville + adresse  + dateNaissance + society);
    }

}
