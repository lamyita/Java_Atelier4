package com.Atelier4;

public class Test {

    public static void main(String[] args) {

        Employe employe1 = new Employe( "El Alami ","Mohammad, ", "Casablanca ", 1963 );
        Employe employe2 = new Employe("Sbai ","Fouad, ","Salé ",2006);
        Employe employe3 = new Employe("El wahabi ","Khalid ","Safi ",1990);
        employe1.afficherInfoClient();
        employe2.afficherInfoClient();
        employe3.afficherInfoClient();
        employe1.calculerAge();
        employe2.calculerAge();
        employe3.calculerAge();

        //System.out.println(employe1.nom + employe1.prenom +"né le " +   employe1.anneNaissance + " habitant à " + employe1.adresse );
       // System.out.println(employe2.nom + employe2.prenom + "né le " +  employe2.anneNaissance +" habitant à " + employe2.adresse   );
       // System.out.println(employe3.nom + employe3.prenom + "né le " +  employe3.anneNaissance +" habitant à " + employe3.adresse   );



    }
}

