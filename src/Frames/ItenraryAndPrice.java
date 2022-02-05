/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Entity.itineraryandprice;
import MySql.Tools;
import java.awt.Color;
import java.sql.Time;

/**
 *
 * @author mohsi
 */
public class ItenraryAndPrice extends javax.swing.JFrame {

    /**
     * Creates new form test
     */
    public ItenraryAndPrice() {
        initComponents();
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
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblIteneraryAndPrice = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTOT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtArrvCity = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtDepCity = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtArrvT = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFC_TP = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtEC_TP = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Itinrary And Price Form");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 40));

        tblIteneraryAndPrice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip_id", "Departure_city", "Arrival_city", "Take_off_time", "Arrival_time", "FC_ticket_price", "EC_ticket_price"
            }
        ));
        tblIteneraryAndPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblIteneraryAndPriceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblIteneraryAndPrice);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 890, 580));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Take_off_Time");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 110, 20));
        jPanel1.add(txtTOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 230, 140, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Trip_id :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 100, 20));

        txtId.setEditable(false);
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 140, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Arrival_city");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 100, 20));
        jPanel1.add(txtArrvCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 190, 140, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Departure_city");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 110, -1));
        jPanel1.add(txtDepCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 150, 140, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Arrival_Time");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 100, 20));
        jPanel1.add(txtArrvT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 140, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("FC_ticket_price");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, 110, 20));
        jPanel1.add(txtFC_TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 310, 140, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("EC_ticket_price");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 110, 20));
        jPanel1.add(txtEC_TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 350, 140, -1));

        btnUpdate.setBackground(new java.awt.Color(245, 245, 245));
        btnUpdate.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_Edit-24.png"))); // NOI18N
        btnUpdate.setText("Edit");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setFocusPainted(false);
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 540, 120, 50));

        btnback.setBackground(new java.awt.Color(245, 245, 245));
        btnback.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_back_126585.png"))); // NOI18N
        btnback.setText("back");
        btnback.setBorderPainted(false);
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.setFocusPainted(false);
        btnback.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnbackMouseExited(evt);
            }
        });
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel1.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        btnAdd.setBackground(new java.awt.Color(245, 245, 245));
        btnAdd.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_database_add_20.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorderPainted(false);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setFocusPainted(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 120, 50));

        btnDelete.setBackground(new java.awt.Color(245, 245, 245));
        btnDelete.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_ic_delete_24.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorderPainted(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setFocusPainted(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 540, 120, 50));

        btnClear.setBackground(new java.awt.Color(245, 245, 245));
        btnClear.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfinder_clear_left_32_1.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setBorderPainted(false);
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.setFocusPainted(false);
        btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 460, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    itineraryandprice ip=new itineraryandprice();
    private void clearData()
    {
        Tools.clearText(this);
        txtId.setText(ip.getAutoNumber());
        btnAdd.setEnabled(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        txtDepCity.requestFocus();
        ip.getAllRows(tblIteneraryAndPrice);
        tblIteneraryAndPrice.getTableHeader().setReorderingAllowed(false);
    }
    
     private void setValues()
    {
        String Departure_City=txtDepCity.getText();
        String Arrival_city=txtArrvCity.getText();
        Time Take_Of_Time=Time.valueOf(txtTOT.getText());
        Time Arrival_Time=Time.valueOf(txtArrvT.getText());
        double FC_ticket_price=Double.parseDouble(txtFC_TP.getText());
        double EC_ticket_price=Double.parseDouble(txtEC_TP.getText());        
        
        ip.setTrip_Id(Integer.parseInt(txtId.getText()));
        ip.setDeparture_city(Departure_City);
        ip.setArrival_city(Arrival_city);
        ip.setTake_of_Time(Take_Of_Time);
        ip.setArrtival_Time(Arrival_Time);
        ip.setFC_ticket_price(FC_ticket_price);
        ip.setEC_ticket_price(EC_ticket_price);
    }
     
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        setValues();
        ip.update();
        clearData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseEntered
        btnback.setBackground(Color.decode("#E0DDDD"));
    }//GEN-LAST:event_btnbackMouseEntered

    private void btnbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseExited
        btnback.setBackground(Color.decode("#F5F5F5"));
    }//GEN-LAST:event_btnbackMouseExited

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       this.dispose();
       Tools.openForm(new MainForm());
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setValues();
        ip.add();
        clearData();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        setValues();
        ip.delete();
        clearData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearData();
    }//GEN-LAST:event_btnClearActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        clearData();
    }//GEN-LAST:event_formWindowOpened

    private void tblIteneraryAndPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblIteneraryAndPriceMouseClicked
        try
        {
            int row=tblIteneraryAndPrice.getSelectedRow();

            String strTrip_id=tblIteneraryAndPrice.getValueAt(row, 0).toString();
            String strDeparture_city=tblIteneraryAndPrice.getValueAt(row, 1).toString();
            String strArrival_city=tblIteneraryAndPrice.getValueAt(row, 2).toString();
            String strTake_of_Time=tblIteneraryAndPrice.getValueAt(row, 3).toString();
            String strArrtival_Time=tblIteneraryAndPrice.getValueAt(row, 4).toString();
            String strFC_ticket_price=tblIteneraryAndPrice.getValueAt(row, 5).toString();
            String strEC_ticket_price=tblIteneraryAndPrice.getValueAt(row, 6).toString();
            
            txtId.setText(strTrip_id);
            txtDepCity.setText(strDeparture_city);
            txtArrvCity.setText(strArrival_city);
            txtTOT.setText(strTake_of_Time);
            txtArrvT.setText(strArrtival_Time);
            txtFC_TP.setText(strFC_ticket_price);
            txtEC_TP.setText(strEC_ticket_price);
            
            btnAdd.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);

        }
        catch (Exception e)
        {
            Tools.msgBox(e.getMessage());
        }
    }//GEN-LAST:event_tblIteneraryAndPriceMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        clearData();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnAdd.setBackground(Color.decode("#E0DDDD"));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnAdd.setBackground(Color.decode("#F5F5F5"));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        btnClear.setBackground(Color.decode("#E0DDDD"));
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        btnClear.setBackground(Color.decode("#F5F5F5"));
    }//GEN-LAST:event_btnClearMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        btnDelete.setBackground(Color.decode("#E0DDDD"));
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        btnDelete.setBackground(Color.decode("#F5F5F5"));
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(Color.decode("#E0DDDD"));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(Color.decode("#F5F5F5"));
    }//GEN-LAST:event_btnUpdateMouseExited

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
            java.util.logging.Logger.getLogger(ItenraryAndPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItenraryAndPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItenraryAndPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItenraryAndPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItenraryAndPrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblIteneraryAndPrice;
    private javax.swing.JTextField txtArrvCity;
    private javax.swing.JTextField txtArrvT;
    private javax.swing.JTextField txtDepCity;
    private javax.swing.JTextField txtEC_TP;
    private javax.swing.JTextField txtFC_TP;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTOT;
    // End of variables declaration//GEN-END:variables
}