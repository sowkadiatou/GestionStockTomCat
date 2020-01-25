package sn.senstock.test;

import sn.senstock.dao.IProduit;
import sn.senstock.dao.ProduitImpl;
import sn.senstock.entities.Produit;

public class Test {
    public static void main(String[] args){
        IProduit produitdao = new ProduitImpl();
        Produit p = new Produit();
        p.setNom("Ordinateur");
        p.setQtStock(125);
        int ok = produitdao.add(p);
        System.out.println(ok);
    }
}
