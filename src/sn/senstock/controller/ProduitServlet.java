package sn.senstock.controller;

import sn.senstock.dao.IProduit;
import sn.senstock.dao.ProduitImpl;
import sn.senstock.entities.Produit;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Produit",name = "produit")
public class ProduitServlet extends HttpServlet {
    private IProduit produitdao;

    @Override
    public void init(ServletConfig config) throws ServletException {
        produitdao = new ProduitImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //resp.getWriter().println("ok");
        List<Produit> list_produits = produitdao.list();
        req.setAttribute("produits",list_produits);
        req.getRequestDispatcher("produit/add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nom = req.getParameter("nom").toString();
        double qte = Double.parseDouble(req.getParameter("qte").toString());
        Produit p = new Produit();
        p.setNom(nom);
        p.setQtStock(qte);
        int ok = produitdao.add(p);
        //resp.getWriter().println(ok);
        req.setAttribute("result",ok);
        doGet(req,resp);

    }
}
