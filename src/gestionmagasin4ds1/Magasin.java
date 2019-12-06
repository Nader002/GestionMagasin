/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmagasin4ds1;

/**
 *
 * @author sana
 */
public class Magasin {

    private int identifiant;
    private String nom;
    private final int capcite = 50;
    private Produit[] tab = new Produit[capcite];
    private int compteur;
    private static int nbProduit;

    public Magasin(int id, String n) {//0..*
        identifiant = id;
        nom = n;
    }

    public Magasin(int id, String n, Produit p) {//1..*
        identifiant = id;
        nom = n;
        tab[compteur] = p;
        compteur++;
        nbProduit++;
    }

    public static int TotalProduit() {
        return nbProduit;
    }

    public Magasin plusProduit(Magasin m) {
        if (this.compteur > m.compteur) {
            return this;
        }
        if (this.compteur < m.compteur) {
            return m;
        }
        return null;
    }

    public void ajouterProduit(Produit pr) {
        if (compteur < capcite && recherche(pr) == false) {
            tab[compteur] = pr;
            compteur++;
            nbProduit++;
        }
    }

    public String toString() {
        String str = "les produits : \n";
        for (int i = 0; i < compteur; i++) {
            str += tab[i] + "\n";

        }

        return "id :" + identifiant + "nom :" + nom + " " + str;
    }

    public boolean recherche(Produit p) {
        for (int i = 0; i < compteur; i++) {
            if (Produit.comparer(p, tab[i])) {
                return true;
            }
        }
        return false;
    }
}
