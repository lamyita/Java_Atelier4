package com.Atelier4.Polymorphism;
import java.util.ArrayList;
public class TestBib {
    public static void main(String[] args) {

        ArrayList<Abonne> abonnes=new ArrayList<Abonne>();

        ArrayList<Ouvrage> ouvrages = new ArrayList<Ouvrage>();


        Bibliotheque bibliotheque=new Bibliotheque("titre1", "12/12/2020", false,ouvrages,abonnes);
        ouvrages.add(new Ouvrage("Men in the Sun","1962",true));
        ouvrages.add(new Ouvrage("Latin Quarter","2003",true));

        abonnes.add(new Abonne(1,"lamyaa",2));
        abonnes.add(new Abonne(2,"lamyita",3));


        bibliotheque.ajoutOuvrage(new Ouvrage("Men in the Sun","1962",true));
        bibliotheque.ajoutOuvrage(new Ouvrage("oLatin Quarter","2003",true));
        bibliotheque.ajoutOuvrage(new Ouvrage("objet1","ddd",true));
        System.out.println("ouvrages List : " +ouvrages);
        bibliotheque.afficher();


    }
}
