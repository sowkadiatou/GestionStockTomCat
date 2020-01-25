<%--
  Created by IntelliJ IDEA.
  User: laptop
  Date: 17/01/2020
  Time: 00:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Produit</title>
  </head>
  <body>
        <pre>
            <form method="post" action="Produit">
              <label>Nom du produit</label>
              <input Type="text" name="nom" />

              <label>Quantite en stock du produit</label>
              <input Type="text" name="qtStock" />

              <input Type="submit" value="Envoyer" />
            </form>
        </pre>
  </body>
</html>
