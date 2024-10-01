package swing;

public class Etudiant {
    private int identifier;
    private String name;
    private String groupe;
    private String section;
    private int niveau;
    
    public Etudiant(int identifier, String name, String groupe, String section, int niveau) {
        this.identifier = identifier;
        this.name = name;
        setGroupe(groupe);
        setSection(section);
        setNiveau(niveau);
        
    }


    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        if (groupe.toLowerCase().equals("licence") || groupe.toLowerCase().equals("mastere") || groupe.equals("ingenieur")) {
            this.groupe = groupe;
        } else {
            throw new IllegalArgumentException("Invalid value for groupe attribute");
        }
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        if (groupe.toLowerCase().equals("licence") || groupe.equals("mastere")) {
            if (section.equals("electronique") || section.equals("informatique")) {
                this.section = section;
            } else {
                throw new IllegalArgumentException("Invalid value for section attribute");
            }
        } else if (groupe.equals("ingenieur")) {
            if (section.equals("recherche") || section.equals("professionnelle")) {
                this.section = section;
            } else {
                throw new IllegalArgumentException("Invalid value for section attribute");
            }
        }
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        if (niveau == 1 || niveau == 2 || niveau == 3) {
            this.niveau = niveau;
        } else {
            throw new IllegalArgumentException("Invalid value for niveau attribute");
        }
    }
}