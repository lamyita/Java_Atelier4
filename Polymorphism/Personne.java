package com.Atelier4.Polymorphism;


public class Personne {


    public String nome, prenom, adresse, ville;
    public int dateNaissance;

    public Personne(String nome, String prenom, String adresse, String ville, int dateNaissance) {
        this.adresse = adresse;
        this.nome = nome;
        this.dateNaissance = dateNaissance;
        this.prenom = prenom;
        this.ville = ville;
    }






    public void Afficher(){
        System.out.println(nome  + prenom  + dateNaissance  + ville  + adresse  + dateNaissance);
    }


}
