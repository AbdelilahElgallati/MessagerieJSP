package bd;

public class Personne extends ConnexionBD {
    private String nom;
    private String prenom;
    private String motDePasse;

    public Personne() {}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public boolean enregister(){
        if(existeDeja()) {
            return false;
        } else {
            miseAJour("insert into personne (nom, prenom, motDePasse) values ('" + nom + "', '" + prenom + "', '" + motDePasse + "')" );
            return true;
        }
    }

    private boolean existeDeja() {
        lire("select * from personne where nom = '" + nom + "' and prenom = '" + prenom + "'");
        return suivant();
    }
}