package com.Atelier4;

public class ArticleEnSolde extends Article  {

        int pourcentageRemise;


        public ArticleEnSolde(String nom, int prix, int pourcentageRemise) {
            super(nom, prix);
            this.pourcentageRemise = pourcentageRemise;
        }



        public double nouveauPrix() {
            double remise=getPrix()*pourcentageRemise/100;
            double nouveauPrix=getPrix()-remise;
            return nouveauPrix;
        }

        @Override
        public void afficher() {
            System.out.println("le nouveau prix est " + nouveauPrix());
        }


    }

