package com.Atelier4;
import java.util.Calendar;
public class Employe {

     String nom;
     String prenom;
     String adresse;
     int anneNaissance;
    Calendar calendar = Calendar.getInstance();
    int anneEncours=calendar.get(Calendar.YEAR);
    int age;


     // construceur for name
    public Employe(String nom){
        this.nom = nom;
    }
    // empty contructeur//
    public Employe(){

    }

    public Employe(String nom, String prenom, String adresse, int anneNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.anneNaissance = anneNaissance;
    }





     public int calculerAge(){

        age=anneEncours-anneNaissance;
        return age;


        }
       public void afficherInfoClient(){

            System.out.println(nom + prenom +"né le " +  anneNaissance + " habitant à " + adresse + calculerAge());

        }

    }


