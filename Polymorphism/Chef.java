package com.Atelier4.Polymorphism;

public class Chef extends Personne{
    public String service;

    public Chef(String nome, String prenom, String adresse, String ville, int dateNaissance, String service) {
        super(nome, prenom, adresse, ville, dateNaissance);
        this.service = service;
    }


    @Override

    public void Afficher(){
        System.out.println("Chef :" +nome + prenom  + dateNaissance  + ville  + ville  + dateNaissance+ service);
    }

}
