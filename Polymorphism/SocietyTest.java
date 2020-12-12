package com.Atelier4.Polymorphism;


import java.util.ArrayList;

public class SocietyTest {

          public static void main (String[]args){


              Employe  employe = new Employe("lamyaa ", "najahi ", "yy ", "youso ", 96, 3000);
              Chef chef = new Chef("lamyaa ", "najahi ", "yy ", "youso ", 96, "drer ");
              Directeur directeur = new Directeur("lamyaa ", "najahi ", "yy ", "youso ", 96, "gsd ");
              ArrayList<Personne> personnes = new ArrayList<>();
              personnes.add(employe);
              personnes.add(directeur);
              personnes.add(chef);
              for (Personne personne: personnes){
                  personne.Afficher();
              }
          }



}






