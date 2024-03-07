<%@page isErrorPage="true" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/jspf/navigation.jspf"%>
<center>
    <h1><font color="red">Erreur...</font></h1>
    <p>Votre demande n'a pu aboutir.</p>
    <p>
        Merci de signaler les circonstances de cet incidant. au webmaster
        <br>de ce site et lui transmettant le texte d'erreur qui suit :
    </p>
    <p><b><%= exception %></b></p>
</center>
<%@include file="/WEB-INF/jspf/pieds.jspf"%>
