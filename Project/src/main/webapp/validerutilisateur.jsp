<%@ page errorPage="/WEB-INF/erreur.jsp" import="bd.*" %>
<%@ include file="/WEB-INF/jspf/navigation.jspf" %>

<h3 align="center">Confirmation de votre demande d'inscription</h3>
<jsp:useBean id="utilisateur" class="bd.Personne">
    <jsp:setProperty name="utilisateur" property="*" />

    <p>
    <table border="1" cellpadding="3" cellspacing="2" width="90%" align="center">
        <tr>
            <td bgcolor="#ff9900" width="100"><b>Nom</b></td>
            <td><jsp:getProperty name="utilisateur" property="nom"/></td>
        </tr>
        <tr>
            <td bgcolor="#ff9900" width="100"><b>Prenom</b></td>
            <td><jsp:getProperty name="utilisateur" property="prenom"/></td>
        </tr>
        <tr>
            <td bgcolor="#ff9900" width="100"><b>Mot de passe</b></td>
            <td><jsp:getProperty name="utilisateur" property="motDePasse"/></td>
        </tr>
    </table>
    </p>
    <h3 align="center">
        <% if (!utilisateur.enregister()) { %>
        <font color="red">ATTENTION : Utilisateur deja enregistre</font>
        <%
        } else {
        %>
        <font color="green">Nouvel utilisateur enregistre</font>
        <%
            }
            utilisateur.arret();
        %>
    </h3>
</jsp:useBean>

<%@ include file="/WEB-INF/jspf/pieds.jspf" %>
