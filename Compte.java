package com.Atelier4;

public class Compte  {


    protected long numero_du_compte;
    protected double solde;

    public Compte(long numero_du_compte, double solde){
        this.numero_du_compte = numero_du_compte;
        this.solde=solde;
    }
    public double ajouter(double soldeAdd){
        solde=+soldeAdd;
        return solde;
    }
    public void retirer( double soldeRetirer) {
        if (soldeRetirer <=solde)
            System.out.println("le solde retirer es" + soldeRetirer);
        else
            System.out.println("vous pouvez pas de retirer");

    }
    public void afficher() {
        System.out.println(" le numero de compte est " + numero_du_compte +" et votre solde " +solde);
    }




}
