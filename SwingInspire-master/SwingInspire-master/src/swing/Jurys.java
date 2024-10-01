package swing;

public class Jurys {
    int id;
    private Enseignant rapporteur;
    private Enseignant examinateur;
    private Enseignant encadreur;
    private Enseignant president;
    private Enseignant invite;
    
    public Jurys(int id , Enseignant rapporteur, Enseignant examinateur, Enseignant encadreur, Enseignant president, Enseignant invite) {
        this.rapporteur = rapporteur;
        this.examinateur = examinateur;
        this.encadreur = encadreur;
        this.president = president;
        this.invite = invite;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Enseignant getRapporteur() {
        return rapporteur;
    }
    
    public void setRapporteur(Enseignant rapporteur) {
        this.rapporteur = rapporteur;
    }
    
    public Enseignant getExaminateur() {
        return examinateur;
    }
    
    public void setExaminateur(Enseignant examinateur) {
        this.examinateur = examinateur;
    }
    
    public Enseignant getEncadreur() {
        return encadreur;
    }
    
    public void setEncadreur(Enseignant encadreur) {
        this.encadreur = encadreur;
    }
    
    public Enseignant getPresident() {
        return president;
    }
    
    public void setPresident(Enseignant president) {
        this.president = president;
    }
    
    public Enseignant getInvite() {
        return invite;
    }
    
    public void setInvite(Enseignant invite) {
        this.invite = invite;
    }
}
