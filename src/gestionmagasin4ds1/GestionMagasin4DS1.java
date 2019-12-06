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
public class GestionMagasin4DS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produit p1=new Produit();
        Produit p2=new Produit(1021, "Delice", "Lait");
         Produit p3=new Produit(200, "Sicam", "Tomate",1.3f);
         
         p1.afficher();
         p2.afficher();
         p3.afficher();
         System.out.println(p1.toString());
         System.out.println(p1);
         Magasin m1=new Magasin(1, "ddd");
         m1.ajouterProduit(p3);
         m1.ajouterProduit(p1);
         System.out.println("magasinnn");
           System.out.println(m1);
         
         System.out.println(p1.comparer(p3));
         System.out.println(Produit.comparer(p3, p2));
        
    }
    
}
