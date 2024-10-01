package swing;

public class Membre_jurys {
    private int idJury;
    private int idEnseignant;

    public Membre_jurys(int idJury, int idEnseignant) {
        this.idJury = idJury;
        this.idEnseignant = idEnseignant;
    }

    public int getIdJury() {
        return idJury;
    }

    public void setIdJury(int idJury) {
        this.idJury = idJury;
    }

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }
}
