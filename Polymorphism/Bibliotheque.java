package com.Atelier4.Polymorphism;
import java.util.ArrayList;

public class Bibliotheque extends Ouvrage {
    private ArrayList<Ouvrage> ouvrages;
    private ArrayList<Abonne> abonnes;


    public Bibliotheque(String t, String date, boolean index, ArrayList<Ouvrage> Ouvrage,ArrayList<Abonne> abonne) {
        super(t, date, index);
        this.ouvrages= Ouvrage;
        this.abonnes=abonne;
    }



    public void ajoutOuvrage(Ouvrage ouvrage) {
        for (int i = 0; i < this.ouvrages.size(); i++) {
            if (ouvrages.get(i).getTitre()!= ouvrage.getTitre()) {
                this.ouvrages.add(ouvrage);
            }
            else {
                System.out.println("book already exists");
            }
        }
    }

    public Ouvrage getOuvrage(String titre) {
        Ouvrage result = null;
        for (int i = 0; i < this.ouvrages.size(); i++) {
            if (this.ouvrages.get(i).getTitre() == titre) {
                result = this.ouvrages.get(i);
                break;
            }
        }
        return result;
    }

    public void ajoutAbonne(Abonne abonne) {
        for (int i = 0; i < this.abonnes.size(); i++) {
            if(this.abonnes.get(i).getNum() != abonne.getNum()) {
                this.abonnes.add(abonne);
            } else {
                this.abonnes.remove(abonne);
            }
        }
    }

    public Abonne getAbonne(int id) {
        Abonne result = null;
        for (int i = 0; i < this.abonnes.size(); i++) {
            if (this.abonnes.get(i).getNum() == this.abonnes.get(id).getNum()) {
                result = this.abonnes.get(i);
                break;
            }
        }
        return result;
    }



}
