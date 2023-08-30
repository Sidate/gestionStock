/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sources;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sidate
 */
public class Principale extends javax.swing.JFrame {

    private static Connection connection = new Connexion().Connect();
    private static PreparedStatement pst;
    private static Statement st;
    private static ResultSet rs;
    private static Principale instance;

    /**
     * Creates new form Principale
     */
    private Principale() {
        initComponents();
        chargerTableau();
        chargerTableauV();
        chargerListe();
    }

    public static Principale getInstance() {
        if (instance == null) {
            instance = new Principale();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableaffiche = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableafficheV = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtPrix = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProduit = new javax.swing.JComboBox<>();
        txtQuantite = new javax.swing.JSpinner();
        txtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion des Stocks");

        jPanel1.setBackground(new java.awt.Color(197, 236, 241));

        jPanel3.setBackground(new java.awt.Color(197, 236, 241));

        jScrollPane1.setBackground(new java.awt.Color(197, 236, 241));

        tableaffiche.setBackground(new java.awt.Color(197, 236, 241));
        tableaffiche.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        tableaffiche.setForeground(new java.awt.Color(0, 0, 0));
        tableaffiche.setShowGrid(true);
        tableaffiche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableafficheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableaffiche);

        jTabbedPane1.addTab("STOCK", jScrollPane1);

        jScrollPane2.setBackground(new java.awt.Color(197, 236, 241));

        tableafficheV.setBackground(new java.awt.Color(197, 236, 241));
        tableafficheV.setFont(new java.awt.Font("Modern No. 20", 0, 14)); // NOI18N
        tableafficheV.setForeground(new java.awt.Color(0, 0, 0));
        tableafficheV.setShowGrid(true);
        jScrollPane2.setViewportView(tableafficheV);

        jTabbedPane1.addTab("VENTES", jScrollPane2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(197, 236, 241));

        jLabel6.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("PRODUIT :");

        txtPrix.setEditable(false);
        txtPrix.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PRIX :");

        jLabel8.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("QUANTITE :");

        txtProduit.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        txtProduit.setForeground(new java.awt.Color(0, 153, 0));
        txtProduit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProduitFocusLost(evt);
            }
        });

        txtQuantite.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtQuantiteStateChanged(evt);
            }
        });

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(204, 255, 204));
        txtId.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setToolTipText("");
        txtId.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("ID :");

        jButton1.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton1.setText("Ajouter un produit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton2.setText("Vendre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton3.setText("Modifier un produit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        jButton4.setText("Supprimer un produit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("TOTAL");

        txtTotal.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProduit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(507, 507, 507)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrix, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantite, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableafficheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableafficheMouseClicked
        DefaultTableModel model = (DefaultTableModel) tableaffiche.getModel();
        int index = tableaffiche.getSelectedRow();
        txtId.setText(model.getValueAt(index, 0).toString());
        txtProduit.setSelectedItem(model.getValueAt(index, 1));
        txtPrix.setText(model.getValueAt(index, 2).toString());

        int prix = Integer.valueOf(txtPrix.getText());
        int quantite = (int) txtQuantite.getValue();
        int prixTotal = prix * quantite;
        txtTotal.setText(String.valueOf(prixTotal));
    }//GEN-LAST:event_tableafficheMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (txtId.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un produit à modifier", "Info incomplète", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Object[] label = {"Oui", "Non"};
            int conf = JOptionPane.showOptionDialog(null, "Voulez-vous continuer ?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, label, label[1]);

            if (conf == 0) {

                try {
                    String sql = "delete from produit where id = ?";
                    pst = connection.prepareStatement(sql);
                    pst.setString(1, txtId.getText());
                    pst.executeUpdate();
                    chargerTableau();
                    chargerListe();
                } catch (Exception e) {
                    //System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Erreur : " + e, "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtId.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un produit à modifier", "Info incomplète", JOptionPane.INFORMATION_MESSAGE);
        } else {

            try {
                String requete = "select * from produit where id = ?";
                pst = connection.prepareStatement(requete);
                pst.setString(1, txtId.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    String id = rs.getString("id");
                    String produit = rs.getString("produit");
                    String prix = rs.getString("prix");
                    String quantite = rs.getString("stock");
                    ModifierProduit modi = ModifierProduit.getInstance(id, produit, prix, quantite);
                    modi.setVisible(true);

                }
            } catch (Exception e) {
                //System.out.println(e);
                JOptionPane.showMessageDialog(null, "Erreur : " + e, "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ModifierProduit ajout = ModifierProduit.getInstance();
        ajout.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtQuantiteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtQuantiteStateChanged
        int prix = Integer.valueOf(txtPrix.getText());
        int quantite = (int) txtQuantite.getValue();
        int prixTotal = prix * quantite;
        txtTotal.setText(String.valueOf(prixTotal));
    }//GEN-LAST:event_txtQuantiteStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtId.getText().isBlank()) {

            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un produit à vendre", "Info incomplète", JOptionPane.INFORMATION_MESSAGE);

        } else if ((int) txtQuantite.getValue() == 0) {

            JOptionPane.showMessageDialog(null, "Veuillez augmenter la quantité à vendre", "Info incomplète", JOptionPane.INFORMATION_MESSAGE);

        } else {
            int quantite;
            String produit;

            quantite = (int) txtQuantite.getValue();        //RECUPERATION DE LA QUANTITE SAISIE PAR L'UTILISATEUR
            produit = txtProduit.getSelectedItem().toString();  //RECUPERATION DU NOM DU PRODUIT SELECTIONNE

            String sql = "select stock from produit where id=?";

            try {
                pst = connection.prepareStatement(sql);
                pst.setString(1, txtId.getText());
                rs = pst.executeQuery();

                if (rs.next()) {
                    int stock = rs.getInt(1);       //RECUPERATION DU STOCK ENREGISTREE DANS LA BASE DE DONNEE

                    // COMPARAISON ENTRE LE STOCK DISPONIBLE ET LA QUANTITE DEMANDE
                    if (quantite <= stock) {

                        //NOUS ALLONS COMPTER TOUTES LES VENTES POUR VOIR SI NOUS NE SOMMES PAS A NOTRE PREMIERE VENTE
                        String requete = "select count(*) as nombreVente from vente";

                        try {
                            st = connection.createStatement();
                            rs = st.executeQuery(requete);
                            //System.out.println(rs.next());

                            if (rs.next()) {
                                int nombres = rs.getInt("nombreVente");
                                
                                //System.out.println(nombres);

                                if (nombres == 0) {

                                    int newId = 1;

                                    Date date1 = new Date();
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                    String date = sdf.format(date1);// Pour avoir une date en chaine de caracère

                                    String requete2 = "insert into vente (id_vente, date_vente, id_produit, nom_produit, prix_unitaire, quantite, prix_total)"
                                                + " values (?, ?, ?, ?, ?, ?, ?)";
                                        pst = connection.prepareStatement(requete2);
                                        pst.setString(1, String.valueOf(newId));
                                        pst.setString(2, date);
                                        pst.setString(3, txtId.getText());
                                        pst.setString(4, produit);
                                        pst.setString(5, txtPrix.getText());
                                        pst.setString(6, String.valueOf(txtQuantite.getValue()));
                                        pst.setString(7, txtTotal.getText());

                                    pst.executeUpdate();

                                    int nouveauStock = stock - quantite;

                                    String requete3 = "update produit set stock=? where id=?";
                                    pst = connection.prepareStatement(requete3);
                                    pst.setString(1, String.valueOf(nouveauStock));
                                    pst.setString(2, txtId.getText());
                                    pst.executeUpdate();
                                    
                                    txtQuantite.setValue(0);

                                    chargerTableau();
                                    chargerTableauV();

                                } else {

                                    String query = "select max(id_vente) from vente";
                                    st = connection.createStatement();
                                    rs = st.executeQuery(query);

                                    if (rs.next()) {

                                        int lastId = rs.getInt(1);
                                        int newId = lastId + 1;

                                        Date date1 = new Date();
                                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                        String date = sdf.format(date1);// Pour avoir une date en chaine de caracère

                                        String requete2 = "insert into vente (id_vente, date_vente, id_produit, nom_produit, prix_unitaire, quantite, prix_total)"
                                                + " values (?, ?, ?, ?, ?, ?, ?)";
                                        pst = connection.prepareStatement(requete2);
                                        pst.setString(1, String.valueOf(newId));
                                        pst.setString(2, date);
                                        pst.setString(3, txtId.getText());
                                        pst.setString(4, produit);
                                        pst.setString(5, txtPrix.getText());
                                        pst.setString(6, String.valueOf(txtQuantite.getValue()));
                                        pst.setString(7, txtTotal.getText());

                                        pst.executeUpdate();

                                        int nouveauStock = stock - quantite;

                                        String requete3 = "update produit set stock=? where id=?";
                                        pst = connection.prepareStatement(requete3);
                                        pst.setString(1, String.valueOf(nouveauStock));
                                        pst.setString(2, txtId.getText());
                                        pst.executeUpdate();
                                        
                                        txtQuantite.setValue(0);

                                        chargerTableau();
                                        chargerTableauV();

                                    }

                                }

                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La quantité demandée est supérieure au stock disponible", "Stock insuffisant", JOptionPane.INFORMATION_MESSAGE);
                    }

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtProduitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProduitFocusLost
        String produit = txtProduit.getSelectedItem().toString();
        
        String req = "select * from produit where produit = ?";
        
        try {
            pst = connection.prepareStatement(req);
            pst.setString(1, produit);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String id = rs.getString("id");
                String prix = rs.getString("prix");
                txtId.setText(id);
                txtPrix.setText(prix);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtProduitFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principale().setVisible(true);
            }
        });
    }

    public static void chargerTableau() {

        String sql = "Select * from produit";
        String Colonne[] = {"ID", "PRODUIT", "PRIX", "QUANTITE"};
        String[] data = new String[4];

        try {
            DefaultTableModel model = new DefaultTableModel(null, Colonne);
            tableaffiche.setModel(model);
            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                data[0] = rs.getString("id");
                data[1] = rs.getString("produit");
                data[2] = rs.getString("prix");
                data[3] = rs.getString("stock");
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void chargerTableauV() {

        String requete = "select * from vente";

        String[] titre = {"ID_VENTE", "DATE_VENTE", "ID_PRODUIT", "NOM_PRODUIT", "PRIX_UNITAIRE", "QUANTITE", "PRIX_TOTAL"};
        String[] data = new String[7];
        DefaultTableModel model = new DefaultTableModel(null, titre);

        try {
            tableafficheV.setModel(model);
            pst = connection.prepareStatement(requete);
            rs = pst.executeQuery();
            while (rs.next()) {
                data[0] = rs.getString("ID_VENTE");
                data[1] = rs.getString("DATE_VENTE");
                data[2] = rs.getString("ID_PRODUIT");
                data[3] = rs.getString("NOM_PRODUIT");
                data[4] = rs.getString("PRIX_UNITAIRE");
                data[5] = rs.getString("QUANTITE");
                data[6] = rs.getString("PRIX_TOTAL");
                

                model.addRow(data);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void chargerListe() {

        try {
            String sql2 = "select produit from produit";
            pst = connection.prepareStatement(sql2);
            rs = pst.executeQuery();
            //txtProduit.addItem("");
            while (rs.next()) {
                txtProduit.addItem(rs.getString("produit"));
            }
        } catch (Exception e) {
            //System.out.println(e);
            new Login().setVisible(true);
            Principale.getInstance().dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable tableaffiche;
    private static javax.swing.JTable tableafficheV;
    private static javax.swing.JTextField txtId;
    private static javax.swing.JTextField txtPrix;
    private static javax.swing.JComboBox<String> txtProduit;
    private javax.swing.JSpinner txtQuantite;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
