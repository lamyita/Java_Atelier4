package com.Atelier4;

public class Enseignant extends Personne{
    public String speciality;

    public Enseignant(String nom, String prenom, String adresse, String ville, int dateNaissance, String specialty) {
        super(nom, prenom,adresse,ville, dateNaissance);
        this.speciality = specialty;
    }


    public void ecrirePersonne() {
        System.out.println(nom  + prenom  + dateNaissance  + ville  + ville + dateNaissance  + speciality);
    }

}
