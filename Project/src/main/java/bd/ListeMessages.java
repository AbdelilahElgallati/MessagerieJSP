package bd;

import bd.ConnexionBD;

import java.sql.SQLException;

public class ListeMessages extends ConnexionBD {
    public ListeMessages(int idPersonne) {
        lire("select * from message where idPersonne = " + idPersonne);
    }

    public String sujet() {
        try {
            return  resultat.getString("sujet");
        } catch (SQLException ex) {
            return "";
        }
    }

    public String texte() {
        try {
            return  resultat.getString("texte");
        } catch (SQLException ex) {
            return "";
        }
    }
}
