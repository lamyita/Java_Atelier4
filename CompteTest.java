package com.Atelier4;
import com.Atelier4.Compte;

import java.util.Scanner;

public class CompteTest extends Compte {


    public CompteTest(long numero_du_compte, double solde) {
        super(numero_du_compte, solde);
    }

    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);



            System.out.println("Enter your account number ");
            int a=scanner.nextInt();
            System.out.println("saisir votre solde ");
            double s = scanner.nextDouble();




            System.out.println("you will want a compteEpagne or compteEncours  ");
            String rep=scanner.next();
            if(rep.equalsIgnoreCase("compteEpagne")) {

                if(s>=200)
                {
                    System.out.println("Enter annual interest rate ");
                    int taux=scanner.nextInt();
                    CompteEpargne deherant=new CompteEpargne(a,s,taux);
                    double calculeintert=deherant.CalculeInteret();
                    System.out.println("annual interest  is  "+calculeintert);
                    System.out.println("you will want a add a balance ");
                    String rep2=scanner.next();

                    if(rep2.equalsIgnoreCase("oui")||rep2.equalsIgnoreCase("yes")) {
                        System.out.println("add in your balance add ");
                        double soldeAjouter=scanner.nextDouble();
                        deherant.ajouter(soldeAjouter);
                        deherant.afficher();
                    }
                    else
                    {
                        deherant.afficher();
                    }

                    System.out.println("y can retirer ");
                    String rep4=scanner.next();
                    if(rep4.equalsIgnoreCase("oui")||rep4.equalsIgnoreCase("yes")) {
                        System.out.println("your balance for  retirer ");
                        double solderetirer=scanner.nextDouble();
                        deherant.retirer(solderetirer);
                    }
                }
                else {
                    System.out.println("your balance must be greater than or equal 200 DH ");
                }




            }

            else if(rep.equalsIgnoreCase("compteEncours")) {
                System.out.println("vous voudrez un ajouter un solde ");
                String rep3=scanner.next();
                CompteCourant deherant=new CompteCourant(a,s);
                if(rep3.equalsIgnoreCase("oui")||rep3.equalsIgnoreCase("yes")) {
                    System.out.println("Entrer votre solde ajouter dans le compteCourant");
                    double soldeAjouter=scanner.nextDouble();
                    deherant.ajouter(soldeAjouter);
                    deherant.afficher();
                }
                else
                {
                    deherant.afficher();
                }

                System.out.println("vous pouvez retirer ");
                String rep4=scanner.next();
                if(rep4.equalsIgnoreCase("oui")||rep4.equalsIgnoreCase("yes")) {
                    System.out.println("votre solde pour retirer ");
                    double solderetirer=scanner.nextDouble();
                    deherant.retirer(solderetirer);
                }

            }
            else {
                System.out.println("doit etre choisir type de votre compte");
            }




        }
        finally {
            if(scanner!=null)
                scanner.close();
        }
    }
}


