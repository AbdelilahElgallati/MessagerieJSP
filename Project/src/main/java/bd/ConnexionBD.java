package bd;

import java.sql.*;

public class ConnexionBD {
    private Connection connexion;
    private Statement instruction;
    protected ResultSet resultat;

    public ConnexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost/messagerie","root","");
            instruction = connexion.createStatement();
        } catch (ClassNotFoundException ex) {
            System.err.println("Problème de pilote");
        } catch (SQLException ex) {
            System.err.println("Base de données non trouvée ou requête incorrecte");
        }
    }

    public void lire(String requete) {
        try {
            resultat = instruction.executeQuery(requete);
        } catch (SQLException ex) {
            System.err.println("Requête incorrecte : " + requete);
        }
    }

    public void miseAJour(String requete) {
        try {
            instruction.executeUpdate(requete);
        } catch (SQLException ex) {
            System.err.println("Requête incorrecte : " + requete);
        }
    }

    public boolean suivant() {
        try {
            return resultat.next();
        } catch (SQLException ex) {
            return false;
        }
    }

    public void arret() {
        try {
            connexion.close();
        } catch (SQLException ex) {
            System.err.println("Erreur sur l'arrêt de la connexion à la base de données");
        }
    }
}
