package swing ; 
import java.sql.Date;
//import java.sql.Time;
import java.time.LocalDate;

public class Pfe {
    private int id;
    private String date;
    private float note;
    private int numeroSalle;
    private String blockSalle;
    private int idJury;
    private int idEtudiant1;
    private int idEtudiant2;

    public Pfe(int id, String date, float note, int numeroSalle, String blockSalle, int idJury , int idEtudiant1, int idEtudiant2) {
        this.id = id;
        this.date = date;
        this.note = note;
        this.numeroSalle = numeroSalle;
        this.blockSalle = blockSalle;
        this.idJury = idJury;
        this.idEtudiant1 = idEtudiant1;
        this.idEtudiant2 = idEtudiant2;
    }
    public int getIdEtudiant1() {
        return idEtudiant1;
    }
    public void setIdEtudiant1(int idEtudiant1) {
        this.idEtudiant1 = idEtudiant1;
    }
    public int getIdEtudiant2() {
        return idEtudiant2;
    }
    public void setIdEtudiant2(int idEtudiant2) {
        this.idEtudiant2 = idEtudiant2;
    }   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public int getNumeroSalle() {
        return numeroSalle;
    }

    public void setNumeroSalle(int numeroSalle) {
        this.numeroSalle = numeroSalle;
    }

    public String getBlockSalle() {
        return blockSalle;
    }

    public void setBlockSalle(String blockSalle) {
        this.blockSalle = blockSalle;
    }

    public int getIdJury() {
        return idJury;
    }

    public void setIdJury(int idJury) {
        this.idJury = idJury;
    }
}
