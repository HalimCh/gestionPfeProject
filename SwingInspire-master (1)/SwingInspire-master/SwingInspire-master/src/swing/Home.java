/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.Border;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.table.JTableHeader;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {
    
    boolean conex= false;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setColor(btn_1); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_3,btn_4}, new JPanel[]{ind_3, ind_4});
        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
            Component comp = jTabbedPane1.getComponentAt(i); // Get the panel for the tab
            if (comp instanceof JPanel) { // Ensure it's a JPanel
                JPanel panel = (JPanel) comp;

                // Loop through the components in the panel
                for (Component innerComp : panel.getComponents()) {
                    if (innerComp instanceof JButton) { // If it's a JButton
                        JButton button = (JButton) innerComp;
                        
                        

                        if (button.getName() != null && "dex".equals(button.getName())){
                            button.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseEntered(MouseEvent e) {
                                 button.setText("Déconexion");
                                 button.setIcon(new ImageIcon("D:/java/InterfaceAdam/SwingInspire-master (1)/SwingInspire-master/SwingInspire-master/src/swing/images/icons8-déconnexion-50.png"));
                                 
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                                 button.setText("");
                                 button.setIcon(new ImageIcon("D:/java/InterfaceAdam/SwingInspire-master (1)/SwingInspire-master/SwingInspire-master/src/swing/images/icons8-logout-rounded-left-50.png"));
                            }
                            
                            
                        });}
                        else { if (!button.getText().isEmpty()){
                        Color originalColor = button.getBackground();
                        Color hoverColor = darken(originalColor, 0.9); // Darken by 20%
                        Color clickColor = darken(hoverColor, 0.85); // Darken more than hover

                        // Add hover animation
                        button.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseEntered(MouseEvent e) {
                                button.setBackground(hoverColor);
                                // Change to hover color
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                                button.setBackground(originalColor); // Revert to original color
                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                button.setBackground(clickColor); // Darken even more on click
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                button.setBackground(hoverColor); // Return to hover color after release
                            }
                        });
                    }
                        else{
                            
                        
                            button.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseEntered(MouseEvent e) {
                                button.setIcon(new ImageIcon("D:/java/InterfaceAdam/SwingInspire-master (1)/SwingInspire-master/SwingInspire-master/src/swing/images/icons8-back-50 (1).png"));
                             
                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                                button.setIcon(new ImageIcon("D:/java/InterfaceAdam/SwingInspire-master (1)/SwingInspire-master/SwingInspire-master/src/swing/images/icons8-back-50.png"));
                            }
                            });
                           
                    }}}
                    
                    if (innerComp instanceof JTextField){
                        JTextField textField = (JTextField) innerComp;
                        Border originalBorder = textField.getBorder();
                        Border focusBorder = BorderFactory.createLineBorder(Color.black, 2); // Change the color and thickness as desired

                                textField.addFocusListener(new FocusListener() {
                                     @Override
                                     public void focusGained(FocusEvent e) {
                                          textField.setBorder(focusBorder);
                           
                                        }

                                     @Override
                                    public void focusLost(FocusEvent e) {
                                          textField.setBorder(originalBorder);
                        }
                    });
                                     }
                    
                }
            }
        }
        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
            Component comp = jTabbedPane1.getComponentAt(i); // Get outer panel for the tab
            if (comp instanceof JPanel) { // Ensure it's a JPanel
                JPanel panel = (JPanel) comp;

                // Initialize text fields in nested panels
                initializeTextFields(panel);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_pane = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ajout_etud = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idE = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        sectionE = new javax.swing.JTextField();
        niveauE = new javax.swing.JTextField();
        nameE = new javax.swing.JTextField();
        groupE = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        modif_etud = new javax.swing.JPanel();
        jButton34 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        idEM = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        sectionEM = new javax.swing.JTextField();
        niveauEM = new javax.swing.JTextField();
        nameEM = new javax.swing.JTextField();
        groupEM = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        admin_home = new javax.swing.JPanel();
        gestionPfeButtonAdmin = new javax.swing.JButton();
        gestionEnseignButtonAdmin = new javax.swing.JButton();
        gestionEtudButtonAdmin = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        gestionJuryButtonAdmin = new javax.swing.JButton();
        dex = new javax.swing.JButton();
        jLabel103 = new javax.swing.JLabel();
        gest_etud = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        rechercherPfeButton1 = new javax.swing.JButton();
        supprimerPfeButt1 = new javax.swing.JButton();
        affichPfeButt1 = new javax.swing.JButton();
        modifPfeButt1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton29 = new javax.swing.JButton();
        gest_enseig = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        ajouterJuryAdmin1 = new javax.swing.JButton();
        modifPfeButt2 = new javax.swing.JButton();
        rechercherPfeButton2 = new javax.swing.JButton();
        affichPfeButt2 = new javax.swing.JButton();
        supprimerPfeButt2 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        gest_jury = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        ajouterJuryAdmin = new javax.swing.JButton();
        supprimerJuryButt = new javax.swing.JButton();
        rechercherJuryButt = new javax.swing.JButton();
        modifJuryButt = new javax.swing.JButton();
        affichJuryButt = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        gest_pfe = new javax.swing.JPanel();
        affichPfeButt = new javax.swing.JButton();
        modifPfeButt = new javax.swing.JButton();
        rechercherPfeButton = new javax.swing.JButton();
        supprimerPfeButt = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        ajouterPfeAdmin = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        rech_enseig = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        eId = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel102 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        rech_jury = new javax.swing.JPanel();
        jButton32 = new javax.swing.JButton();
        idJ = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel106 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        rech_pfe = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        idPfeRecherche = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        rech_etud = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        idER = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel101 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        affich_etud = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        modif_jury = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        presidentM = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        idM = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        rapporteurM = new javax.swing.JTextField();
        encadreurM = new javax.swing.JTextField();
        inviteM = new javax.swing.JTextField();
        examinateurM = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        ajout_jury = new javax.swing.JPanel();
        jButton36 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        presidentA = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        idA = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        rapporteurA = new javax.swing.JTextField();
        encadreurA = new javax.swing.JTextField();
        inviteA = new javax.swing.JTextField();
        examinateurA = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        ajout_enseig = new javax.swing.JPanel();
        jButton37 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        EnId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        EnName = new javax.swing.JTextField();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        modif_enseig = new javax.swing.JPanel();
        jButton39 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        EnNameM = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        EnIdM = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        modif_pfe = new javax.swing.JPanel();
        modifFormButton = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        idEtud2ModifAdm = new javax.swing.JTextField();
        etud1ModifAdm = new javax.swing.JTextField();
        idPfeModif = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        idJuryModifAdm = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        notePfeModif = new javax.swing.JTextField();
        numSalleModifAdm = new javax.swing.JTextField();
        blockModifAdm = new javax.swing.JTextField();
        datePfeModif = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        ajout_pfe = new javax.swing.JPanel();
        ajouterPfeButt = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        idEtud2 = new javax.swing.JTextField();
        idEtud1 = new javax.swing.JTextField();
        idPfeTextField = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        idJury = new javax.swing.JTextField();
        jLabel145 = new javax.swing.JLabel();
        noteTextField = new javax.swing.JTextField();
        numeroSalleTextField = new javax.swing.JTextField();
        blockSalle = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        affich_pfe = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        affich_enseig = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton23 = new javax.swing.JButton();
        affich_jury = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jButton24 = new javax.swing.JButton();
        supp_etud = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        idES = new javax.swing.JTextField();
        jLabel153 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        supp_jurys = new javax.swing.JPanel();
        jButton38 = new javax.swing.JButton();
        idS = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        supp_enseig = new javax.swing.JPanel();
        jButton40 = new javax.swing.JButton();
        ES = new javax.swing.JTextField();
        jLabel161 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        supp_pfe = new javax.swing.JPanel();
        jButton41 = new javax.swing.JButton();
        idPfeTextFieldSupprim = new javax.swing.JTextField();
        jLabel165 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        rech_etud_pfe = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        idPE = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jButton45 = new javax.swing.JButton();
        rech_enseig_pfe = new javax.swing.JPanel();
        jButton42 = new javax.swing.JButton();
        eId1 = new javax.swing.JTextField();
        jLabel173 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jButton46 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_pane.setBackground(new java.awt.Color(0, 75, 142));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_1.setBackground(new java.awt.Color(0, 75, 142));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
        });

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setBackground(new java.awt.Color(31, 47, 152));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/home (1).png"))); // NOI18N
        jLabel8.setText("Acceuil");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ind_1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        side_pane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, -1));

        btn_3.setBackground(new java.awt.Color(0, 75, 142));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-administrator-male-26.png"))); // NOI18N
        jLabel10.setText("Admin");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        side_pane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 160, 50));

        btn_4.setBackground(new java.awt.Color(0, 75, 142));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel11.setBackground(new java.awt.Color(0, 75, 142));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-student-30.png"))); // NOI18N
        jLabel11.setText("Etudiant");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ind_4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        side_pane.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 160, 50));

        btn_2.setBackground(new java.awt.Color(0, 75, 142));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_2MouseExited(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(5, 56));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 23)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-teacher-24.png"))); // NOI18N
        jLabel100.setText("Enseignant");
        jLabel100.setAlignmentX(0.5F);
        jLabel100.setIconTextGap(3);

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_2Layout.createSequentialGroup()
                .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_pane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 160, 50));

        getContentPane().add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 640));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        home.setBackground(new java.awt.Color(180, 218, 249));
        home.setMinimumSize(new java.awt.Dimension(990, 630));
        home.setPreferredSize(new java.awt.Dimension(990, 630));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(180, 218, 249));
        jButton1.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(133, 163, 221));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-female-student-with-notebooks3.png"))); // NOI18N
        jButton1.setText("Espace Etudiant");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(5);
        jButton1.setMargin(new java.awt.Insets(2, 14, 35, 9));
        jButton1.setName(""); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(191, 66));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        home.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 330, 480));

        jButton3.setBackground(new java.awt.Color(250, 218, 180));
        jButton3.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(160, 150, 130));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-joyful-man-with-phone-waving-his-hand1.png"))); // NOI18N
        jButton3.setText("Espace Admin");
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMargin(new java.awt.Insets(2, 14, 30, 14));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        home.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 310, 480));

        jButton2.setBackground(new java.awt.Color(176, 232, 223));
        jButton2.setFont(new java.awt.Font("Cascadia Code", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(127, 170, 163));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-joyful-man-with-raised-fists1.png"))); // NOI18N
        jButton2.setText("Espace Enseignant");
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(30);
        jButton2.setMargin(new java.awt.Insets(2, 14, 35, 9));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        home.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 310, 480));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        home.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, -10, 950, 190));

        jTabbedPane1.addTab("tab2", home);

        login.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel2.setText("Password");

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        sendButton.setBackground(new java.awt.Color(253, 223, 201));
        sendButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        sendButton.setForeground(new java.awt.Color(138, 118, 82));
        sendButton.setText("Log in");
        sendButton.setBorder(null);
        sendButton.setFocusable(false);
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(123, 213, 245));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-man-studying-online.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(28, 167, 236));
        jLabel3.setText("Admin Log in");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("hey enter your details to log in");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernameField)
                                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                    .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(loginLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel3)))
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(sendButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", login);

        ajout_etud.setBackground(new java.awt.Color(105, 122, 152));
        ajout_etud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setBackground(new java.awt.Color(177, 150, 216));
        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton8.setText("Valider");
        jButton8.setBorder(null);
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        ajout_etud.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 120, 40));

        jPanel6.setBackground(new java.awt.Color(184, 191, 214));
        jPanel6.setFocusable(false);
        jPanel6.setNextFocusableComponent(jButton4);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 40)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ajout D'Etudiant");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 26, -1, 44));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 103, -1, -1));

        idE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idE.setForeground(new java.awt.Color(102, 102, 102));
        idE.setText("Entrez votre Identifiant");
        idE.setName(""); // NOI18N
        idE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEActionPerformed(evt);
            }
        });
        jPanel6.add(idE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 105, 311, 50));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 82, 450, 15));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-online-group-studying-50.png"))); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 165, -1, -1));

        sectionE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sectionE.setForeground(new java.awt.Color(102, 102, 102));
        sectionE.setText("Entrez votre section");
        sectionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionEActionPerformed(evt);
            }
        });
        jPanel6.add(sectionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 310, 50));

        niveauE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        niveauE.setForeground(new java.awt.Color(102, 102, 102));
        niveauE.setText("Entrez votre niveau");
        niveauE.setName(""); // NOI18N
        niveauE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveauEActionPerformed(evt);
            }
        });
        jPanel6.add(niveauE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 311, 48));

        nameE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameE.setForeground(new java.awt.Color(102, 102, 102));
        nameE.setText("Entrez votre name");
        nameE.setName(""); // NOI18N
        nameE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameEActionPerformed(evt);
            }
        });
        jPanel6.add(nameE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 311, 48));

        groupE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        groupE.setForeground(new java.awt.Color(102, 102, 102));
        groupE.setText("Entrez votre group");
        groupE.setName(""); // NOI18N
        groupE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupEActionPerformed(evt);
            }
        });
        jPanel6.add(groupE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 311, 48));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-group-50.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 235, -1, 48));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-study-50.png"))); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 62, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-name-50.png"))); // NOI18N
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 53, -1));

        ajout_etud.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 480, 540));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Lovepik_com-450092329-user_profile_flat_illustration__2_20.png"))); // NOI18N
        ajout_etud.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 96, 392, 494));

        jButton4.setBackground(new java.awt.Color(105, 122, 152));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ajout_etud.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 60));

        jTabbedPane1.addTab("tab3", ajout_etud);

        modif_etud.setBackground(new java.awt.Color(105, 122, 152));
        modif_etud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton34.setBackground(new java.awt.Color(177, 150, 216));
        jButton34.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton34.setText("Valider");
        jButton34.setBorder(null);
        jButton34.setFocusable(false);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        modif_etud.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, 120, 40));

        jPanel8.setBackground(new java.awt.Color(184, 191, 214));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Modification D'Etudiant");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 26, -1, 44));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 103, -1, -1));

        idEM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idEM.setForeground(new java.awt.Color(102, 102, 102));
        idEM.setText("Entrez votre Identifiant");
        idEM.setName(""); // NOI18N
        idEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEMActionPerformed(evt);
            }
        });
        jPanel8.add(idEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 311, 48));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel8.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 82, 467, 15));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-online-group-studying-50.png"))); // NOI18N
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 165, -1, -1));

        sectionEM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sectionEM.setForeground(new java.awt.Color(102, 102, 102));
        sectionEM.setText("Entrez votre section");
        sectionEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionEMActionPerformed(evt);
            }
        });
        jPanel8.add(sectionEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 310, 50));

        niveauEM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        niveauEM.setForeground(new java.awt.Color(102, 102, 102));
        niveauEM.setText("Entrez votre niveau");
        niveauEM.setName(""); // NOI18N
        niveauEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveauEMActionPerformed(evt);
            }
        });
        jPanel8.add(niveauEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 311, 48));

        nameEM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameEM.setForeground(new java.awt.Color(102, 102, 102));
        nameEM.setText("Entrez votre prenom");
        nameEM.setToolTipText("");
        nameEM.setName(""); // NOI18N
        nameEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameEMActionPerformed(evt);
            }
        });
        jPanel8.add(nameEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 311, 48));

        groupEM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        groupEM.setForeground(new java.awt.Color(102, 102, 102));
        groupEM.setText("Entrez votre group");
        groupEM.setName(""); // NOI18N
        groupEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupEMActionPerformed(evt);
            }
        });
        jPanel8.add(groupEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 311, 48));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-group-50.png"))); // NOI18N
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 48));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-study-50.png"))); // NOI18N
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 62, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-name-50.png"))); // NOI18N
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 53, -1));

        modif_etud.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 490, 530));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Lovepik_com-450092190-user experience flat illustration with high quality graphics (1).png"))); // NOI18N
        modif_etud.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 93, 390, 467));

        jButton5.setBackground(new java.awt.Color(105, 122, 152));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        modif_etud.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 60));

        jTabbedPane1.addTab("tab3", modif_etud);

        admin_home.setBackground(new java.awt.Color(143, 200, 235));
        admin_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gestionPfeButtonAdmin.setBackground(new java.awt.Color(211, 234, 242));
        gestionPfeButtonAdmin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        gestionPfeButtonAdmin.setForeground(new java.awt.Color(0, 75, 142));
        gestionPfeButtonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-book-50 (2).png"))); // NOI18N
        gestionPfeButtonAdmin.setText("Gestion de PFE");
        gestionPfeButtonAdmin.setAlignmentX(0.5F);
        gestionPfeButtonAdmin.setBorder(null);
        gestionPfeButtonAdmin.setFocusable(false);
        gestionPfeButtonAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gestionPfeButtonAdmin.setIconTextGap(5);
        gestionPfeButtonAdmin.setMargin(new java.awt.Insets(30, 10, 3, 20));
        gestionPfeButtonAdmin.setName(""); // NOI18N
        gestionPfeButtonAdmin.setPreferredSize(new java.awt.Dimension(191, 66));
        gestionPfeButtonAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gestionPfeButtonAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gestionPfeButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionPfeButtonAdminActionPerformed(evt);
            }
        });
        admin_home.add(gestionPfeButtonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 270, 100));

        gestionEnseignButtonAdmin.setBackground(new java.awt.Color(123, 133, 152));
        gestionEnseignButtonAdmin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        gestionEnseignButtonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        gestionEnseignButtonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-teacher-50.png"))); // NOI18N
        gestionEnseignButtonAdmin.setText("Gestion d'enseignant");
        gestionEnseignButtonAdmin.setBorder(null);
        gestionEnseignButtonAdmin.setFocusable(false);
        gestionEnseignButtonAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gestionEnseignButtonAdmin.setInheritsPopupMenu(true);
        gestionEnseignButtonAdmin.setMargin(new java.awt.Insets(2, 14, 30, 14));
        gestionEnseignButtonAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gestionEnseignButtonAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gestionEnseignButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionEnseignButtonAdminActionPerformed(evt);
            }
        });
        admin_home.add(gestionEnseignButtonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 270, 100));

        gestionEtudButtonAdmin.setBackground(new java.awt.Color(123, 133, 152));
        gestionEtudButtonAdmin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        gestionEtudButtonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        gestionEtudButtonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-name-50.png"))); // NOI18N
        gestionEtudButtonAdmin.setText("Gestion d'etudiant");
        gestionEtudButtonAdmin.setBorder(null);
        gestionEtudButtonAdmin.setFocusable(false);
        gestionEtudButtonAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gestionEtudButtonAdmin.setIconTextGap(1);
        gestionEtudButtonAdmin.setMargin(new java.awt.Insets(2, 14, 35, 9));
        gestionEtudButtonAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gestionEtudButtonAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gestionEtudButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionEtudButtonAdminActionPerformed(evt);
            }
        });
        admin_home.add(gestionEtudButtonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 270, 100));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel31.setText("jLabel7");

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        admin_home.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        gestionJuryButtonAdmin.setBackground(new java.awt.Color(211, 234, 242));
        gestionJuryButtonAdmin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        gestionJuryButtonAdmin.setForeground(new java.awt.Color(0, 75, 142));
        gestionJuryButtonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-judge-50.png"))); // NOI18N
        gestionJuryButtonAdmin.setText("Gestion de jury");
        gestionJuryButtonAdmin.setBorder(null);
        gestionJuryButtonAdmin.setFocusable(false);
        gestionJuryButtonAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gestionJuryButtonAdmin.setMargin(new java.awt.Insets(2, 14, 30, 14));
        gestionJuryButtonAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        gestionJuryButtonAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gestionJuryButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionJuryButtonAdminActionPerformed(evt);
            }
        });
        admin_home.add(gestionJuryButtonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 270, 100));

        dex.setBackground(new java.awt.Color(143, 200, 235));
        dex.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        dex.setForeground(new java.awt.Color(255, 0, 47));
        dex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-logout-rounded-left-50.png"))); // NOI18N
        dex.setToolTipText("");
        dex.setBorder(null);
        dex.setFocusable(false);
        dex.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dex.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        dex.setName("dex"); // NOI18N
        dex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexActionPerformed(evt);
            }
        });
        admin_home.add(dex, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, 170, 50));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Login-removebg.png"))); // NOI18N
        admin_home.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 940, 470));

        jTabbedPane1.addTab("tab2", admin_home);

        gest_etud.setBackground(new java.awt.Color(103, 194, 249));
        gest_etud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel46.setText("jLabel7");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gest_etud.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jButton14.setBackground(new java.awt.Color(0, 181, 255));
        jButton14.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-add-user-50.png"))); // NOI18N
        jButton14.setText("Ajouter");
        jButton14.setBorder(null);
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setMargin(new java.awt.Insets(2, 14, 30, 14));
        jButton14.setNextFocusableComponent(jPanel6);
        jButton14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        gest_etud.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 260, 100));

        rechercherPfeButton1.setBackground(new java.awt.Color(153, 153, 255));
        rechercherPfeButton1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        rechercherPfeButton1.setForeground(new java.awt.Color(255, 255, 255));
        rechercherPfeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-find-user-male-50.png"))); // NOI18N
        rechercherPfeButton1.setText("Rechercher");
        rechercherPfeButton1.setBorder(null);
        rechercherPfeButton1.setFocusable(false);
        rechercherPfeButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rechercherPfeButton1.setMargin(new java.awt.Insets(2, 14, 35, 9));
        rechercherPfeButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        rechercherPfeButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rechercherPfeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherPfeButton1ActionPerformed(evt);
            }
        });
        gest_etud.add(rechercherPfeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 260, 100));

        supprimerPfeButt1.setBackground(new java.awt.Color(0, 204, 204));
        supprimerPfeButt1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        supprimerPfeButt1.setForeground(new java.awt.Color(255, 255, 255));
        supprimerPfeButt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-delete-user-50.png"))); // NOI18N
        supprimerPfeButt1.setText("Supprimer");
        supprimerPfeButt1.setBorder(null);
        supprimerPfeButt1.setFocusable(false);
        supprimerPfeButt1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supprimerPfeButt1.setMargin(new java.awt.Insets(2, 14, 30, 14));
        supprimerPfeButt1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        supprimerPfeButt1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        supprimerPfeButt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerPfeButt1ActionPerformed(evt);
            }
        });
        gest_etud.add(supprimerPfeButt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 260, 100));

        affichPfeButt1.setBackground(new java.awt.Color(0, 153, 204));
        affichPfeButt1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        affichPfeButt1.setForeground(new java.awt.Color(255, 255, 255));
        affichPfeButt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-user-menu-male-50.png"))); // NOI18N
        affichPfeButt1.setText("Afficher");
        affichPfeButt1.setBorder(null);
        affichPfeButt1.setFocusable(false);
        affichPfeButt1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        affichPfeButt1.setMargin(new java.awt.Insets(30, 10, 3, 20));
        affichPfeButt1.setName(""); // NOI18N
        affichPfeButt1.setPreferredSize(new java.awt.Dimension(191, 66));
        affichPfeButt1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        affichPfeButt1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        affichPfeButt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affichPfeButt1ActionPerformed(evt);
            }
        });
        gest_etud.add(affichPfeButt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 260, 100));

        modifPfeButt1.setBackground(new java.awt.Color(153, 204, 255));
        modifPfeButt1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        modifPfeButt1.setForeground(new java.awt.Color(255, 255, 255));
        modifPfeButt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-change-user-50.png"))); // NOI18N
        modifPfeButt1.setText("Modifier");
        modifPfeButt1.setBorder(null);
        modifPfeButt1.setFocusable(false);
        modifPfeButt1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifPfeButt1.setInheritsPopupMenu(true);
        modifPfeButt1.setMargin(new java.awt.Insets(2, 14, 30, 14));
        modifPfeButt1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        modifPfeButt1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modifPfeButt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifPfeButt1ActionPerformed(evt);
            }
        });
        gest_etud.add(modifPfeButt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 260, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-graduated-student-holding-diploma1.png"))); // NOI18N
        gest_etud.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 200, 430));

        jButton29.setBackground(new java.awt.Color(103, 194, 249));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton29.setBorder(null);
        jButton29.setFocusable(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        gest_etud.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 70));

        jTabbedPane1.addTab("tab2", gest_etud);

        gest_enseig.setBackground(new java.awt.Color(103, 194, 249));
        gest_enseig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel65.setText("jLabel7");

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gest_enseig.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/business-3d-young-man-with-coffee-standing-and-speaking1.png"))); // NOI18N
        gest_enseig.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 160, 420));

        ajouterJuryAdmin1.setBackground(new java.awt.Color(34, 143, 207));
        ajouterJuryAdmin1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        ajouterJuryAdmin1.setForeground(new java.awt.Color(255, 255, 255));
        ajouterJuryAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-add-user-50.png"))); // NOI18N
        ajouterJuryAdmin1.setText("Ajouter");
        ajouterJuryAdmin1.setBorder(null);
        ajouterJuryAdmin1.setFocusable(false);
        ajouterJuryAdmin1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajouterJuryAdmin1.setMargin(new java.awt.Insets(2, 14, 30, 14));
        ajouterJuryAdmin1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ajouterJuryAdmin1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajouterJuryAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterJuryAdmin1ActionPerformed(evt);
            }
        });
        gest_enseig.add(ajouterJuryAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 260, 100));

        modifPfeButt2.setBackground(new java.awt.Color(243, 176, 195));
        modifPfeButt2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        modifPfeButt2.setForeground(new java.awt.Color(255, 255, 255));
        modifPfeButt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-change-user-50.png"))); // NOI18N
        modifPfeButt2.setText("Modifier");
        modifPfeButt2.setBorder(null);
        modifPfeButt2.setFocusable(false);
        modifPfeButt2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifPfeButt2.setInheritsPopupMenu(true);
        modifPfeButt2.setMargin(new java.awt.Insets(2, 14, 30, 14));
        modifPfeButt2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        modifPfeButt2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modifPfeButt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifPfeButt2ActionPerformed(evt);
            }
        });
        gest_enseig.add(modifPfeButt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 260, 100));

        rechercherPfeButton2.setBackground(new java.awt.Color(97, 133, 195));
        rechercherPfeButton2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        rechercherPfeButton2.setForeground(new java.awt.Color(255, 255, 255));
        rechercherPfeButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-find-user-male-50.png"))); // NOI18N
        rechercherPfeButton2.setText("Rechercher");
        rechercherPfeButton2.setBorder(null);
        rechercherPfeButton2.setFocusable(false);
        rechercherPfeButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rechercherPfeButton2.setMargin(new java.awt.Insets(2, 14, 35, 9));
        rechercherPfeButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        rechercherPfeButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rechercherPfeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherPfeButton2ActionPerformed(evt);
            }
        });
        gest_enseig.add(rechercherPfeButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 260, 100));

        affichPfeButt2.setBackground(new java.awt.Color(212, 166, 86));
        affichPfeButt2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        affichPfeButt2.setForeground(new java.awt.Color(255, 255, 255));
        affichPfeButt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-user-menu-male-50.png"))); // NOI18N
        affichPfeButt2.setText("Afficher");
        affichPfeButt2.setBorder(null);
        affichPfeButt2.setFocusable(false);
        affichPfeButt2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        affichPfeButt2.setMargin(new java.awt.Insets(30, 10, 3, 20));
        affichPfeButt2.setName(""); // NOI18N
        affichPfeButt2.setPreferredSize(new java.awt.Dimension(191, 66));
        affichPfeButt2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        affichPfeButt2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        affichPfeButt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affichPfeButt2ActionPerformed(evt);
            }
        });
        gest_enseig.add(affichPfeButt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 260, 100));

        supprimerPfeButt2.setBackground(new java.awt.Color(232, 232, 195));
        supprimerPfeButt2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        supprimerPfeButt2.setForeground(new java.awt.Color(255, 255, 255));
        supprimerPfeButt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-delete-user-50.png"))); // NOI18N
        supprimerPfeButt2.setText("Supprimer");
        supprimerPfeButt2.setBorder(null);
        supprimerPfeButt2.setFocusable(false);
        supprimerPfeButt2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supprimerPfeButt2.setMargin(new java.awt.Insets(2, 14, 30, 14));
        supprimerPfeButt2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        supprimerPfeButt2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        supprimerPfeButt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerPfeButt2ActionPerformed(evt);
            }
        });
        gest_enseig.add(supprimerPfeButt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 260, 100));

        jButton30.setBackground(new java.awt.Color(103, 194, 249));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton30.setBorder(null);
        jButton30.setFocusable(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        gest_enseig.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 70));

        jTabbedPane1.addTab("tab2", gest_enseig);

        gest_jury.setBackground(new java.awt.Color(103, 194, 249));
        gest_jury.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel77.setText("jLabel7");

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gest_jury.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-hygge-isometric-view-of-colleagues-discussing-the-project.png"))); // NOI18N
        gest_jury.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 320, 360));

        ajouterJuryAdmin.setBackground(new java.awt.Color(34, 143, 207));
        ajouterJuryAdmin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        ajouterJuryAdmin.setForeground(new java.awt.Color(255, 255, 255));
        ajouterJuryAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-add-user-50.png"))); // NOI18N
        ajouterJuryAdmin.setText("Ajouter");
        ajouterJuryAdmin.setBorder(null);
        ajouterJuryAdmin.setFocusable(false);
        ajouterJuryAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajouterJuryAdmin.setMargin(new java.awt.Insets(2, 14, 30, 14));
        ajouterJuryAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ajouterJuryAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajouterJuryAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterJuryAdminActionPerformed(evt);
            }
        });
        gest_jury.add(ajouterJuryAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 260, 100));

        supprimerJuryButt.setBackground(new java.awt.Color(92, 110, 180));
        supprimerJuryButt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        supprimerJuryButt.setForeground(new java.awt.Color(255, 255, 255));
        supprimerJuryButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-delete-user-50.png"))); // NOI18N
        supprimerJuryButt.setText("Supprimer");
        supprimerJuryButt.setBorder(null);
        supprimerJuryButt.setFocusable(false);
        supprimerJuryButt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supprimerJuryButt.setMargin(new java.awt.Insets(2, 14, 30, 14));
        supprimerJuryButt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        supprimerJuryButt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        supprimerJuryButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerJuryButtActionPerformed(evt);
            }
        });
        gest_jury.add(supprimerJuryButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 260, 100));

        rechercherJuryButt.setBackground(new java.awt.Color(68, 134, 143));
        rechercherJuryButt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        rechercherJuryButt.setForeground(new java.awt.Color(255, 255, 255));
        rechercherJuryButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-find-user-male-50.png"))); // NOI18N
        rechercherJuryButt.setText("Rechercher");
        rechercherJuryButt.setBorder(null);
        rechercherJuryButt.setFocusable(false);
        rechercherJuryButt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rechercherJuryButt.setMargin(new java.awt.Insets(2, 14, 35, 9));
        rechercherJuryButt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        rechercherJuryButt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rechercherJuryButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherJuryButtActionPerformed(evt);
            }
        });
        gest_jury.add(rechercherJuryButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 260, 100));

        modifJuryButt.setBackground(new java.awt.Color(246, 189, 121));
        modifJuryButt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        modifJuryButt.setForeground(new java.awt.Color(255, 255, 255));
        modifJuryButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-change-user-50.png"))); // NOI18N
        modifJuryButt.setText("Modifier");
        modifJuryButt.setBorder(null);
        modifJuryButt.setFocusable(false);
        modifJuryButt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifJuryButt.setInheritsPopupMenu(true);
        modifJuryButt.setMargin(new java.awt.Insets(2, 14, 30, 14));
        modifJuryButt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        modifJuryButt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modifJuryButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifJuryButtActionPerformed(evt);
            }
        });
        gest_jury.add(modifJuryButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 260, 100));

        affichJuryButt.setBackground(new java.awt.Color(172, 142, 114));
        affichJuryButt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        affichJuryButt.setForeground(new java.awt.Color(255, 255, 255));
        affichJuryButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-user-menu-male-50.png"))); // NOI18N
        affichJuryButt.setText("Afficher");
        affichJuryButt.setBorder(null);
        affichJuryButt.setFocusable(false);
        affichJuryButt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        affichJuryButt.setMargin(new java.awt.Insets(30, 10, 3, 20));
        affichJuryButt.setName(""); // NOI18N
        affichJuryButt.setPreferredSize(new java.awt.Dimension(191, 66));
        affichJuryButt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        affichJuryButt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        affichJuryButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affichJuryButtActionPerformed(evt);
            }
        });
        gest_jury.add(affichJuryButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 260, 100));

        jButton43.setBackground(new java.awt.Color(103, 194, 249));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton43.setBorder(null);
        jButton43.setFocusable(false);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        gest_jury.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 40, 70));

        jTabbedPane1.addTab("tab2", gest_jury);

        gest_pfe.setBackground(new java.awt.Color(103, 194, 249));
        gest_pfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        affichPfeButt.setBackground(new java.awt.Color(0, 153, 204));
        affichPfeButt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        affichPfeButt.setForeground(new java.awt.Color(255, 255, 255));
        affichPfeButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-user-menu-male-50.png"))); // NOI18N
        affichPfeButt.setText("Afficher");
        affichPfeButt.setBorder(null);
        affichPfeButt.setFocusable(false);
        affichPfeButt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        affichPfeButt.setMargin(new java.awt.Insets(30, 10, 3, 20));
        affichPfeButt.setName(""); // NOI18N
        affichPfeButt.setPreferredSize(new java.awt.Dimension(191, 66));
        affichPfeButt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        affichPfeButt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        affichPfeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affichPfeButtActionPerformed(evt);
            }
        });
        gest_pfe.add(affichPfeButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 260, 100));

        modifPfeButt.setBackground(new java.awt.Color(153, 204, 255));
        modifPfeButt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        modifPfeButt.setForeground(new java.awt.Color(255, 255, 255));
        modifPfeButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-change-user-50.png"))); // NOI18N
        modifPfeButt.setText("Modifier");
        modifPfeButt.setBorder(null);
        modifPfeButt.setFocusable(false);
        modifPfeButt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modifPfeButt.setInheritsPopupMenu(true);
        modifPfeButt.setMargin(new java.awt.Insets(2, 14, 30, 14));
        modifPfeButt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        modifPfeButt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modifPfeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifPfeButtActionPerformed(evt);
            }
        });
        gest_pfe.add(modifPfeButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 260, 100));

        rechercherPfeButton.setBackground(new java.awt.Color(153, 153, 255));
        rechercherPfeButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        rechercherPfeButton.setForeground(new java.awt.Color(255, 255, 255));
        rechercherPfeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-find-user-male-50.png"))); // NOI18N
        rechercherPfeButton.setText("Rechercher");
        rechercherPfeButton.setBorder(null);
        rechercherPfeButton.setFocusable(false);
        rechercherPfeButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rechercherPfeButton.setMargin(new java.awt.Insets(2, 14, 35, 9));
        rechercherPfeButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        rechercherPfeButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rechercherPfeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherPfeButtonActionPerformed(evt);
            }
        });
        gest_pfe.add(rechercherPfeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 260, 100));

        supprimerPfeButt.setBackground(new java.awt.Color(0, 204, 204));
        supprimerPfeButt.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        supprimerPfeButt.setForeground(new java.awt.Color(255, 255, 255));
        supprimerPfeButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-delete-user-50.png"))); // NOI18N
        supprimerPfeButt.setText("Supprimer");
        supprimerPfeButt.setBorder(null);
        supprimerPfeButt.setFocusable(false);
        supprimerPfeButt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        supprimerPfeButt.setMargin(new java.awt.Insets(2, 14, 30, 14));
        supprimerPfeButt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        supprimerPfeButt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        supprimerPfeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerPfeButtActionPerformed(evt);
            }
        });
        gest_pfe.add(supprimerPfeButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 260, 100));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel89.setText("jLabel7");

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gest_pfe.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        ajouterPfeAdmin.setBackground(new java.awt.Color(0, 181, 255));
        ajouterPfeAdmin.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        ajouterPfeAdmin.setForeground(new java.awt.Color(255, 255, 255));
        ajouterPfeAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-add-user-50.png"))); // NOI18N
        ajouterPfeAdmin.setText("Ajouter");
        ajouterPfeAdmin.setBorder(null);
        ajouterPfeAdmin.setFocusable(false);
        ajouterPfeAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ajouterPfeAdmin.setMargin(new java.awt.Insets(2, 14, 30, 14));
        ajouterPfeAdmin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ajouterPfeAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ajouterPfeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterPfeAdminActionPerformed(evt);
            }
        });
        gest_pfe.add(ajouterPfeAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 260, 100));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-graduation-cap-lying-on-pile-of-books.png"))); // NOI18N
        jLabel28.setText("                               nvbvbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbnvbn nvb  ");
        gest_pfe.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 170, 210));

        jButton44.setBackground(new java.awt.Color(103, 194, 249));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton44.setBorder(null);
        jButton44.setFocusable(false);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        gest_pfe.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 40, 70));

        jTabbedPane1.addTab("tab2", gest_pfe);

        rech_enseig.setBackground(new java.awt.Color(143, 200, 235));
        rech_enseig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton31.setBackground(new java.awt.Color(0, 75, 142));
        jButton31.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Valider");
        jButton31.setBorder(null);
        jButton31.setFocusable(false);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        rech_enseig.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 110, 40));

        eId.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        eId.setName(""); // NOI18N
        eId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eIdActionPerformed(evt);
            }
        });
        rech_enseig.add(eId, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel91.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Tapez votre ID:");
        jLabel91.setName(""); // NOI18N
        rech_enseig.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel92.setText("jLabel7");

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rech_enseig.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom"
            }
        ));
        jTable3.setRowHeight(30);
        jScrollPane3.setViewportView(jTable3);
        Font biggerFont5 = new Font("Segoe UI", Font.BOLD, 14);
        DefaultTableCellRenderer headerRenderer5 = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                setFont(biggerFont5);
                return this;
            }
        };

        // Apply the renderer to all columns for consistency (moved before populating data)
        for (int i = 0; i < jTable3.getColumnCount(); i++) {
            jTable3.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer5);
        }

        rech_enseig.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 260, 50));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/business-3d-young-man-with-coffee-standing-and-speaking1.png"))); // NOI18N
        rech_enseig.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 160, 420));

        jButton22.setBackground(new java.awt.Color(143, 200, 235));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton22.setBorder(null);
        jButton22.setFocusable(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        rech_enseig.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 70));

        jTabbedPane1.addTab("tab2", rech_enseig);

        rech_jury.setBackground(new java.awt.Color(143, 200, 235));
        rech_jury.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton32.setBackground(new java.awt.Color(0, 75, 142));
        jButton32.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("Valider");
        jButton32.setBorder(null);
        jButton32.setFocusable(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        rech_jury.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 110, 40));

        idJ.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idJ.setName(""); // NOI18N
        idJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJActionPerformed(evt);
            }
        });
        rech_jury.add(idJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel94.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Tapez votre ID:");
        jLabel94.setName(""); // NOI18N
        rech_jury.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel95.setText("jLabel7");

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rech_jury.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jScrollPane4.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane4.setBorder(null);

        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "president", "rapporteur", "examinateur", "encadreur", "invite", "id"
            }
        ));
        jTable4.setRowHeight(30);
        jScrollPane4.setViewportView(jTable4);
        Font biggerFont1 = new Font("Segoe UI", Font.BOLD, 14);
        DefaultTableCellRenderer headerRenderer1 = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                setFont(biggerFont1);
                return this;
            }
        };

        // Apply the renderer to all columns for consistency (moved before populating data)
        for (int i = 0; i < jTable4.getColumnCount(); i++) {
            jTable4.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer1);
        }

        rech_jury.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 700, 50));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/business-3d-old-businessman-in-classical-suit-and-glasses-with-coffee-mug-holding-tablet1.png"))); // NOI18N
        rech_jury.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 160, 430));

        jButton26.setBackground(new java.awt.Color(143, 200, 235));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton26.setBorder(null);
        jButton26.setFocusable(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        rech_jury.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", rech_jury);

        rech_pfe.setBackground(new java.awt.Color(143, 200, 235));
        rech_pfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton33.setBackground(new java.awt.Color(0, 75, 142));
        jButton33.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("Valider");
        jButton33.setBorder(null);
        jButton33.setFocusable(false);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        rech_pfe.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 110, 40));

        idPfeRecherche.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idPfeRecherche.setName(""); // NOI18N
        idPfeRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPfeRechercheActionPerformed(evt);
            }
        });
        rech_pfe.add(idPfeRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel97.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Tapez votre ID:");
        jLabel97.setName(""); // NOI18N
        rech_pfe.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel98.setText("jLabel7");

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rech_pfe.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jScrollPane5.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane5.setBorder(null);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "date", "note", "numero salle", "block salle ", "id jury", "id etudiant 1", "id etudiant 2"
            }
        ));
        jTable5.setRowHeight(30);
        jScrollPane5.setViewportView(jTable5);
        Font biggerFont = new Font("Segoe UI", Font.BOLD, 14);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                setFont(biggerFont);
                return this;
            }
        };

        // Apply the renderer to all columns for consistency (moved before populating data)
        for (int i = 0; i < jTable5.getColumnCount(); i++) {
            jTable5.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        rech_pfe.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 780, 50));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-graduation-cap-lying-on-pile-of-books.png"))); // NOI18N
        rech_pfe.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 180, 180));

        jButton13.setBackground(new java.awt.Color(143, 200, 235));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setFocusable(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        rech_pfe.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", rech_pfe);

        rech_etud.setBackground(new java.awt.Color(143, 200, 235));
        rech_etud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setBackground(new java.awt.Color(0, 75, 142));
        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Valider");
        jButton9.setBorder(null);
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        rech_etud.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 110, 40));

        idER.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idER.setName(""); // NOI18N
        idER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idERActionPerformed(evt);
            }
        });
        rech_etud.add(idER, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel51.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Tapez votre ID:");
        jLabel51.setName(""); // NOI18N
        rech_etud.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel53.setText("jLabel7");

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rech_etud.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "section", "groupe", "niveau", "nom"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        Font biggerFont2 = new Font("Segoe UI", Font.BOLD, 14);
        DefaultTableCellRenderer headerRenderer2 = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                setFont(biggerFont);
                return this;
            }
        };

        // Apply the renderer to all columns for consistency (moved before populating data)
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        rech_etud.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 620, 50));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-young-woman-student-with-notebooks1.png"))); // NOI18N
        rech_etud.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 140, 400));

        jButton12.setBackground(new java.awt.Color(143, 200, 235));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setFocusable(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        rech_etud.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", rech_etud);

        affich_etud.setBackground(new java.awt.Color(143, 200, 235));
        affich_etud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel55.setText("jLabel7");

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        affich_etud.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jScrollPane2.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane2.setBorder(null);

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "section", "groupe", "niveau", "nom"
            }
        ));
        jTable2.setToolTipText("");
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setRowHeight(30);
        jScrollPane2.setViewportView(jTable2);

        affich_etud.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 690, 340));

        jButton7.setBackground(new java.awt.Color(143, 200, 235));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        affich_etud.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 70));

        jTabbedPane1.addTab("tab2", affich_etud);

        modif_jury.setBackground(new java.awt.Color(105, 122, 152));
        modif_jury.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(184, 191, 214));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel107.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("Modification De Jury");
        jPanel11.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 44));

        jLabel108.setBackground(new java.awt.Color(0, 0, 0));
        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel11.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-guest-50.png"))); // NOI18N
        jPanel11.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 53, -1));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-professor-50.png"))); // NOI18N
        jPanel11.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 53, -1));

        presidentM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        presidentM.setForeground(new java.awt.Color(102, 102, 102));
        presidentM.setText("president");
        presidentM.setName(""); // NOI18N
        presidentM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presidentMActionPerformed(evt);
            }
        });
        jPanel11.add(presidentM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 311, 48));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jPanel11.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 82, 467, 15));

        idM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idM.setForeground(new java.awt.Color(102, 102, 102));
        idM.setText("identifier");
        idM.setToolTipText("");
        idM.setName(""); // NOI18N
        idM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMActionPerformed(evt);
            }
        });
        jPanel11.add(idM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 311, 48));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-donald-trump-48.png"))); // NOI18N
        jPanel11.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        rapporteurM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rapporteurM.setForeground(new java.awt.Color(102, 102, 102));
        rapporteurM.setText("rapporteur");
        rapporteurM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapporteurMActionPerformed(evt);
            }
        });
        jPanel11.add(rapporteurM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 310, 50));

        encadreurM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        encadreurM.setForeground(new java.awt.Color(102, 102, 102));
        encadreurM.setText("encadreur");
        encadreurM.setName(""); // NOI18N
        encadreurM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encadreurMActionPerformed(evt);
            }
        });
        jPanel11.add(encadreurM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 311, 48));

        inviteM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inviteM.setForeground(new java.awt.Color(102, 102, 102));
        inviteM.setText("invite");
        inviteM.setToolTipText("");
        inviteM.setName(""); // NOI18N
        inviteM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviteMActionPerformed(evt);
            }
        });
        jPanel11.add(inviteM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 311, 48));

        examinateurM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        examinateurM.setForeground(new java.awt.Color(102, 102, 102));
        examinateurM.setText("examinateur");
        examinateurM.setName(""); // NOI18N
        examinateurM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinateurMActionPerformed(evt);
            }
        });
        jPanel11.add(examinateurM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 311, 48));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-businessman-50.png"))); // NOI18N
        jPanel11.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 48));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-businessman-48.png"))); // NOI18N
        jPanel11.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 62, -1));

        jButton35.setBackground(new java.awt.Color(177, 150, 216));
        jButton35.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton35.setText("Valider");
        jButton35.setBorder(null);
        jButton35.setFocusable(false);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 120, 40));

        modif_jury.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 500, 550));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Lovepik_com-450092190-user experience flat illustration with high quality graphics (1).png"))); // NOI18N
        modif_jury.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 93, 388, 467));

        jButton28.setBackground(new java.awt.Color(105, 122, 152));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton28.setBorder(null);
        jButton28.setFocusable(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        modif_jury.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 60));

        jTabbedPane1.addTab("tab3", modif_jury);

        ajout_jury.setBackground(new java.awt.Color(105, 122, 152));
        ajout_jury.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton36.setBackground(new java.awt.Color(177, 150, 216));
        jButton36.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton36.setText("Valider");
        jButton36.setBorder(null);
        jButton36.setFocusable(false);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        ajout_jury.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 120, 40));

        jPanel13.setBackground(new java.awt.Color(184, 191, 214));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel115.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("Ajout De Jury");
        jPanel13.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 44));

        jLabel116.setBackground(new java.awt.Color(0, 0, 0));
        jLabel116.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel13.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-guest-50.png"))); // NOI18N
        jPanel13.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 53, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-professor-50.png"))); // NOI18N
        jPanel13.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 53, -1));

        presidentA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        presidentA.setForeground(new java.awt.Color(102, 102, 102));
        presidentA.setText("Entrez votre president");
        presidentA.setName(""); // NOI18N
        presidentA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presidentAActionPerformed(evt);
            }
        });
        jPanel13.add(presidentA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 311, 48));

        jSeparator5.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jPanel13.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 82, 467, 15));

        idA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idA.setForeground(new java.awt.Color(102, 102, 102));
        idA.setText("Entrez votre identifiant");
        idA.setToolTipText("");
        idA.setName(""); // NOI18N
        idA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAActionPerformed(evt);
            }
        });
        jPanel13.add(idA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 311, 48));

        jLabel119.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-donald-trump-48.png"))); // NOI18N
        jPanel13.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        rapporteurA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rapporteurA.setForeground(new java.awt.Color(102, 102, 102));
        rapporteurA.setText("Entrez votre rapporteur");
        rapporteurA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapporteurAActionPerformed(evt);
            }
        });
        jPanel13.add(rapporteurA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 310, 50));

        encadreurA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        encadreurA.setForeground(new java.awt.Color(102, 102, 102));
        encadreurA.setText("Entrez votre encadreur");
        encadreurA.setName(""); // NOI18N
        encadreurA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encadreurAActionPerformed(evt);
            }
        });
        jPanel13.add(encadreurA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 311, 48));

        inviteA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inviteA.setForeground(new java.awt.Color(102, 102, 102));
        inviteA.setText("Entrez votre invite");
        inviteA.setToolTipText("");
        inviteA.setName(""); // NOI18N
        inviteA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviteAActionPerformed(evt);
            }
        });
        jPanel13.add(inviteA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 311, 48));

        examinateurA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        examinateurA.setForeground(new java.awt.Color(102, 102, 102));
        examinateurA.setText("Entrez votre examinateur");
        examinateurA.setName(""); // NOI18N
        examinateurA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinateurAActionPerformed(evt);
            }
        });
        jPanel13.add(examinateurA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 311, 48));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-businessman-50.png"))); // NOI18N
        jPanel13.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 48));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-businessman-48.png"))); // NOI18N
        jPanel13.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 62, -1));

        ajout_jury.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 500, 550));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Lovepik_com-450092329-user_profile_flat_illustration__2_20.png"))); // NOI18N
        ajout_jury.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 93, 410, 467));

        jButton27.setBackground(new java.awt.Color(105, 122, 152));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton27.setBorder(null);
        jButton27.setFocusable(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        ajout_jury.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 60));

        jTabbedPane1.addTab("tab3", ajout_jury);

        ajout_enseig.setBackground(new java.awt.Color(105, 122, 152));
        ajout_enseig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton37.setBackground(new java.awt.Color(177, 150, 216));
        jButton37.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton37.setText("Valider");
        jButton37.setBorder(null);
        jButton37.setFocusable(false);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        ajout_enseig.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 120, 40));

        jPanel9.setBackground(new java.awt.Color(184, 191, 214));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel123.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("Ajout d'enseignant");
        jPanel9.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, 44));

        jLabel124.setBackground(new java.awt.Color(0, 0, 0));
        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel9.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        EnId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnId.setForeground(new java.awt.Color(102, 102, 102));
        EnId.setText("Entrez votre Identifiant");
        EnId.setName(""); // NOI18N
        EnId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnIdActionPerformed(evt);
            }
        });
        jPanel9.add(EnId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 311, 48));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel9.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 82, 467, 15));

        EnName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnName.setForeground(new java.awt.Color(102, 102, 102));
        EnName.setText("Entrez votre prenom");
        EnName.setToolTipText("");
        EnName.setName(""); // NOI18N
        EnName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnNameActionPerformed(evt);
            }
        });
        jPanel9.add(EnName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 311, 48));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-name-50.png"))); // NOI18N
        jPanel9.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 53, -1));

        ajout_enseig.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 490, 390));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Lovepik_com-450092190-user experience flat illustration with high quality graphics (1).png"))); // NOI18N
        ajout_enseig.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 93, 388, 467));

        jButton19.setBackground(new java.awt.Color(105, 122, 152));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton19.setBorder(null);
        jButton19.setFocusable(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        ajout_enseig.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 60));

        jTabbedPane1.addTab("tab3", ajout_enseig);

        modif_enseig.setBackground(new java.awt.Color(105, 122, 152));
        modif_enseig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton39.setBackground(new java.awt.Color(177, 150, 216));
        jButton39.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton39.setText("Valider");
        jButton39.setBorder(null);
        jButton39.setFocusable(false);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        modif_enseig.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 120, 40));

        jPanel23.setBackground(new java.awt.Color(184, 191, 214));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel134.setFont(new java.awt.Font("Georgia", 1, 32)); // NOI18N
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("Modification d'enseignant");
        jPanel23.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 44));

        jLabel135.setBackground(new java.awt.Color(0, 0, 0));
        jLabel135.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel23.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        EnNameM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnNameM.setForeground(new java.awt.Color(102, 102, 102));
        EnNameM.setText("Entrez votre prenom");
        EnNameM.setName(""); // NOI18N
        EnNameM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnNameMActionPerformed(evt);
            }
        });
        jPanel23.add(EnNameM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 311, 48));

        jSeparator7.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jPanel23.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 82, 467, 15));

        EnIdM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        EnIdM.setForeground(new java.awt.Color(102, 102, 102));
        EnIdM.setText("Entrez votre identifiant");
        EnIdM.setToolTipText("");
        EnIdM.setName(""); // NOI18N
        EnIdM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnIdMActionPerformed(evt);
            }
        });
        jPanel23.add(EnIdM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 311, 48));

        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-name-50.png"))); // NOI18N
        jPanel23.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 53, -1));

        modif_enseig.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 490, 390));

        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Lovepik_com-450092190-user experience flat illustration with high quality graphics (1).png"))); // NOI18N
        modif_enseig.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 93, 388, 467));

        jButton20.setBackground(new java.awt.Color(105, 122, 152));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton20.setBorder(null);
        jButton20.setFocusable(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        modif_enseig.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 60));

        jTabbedPane1.addTab("tab3", modif_enseig);

        modif_pfe.setBackground(new java.awt.Color(105, 122, 152));
        modif_pfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modifFormButton.setBackground(new java.awt.Color(177, 150, 216));
        modifFormButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        modifFormButton.setText("Valider");
        modifFormButton.setBorder(null);
        modifFormButton.setFocusable(false);
        modifFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifFormButtonActionPerformed(evt);
            }
        });
        modif_pfe.add(modifFormButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 120, 40));

        jPanel15.setBackground(new java.awt.Color(184, 191, 214));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel125.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("Modification De PFE");
        jPanel15.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 44));

        jLabel126.setBackground(new java.awt.Color(0, 0, 0));
        jLabel126.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel15.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 60, 50));

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-guest-50.png"))); // NOI18N
        jPanel15.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 53, -1));

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-professor-50.png"))); // NOI18N
        jPanel15.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 53, -1));

        idEtud2ModifAdm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idEtud2ModifAdm.setForeground(new java.awt.Color(102, 102, 102));
        idEtud2ModifAdm.setText("Entrez id etudiant 2 ");
        idEtud2ModifAdm.setToolTipText("");
        idEtud2ModifAdm.setName(""); // NOI18N
        idEtud2ModifAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEtud2ModifAdmActionPerformed(evt);
            }
        });
        jPanel15.add(idEtud2ModifAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 311, 40));

        etud1ModifAdm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etud1ModifAdm.setForeground(new java.awt.Color(102, 102, 102));
        etud1ModifAdm.setText("Entrez id etudiant 1 ");
        etud1ModifAdm.setToolTipText("");
        etud1ModifAdm.setName(""); // NOI18N
        etud1ModifAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etud1ModifAdmActionPerformed(evt);
            }
        });
        jPanel15.add(etud1ModifAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 311, 40));

        idPfeModif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idPfeModif.setForeground(new java.awt.Color(102, 102, 102));
        idPfeModif.setText("Entrez votre Identifiant");
        idPfeModif.setName(""); // NOI18N
        idPfeModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPfeModifActionPerformed(evt);
            }
        });
        jPanel15.add(idPfeModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 311, 40));

        jSeparator6.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jPanel15.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 82, 467, 15));

        idJuryModifAdm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idJuryModifAdm.setForeground(new java.awt.Color(102, 102, 102));
        idJuryModifAdm.setText("Entrez votre id jury");
        idJuryModifAdm.setToolTipText("");
        idJuryModifAdm.setName(""); // NOI18N
        idJuryModifAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJuryModifAdmActionPerformed(evt);
            }
        });
        jPanel15.add(idJuryModifAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 311, 40));

        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-donald-trump-48.png"))); // NOI18N
        jPanel15.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        notePfeModif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        notePfeModif.setForeground(new java.awt.Color(102, 102, 102));
        notePfeModif.setText("Entrez votre note");
        notePfeModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notePfeModifActionPerformed(evt);
            }
        });
        jPanel15.add(notePfeModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 310, 40));

        numSalleModifAdm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numSalleModifAdm.setForeground(new java.awt.Color(102, 102, 102));
        numSalleModifAdm.setText("Entrez votre numero de salle");
        numSalleModifAdm.setName(""); // NOI18N
        numSalleModifAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSalleModifAdmActionPerformed(evt);
            }
        });
        jPanel15.add(numSalleModifAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 311, 40));

        blockModifAdm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        blockModifAdm.setForeground(new java.awt.Color(102, 102, 102));
        blockModifAdm.setText("Entrez votre block de salle");
        blockModifAdm.setToolTipText("");
        blockModifAdm.setName(""); // NOI18N
        blockModifAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockModifAdmActionPerformed(evt);
            }
        });
        jPanel15.add(blockModifAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 311, 40));

        datePfeModif.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        datePfeModif.setForeground(new java.awt.Color(102, 102, 102));
        datePfeModif.setText("Entrez votre date");
        datePfeModif.setName(""); // NOI18N
        datePfeModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePfeModifActionPerformed(evt);
            }
        });
        jPanel15.add(datePfeModif, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 311, 40));

        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-businessman-50.png"))); // NOI18N
        jPanel15.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 48));

        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-businessman-48.png"))); // NOI18N
        jPanel15.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 62, -1));

        jLabel168.setBackground(new java.awt.Color(0, 0, 0));
        jLabel168.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel15.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 60, 50));

        jLabel169.setBackground(new java.awt.Color(0, 0, 0));
        jLabel169.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel15.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, 50));

        modif_pfe.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 500, 580));

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Lovepik_com-450092190-user experience flat illustration with high quality graphics (1).png"))); // NOI18N
        modif_pfe.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 93, 388, 467));

        jButton18.setBackground(new java.awt.Color(105, 122, 152));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton18.setBorder(null);
        jButton18.setFocusable(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        modif_pfe.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 60));

        jTabbedPane1.addTab("tab3", modif_pfe);

        ajout_pfe.setBackground(new java.awt.Color(105, 122, 152));
        ajout_pfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ajouterPfeButt.setBackground(new java.awt.Color(177, 150, 216));
        ajouterPfeButt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ajouterPfeButt.setText("Valider");
        ajouterPfeButt.setBorder(null);
        ajouterPfeButt.setFocusable(false);
        ajouterPfeButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterPfeButtActionPerformed(evt);
            }
        });
        ajout_pfe.add(ajouterPfeButt, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 540, 120, 40));

        jPanel24.setBackground(new java.awt.Color(184, 191, 214));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel141.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("Ajout De PFE");
        jPanel24.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 44));

        jLabel142.setBackground(new java.awt.Color(0, 0, 0));
        jLabel142.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel24.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 50, 50));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-guest-50.png"))); // NOI18N
        jPanel24.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 53, 50));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-professor-50.png"))); // NOI18N
        jPanel24.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 53, 40));

        idEtud2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idEtud2.setForeground(new java.awt.Color(102, 102, 102));
        idEtud2.setText("Entrez votre idEtud2");
        idEtud2.setToolTipText("");
        idEtud2.setName(""); // NOI18N
        idEtud2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEtud2ActionPerformed(evt);
            }
        });
        jPanel24.add(idEtud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 311, 40));

        idEtud1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idEtud1.setForeground(new java.awt.Color(102, 102, 102));
        idEtud1.setText("Entrez votre idEtud1");
        idEtud1.setToolTipText("");
        idEtud1.setName(""); // NOI18N
        idEtud1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idEtud1ActionPerformed(evt);
            }
        });
        jPanel24.add(idEtud1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 311, 40));

        idPfeTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idPfeTextField.setForeground(new java.awt.Color(102, 102, 102));
        idPfeTextField.setText("Entrez votre Identifiant");
        idPfeTextField.setName(""); // NOI18N
        idPfeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPfeTextFieldActionPerformed(evt);
            }
        });
        jPanel24.add(idPfeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 311, 40));

        jSeparator8.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel24.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 82, 467, 15));

        idJury.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idJury.setForeground(new java.awt.Color(102, 102, 102));
        idJury.setText("Entrez votre idJury");
        idJury.setToolTipText("");
        idJury.setName(""); // NOI18N
        idJury.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idJuryActionPerformed(evt);
            }
        });
        jPanel24.add(idJury, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 311, 40));

        jLabel145.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-donald-trump-48.png"))); // NOI18N
        jPanel24.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        noteTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        noteTextField.setForeground(new java.awt.Color(102, 102, 102));
        noteTextField.setText("Entrez votre note");
        noteTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noteTextFieldActionPerformed(evt);
            }
        });
        jPanel24.add(noteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 310, 40));

        numeroSalleTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numeroSalleTextField.setForeground(new java.awt.Color(102, 102, 102));
        numeroSalleTextField.setText("Entrez votre numero salle");
        numeroSalleTextField.setName(""); // NOI18N
        numeroSalleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroSalleTextFieldActionPerformed(evt);
            }
        });
        jPanel24.add(numeroSalleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 311, 40));

        blockSalle.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        blockSalle.setForeground(new java.awt.Color(102, 102, 102));
        blockSalle.setText("Entrez votre blockSalle");
        blockSalle.setToolTipText("");
        blockSalle.setName(""); // NOI18N
        blockSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockSalleActionPerformed(evt);
            }
        });
        jPanel24.add(blockSalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 311, 40));

        dateTextField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateTextField.setForeground(new java.awt.Color(102, 102, 102));
        dateTextField.setText("Entrez votre date");
        dateTextField.setName(""); // NOI18N
        dateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextFieldActionPerformed(evt);
            }
        });
        jPanel24.add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 311, 40));

        jLabel146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-businessman-50.png"))); // NOI18N
        jPanel24.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, 48));

        jLabel147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-businessman-48.png"))); // NOI18N
        jPanel24.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 50, 40));

        jLabel170.setBackground(new java.awt.Color(0, 0, 0));
        jLabel170.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel24.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 50, 50));

        jLabel171.setBackground(new java.awt.Color(0, 0, 0));
        jLabel171.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-id-50 (1).png"))); // NOI18N
        jPanel24.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 60, 50));

        ajout_pfe.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 500, 580));

        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/Lovepik_com-450092190-user experience flat illustration with high quality graphics (1).png"))); // NOI18N
        ajout_pfe.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 93, 388, 467));

        jButton17.setBackground(new java.awt.Color(105, 122, 152));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton17.setBorder(null);
        jButton17.setFocusable(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        ajout_pfe.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 40, 60));

        jTabbedPane1.addTab("tab3", ajout_pfe);

        affich_pfe.setBackground(new java.awt.Color(143, 200, 235));
        affich_pfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel139.setText("jLabel7");

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        affich_pfe.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jScrollPane6.setBackground(new java.awt.Color(0, 102, 255));

        jTable6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "date", "note", "numero salle", "block salle", "id jury", "id etudiant 1 ", "id eutdiant 2"
            }
        ));
        jTable6.setToolTipText("");
        jTable6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable6.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jTable6.setRowHeight(30);
        jTable6.setShowGrid(true);
        jScrollPane6.setViewportView(jTable6);

        affich_pfe.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 840, 320));

        jButton16.setBackground(new java.awt.Color(143, 200, 235));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setFocusable(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        affich_pfe.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, 70));

        jTabbedPane1.addTab("tab2", affich_pfe);

        affich_enseig.setBackground(new java.awt.Color(143, 200, 235));
        affich_enseig.setToolTipText("");
        affich_enseig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jLabel149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel149.setText("jLabel7");

        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel149, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        affich_enseig.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jScrollPane7.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane7.setBorder(null);

        jTable7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom"
            }
        ));
        jTable7.setToolTipText("");
        jTable7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable7.setIntercellSpacing(new java.awt.Dimension(5, 5));
        jTable7.setRowHeight(30);
        jScrollPane7.setViewportView(jTable7);

        affich_enseig.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 460, 270));

        jButton23.setBackground(new java.awt.Color(143, 200, 235));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton23.setBorder(null);
        jButton23.setFocusable(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        affich_enseig.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", affich_enseig);

        affich_jury.setBackground(new java.awt.Color(143, 200, 235));
        affich_jury.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));

        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel151.setText("jLabel7");

        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel152, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        affich_jury.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jScrollPane8.setBackground(new java.awt.Color(0, 102, 255));

        jTable8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "president", "rapporteur", "examinateur", "encadreur", "invite", "ID"
            }
        ));
        jTable8.setToolTipText("");
        jTable8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable8.setRowHeight(30);
        jTable8.setSurrendersFocusOnKeystroke(true);
        jScrollPane8.setViewportView(jTable8);

        affich_jury.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 670, 390));

        jButton24.setBackground(new java.awt.Color(143, 200, 235));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton24.setBorder(null);
        jButton24.setFocusable(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        affich_jury.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", affich_jury);

        supp_etud.setBackground(new java.awt.Color(143, 200, 235));
        supp_etud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setBackground(new java.awt.Color(0, 75, 142));
        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Supprimer");
        jButton10.setBorder(null);
        jButton10.setFocusable(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        supp_etud.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 40));

        idES.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idES.setName(""); // NOI18N
        idES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idESActionPerformed(evt);
            }
        });
        supp_etud.add(idES, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel153.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setText("Tapez votre ID:");
        jLabel153.setName(""); // NOI18N
        supp_etud.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jButton6.setBackground(new java.awt.Color(143, 200, 235));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        supp_etud.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 70));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));

        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel154.setText("jLabel7");

        jLabel155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supp_etud.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jLabel156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-young-woman-student-with-notebooks1.png"))); // NOI18N
        supp_etud.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 140, 400));

        jTabbedPane1.addTab("tab2", supp_etud);

        supp_jurys.setBackground(new java.awt.Color(143, 200, 235));
        supp_jurys.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton38.setBackground(new java.awt.Color(0, 75, 142));
        jButton38.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setText("Supprimer");
        jButton38.setBorder(null);
        jButton38.setFocusable(false);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        supp_jurys.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 130, 40));

        idS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idS.setName(""); // NOI18N
        idS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idSActionPerformed(evt);
            }
        });
        supp_jurys.add(idS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel157.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setText("Tapez votre ID:");
        jLabel157.setName(""); // NOI18N
        supp_jurys.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel158.setText("jLabel7");

        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supp_jurys.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/business-3d-old-businessman-in-classical-suit-and-glasses-with-coffee-mug-holding-tablet1.png"))); // NOI18N
        supp_jurys.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 160, 430));

        jButton25.setBackground(new java.awt.Color(143, 200, 235));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton25.setBorder(null);
        jButton25.setFocusable(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        supp_jurys.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", supp_jurys);

        supp_enseig.setBackground(new java.awt.Color(143, 200, 235));
        supp_enseig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton40.setBackground(new java.awt.Color(0, 75, 142));
        jButton40.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setText("Supprimer");
        jButton40.setBorder(null);
        jButton40.setFocusable(false);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        supp_enseig.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 130, 40));

        ES.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ES.setName(""); // NOI18N
        ES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESActionPerformed(evt);
            }
        });
        supp_enseig.add(ES, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel161.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setText("Tapez votre ID:");
        jLabel161.setName(""); // NOI18N
        supp_enseig.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel30.setBackground(new java.awt.Color(255, 255, 255));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel162.setText("jLabel7");

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supp_enseig.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jLabel164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/business-3d-young-man-with-coffee-standing-and-speaking1.png"))); // NOI18N
        supp_enseig.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, 140, 420));

        jButton21.setBackground(new java.awt.Color(143, 200, 235));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton21.setBorder(null);
        jButton21.setFocusable(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        supp_enseig.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 40, 70));

        jTabbedPane1.addTab("tab2", supp_enseig);

        supp_pfe.setBackground(new java.awt.Color(143, 200, 235));
        supp_pfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton41.setBackground(new java.awt.Color(0, 75, 142));
        jButton41.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setText("Supprimer");
        jButton41.setBorder(null);
        jButton41.setFocusable(false);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        supp_pfe.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 40));

        idPfeTextFieldSupprim.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idPfeTextFieldSupprim.setName(""); // NOI18N
        idPfeTextFieldSupprim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPfeTextFieldSupprimActionPerformed(evt);
            }
        });
        supp_pfe.add(idPfeTextFieldSupprim, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel165.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setText("Tapez votre ID:");
        jLabel165.setName(""); // NOI18N
        supp_pfe.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));

        jLabel166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel166.setText("jLabel7");

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        supp_pfe.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-graduation-cap-lying-on-pile-of-books.png"))); // NOI18N
        supp_pfe.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 170, 160));

        jButton15.setBackground(new java.awt.Color(143, 200, 235));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton15.setBorder(null);
        jButton15.setFocusable(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        supp_pfe.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", supp_pfe);

        rech_etud_pfe.setBackground(new java.awt.Color(143, 200, 235));
        rech_etud_pfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setBackground(new java.awt.Color(0, 75, 142));
        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Valider");
        jButton11.setBorder(null);
        jButton11.setFocusable(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        rech_etud_pfe.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 110, 40));

        idPE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        idPE.setName(""); // NOI18N
        idPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPEActionPerformed(evt);
            }
        });
        rech_etud_pfe.add(idPE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel52.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Tapez votre ID:");
        jLabel52.setName(""); // NOI18N
        rech_etud_pfe.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel57.setText("jLabel7");

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rech_etud_pfe.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/3d-business-young-woman-student-with-notebooks1.png"))); // NOI18N
        rech_etud_pfe.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, 140, 400));

        jScrollPane10.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane10.setBorder(null);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "date", "note", "numero salle", "block salle ", "id jury", "id etudiant 1", "id etudiant 2"
            }
        ));
        jTable10.setRowHeight(30);
        jScrollPane10.setViewportView(jTable10);
        Font biggerFont3 = new Font("Segoe UI", Font.BOLD, 14);
        DefaultTableCellRenderer headerRenderer3 = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                setFont(biggerFont3);
                return this;
            }
        };

        // Apply the renderer to all columns for consistency (moved before populating data)
        for (int i = 0; i < jTable10.getColumnCount(); i++) {
            jTable10.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer2);
        }

        rech_etud_pfe.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 770, 50));

        jButton45.setBackground(new java.awt.Color(143, 200, 235));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton45.setBorder(null);
        jButton45.setFocusable(false);
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        rech_etud_pfe.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", rech_etud_pfe);

        rech_enseig_pfe.setBackground(new java.awt.Color(143, 200, 235));
        rech_enseig_pfe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton42.setBackground(new java.awt.Color(0, 75, 142));
        jButton42.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("Valider");
        jButton42.setBorder(null);
        jButton42.setFocusable(false);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        rech_enseig_pfe.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 110, 40));

        eId1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        eId1.setName(""); // NOI18N
        eId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eId1ActionPerformed(evt);
            }
        });
        rech_enseig_pfe.add(eId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 360, 50));

        jLabel173.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel173.setText("Tapez votre ID:");
        jLabel173.setName(""); // NOI18N
        rech_enseig_pfe.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 220, 30));

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/pGmJGgcAUDZCgyHGMGJR (1).png"))); // NOI18N
        jLabel174.setText("jLabel7");

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/download (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rech_enseig_pfe.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 950, 180));

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/business-3d-young-man-with-coffee-standing-and-speaking1.png"))); // NOI18N
        rech_enseig_pfe.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, -1, 420));

        jScrollPane12.setBackground(new java.awt.Color(0, 102, 255));
        jScrollPane12.setBorder(null);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "date", "note", "numero salle", "block salle ", "id jury", "id etudiant 1", "id etudiant 2"
            }
        ));
        jTable12.setRowHeight(30);
        jScrollPane12.setViewportView(jTable12);
        DefaultTableCellRenderer headerRenderer4 = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setHorizontalAlignment(SwingConstants.CENTER);
                setFont(biggerFont);
                return this;
            }
        };

        // Apply the renderer to all columns for consistency (moved before populating data)
        for (int i = 0; i < jTable12.getColumnCount(); i++) {
            jTable12.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }

        rech_enseig_pfe.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 750, 140));

        jButton46.setBackground(new java.awt.Color(143, 200, 235));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8-back-50.png"))); // NOI18N
        jButton46.setBorder(null);
        jButton46.setFocusable(false);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        rech_enseig_pfe.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 40, 70));

        jTabbedPane1.addTab("tab2", rech_enseig_pfe);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -40, 990, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed
        // TODO add your handling code here:

        jTabbedPane1.setSelectedIndex(0);
        setColor(btn_1); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_3,btn_4,btn_2}, new JPanel[]{ind_3, ind_4,ind_2});
    }//GEN-LAST:event_btn_1MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed
        // TODO add your handling code here:
        if(conex){
            jTabbedPane1.setSelectedIndex(4);
            setColor(btn_3); 
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_1,btn_4}, new JPanel[]{ind_1, ind_2,ind_4});}
        
        else{
        jTabbedPane1.setSelectedIndex(1);
        setColor(btn_3); 
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_1,btn_4}, new JPanel[]{ind_1, ind_2,ind_4});}
    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(27);
        setColor(btn_4); 
        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_1}, new JPanel[]{ind_2,ind_3, ind_1});
    }//GEN-LAST:event_btn_4MousePressed
    
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
                if (usernameField.getText().equals("root") && Arrays.equals(passwordField.getPassword(), "root".toCharArray())) {
    // Switch to the AdminSpace panel
                    jTabbedPane1.setSelectedIndex(4);
                    conex=true;
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);    
                }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(27);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(conex){
            jTabbedPane1.setSelectedIndex(4);
            setColor(btn_3); 
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_1,btn_4}, new JPanel[]{ind_1, ind_2,ind_4});}
        
        else{
        jTabbedPane1.setSelectedIndex(1);
        setColor(btn_3); 
        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_1,btn_4}, new JPanel[]{ind_1, ind_2,ind_4});}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEActionPerformed

    private void sectionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionEActionPerformed

    private void niveauEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveauEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niveauEActionPerformed

    private void nameEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameEActionPerformed

    private void groupEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupEActionPerformed

    private void idEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEMActionPerformed

    private void sectionEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionEMActionPerformed

    private void niveauEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveauEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_niveauEMActionPerformed

    private void nameEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameEMActionPerformed

    private void groupEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_groupEMActionPerformed

    private void gestionPfeButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionPfeButtonAdminActionPerformed
        jTabbedPane1.setSelectedIndex(8);
        // go to gestionPfe
    }//GEN-LAST:event_gestionPfeButtonAdminActionPerformed

    private void gestionEnseignButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionEnseignButtonAdminActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_gestionEnseignButtonAdminActionPerformed

    private void gestionEtudButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionEtudButtonAdminActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_gestionEtudButtonAdminActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch(ClassNotFoundException e) {
    e.printStackTrace();
    System.out.println("JDBC Driver not found");
}
            
            
            connection = DriverManager.getConnection(url, username, password);
            // Check if the fields are empty
            if  (nameE.getText().isEmpty() || idE.getText().isEmpty() || sectionE.getText().isEmpty() || groupE.getText().isEmpty() || niveauE.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
                return;
            }
            //check if the date is valid
            // Create a DateChecker instance
            // Get the date from the dateTextField
            

            // Check if the date is valid
            
            // Check if the id is positive
            if (Integer.parseInt(idE.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "ID PFE must be Positive");
                return;
            }
            // Check if the pfe id already exists
            ResultSet result = null;
     
            // Check if the note is between 0 and 20
       
         
 
            Etudiant etudiant = new Etudiant(Integer.parseInt(idE.getText()),
                nameE.getText(),
                groupE.getText(),
                sectionE.getText(),
                Integer.parseInt(niveauE.getText()));
            EtudiantDAO EtudiantDAO = new EtudiantDAO(connection);
            EtudiantDAO.create(etudiant);
            JOptionPane.showMessageDialog(null, "succed operation");
            
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "database connection failed");
        } /*catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid infos");
        } */finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                }
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM etudiant where identifier = " + idER.getText() ;
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
           
            DefaultTableModel model = (DefaultTableModel )jTable1.getModel();
            int rowCount = model.getRowCount();

    if (rowCount > 0) {
        // Clear existing rows before adding new data
        model.setRowCount(0); // This removes all rows
    }

            JTableHeader tableHeader = jTable1.getTableHeader();
            Font biggerFont = new Font("Segoe UI", Font.BOLD, 14);

            // Create a custom renderer to avoid potential issues with the default renderer
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                    public Component getTableCellRendererComponent(JTable table, Object value,
                                                 boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setHorizontalAlignment(SwingConstants.CENTER);
                    setFont(biggerFont);
                    return this;
                }
};

                        // Apply the renderer to all columns for consistency
                        for (int i = 0; i < jTable1.getColumnCount(); i++) {
                            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                        }
            
            if (result.next()) {
                int id = result.getInt("identifier");
                String date = result.getString("name");
                String note = result.getString("groupe");
                String numeroSalle = result.getString("section");
                int blockSalle = result.getInt("niveau");
                
                //Pfe pfe = new Pfe(id, date, note, numeroSalle, blockSalle, idJury, idEtudiant1, idEtudiant2);
                model.addRow( new Object [] { id , date , note , numeroSalle , blockSalle });
                
            }
            else{
                JOptionPane.showMessageDialog(null, "etudiant not found");
            }

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void gestionJuryButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionJuryButtonAdminActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_gestionJuryButtonAdminActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        jPanel12.requestFocus();
        jTabbedPane1.setSelectedIndex(2);
        
        
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void idERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idERActionPerformed

    private void affichPfeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affichPfeButtActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(20);
                
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM pfe";
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
           
            DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
            int rowCount = model.getRowCount();

    if (rowCount > 0) {
        // Clear existing rows before adding new data
        model.setRowCount(0); // This removes all rows
    }

            JTableHeader tableHeader = jTable6.getTableHeader();
            Font biggerFont = new Font("Segoe UI", Font.BOLD, 14);

            // Create a custom renderer to avoid potential issues with the default renderer
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                    public Component getTableCellRendererComponent(JTable table, Object value,
                                                 boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setHorizontalAlignment(SwingConstants.CENTER);
                    setFont(biggerFont);
                    return this;
                }
};

                        // Apply the renderer to all columns for consistency
                        for (int i = 0; i < jTable6.getColumnCount(); i++) {
                            jTable6.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                        }

            
            while (result.next()) {
                int id = result.getInt("id");
                String date = result.getString("date");
                float note = result.getFloat("note");
                int numeroSalle = result.getInt("numeroSalle");
                String blockSalle = result.getString("blockSalle");
                int idJury = result.getInt("idjurys");
                int idEtudiant1 = result.getInt("idEtudiant1");
                int idEtudiant2 = result.getInt("idEtudiant2");
                //Pfe pfe = new Pfe(id, date, note, numeroSalle, blockSalle, idJury, idEtudiant1, idEtudiant2);
                model.addRow( new Object [] { id , date , note , numeroSalle , blockSalle , idJury , idEtudiant1 , idEtudiant2});
                
            }
            
            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_affichPfeButtActionPerformed

    private void modifPfeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifPfeButtActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(18);
    }//GEN-LAST:event_modifPfeButtActionPerformed

    private void rechercherPfeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherPfeButtonActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(11);
    }//GEN-LAST:event_rechercherPfeButtonActionPerformed

    private void supprimerPfeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerPfeButtActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(26);
    }//GEN-LAST:event_supprimerPfeButtActionPerformed

    private void ajouterPfeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterPfeAdminActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(19);
    }//GEN-LAST:event_ajouterPfeAdminActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM enseignant where id = " + eId.getText() ;
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
           
             DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
    int rowCount = model.getRowCount();

    if (rowCount > 0) {
        // Clear existing rows before adding new data
        model.setRowCount(0); // This removes all rows
    }

    // ... (your existing code to execute the query and populate the table)

    if (result.next()) {
        int id = result.getInt("id");
        String name = result.getString("name");

        // Add new row
        model.addRow(new Object[]{id, name});
    } else {
        JOptionPane.showMessageDialog(null, "Enseignant not found");
    }

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }//GEN-LAST:event_jButton31ActionPerformed

    private void eIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eIdActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            Font biggerFont = new Font("Segoe UI", Font.BOLD, 14);

            // Create a custom renderer to avoid potential issues with the default renderer
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                    public Component getTableCellRendererComponent(JTable table, Object value,
                                                 boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setHorizontalAlignment(SwingConstants.CENTER);
                    setFont(biggerFont);
                    return this;
                }
};

                        // Apply the renderer to all columns for consistency
                        for (int i = 0; i < jTable4.getColumnCount(); i++) {
                            jTable4.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                        }
            String query = "SELECT * FROM jurys where id = " + idJ.getText() ;
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
           
            DefaultTableModel model = (DefaultTableModel )jTable4.getModel();
            int rowCount = model.getRowCount();

    if (rowCount > 0) {
        // Clear existing rows before adding new data
        model.setRowCount(0); // This removes all rows
    }

            
            
            
            if (result.next()) {
                int president = result.getInt("president");
                int rapporteur = result.getInt("rapporteur");
                int examinateur = result.getInt("examinateur");
                int encadreur = result.getInt("encadreur");
                int invite = result.getInt("invite");
                int id = result.getInt("id");
                
                //Pfe pfe = new Pfe(id, date, note, numeroSalle, blockSalle, idJury, idEtudiant1, idEtudiant2);
                model.addRow( new Object [] { president , rapporteur , examinateur , encadreur , invite , id });
                
            }
            else{
                JOptionPane.showMessageDialog(null, "jury not found");
            }

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton32ActionPerformed

    private void idJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idJActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
                        
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            Font biggerFont = new Font("Segoe UI", Font.BOLD, 14);

            // Create a custom renderer to avoid potential issues with the default renderer
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                    public Component getTableCellRendererComponent(JTable table, Object value,
                                                 boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setHorizontalAlignment(SwingConstants.CENTER);
                    setFont(biggerFont);
                    return this;
                }
};
                        // Apply the renderer to all columns for consistency
                         for (int i = 0; i < jTable5.getColumnCount(); i++) {
                            jTable5.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                        }            
            String query = "SELECT * FROM pfe where id = " + idPfeRecherche.getText() ;
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
            


            DefaultTableModel model = (DefaultTableModel )jTable5.getModel();
            int rowCount = model.getRowCount();

    if (rowCount > 0) {
        // Clear existing rows before adding new data
        model.setRowCount(0); // This removes all rows
    }

            

            
            if (result.next()) {
                int id = result.getInt("id");
                String date = result.getString("date");
                float note = result.getFloat("note");
                int numeroSalle = result.getInt("numeroSalle");
                String blockSalle = result.getString("blockSalle");
                int idJury = result.getInt("idjurys");
                int idEtudiant1 = result.getInt("idEtudiant1");
                int idEtudiant2 = result.getInt("idEtudiant2");
                //Pfe pfe = new Pfe(id, date, note, numeroSalle, blockSalle, idJury, idEtudiant1, idEtudiant2);
                model.addRow( new Object [] { id , date , note , numeroSalle , blockSalle , idJury , idEtudiant1 , idEtudiant2});
               
            }
            else{
                JOptionPane.showMessageDialog(null, "pfe not found");
            }

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton33ActionPerformed

    private void idPfeRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPfeRechercheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPfeRechercheActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch(ClassNotFoundException e) {
    e.printStackTrace();
    System.out.println("JDBC Driver not found");
}
            
            
            connection = DriverManager.getConnection(url, username, password);
            // Check if the fields are empty
            if  (nameEM.getText().isEmpty() || idEM.getText().isEmpty() || sectionEM.getText().isEmpty() || groupEM.getText().isEmpty() || niveauEM.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
                return;
            }
            //check if the date is valid
            // Create a DateChecker instance
            // Get the date from the dateTextField
            

            // Check if the date is valid
            
            // Check if the id is positive
            if (Integer.parseInt(idEM.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "ID PFE must be Positive");
                return;
            }
            // Check if the pfe id already exists
            ResultSet result = null;
     
            // Check if the note is between 0 and 20
       
         
 
            Etudiant etudiant = new Etudiant(Integer.parseInt(idEM.getText()),
                nameEM.getText(),
                groupEM.getText(),
                sectionEM.getText(),
                Integer.parseInt(niveauEM.getText()));
            EtudiantDAO EtudiantDAO = new EtudiantDAO(connection);
            EtudiantDAO.update(etudiant);
            JOptionPane.showMessageDialog(null, "succed operation");
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "database connection failed");
        } /*catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid infos");
        } */finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                }
            }
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void presidentMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presidentMActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_presidentMActionPerformed

    private void rapporteurMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rapporteurMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rapporteurMActionPerformed

    private void encadreurMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encadreurMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encadreurMActionPerformed

    private void inviteMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviteMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inviteMActionPerformed

    private void examinateurMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinateurMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examinateurMActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch(ClassNotFoundException e) {
    e.printStackTrace();
    System.out.println("JDBC Driver not found");
}
            
            
            connection = DriverManager.getConnection(url, username, password);
            // Check if the fields are empty
            if  (presidentM.getText().isEmpty() || idM.getText().isEmpty() || examinateurM.getText().isEmpty() || inviteM.getText().isEmpty() || encadreurM.getText().isEmpty() || rapporteurM.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
                return;
            }
            //check if the date is valid
            // Create a DateChecker instance
            // Get the date from the dateTextField
            

            // Check if the date is valid
            
            // Check if the id is positive
            if (Integer.parseInt(idM.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "ID PFE must be Positive");
                return;
            }
            // Check if the pfe id already exists
            ResultSet result = null;
     
            // Check if the note is between 0 and 20
       
         
 
            Jurys Jurys = new Jurys(Integer.parseInt(idM.getText()),
                Integer.parseInt(rapporteurM.getText()),
                Integer.parseInt(examinateurM.getText()),
                Integer.parseInt(encadreurM.getText()),
                Integer.parseInt(presidentM.getText()) , 
                Integer.parseInt(inviteM.getText()) 
                );
                    
           
            JurysDAO JurysDAO = new JurysDAO(connection);
            JurysDAO.update(Jurys);
            JOptionPane.showMessageDialog(null, "succed operation");
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "database connection failed");
        } /*catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid infos");
        } */finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                }
            }
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void idMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMActionPerformed

    private void presidentAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presidentAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_presidentAActionPerformed

    private void idAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAActionPerformed

    private void rapporteurAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rapporteurAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rapporteurAActionPerformed

    private void encadreurAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encadreurAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encadreurAActionPerformed

    private void inviteAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviteAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inviteAActionPerformed

    private void examinateurAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinateurAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_examinateurAActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch(ClassNotFoundException e) {
    e.printStackTrace();
    System.out.println("JDBC Driver not found");
}
            
            
            connection = DriverManager.getConnection(url, username, password);
            // Check if the fields are empty
            if  (presidentA.getText().isEmpty() || idA.getText().isEmpty() || examinateurA.getText().isEmpty() || inviteA.getText().isEmpty() || encadreurA.getText().isEmpty() || rapporteurA.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
                return;
            }
            //check if the date is valid
            // Create a DateChecker instance
            // Get the date from the dateTextField
            

            // Check if the date is valid
            
            // Check if the id is positive
            if (Integer.parseInt(idA.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "ID PFE must be Positive");
                return;
            }
            // Check if the pfe id already exists
            ResultSet result = null;
     
            // Check if the note is between 0 and 20
       
         
 
            Jurys Jurys = new Jurys(Integer.parseInt(idA.getText()),
                Integer.parseInt(rapporteurA.getText()),
                Integer.parseInt(examinateurA.getText()),
                Integer.parseInt(encadreurA.getText()),
                Integer.parseInt(presidentA.getText()) , 
                Integer.parseInt(inviteA.getText()) 
                );
                    
           
            JurysDAO JurysDAO = new JurysDAO(connection);
            JurysDAO.create(Jurys);
            JOptionPane.showMessageDialog(null, "succed operation");
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "database connection failed");
        } /*catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid infos");
        } */finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                }
            }
        }

    }//GEN-LAST:event_jButton36ActionPerformed

    private void EnIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnIdActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch(ClassNotFoundException e) {
    e.printStackTrace();
    System.out.println("JDBC Driver not found");
}
            
            
            connection = DriverManager.getConnection(url, username, password);
            // Check if the fields are empty
            if  (EnName.getText().isEmpty() || EnId.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
                return;
            }
            //check if the date is valid
            // Create a DateChecker instance
            // Get the date from the dateTextField
            

            // Check if the date is valid
            
            // Check if the id is positive
            if (Integer.parseInt(EnId.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "ID enseignant must be Positive");
                return;
            }
            // Check if the pfe id already exists
            ResultSet result = null;
     
            // Check if the note is between 0 and 20
       
         
 
            Enseignant Enseignant = new Enseignant(Integer.parseInt(EnId.getText()),
                EnName.getText()
                );
            EnseignantDAO EnseignantDAO = new EnseignantDAO(connection);
            EnseignantDAO.create(Enseignant);
            JOptionPane.showMessageDialog(null, "succed operation");
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "database connection failed");
        } /*catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid infos");
        } */finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                }
            }
        }
    }//GEN-LAST:event_jButton37ActionPerformed

    private void EnNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnNameActionPerformed

    private void EnNameMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnNameMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnNameMActionPerformed

    private void EnIdMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnIdMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnIdMActionPerformed

    private void idPfeModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPfeModifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPfeModifActionPerformed

    private void idJuryModifAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idJuryModifAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idJuryModifAdmActionPerformed

    private void notePfeModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notePfeModifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notePfeModifActionPerformed

    private void numSalleModifAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSalleModifAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numSalleModifAdmActionPerformed

    private void blockModifAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockModifAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockModifAdmActionPerformed

    private void datePfeModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePfeModifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datePfeModifActionPerformed

    private void idEtud2ModifAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEtud2ModifAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEtud2ModifAdmActionPerformed

    private void etud1ModifAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etud1ModifAdmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etud1ModifAdmActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch(ClassNotFoundException e) {
    e.printStackTrace();
    System.out.println("JDBC Driver not found");
}
            
            
            connection = DriverManager.getConnection(url, username, password);
            // Check if the fields are empty
            if  (EnNameM.getText().isEmpty() || EnIdM.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
                return;
            }
            //check if the date is valid
            // Create a DateChecker instance
            // Get the date from the dateTextField
            

            // Check if the date is valid
            
            // Check if the id is positive
            if (Integer.parseInt(EnIdM.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "ID enseignant must be Positive");
                return;
            }
            // Check if the pfe id already exists
            ResultSet result = null;
     
            // Check if the note is between 0 and 20
       
         
 
            Enseignant Enseignant = new Enseignant(Integer.parseInt(EnIdM.getText()),
                EnNameM.getText()
                );
            EnseignantDAO EnseignantDAO = new EnseignantDAO(connection);
            EnseignantDAO.update(Enseignant);
            JOptionPane.showMessageDialog(null, "succed operation");
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "database connection failed");
        } /*catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid infos");
        } */finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                }
            }
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void modifFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifFormButtonActionPerformed
            // TODO add your handling code here:
        Connection connection = null;
        try {
                    String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
                    String username = "root";
                    String password = "halimsql123";
                    connection = DriverManager.getConnection(url, username, password);
                    // Check if the fields are empty
                    if (idPfeModif.getText().isEmpty() || notePfeModif.getText().isEmpty()
                            || datePfeModif.getText().isEmpty() || numSalleModifAdm.getText().isEmpty()
                            || blockModifAdm.getText().isEmpty() || idJuryModifAdm.getText().isEmpty()
                            || etud1ModifAdm.getText().isEmpty() || idEtud2ModifAdm.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields");
                        return;
                    }
                    // Check if the id is positive
                    if (Integer.parseInt(idPfeModif.getText()) < 0) {
                        JOptionPane.showMessageDialog(null, "ID PFE must be Positive");
                        return;
                    }
                    // Check if the pfe id already exists
                    ResultSet result = null;
                    try {
                        Statement state = (Statement) connection.createStatement();
                        String query = "SELECT * FROM pfe WHERE id = " + Integer.parseInt(idPfeModif.getText());
                        result = ((java.sql.Statement) state).executeQuery(query);

                        if (!result.next()) {
                            JOptionPane.showMessageDialog(null, "ID Pfe not found");
                            return;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error while finding a pfe");
                    }
                    // Check if the note is between 0 and 20
                    if (Float.parseFloat(notePfeModif.getText()) > 20
                            || Float.parseFloat(notePfeModif.getText()) < 0) {
                        JOptionPane.showMessageDialog(null, "Note must be between 0 and 20");
                        return;
                    }
                    // Check if the id jury exists
                    try {
                        Statement state = (Statement) connection.createStatement();
                        String queryJury = "SELECT * FROM jurys WHERE id = "
                                + Integer.parseInt(idJuryModifAdm.getText());
                        result = ((java.sql.Statement) state).executeQuery(queryJury);

                        if (!result.next()) {
                            JOptionPane.showMessageDialog(null, "there is no jury with this id");
                            return;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error while finding a jury in order to verify the id");
                    }
                    // Check if the id etudiant 1 exists
                    try {
                        Statement state = (Statement) connection.createStatement();
                        String queryEtud1 = "SELECT * FROM etudiant WHERE id = "
                                + Integer.parseInt(etud1ModifAdm.getText());
                        result = ((java.sql.Statement) state).executeQuery(queryEtud1);

                        if (!result.next()) {
                            JOptionPane.showMessageDialog(null,
                                    "there is no etudiant with this id , try another id etudiant 1");
                            return;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        
                    
                    }
                    
                    // Check if the id etudiant 2 exists
                    try {
                        Statement state = (Statement) connection.createStatement();
                        String queryJury = "SELECT * FROM etudiant WHERE id = "
                                + Integer.parseInt(idEtud2ModifAdm.getText());
                        result = ((java.sql.Statement) state).executeQuery(queryJury);

                        if (!result.next()) {
                            JOptionPane.showMessageDialog(null,
                                    "there is no etudiant with this id , try another id etudiant 2");
                            return;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        
                    }
                    // Check if the salle is valid
                    try {
                        Statement state = (Statement) connection.createStatement();
                        String queryJury = "SELECT * FROM salle WHERE numero = "
                                + Integer.parseInt(numSalleModifAdm.getText()) + " AND block = '"
                                + blockModifAdm.getText() + "'";
                        result = ((java.sql.Statement) state).executeQuery(queryJury);

                        if (!result.next()) {
                            JOptionPane.showMessageDialog(null,
                                    "there is no salle with this numero and block , try another salle");
                            return;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null,
                                "Error while finding a salle in order to verify the block and the numero");
                    }

                    PfeDAO pfeDAO = new PfeDAO(connection);
                    Pfe pfe = new Pfe(Integer.parseInt(idPfeModif.getText()),
                            datePfeModif.getText(),
                            Float.parseFloat(notePfeModif.getText()),
                            Integer.parseInt(numSalleModifAdm.getText()),
                            blockModifAdm.getText(),
                            Integer.parseInt(idJuryModifAdm.getText()),
                            Integer.parseInt(etud1ModifAdm.getText()),
                            Integer.parseInt(idEtud2ModifAdm.getText()));
                    pfeDAO.update(pfe);
                    JOptionPane.showMessageDialog(null, "succed operation");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid infos");
                } finally {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "database connection failed");
                        }
                    }
                }
    }//GEN-LAST:event_modifFormButtonActionPerformed

    private void idEtud2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEtud2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEtud2ActionPerformed

    private void idEtud1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idEtud1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idEtud1ActionPerformed

    private void idPfeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPfeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPfeTextFieldActionPerformed

    private void idJuryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idJuryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idJuryActionPerformed

    private void noteTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noteTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noteTextFieldActionPerformed

    private void numeroSalleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroSalleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroSalleTextFieldActionPerformed

    private void blockSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockSalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockSalleActionPerformed

    private void dateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void ajouterPfeButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterPfeButtActionPerformed
        Connection connection = null;

        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            try {
    Class.forName("com.mysql.cj.jdbc.Driver");
} catch(ClassNotFoundException e) {
    e.printStackTrace();
    System.out.println("JDBC Driver not found");
}
            
            
            connection = DriverManager.getConnection(url, username, password);
            // Check if the fields are empty
            if  (idPfeTextField.getText().isEmpty() || noteTextField.getText().isEmpty() || dateTextField.getText().isEmpty() || numeroSalleTextField.getText().isEmpty() || blockSalle.getText().isEmpty() || idJury.getText().isEmpty() || idEtud1.getText().isEmpty() || idEtud2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
                return;
            }
            //check if the date is valid
            // Create a DateChecker instance
            // Get the date from the dateTextField
            String date = dateTextField.getText();

            // Check if the date is valid
            
            // Check if the id is positive
            if (Integer.parseInt(idPfeTextField.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "ID PFE must be Positive");
                return;
            }
            // Check if the pfe id already exists
            ResultSet result = null;
            try {
                Statement state = (Statement) connection.createStatement();
                String query = "SELECT * FROM pfe WHERE id = " + Integer.parseInt(idPfeTextField.getText());
                result = ((java.sql.Statement) state).executeQuery(query);

                if (result.next()) {
                    JOptionPane.showMessageDialog(null, "ID Pfe used");
                    return;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error while finding a pfe");
            }
            // Check if the note is between 0 and 20
            if(Float.parseFloat(noteTextField.getText())>20 || Float.parseFloat(noteTextField.getText())<0){
                JOptionPane.showMessageDialog(null, "Note must be between 0 and 20");
                return;
            }
            // Check if the id jury exists
            try {
                Statement state = (Statement) connection.createStatement();
                String queryJury = "SELECT * FROM jurys WHERE id = " + Integer.parseInt(idJury.getText());
                result = ((java.sql.Statement) state).executeQuery(queryJury);

                if (!result.next()) {
                    JOptionPane.showMessageDialog(null, "there is no jury with this id");
                    return;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error while finding a jury in order to verify the id");
            }
            // Check if the id etudiant 1 exists
            try {
                Statement state = (Statement) connection.createStatement();
                String queryEtud1 = "SELECT * FROM etudiant WHERE id = " + Integer.parseInt(idEtud1.getText());
                result = ((java.sql.Statement) state).executeQuery(queryEtud1);

                if (!result.next()) {
                    JOptionPane.showMessageDialog(null, "there is no etudiant with this id , try another id etudiant 1");
                    return;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                
            }
            // Check if the id etudiant 2 exists
            try {
                Statement state = (Statement) connection.createStatement();
                String queryJury = "SELECT * FROM etudiant WHERE id = " + Integer.parseInt(idEtud2.getText());
                result = ((java.sql.Statement) state).executeQuery(queryJury);

                if (!result.next()) {
                    JOptionPane.showMessageDialog(null, "there is no etudiant with this id , try another id etudiant 2");
                    return;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                
            }
            // Check if the salle is valid
            try {
                Statement state = (Statement) connection.createStatement();
                String queryJury = "SELECT * FROM salle WHERE numero = " + Integer.parseInt(numeroSalleTextField.getText()) + " AND block = '" + blockSalle.getText() + "'";
                result = ((java.sql.Statement) state).executeQuery(queryJury);

                if (!result.next()) {
                    JOptionPane.showMessageDialog(null, "there is no salle with this numero and block , try another salle");
                    return;
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error while finding a salle in order to verify the block and the numero");
            }

            Pfe pfe = new Pfe(Integer.parseInt(idPfeTextField.getText()),
                dateTextField.getText(),
                Float.parseFloat(noteTextField.getText()),
                Integer.parseInt(numeroSalleTextField.getText()),
                blockSalle.getText(),
                Integer.parseInt(idJury.getText()),
                Integer.parseInt(idEtud1.getText()),
                Integer.parseInt(idEtud2.getText()));
            PfeDAO pfeDAO = new PfeDAO(connection);
            pfeDAO.create(pfe);
            JOptionPane.showMessageDialog(null, "succed operation");
            

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "database connection failed");
        } /*catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid infos");
        } */finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                }
            }
        }
    }//GEN-LAST:event_ajouterPfeButtActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
                // Add the missing import statements above

                try {
                    String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC"; // Update the database name and remove spaces
                    String username = "root";
                    String password = "halimsql123";
                    connection = DriverManager.getConnection(url, username, password);
                    // Check if the fields are empty
                    if (idES.getText().isEmpty()  )  {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields");
                        return;
                    }
                    // Check if the id is positive
                    if (Integer.parseInt(idES.getText()) < 0) {
                        JOptionPane.showMessageDialog(null, "ID etudiant must be Positive");
                        return;
                    }
                    EtudiantDAO EtudiantDAO = new EtudiantDAO(connection);
                    //System.out.println("find state:" + EtudiantDAO.find(Integer.parseInt(idES.getText())));
                    if (EtudiantDAO.find(Integer.parseInt(idES.getText()))) {
                        EtudiantDAO.delete(Integer.parseInt(idES.getText()));
                        JOptionPane.showMessageDialog(null, "etudiant supprimé avec succès");
                    } else {
                        JOptionPane.showMessageDialog(null, "etudiant not found");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid ID");
                }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void idESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idESActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
                // Add the missing import statements above

                try {
                    String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC"; // Update the database name and remove spaces
                    String username = "root";
                    String password = "halimsql123";
                    connection = DriverManager.getConnection(url, username, password);
                    // Check if the fields are empty
                    if (idS.getText().isEmpty()  )  {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields");
                        return;
                    }
                    // Check if the id is positive
                    if (Integer.parseInt(idS.getText()) < 0) {
                        JOptionPane.showMessageDialog(null, "ID jury must be Positive");
                        return;
                    }
                    JurysDAO JurysDAO = new JurysDAO(connection);
                    //System.out.println("find state:" + EtudiantDAO.find(Integer.parseInt(idES.getText())));
                    if (JurysDAO.find(Integer.parseInt(idS.getText()))) {
                        JurysDAO.delete(Integer.parseInt(idS.getText()));
                        JOptionPane.showMessageDialog(null, " jury supprimé avec succès");
                    } else {
                        JOptionPane.showMessageDialog(null, "jury not found");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid ID");
                }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void idSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idSActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
                // Add the missing import statements above

                try {
                    String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC"; // Update the database name and remove spaces
                    String username = "root";
                    String password = "halimsql123";
                    connection = DriverManager.getConnection(url, username, password);
                    // Check if the fields are empty
                    if (ES.getText().isEmpty()  )  {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields");
                        return;
                    }
                    // Check if the id is positive
                    if (Integer.parseInt(ES.getText()) < 0) {
                        JOptionPane.showMessageDialog(null, "ID enseignant must be Positive");
                        return;
                    }
                    EnseignantDAO EnseignantDAO = new EnseignantDAO(connection);
                    //System.out.println("find state:" + EtudiantDAO.find(Integer.parseInt(idES.getText())));
                    if (EnseignantDAO.find(Integer.parseInt(ES.getText()))) {
                        EnseignantDAO.delete(Integer.parseInt(ES.getText()));
                        JOptionPane.showMessageDialog(null, "enseignant supprimé avec succès");
                    } else {
                        JOptionPane.showMessageDialog(null, "enseignant not found");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid ID");
                }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void ESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ESActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
                Connection connection = null;
                // Add the missing import statements above

                try {
                    String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC"; // Update the database name and remove spaces
                    String username = "root";
                    String password = "halimsql123";
                    connection = DriverManager.getConnection(url, username, password);
                    // Check if the fields are empty
                    if (idPfeTextFieldSupprim.getText().isEmpty()  )  {
                        JOptionPane.showMessageDialog(null, "Please fill all the fields");
                        return;
                    }
                    // Check if the id is positive
                    if (Integer.parseInt(idPfeTextFieldSupprim.getText()) < 0) {
                        JOptionPane.showMessageDialog(null, "ID PFE must be Positive");
                        return;
                    }
                    PfeDAO pfeDAO = new PfeDAO(connection);
                    System.out.println("find state:" + pfeDAO.find(Integer.parseInt(idPfeTextFieldSupprim.getText())));
                    if (pfeDAO.find(Integer.parseInt(idPfeTextFieldSupprim.getText()))) {
                        pfeDAO.delete(Integer.parseInt(idPfeTextFieldSupprim.getText()));
                        JOptionPane.showMessageDialog(null, "PFE supprimé avec succès");
                    } else {
                        JOptionPane.showMessageDialog(null, "PFE not found");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "database connection failed");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid ID");
                }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void idPfeTextFieldSupprimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPfeTextFieldSupprimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPfeTextFieldSupprimActionPerformed

    private void rechercherPfeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherPfeButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(12);
    }//GEN-LAST:event_rechercherPfeButton1ActionPerformed

    private void supprimerPfeButt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerPfeButt1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(23);
    }//GEN-LAST:event_supprimerPfeButt1ActionPerformed

    private void affichPfeButt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affichPfeButt1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(13);
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM etudiant";
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
           
            DefaultTableModel model = (DefaultTableModel )jTable2.getModel();
            JTableHeader tableHeader = jTable2.getTableHeader();
            
            int rowCount = model.getRowCount();

                if (rowCount > 0) {
                    // Clear existing rows before adding new data
                    model.setRowCount(0); // This removes all rows
                }

            Font biggerFont = new Font("Segoe UI", Font.BOLD, 14);

            // Create a custom renderer to avoid potential issues with the default renderer
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                    public Component getTableCellRendererComponent(JTable table, Object value,
                                                 boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setHorizontalAlignment(SwingConstants.CENTER);
                    setFont(biggerFont);
                    return this;
                }
};

                        // Apply the renderer to all columns for consistency
                        for (int i = 0; i < jTable2.getColumnCount(); i++) {
                            jTable2.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                        }
            
            
            
            while (result.next()) {
                int id = result.getInt("identifier");
                String date = result.getString("name");
                String note = result.getString("groupe");
                String numeroSalle = result.getString("section");
                int blockSalle = result.getInt("niveau");
                
                //Pfe pfe = new Pfe(id, date, note, numeroSalle, blockSalle, idJury, idEtudiant1, idEtudiant2);
                model.addRow( new Object [] { id , date , note , numeroSalle , blockSalle});
                
            }

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_affichPfeButt1ActionPerformed

    private void ajouterJuryAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterJuryAdminActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(15);
    }//GEN-LAST:event_ajouterJuryAdminActionPerformed

    private void rechercherJuryButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherJuryButtActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(10);
    }//GEN-LAST:event_rechercherJuryButtActionPerformed

    private void supprimerJuryButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerJuryButtActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(24);  
    }//GEN-LAST:event_supprimerJuryButtActionPerformed

    private void modifJuryButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifJuryButtActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(14);
    }//GEN-LAST:event_modifJuryButtActionPerformed

    private void affichJuryButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affichJuryButtActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(22);
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM jurys";
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
           
            DefaultTableModel model = (DefaultTableModel )jTable8.getModel();
            int rowCount = model.getRowCount();

    if (rowCount > 0) {
        // Clear existing rows before adding new data
        model.setRowCount(0); // This removes all rows
    }

            JTableHeader tableHeader = jTable8.getTableHeader();
            Font biggerFont = new Font("Segoe UI", Font.BOLD, 14);

            // Create a custom renderer to avoid potential issues with the default renderer
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                    public Component getTableCellRendererComponent(JTable table, Object value,
                                                 boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setHorizontalAlignment(SwingConstants.CENTER);
                    setFont(biggerFont);
                    return this;
                }
};

                        // Apply the renderer to all columns for consistency
                        for (int i = 0; i < jTable8.getColumnCount(); i++) {
                            jTable8.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                        }
            
            while (result.next()) {
                int president = result.getInt("president");
                int  rapporteur = result.getInt("rapporteur");
                int  examinateur = result.getInt("examinateur");
                int  encadreur = result.getInt("encadreur");
                int invite = result.getInt("invite");
                int id = result.getInt("id");
                
                //Pfe pfe = new Pfe(id, date, note, numeroSalle, blockSalle, idJury, idEtudiant1, idEtudiant2);
                model.addRow( new Object [] { president , rapporteur , examinateur , encadreur , invite , id});
                
            }

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_affichJuryButtActionPerformed

    private void ajouterJuryAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterJuryAdmin1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(16);
    }//GEN-LAST:event_ajouterJuryAdmin1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(28);
    }//GEN-LAST:event_jButton2MouseClicked

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(28);
        setColor(btn_2); 
        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_3, btn_4}, new JPanel[]{ind_1, ind_3, ind_4});
    }//GEN-LAST:event_btn_2MouseClicked

    private void modifPfeButt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifPfeButt1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_modifPfeButt1ActionPerformed

    private void modifPfeButt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifPfeButt2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(17);
    }//GEN-LAST:event_modifPfeButt2ActionPerformed

    private void rechercherPfeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherPfeButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_rechercherPfeButton2ActionPerformed

    private void affichPfeButt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affichPfeButt2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(21);
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM enseignant";
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
           
            DefaultTableModel model = (DefaultTableModel )jTable7.getModel();
            int rowCount = model.getRowCount();

                if (rowCount > 0) {
        // Clear existing rows before adding new data
                 model.setRowCount(0); // This removes all rows
                }

            JTableHeader tableHeader = jTable7.getTableHeader();
            Font biggerFont = new Font("Segoe UI", Font.BOLD, 14);

            // Create a custom renderer to avoid potential issues with the default renderer
            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
                @Override
                    public Component getTableCellRendererComponent(JTable table, Object value,
                                                 boolean isSelected, boolean hasFocus, int row, int column) {
                    super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                    setHorizontalAlignment(SwingConstants.CENTER);
                    setFont(biggerFont);
                    return this;
                }
};

                        // Apply the renderer to all columns for consistency
                        for (int i = 0; i < jTable7.getColumnCount(); i++) {
                            jTable7.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
                        }
            
            while (result.next()) {
                int id = result.getInt("id");
                String  name = result.getString("name");

                model.addRow( new Object [] { id , name });
                
            }

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_affichPfeButt2ActionPerformed

    private void supprimerPfeButt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerPfeButt2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(25);
    }//GEN-LAST:event_supprimerPfeButt2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            String queryRecherche = "SELECT * FROM etudiant  WHERE identifier = ?";
            PreparedStatement pstmt2 = connection.prepareStatement(queryRecherche);
            pstmt2.setString(1, idPE.getText());
            ResultSet result2 = pstmt2.executeQuery();
            if (!result2.next()) {
                JOptionPane.showMessageDialog(null, "n'existe pas un etudiant avec ce id ");
            }
            String query = "SELECT * FROM pfe WHERE idetudiant1 = " + idPE.getText() + " OR idetudiant2 = " + idPE.getText();
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(query);

            // Create a table to display the results
           
            DefaultTableModel model = (DefaultTableModel )jTable10.getModel();
            int rowCount = model.getRowCount();

    if (rowCount > 0) {
        // Clear existing rows before adding new data
        model.setRowCount(0); // This removes all rows
    }

            
            if (result.next()) {
                int id = result.getInt("id");
                String date = result.getString("date");
                float note = result.getFloat("note");
                int numeroSalle = result.getInt("numeroSalle");
                String blockSalle = result.getString("blockSalle");
                int idJury = result.getInt("idjurys");
                int idEtudiant1 = result.getInt("idEtudiant1");
                int idEtudiant2 = result.getInt("idEtudiant2");
                //Pfe pfe = new Pfe(id, date, note, numeroSalle, blockSalle, idJury, idEtudiant1, idEtudiant2);
                model.addRow( new Object [] { id , date , note , numeroSalle , blockSalle , idJury , idEtudiant1 , idEtudiant2});
                
            }
            else{
                JOptionPane.showMessageDialog(null, "ce etudiant n'admet pas un pfe");
            }

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void idPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPEActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/etudiant?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "halimsql123";
            connection = DriverManager.getConnection(url, username, password);
            String queryRecherche = "SELECT * FROM enseignant  WHERE id = ?";
            PreparedStatement pstmt2 = connection.prepareStatement(queryRecherche);
            pstmt2.setString(1, eId1.getText());
            ResultSet result2 = pstmt2.executeQuery();
            if (!result2.next()) {
                JOptionPane.showMessageDialog(null, "n'existe pas un enseignant avec ce id ");
            }
            String query = "SELECT * FROM pfe INNER JOIN jurys WHERE encadreur = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setString(1, eId1.getText());
            ResultSet result = pstmt.executeQuery();
            if (!result.next()) {
                JOptionPane.showMessageDialog(null, "ce enseignant n'encadre pas aucun etudiant");
            }

            // Create a table to display the results
           
            DefaultTableModel model = (DefaultTableModel )jTable12.getModel();
            int rowCount = model.getRowCount();

    if (rowCount > 0) {
        // Clear existing rows before adding new data
        model.setRowCount(0); // This removes all rows
    }

            
            while (result.next()) {
                int id = result.getInt("id");
                String date = result.getString("date");
                float note = result.getFloat("note");
                int numeroSalle = result.getInt("numeroSalle");
                String blockSalle = result.getString("blockSalle");
                int idJury = result.getInt("idjurys");
                int idEtudiant1 = result.getInt("idEtudiant1");
                int idEtudiant2 = result.getInt("idEtudiant2");
                //Pfe pfe = new Pfe(id, date, note, numeroSalle, blockSalle, idJury, idEtudiant1, idEtudiant2);
                model.addRow( new Object [] { id , date , note , numeroSalle , blockSalle , idJury , idEtudiant1 , idEtudiant2});
                
            }
            

            

            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }//GEN-LAST:event_jButton42ActionPerformed

    private void eId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eId1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
        idE.setText("Entrez votre Identifiant");
            idE.setForeground(new Color(102,102,102));
            nameE.setText("Entrez votre nom");
            nameE.setForeground(new Color(102, 102, 102));

            niveauE.setText("Entrez votre niveau");
            niveauE.setForeground(new Color(102, 102, 102));

            groupE.setText("Entrez votre groupe");
            groupE.setForeground(new Color(102, 102, 102));

            sectionE.setText("Entrez votre section");
            sectionE.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
        idEM.setText("Entrez votre Identifiant");
            idEM.setForeground(new Color(102,102,102));
            nameEM.setText("Entrez votre nom");
            nameEM.setForeground(new Color(102, 102, 102));

            niveauEM.setText("Entrez votre niveau");
            niveauEM.setForeground(new Color(102, 102, 102));

            groupEM.setText("Entrez votre groupe");
            groupEM.setForeground(new Color(102, 102, 102));

            sectionEM.setText("Entrez votre section");
            sectionEM.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
        idA.setText("Entrez votre Identifiant");
idA.setForeground(new Color(102, 102, 102));

inviteA.setText("Entrez votre invitation");
inviteA.setForeground(new Color(102, 102, 102));

encadreurA.setText("Entrez votre encadreur");
encadreurA.setForeground(new Color(102, 102, 102));

examinateurA.setText("Entrez votre examinateur");
examinateurA.setForeground(new Color(102, 102, 102));

rapporteurA.setText("Entrez votre rapporteur");
rapporteurA.setForeground(new Color(102, 102, 102));

presidentA.setText("Entrez votre président");
presidentA.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
        idM.setText("Entrez votre Identifiant");
idM.setForeground(new Color(102, 102, 102));

inviteM.setText("Entrez votre invitation");
inviteM.setForeground(new Color(102, 102, 102));

encadreurM.setText("Entrez votre encadreur");
encadreurM.setForeground(new Color(102, 102, 102));

examinateurM.setText("Entrez votre examinateur");
examinateurM.setForeground(new Color(102, 102, 102));

rapporteurM.setText("Entrez votre rapporteur");
rapporteurM.setForeground(new Color(102, 102, 102));

presidentM.setText("Entrez votre président");
presidentM.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        setColor(btn_1); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4}, new JPanel[]{ind_2,ind_3, ind_4});
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
        setColor(btn_1); 
        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2,btn_3,btn_4}, new JPanel[]{ind_2,ind_3, ind_4});
    }//GEN-LAST:event_jButton46ActionPerformed

    private void btn_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseEntered
        // TODO add your handling code here:
        
                // Change font style to bold when mouse enters
                Font font = jLabel8.getFont();
                jLabel8.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
            

           
    }//GEN-LAST:event_btn_1MouseEntered

    private void btn_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseExited
        // TODO add your handling code here:
        
                // Change font style to normal when mouse exits
                Font font = jLabel8.getFont();
                jLabel8.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
          
    }//GEN-LAST:event_btn_1MouseExited

    private void btn_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseEntered
        // TODO add your handling code here:
        Font font = jLabel10.getFont();
        jLabel10.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
    }//GEN-LAST:event_btn_3MouseEntered

    private void btn_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseExited
        // TODO add your handling code here:
            Font font = jLabel10.getFont();
            jLabel10.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
    }//GEN-LAST:event_btn_3MouseExited

    private void btn_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseEntered
        // TODO add your handling code here:
        Font font = jLabel11.getFont();
        jLabel11.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
    }//GEN-LAST:event_btn_4MouseEntered

    private void btn_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseExited
        // TODO add your handling code here:
        Font font = jLabel11.getFont();
        jLabel11.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
    }//GEN-LAST:event_btn_4MouseExited

    private void btn_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseEntered
        // TODO add your handling code here:
        Font font = jLabel100.getFont();
        jLabel100.setFont(font.deriveFont(font.getStyle() | Font.BOLD));
    }//GEN-LAST:event_btn_2MouseEntered

    private void btn_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseExited
        // TODO add your handling code here:
        Font font = jLabel100.getFont();
        jLabel100.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
    }//GEN-LAST:event_btn_2MouseExited

    private void dexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        conex = false;
        Component tabComponent = jTabbedPane1.getComponentAt(1);
        if (tabComponent instanceof JPanel) {
                JPanel panel = (JPanel) tabComponent;
                Component[] components = panel.getComponents();
                for (Component component : components) {
                    if (component instanceof JTextField) {
                        JTextField usernameField = (JTextField) component;
                        usernameField.setText("");
                         // Once we find the username field, no need to continue iterating
                    }
                    if (component instanceof JPasswordField) {
                        JPasswordField passwordField = (JPasswordField) component;
                        passwordField.setText("");
                         // Once we find the username field, no need to continue iterating
                    }
    }
}
    }//GEN-LAST:event_dexActionPerformed

    int xx,xy;

  
        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
                }
            });
    
        }
        

        


   
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(0, 95, 180));
        
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(0,75,142));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }
    
    public static Color darken(Color color, double factor) {
        return new Color(
            (int) (color.getRed() * factor),
            (int) (color.getGreen() * factor),
            (int) (color.getBlue() * factor)
        );
    }
    
private static void initializeTextFields(JPanel panel) {
    // Loop through components in the given panel
    for (Component comp : panel.getComponents()) {
        if (comp instanceof JPanel) { // Check for nested JPanel
            JPanel innerPanel = (JPanel) comp;

            // Loop through components in the inner panel
            for (Component innerComp : innerPanel.getComponents()) {
                if (innerComp instanceof JTextField) { // Check for JTextField
                    JTextField textField = (JTextField) innerComp;

                    Border originalBorder = textField.getBorder();
                    Border focusBorder = BorderFactory.createLineBorder(Color.black, 2); // Change the color and thickness as desired

                    textField.addFocusListener(new FocusListener() {
                        @Override
                        public void focusGained(FocusEvent e) {
                          Color currentColor = textField.getForeground();
                          if ((currentColor.getRed() == 102) && (currentColor.getGreen() == 102) && (currentColor.getBlue() == 102)){  
                            textField.setForeground(Color.BLACK);
                            textField.setText("");
                            } // Set the focus border
                            textField.setBorder(focusBorder);
                            // Clear the text
                        }

                        @Override
                        public void focusLost(FocusEvent e) {
                            textField.setBorder(originalBorder); // Restore the original border
                            // Optional: Define behavior when focus is lost
                        }
                    });
                }
            }
        }
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ES;
    private javax.swing.JTextField EnId;
    private javax.swing.JTextField EnIdM;
    private javax.swing.JTextField EnName;
    private javax.swing.JTextField EnNameM;
    private javax.swing.JPanel admin_home;
    private javax.swing.JButton affichJuryButt;
    private javax.swing.JButton affichPfeButt;
    private javax.swing.JButton affichPfeButt1;
    private javax.swing.JButton affichPfeButt2;
    private javax.swing.JPanel affich_enseig;
    private javax.swing.JPanel affich_etud;
    private javax.swing.JPanel affich_jury;
    private javax.swing.JPanel affich_pfe;
    private javax.swing.JPanel ajout_enseig;
    private javax.swing.JPanel ajout_etud;
    private javax.swing.JPanel ajout_jury;
    private javax.swing.JPanel ajout_pfe;
    private javax.swing.JButton ajouterJuryAdmin;
    private javax.swing.JButton ajouterJuryAdmin1;
    private javax.swing.JButton ajouterPfeAdmin;
    private javax.swing.JButton ajouterPfeButt;
    private javax.swing.JTextField blockModifAdm;
    private javax.swing.JTextField blockSalle;
    private javax.swing.JPanel btn_1;
    private javax.swing.JPanel btn_2;
    private javax.swing.JPanel btn_3;
    private javax.swing.JPanel btn_4;
    private javax.swing.JTextField datePfeModif;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton dex;
    private javax.swing.JTextField eId;
    private javax.swing.JTextField eId1;
    private javax.swing.JTextField encadreurA;
    private javax.swing.JTextField encadreurM;
    private javax.swing.JTextField etud1ModifAdm;
    private javax.swing.JTextField examinateurA;
    private javax.swing.JTextField examinateurM;
    private javax.swing.JPanel gest_enseig;
    private javax.swing.JPanel gest_etud;
    private javax.swing.JPanel gest_jury;
    private javax.swing.JPanel gest_pfe;
    private javax.swing.JButton gestionEnseignButtonAdmin;
    private javax.swing.JButton gestionEtudButtonAdmin;
    private javax.swing.JButton gestionJuryButtonAdmin;
    private javax.swing.JButton gestionPfeButtonAdmin;
    private javax.swing.JTextField groupE;
    private javax.swing.JTextField groupEM;
    private javax.swing.JPanel home;
    private javax.swing.JTextField idA;
    private javax.swing.JTextField idE;
    private javax.swing.JTextField idEM;
    private javax.swing.JTextField idER;
    private javax.swing.JTextField idES;
    private javax.swing.JTextField idEtud1;
    private javax.swing.JTextField idEtud2;
    private javax.swing.JTextField idEtud2ModifAdm;
    private javax.swing.JTextField idJ;
    private javax.swing.JTextField idJury;
    private javax.swing.JTextField idJuryModifAdm;
    private javax.swing.JTextField idM;
    private javax.swing.JTextField idPE;
    private javax.swing.JTextField idPfeModif;
    private javax.swing.JTextField idPfeRecherche;
    private javax.swing.JTextField idPfeTextField;
    private javax.swing.JTextField idPfeTextFieldSupprim;
    private javax.swing.JTextField idS;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JTextField inviteA;
    private javax.swing.JTextField inviteM;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JPanel login;
    private javax.swing.JButton modifFormButton;
    private javax.swing.JButton modifJuryButt;
    private javax.swing.JButton modifPfeButt;
    private javax.swing.JButton modifPfeButt1;
    private javax.swing.JButton modifPfeButt2;
    private javax.swing.JPanel modif_enseig;
    private javax.swing.JPanel modif_etud;
    private javax.swing.JPanel modif_jury;
    private javax.swing.JPanel modif_pfe;
    private javax.swing.JTextField nameE;
    private javax.swing.JTextField nameEM;
    private javax.swing.JTextField niveauE;
    private javax.swing.JTextField niveauEM;
    private javax.swing.JTextField notePfeModif;
    private javax.swing.JTextField noteTextField;
    private javax.swing.JTextField numSalleModifAdm;
    private javax.swing.JTextField numeroSalleTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField presidentA;
    private javax.swing.JTextField presidentM;
    private javax.swing.JTextField rapporteurA;
    private javax.swing.JTextField rapporteurM;
    private javax.swing.JPanel rech_enseig;
    private javax.swing.JPanel rech_enseig_pfe;
    private javax.swing.JPanel rech_etud;
    private javax.swing.JPanel rech_etud_pfe;
    private javax.swing.JPanel rech_jury;
    private javax.swing.JPanel rech_pfe;
    private javax.swing.JButton rechercherJuryButt;
    private javax.swing.JButton rechercherPfeButton;
    private javax.swing.JButton rechercherPfeButton1;
    private javax.swing.JButton rechercherPfeButton2;
    private javax.swing.JTextField sectionE;
    private javax.swing.JTextField sectionEM;
    private javax.swing.JButton sendButton;
    private javax.swing.JPanel side_pane;
    private javax.swing.JPanel supp_enseig;
    private javax.swing.JPanel supp_etud;
    private javax.swing.JPanel supp_jurys;
    private javax.swing.JPanel supp_pfe;
    private javax.swing.JButton supprimerJuryButt;
    private javax.swing.JButton supprimerPfeButt;
    private javax.swing.JButton supprimerPfeButt1;
    private javax.swing.JButton supprimerPfeButt2;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
