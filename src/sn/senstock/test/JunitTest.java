package sn.senstock.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sn.senstock.dao.IProduit;
import sn.senstock.dao.ProduitImpl;
import sn.senstock.entities.Produit;

public class JunitTest {
    @Before
    public void beforeTest(){
        System.out.println("=======Before======");

    }
@After
    public void afterTest(){
    System.out.println("=======After======");

    }
    @Test
    public void testAddProduit(){
        Produit p = new Produit();
        p.setNom("Table");
        p.setQtStock(25);
        IProduit produitdao = new ProduitImpl();
        int ok = produitdao.add(p);
        System.out.println(ok);

    }
}
