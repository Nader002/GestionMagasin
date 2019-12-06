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
public class Produit {

    private int identifiant;
    private String marque;
    private String libelle;
    private float prix;

    public Produit(int ident, String marque, String lib) {
        this.identifiant = ident;
        this.marque = marque;
        libelle = lib;
    }

    public Produit(int ident, String marque, String lib, float pr) {
        this.identifiant = ident;
        this.marque = marque;
        libelle = lib;
        prix = pr;
    }

    public Produit() {
    }

    public void afficher() {
        System.out.println("idntifaint :" + identifiant + "marque :"
                + marque + "libelle :" + libelle + "prix :" + prix);

    }

    public String toString() {
        return "idntifaint :" + identifiant + "marque :"
                + marque + "libelle :" + libelle + "prix :" + prix;
    }

    public void setPrix(int p) {
        if (p > 0) {
            prix = p;
        }

    }

    public float getPrix() {
        return prix;
    }
    public boolean comparer(Produit pr)
    {
    if(this.identifiant==pr.identifiant && libelle==pr.libelle)
        return true;
    return false;
    }
    public static boolean comparer(Produit p1,Produit p2)
    {
    if(p1.libelle==p2.libelle && p1.identifiant==p2.identifiant)
        return true;
    else return false;
    }
}
