package com.Atelier4.Polymorphism;

public class Employe extends Personne {
    public int salaire;

    public Employe(String nome, String prenom, String adresse, String ville, int dateNaissance, int salaire) {
        super(nome, prenom, adresse, ville, dateNaissance);
        this.salaire = salaire;
    }

    @Override
    public void Afficher(){
        System.out.println("Employe :" +nome  + prenom  + dateNaissance  + ville  + adresse  + dateNaissance + salaire);
    }
}
