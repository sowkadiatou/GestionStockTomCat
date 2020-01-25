package test;

import sn.senstock.dao.IProduit;
import sn.senstock.dao.ProduitImpl;
import sn.senstock.entities.Produit;

public class Test {

    public static void main(String[] args){

        IProduit produitdao = new ProduitImpl();

        Produit produit = new Produit();
        produit.setNom("tablette");
        produit.setQtStock(200);


        int ok = produitdao.add(produit);
        System.out.println(ok);
    }
}
