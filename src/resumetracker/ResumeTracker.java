/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumetracker;

import com.toedter.calendar.JDateChooser;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Hyeji
 */
public class ResumeTracker extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    CardLayout cardLayout;
    public ResumeTracker() {
        initComponents();
        
        cardLayout = (CardLayout) (parentCard.getLayout());
        Show_Products_In_JTable();
    }
    
    public void Show_Products_In_JTable()
    {
            Connection con = MySqlConnection.getConnection();
            String query = "SELECT * FROM applied";
            
            Statement st;
            ResultSet rs;
            
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            Object[] row = new Object[5];
            
            while(rs.next())
            {
                row[0] = String.valueOf(rs.getInt("i"));
                row[1] = rs.getString("Company");
                row[2] = rs.getString("Position");
                row[3] = rs.getString("Website");
                row[4] = rs.getObject("Date");
                
                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ResumeTracker.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextField10 = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        parentCard = new javax.swing.JPanel();
        newAppPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IndexField = new javax.swing.JTextField();
        CompanyField = new javax.swing.JTextField();
        PositionField = new javax.swing.JTextField();
        DateField = new com.toedter.calendar.JDateChooser();
        WebsiteField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        editLabel = new javax.swing.JLabel();
        deleteLabel = new javax.swing.JLabel();
        SearchCompanyField = new javax.swing.JTextField();
        resetLabel = new java.awt.Label();
        trackAppPanel = new javax.swing.JPanel();

        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerSize(0);

        jPanel1.setBackground(new java.awt.Color(108, 85, 125));

        jButton1.setBackground(new java.awt.Color(4, 37, 58));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("NEW APPLICATION");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(4, 37, 58));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("TRACK APPLICATION");
        jButton2.setContentAreaFilled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(108, 85, 125));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HireMe");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        parentCard.setLayout(new java.awt.CardLayout());

        newAppPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Search Company Name : ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index", "Company", "Position", "Website", "Date Applied"
            }
        ));
        jTable1.setDragEnabled(true);
        jTable1.setShowVerticalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(151, 131, 166));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Company :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Position :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Website :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Index :");

        IndexField.setEditable(false);
        IndexField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        CompanyField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        PositionField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        WebsiteField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Date Applied :");

        addLabel.setBackground(new java.awt.Color(204, 204, 204));
        addLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        addLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resumetracker/icon/add_property_32px.png"))); // NOI18N
        addLabel.setText(" ADD");
        addLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addLabel.setOpaque(true);
        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addLabelMouseReleased(evt);
            }
        });

        editLabel.setBackground(new java.awt.Color(204, 204, 204));
        editLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        editLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resumetracker/icon/edit_property_32px.png"))); // NOI18N
        editLabel.setText(" EDIT");
        editLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editLabel.setOpaque(true);
        editLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editLabelMouseReleased(evt);
            }
        });

        deleteLabel.setBackground(new java.awt.Color(204, 204, 204));
        deleteLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        deleteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resumetracker/icon/delete_property_32px.png"))); // NOI18N
        deleteLabel.setText(" DELETE");
        deleteLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteLabel.setOpaque(true);
        deleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IndexField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CompanyField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WebsiteField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IndexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CompanyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WebsiteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(addLabel)
                .addGap(18, 18, 18)
                .addComponent(editLabel)
                .addGap(18, 18, 18)
                .addComponent(deleteLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SearchCompanyField.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        SearchCompanyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchCompanyFieldActionPerformed(evt);
            }
        });
        SearchCompanyField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchCompanyFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchCompanyFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchCompanyFieldKeyTyped(evt);
            }
        });

        resetLabel.setAlignment(java.awt.Label.CENTER);
        resetLabel.setBackground(new java.awt.Color(204, 204, 204));
        resetLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        resetLabel.setText("Reset");
        resetLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                resetLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout newAppPanelLayout = new javax.swing.GroupLayout(newAppPanel);
        newAppPanel.setLayout(newAppPanelLayout);
        newAppPanelLayout.setHorizontalGroup(
            newAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(newAppPanelLayout.createSequentialGroup()
                .addGroup(newAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newAppPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(newAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newAppPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchCompanyField, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(newAppPanelLayout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(resetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        newAppPanelLayout.setVerticalGroup(
            newAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newAppPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchCompanyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        parentCard.add(newAppPanel, "card2");

        trackAppPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout trackAppPanelLayout = new javax.swing.GroupLayout(trackAppPanel);
        trackAppPanel.setLayout(trackAppPanelLayout);
        trackAppPanelLayout.setHorizontalGroup(
            trackAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        trackAppPanelLayout.setVerticalGroup(
            trackAppPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );

        parentCard.add(trackAppPanel, "card3");

        jSplitPane1.setRightComponent(parentCard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cardLayout.show(parentCard, "card3");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cardLayout.show(parentCard, "card2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseReleased

//    add new list to the database
    private void addLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseReleased
        // TODO add your handling code here:
        if (!IndexField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Failed to add");
        } else {
            Connection con = MySqlConnection.getConnection();
            PreparedStatement ps;
            if (verifyText()) {
                try {

                        ps = con.prepareStatement("INSERT INTO applied(Company, Position, Website, Date) VALUES (?,?,?,?)");
                        ps.setString(1, CompanyField.getText());
                        ps.setString(2, PositionField.getText());
                        ps.setString(3, WebsiteField.getText());
                        Date date = DateField.getDate();
                        String strDate = DateFormat.getDateInstance().format(date);
                        ps.setString(4, strDate);

                        if (ps.executeUpdate() > 0) {
                            JOptionPane.showMessageDialog(null, "New list added");
                        }


                    Show_Products_In_JTable();

                } catch (SQLException ex) {
                    Logger.getLogger(ResumeTracker.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }//GEN-LAST:event_addLabelMouseReleased

//    delete selected list from the database
    private void deleteLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseReleased
        // TODO add your handling code here:
        if (verifyText()) {
            Connection con = MySqlConnection.getConnection();
            PreparedStatement ps;
            String UpdateQuery = "DELETE FROM applied WHERE i = ?";
            try {
                ps = con.prepareStatement(UpdateQuery);
                ps.setString(1, IndexField.getText());
                        
                if (ps.executeUpdate()> 0) {
                    JOptionPane.showMessageDialog(null, "List Deleted");
                }
                
                Show_Products_In_JTable();
            } catch (SQLException ex) {
                Logger.getLogger(ResumeTracker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteLabelMouseReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index = jTable1.getSelectedRow();
        IndexField.setText(jTable1.getValueAt(index, 0).toString());
        CompanyField.setText("");
        if (jTable1.getValueAt(index, 1) != null) {
            CompanyField.setText(jTable1.getValueAt(index, 1).toString());
        }
        PositionField.setText("");
        if (jTable1.getValueAt(index, 2) != null) {
            PositionField.setText(jTable1.getValueAt(index, 2).toString());
        }
        WebsiteField.setText("");
        if (jTable1.getValueAt(index, 3) != null) {
            WebsiteField.setText(jTable1.getValueAt(index, 3).toString());
        }
        if (jTable1.getValueAt(index, 4) != null) {
           
            String dateValue = jTable1.getValueAt(index, 4).toString(); 
            java.util.Date date;
            try {
                date = new SimpleDateFormat("MMMMM d, yyyy").parse(dateValue);
                DateField.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(ResumeTracker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

//    edit existing data in the database
    private void editLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLabelMouseReleased
        // TODO add your handling code here:
        if (verifyText()) {
            Connection con = MySqlConnection.getConnection();
            PreparedStatement ps;
            String UpdateQuery = "UPDATE applied SET Company = ?, Position = ?, Website = ?, Date = ? WHERE i = ?";
            try {
                ps = con.prepareStatement(UpdateQuery);
                ps.setString(1, CompanyField.getText());
                ps.setString(2, PositionField.getText());
                ps.setString(3, WebsiteField.getText());
                Date date = DateField.getDate();
                String strDate = DateFormat.getDateInstance().format(date);
                ps.setString(4, strDate);
                ps.setString(5, IndexField.getText());
                
                if (ps.executeUpdate()> 0) {
                    JOptionPane.showMessageDialog(null, "Product Updated");
                }
                
                Show_Products_In_JTable();
            } catch (SQLException ex) {
                Logger.getLogger(ResumeTracker.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_editLabelMouseReleased

    private void SearchCompanyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchCompanyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchCompanyFieldActionPerformed

    private void SearchCompanyFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchCompanyFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchCompanyFieldKeyPressed

//    show matching rows
    private void SearchCompanyFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchCompanyFieldKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<> (model);
        jTable1.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(SearchCompanyField.getText(), 1));
        if (SearchCompanyField.getText().equals("")) {
            Show_Products_In_JTable();
        }
    }//GEN-LAST:event_SearchCompanyFieldKeyReleased

    private void SearchCompanyFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchCompanyFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchCompanyFieldKeyTyped

//    reset to default
    private void resetLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetLabelMouseReleased
        // TODO add your handling code here:
        IndexField.setText("");
        CompanyField.setText("");
        PositionField.setText("");
        WebsiteField.setText("");
        JDateChooser date = new JDateChooser();
        DateField.setDate(date.getDate());
    }//GEN-LAST:event_resetLabelMouseReleased

    
//    check whether textfields are empty or not
    public boolean verifyText() 
    {
        if (CompanyField.getText().equals("") || 
                PositionField.getText().equals("") ||
                DateField.getDate().equals("") || 
                WebsiteField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "One or More Empty Field");
            return false;
        }       
        return true;
    }
    
    
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
            java.util.logging.Logger.getLogger(ResumeTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResumeTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResumeTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResumeTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ResumeTracker main = new ResumeTracker();
                main.pack();
                main.setLocationRelativeTo(null);
                main.setResizable(false);
                main.setVisible(true);
//                new ResumeTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CompanyField;
    private com.toedter.calendar.JDateChooser DateField;
    private javax.swing.JTextField IndexField;
    private javax.swing.JTextField PositionField;
    private javax.swing.JTextField SearchCompanyField;
    private javax.swing.JTextField WebsiteField;
    private javax.swing.JLabel addLabel;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel editLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JPanel newAppPanel;
    private javax.swing.JPanel parentCard;
    private java.awt.Label resetLabel;
    private javax.swing.JPanel trackAppPanel;
    // End of variables declaration//GEN-END:variables
}
