package swing;

public class Jurys {
    int id;
    private int rapporteur;
    private int examinateur;
    private int encadreur;
    private int president;
    private int invite;
    
    public Jurys(int id , int rapporteur, int examinateur, int encadreur, int president, int invite) {
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
    public int getRapporteur() {
        return rapporteur;
    }
    
    public void setRapporteur(int rapporteur) {
        this.rapporteur = rapporteur;
    }
    
    public int getExaminateur() {
        return examinateur;
    }
    
    public void setExaminateur(int examinateur) {
        this.examinateur = examinateur;
    }
    
    public int getEncadreur() {
        return encadreur;
    }
    
    public void setEncadreur(int encadreur) {
        this.encadreur = encadreur;
    }
    
    public int getPresident() {
        return president;
    }
    
    public void setPresident(int president) {
        this.president = president;
    }
    
    public int getInvite() {
        return invite;
    }
    
    public void setInvite(int invite) {
        this.invite = invite;
    }
}
