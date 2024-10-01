package swing;
import java.sql.Connection;

//import javax.swing.plaf.nimbus.State;

import java.sql.*;

public abstract class DAO<T> {
    protected Connection connect;

    public DAO(Connection conn) {
        this.connect = conn;
    }

    public abstract boolean create(T obj);

    public abstract boolean delete(int obj);

    public abstract boolean update(T obj);

    public abstract boolean find(int obj);
}

class EtudiantDAO extends DAO<Etudiant> {
    public EtudiantDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Etudiant obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "INSERT INTO etudiant (identifier, name, groupe, section, niveau) VALUES ("
                    + obj.getIdentifier() + ", '" + obj.getName() + "', '" + obj.getGroupe() + "', '"
                    + obj.getSection() + "', " + obj.getNiveau() + "', " + ")";
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while creating a student");
            e.printStackTrace();
        }
        return false; // Add missing return statement
    }

    public boolean delete(int id) {
        try {
            Statement state = this.connect.createStatement();
            String query = "DELETE FROM etudiant WHERE identifier = " + id;
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while deleting a student");
            e.printStackTrace();
            return false;
        }
    }

    // We don't use it for the moment
    public boolean update(Etudiant obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "UPDATE etudiant SET name = '" + obj.getName() + "', groupe = '" + obj.getGroupe()
                    + "', section = '" + obj.getSection() + "', niveau = " + obj.getNiveau() + " WHERE identifier = "
                    + obj.getIdentifier();
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while updating a student");
            e.printStackTrace();
            return false;
        }
    }

public boolean find(int id) {
    try {
        Statement state = this.connect.createStatement();
        String query = "SELECT * FROM etudiant WHERE identifier = " + id;
        ResultSet result = state.executeQuery(query);
        return result.next(); // Check if there is a result
    } catch (Exception e) {
        System.err.println("Error while finding a student");
        e.printStackTrace();
    }
    return false; // Return false if an exception is thrown
}
}

/**
 * InnerDAO
 */
class EnseignantDAO extends DAO<Enseignant> {
    public EnseignantDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Enseignant obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "INSERT INTO enseignant (id, name) VALUES (" + obj.getId() + ", '" + obj.getName() + "')";
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while creating a teacher");
            e.printStackTrace();
        }
        return false; // Add missing return statement
    }

    public boolean delete(int id) {
        try {
            Statement state = this.connect.createStatement();
            String query = "DELETE FROM enseignant WHERE id = " + id;
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while deleting a teacher");
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Enseignant obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "UPDATE enseignant SET name = '" + obj.getName() + "' WHERE id = " + obj.getId();
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while updating a teacher");
            e.printStackTrace();
            return false;
        }
    }

    public boolean find(int id) {
        ResultSet result = null;
        try {
            Statement state = this.connect.createStatement();
            String query = "SELECT * FROM enseignant WHERE id = " + id;
            result = state.executeQuery(query);
        } catch (Exception e) {
            System.err.println("Error while finding a teacher");
            e.printStackTrace();
        }
        return (result != null);
    }
}

/**
 * InnerDAO
 */
class SalleDAO extends DAO<Salle> {
    public SalleDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Salle obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "INSERT INTO salle (numero, block, occupe) VALUES (" +
                    obj.getNumero() + ", '" + obj.getBlock() + "', " + obj.isOccupe() + ")";
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while creating a room");
            e.printStackTrace();
        }
        return false; // Add missing return statement
    }

    public boolean delete(int id) {
        // not implemented
        return false;
    }

    public boolean deleteWithTwoIds(int numero, String block) {
        try {
            Statement state = this.connect.createStatement();
            String query = "DELETE FROM salle WHERE numero = " + numero + " AND block = '" + block + "'";
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while deleting a room");
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Salle obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "UPDATE salle SET occupe = '" + obj.isOccupe() + " WHERE numero = " + obj.getNumero()
                    + " AND block = '" + obj.getBlock() + "'";
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while updating a room");
            e.printStackTrace();
            return false;
        }
    }

    public boolean find(int id) {
        // not implemented
        return false;
    }

    public boolean findWithTwoIds(int numero, String block) {
        ResultSet result = null;
        try {
            Statement state = this.connect.createStatement();
            String query = "SELECT * FROM salle WHERE numero = " + numero + " AND block = '" + block + "'";
            result = state.executeQuery(query);
            return (result != null);
        } catch (Exception e) {
            System.err.println("Error while finding a room");
            e.printStackTrace();
        }
        return false;
    }
}

/**
 * InnerDAO
 */
class JurysDAO extends DAO<Jurys> {
    public JurysDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Jurys obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "INSERT INTO jurys (id, rapporteur, examinateur, encadreur, president, invite) VALUES ("
                    + obj.getId() + ", " + obj.getRapporteur().getId() + ", "
                    + obj.getExaminateur().getId() + ", " + obj.getEncadreur().getId() + ", "
                    + obj.getPresident().getId() + ", " + obj.getInvite().getId() + ")";
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while creating a jury");
            e.printStackTrace();
        }
        return false; // Add missing return statement
    }

    public boolean delete(int id) {
        try {
            Statement state = this.connect.createStatement();
            String query = "DELETE FROM jurys WHERE id = " + id;
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while deleting a jury");
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Jurys obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "UPDATE jurys SET rapporteur = " + obj.getRapporteur().getId() + ", examinateur = "
                    + obj.getExaminateur().getId() + ", encadreur = " + obj.getEncadreur().getId() + ", president = "
                    + obj.getPresident().getId() + ", invite = " + obj.getInvite().getId() + " WHERE id = "
                    + obj.getId();
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while updating a jury");
            e.printStackTrace();
            return false;
        }
    }

    public boolean find(int id) {
        ResultSet result = null;
        try {
            Statement state = this.connect.createStatement();
            String query = "SELECT * FROM jurys WHERE id = " + id;
            result = state.executeQuery(query);
        } catch (Exception e) {
            System.err.println("Error while finding a jury");
            e.printStackTrace();
        }
        return (result != null);
    }
}

class PfeDAO extends DAO<Pfe> {
    public PfeDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Pfe obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "INSERT INTO pfe (id, date, note, numerosalle, blocksalle, idjurys, idetudiant1, idetudiant2) VALUES ("
                    + obj.getId() + ", '" + obj.getDate() + "', " + obj.getNote() + ", " + obj.getNumeroSalle() + ", '"
                    + obj.getBlockSalle() + "', "
                    + obj.getIdJury() + ", " + obj.getIdEtudiant1() + ", " + obj.getIdEtudiant2() + ")";
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while creating a pfe");
            e.printStackTrace();
        }
        return false; // Add missing return statement
    }

    public boolean delete(int id) {

        try {
            // Establish database connection

            // Prepare SQL statement
            String sql = "DELETE FROM pfe WHERE id = ?";
            PreparedStatement statement = connect.prepareStatement(sql);

            // Set parameter value
            statement.setInt(1, id);

            // Execute the statement
            System.out.println(id);
            System.out.println(statement.toString());
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Row deleted successfully!");
                statement.close();
                connect.close();
                return true;
            } else {
                System.out.println("No rows deleted");
                statement.close();
                connect.close();
                return false;
            }

            // Close resources

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Database connection failed");
        }
        return false;
    }

    public boolean update(Pfe obj) {
        if (this.find(obj.getId())) {
            try {
                Statement state = this.connect.createStatement();
                String query = "UPDATE pfe SET date = '" + obj.getDate()
                        + "', note = " + obj.getNote() + ", numerosalle = "
                        + obj.getNumeroSalle() + ", blocksalle = '" + obj.getBlockSalle() + "', idjurys = "
                        + obj.getIdJury() + ", idetudiant1 = " + obj.getIdEtudiant1() + ", idetudiant2 = "
                        + obj.getIdEtudiant2() + " WHERE id = " + obj.getId();
                state.executeUpdate(query);
                return true;
            } catch (Exception e) {
                System.err.println("Error while updating a pfe");
                e.printStackTrace();
            } finally {
                if (this.connect != null) {
                    try {
                        this.connect.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return false;
    }

    public boolean find(int id) {
        ResultSet result = null;
        try {
            Statement state = this.connect.createStatement();
            String query = "SELECT * FROM pfe WHERE id = " + id;
            result = state.executeQuery(query);

            if (result.next()) {
                // At least one row found
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error while finding a pfe");
            e.printStackTrace();
        }

        // No row found or an error occurred
        return false;
    }

}

/**
 * InnerDAO
 */
class Membre_jurysDAO extends DAO<Membre_jurys> {
    public Membre_jurysDAO(Connection conn) {
        super(conn);
    }

    public boolean create(Membre_jurys obj) {
        try {
            Statement state = this.connect.createStatement();
            String query = "INSERT INTO membre_jurys (idjurys, idenseignant) VALUES (" +
                    obj.getIdJury() + ", " + obj.getIdEnseignant() + ")";
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while creating a jury member");
            e.printStackTrace();
        }
        return false; // Add missing return statement
    }

    public boolean delete(int idJury) {
        // not implemented
        return false;
    }

    public boolean deleteWithTwoIds(int idJury, int idEnseignant) {
        try {
            Statement state = this.connect.createStatement();
            String query = "DELETE FROM membre_jurys WHERE idjurys = " + idJury + " AND idenseignant = " + idEnseignant;
            state.executeUpdate(query);
            return true;
        } catch (Exception e) {
            System.err.println("Error while deleting a jury member");
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Membre_jurys obj) {
        // not implemented
        return false;
    }

    public boolean find(int id) {
        // not implemented
        return false;
    }

    public boolean findWithTwoIds(int idJury, int idEnseignant) {
        ResultSet result = null;
        try {
            Statement state = this.connect.createStatement();
            String query = "SELECT * FROM membre_jurys WHERE idjurys = " + idJury + " AND idenseignant = "
                    + idEnseignant;
            result = state.executeQuery(query);
            return (result != null);
        } catch (Exception e) {
            System.err.println("Error while finding a jury member");
            e.printStackTrace();
        }
        return false;
    }
}
