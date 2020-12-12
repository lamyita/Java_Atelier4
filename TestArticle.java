package com.Atelier4;

public class TestArticle {
    public static void main(String[] args) {
        Article Prix = new Article("Lamyaa", 3000);
        Prix.afficher();

        ArticleEnSolde Prixnew = new ArticleEnSolde("Lamyaa ", 400, 4);
        Prixnew.afficher();

    }
}
