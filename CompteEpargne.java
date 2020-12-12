package com.Atelier4;

public class CompteEpargne  extends Compte{
    int tauxInteret;

    public CompteEpargne(long numero_du_compte, double solde, int tauxInteret) {
        super(numero_du_compte, solde);
        this.tauxInteret=tauxInteret;
    }
    public double CalculeInteret() {
        double SoldInteret=solde*tauxInteret/100;
        return SoldInteret;
    }
}
