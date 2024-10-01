package swing;

public class Salle {
    private int numero;
    private String block;
    private boolean occupe;
    public Salle(int numero, String block, boolean occupe) {
        this.numero = numero;
        this.block = block;
        this.occupe = occupe;
    }   

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public boolean isOccupe() {
        return occupe;
    }

    public void setOccupe(boolean occupe) {
        this.occupe = occupe;
    }
}
