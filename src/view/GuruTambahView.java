/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GuruController;
import event.GuruListener;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import model.GuruModel;

/**
 *
 * @author tsisw
 */
public class GuruTambahView extends javax.swing.JFrame implements GuruListener {

    /**
     * KOMUNIKASIKAN MVC MVC --> komunikasikan semua view, model, dan controller
     * di dalam view 1. Deklarasikan Model & Controller 2. Implement Listener
     */
    
    public GuruTambahView() {
        //instansiasi
        controller = new GuruController();
        model = new GuruModel();

        //set model ke dalam controller
        model.setGuruListener(this);
        controller.setModel(model); //setelah ini, kita bisa actionPerform btn

        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        
        initComponents();
    }
    
    private GuruModel model;
    private GuruController controller;
    
    public JComboBox getCb_guruTambah_status() {
        return cb_guruTambah_status;
    }
    
    public JTextField getTf_guruTambah_email() {
        return tf_guruTambah_email;
    }
    
    public JTextField getTf_guruTambah_idGuru() {
        return tf_guruTambah_idGuru;
    }
    
    public JTextField getTf_guruTambah_lahir() {
        return tf_guruTambah_tanggalLahir;
    }
    
    public JTextField getTf_guruTambah_nama() {
        return tf_guruTambah_nama;
    }
    
    public JTextField getTf_guruTambah_telepon() {
        return tf_guruTambah_telepon;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_guruTambah_idGuru = new javax.swing.JTextField();
        tf_guruTambah_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_guruTambah_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_guruTambah_telepon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_guruTambah_tanggalLahir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_guruTambah_status = new javax.swing.JComboBox();
        btn_guruTambah_batal_div = new javax.swing.JPanel();
        btn_guruTambah_batal = new javax.swing.JLabel();
        btn_guruTambah_tambah_div = new javax.swing.JPanel();
        btn_guruTambah_tambah = new javax.swing.JLabel();

        setTitle("Tambah Guru ");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Tambah Guru");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("ID Guru");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Nama");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("E-mail");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("Telepon");

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("Lahir");

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("Status");

        cb_guruTambah_status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Honorer", "Tetap" }));

        btn_guruTambah_batal_div.setBackground(new java.awt.Color(230, 126, 34));
        btn_guruTambah_batal_div.setPreferredSize(new java.awt.Dimension(135, 45));

        btn_guruTambah_batal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_guruTambah_batal.setForeground(new java.awt.Color(236, 240, 241));
        btn_guruTambah_batal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_guruTambah_batal.setText("Batal");
        btn_guruTambah_batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guruTambah_batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guruTambah_batalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guruTambah_batalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guruTambah_batalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_guruTambah_batalMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_guruTambah_batal_divLayout = new javax.swing.GroupLayout(btn_guruTambah_batal_div);
        btn_guruTambah_batal_div.setLayout(btn_guruTambah_batal_divLayout);
        btn_guruTambah_batal_divLayout.setHorizontalGroup(
            btn_guruTambah_batal_divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(btn_guruTambah_batal_divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_guruTambah_batal_divLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_guruTambah_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        btn_guruTambah_batal_divLayout.setVerticalGroup(
            btn_guruTambah_batal_divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(btn_guruTambah_batal_divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_guruTambah_batal, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        btn_guruTambah_tambah_div.setBackground(new java.awt.Color(22, 160, 133));
        btn_guruTambah_tambah_div.setPreferredSize(new java.awt.Dimension(135, 45));

        btn_guruTambah_tambah.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_guruTambah_tambah.setForeground(new java.awt.Color(236, 240, 241));
        btn_guruTambah_tambah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_guruTambah_tambah.setIcon(new javax.swing.ImageIcon("C:\\Users\\tsisw\\Downloads\\Icons\\provis_sekolah\\icons8-add-new-24.png")); // NOI18N
        btn_guruTambah_tambah.setText("Tambahkan");
        btn_guruTambah_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_guruTambah_tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guruTambah_tambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guruTambah_tambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guruTambah_tambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_guruTambah_tambahMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_guruTambah_tambah_divLayout = new javax.swing.GroupLayout(btn_guruTambah_tambah_div);
        btn_guruTambah_tambah_div.setLayout(btn_guruTambah_tambah_divLayout);
        btn_guruTambah_tambah_divLayout.setHorizontalGroup(
            btn_guruTambah_tambah_divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
            .addGroup(btn_guruTambah_tambah_divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_guruTambah_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        btn_guruTambah_tambah_divLayout.setVerticalGroup(
            btn_guruTambah_tambah_divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(btn_guruTambah_tambah_divLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btn_guruTambah_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_guruTambah_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(26, 26, 26)
                                .addComponent(tf_guruTambah_idGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_guruTambah_email, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(tf_guruTambah_tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(35, 35, 35)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_guruTambah_telepon)
                                    .addComponent(cb_guruTambah_status, 0, 149, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_guruTambah_batal_div, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_guruTambah_tambah_div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_guruTambah_idGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tf_guruTambah_tanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_guruTambah_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tf_guruTambah_telepon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_guruTambah_email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cb_guruTambah_status, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guruTambah_tambah_div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guruTambah_batal_div, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guruTambah_tambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guruTambah_tambahMouseEntered
        // TODO add your handling code here:
        btn_guruTambah_tambah_div.setBackground(new Color(0, 135, 108));
    }//GEN-LAST:event_btn_guruTambah_tambahMouseEntered

    private void btn_guruTambah_tambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guruTambah_tambahMouseExited
        // TODO add your handling code here:
        btn_guruTambah_tambah_div.setBackground(new Color(22, 160, 133));
    }//GEN-LAST:event_btn_guruTambah_tambahMouseExited

    private void btn_guruTambah_tambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guruTambah_tambahMousePressed
        // TODO add your handling code here:
        btn_guruTambah_tambah_div.setBackground(new Color(0, 109, 82));
    }//GEN-LAST:event_btn_guruTambah_tambahMousePressed

    private void btn_guruTambah_batalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guruTambah_batalMouseEntered
        // TODO add your handling code here:
        btn_guruTambah_batal_div.setBackground(new Color(205, 101, 9));
    }//GEN-LAST:event_btn_guruTambah_batalMouseEntered

    private void btn_guruTambah_batalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guruTambah_batalMouseExited
        // TODO add your handling code here:
        btn_guruTambah_batal_div.setBackground(new Color(230, 126, 34));
    }//GEN-LAST:event_btn_guruTambah_batalMouseExited

    private void btn_guruTambah_batalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guruTambah_batalMousePressed
        // TODO add your handling code here:
        btn_guruTambah_batal_div.setBackground(new Color(179, 75, 0));
    }//GEN-LAST:event_btn_guruTambah_batalMousePressed

    private void btn_guruTambah_batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guruTambah_batalMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_guruTambah_batalMouseClicked

    private void btn_guruTambah_tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guruTambah_tambahMouseClicked
        // KITA HANYA MEMANGGIL CONTROLLER-NYA SAJA
        controller.tambahGuru(this);
//        controller.resetForm(this);
    }//GEN-LAST:event_btn_guruTambah_tambahMouseClicked

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
            java.util.logging.Logger.getLogger(GuruTambahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuruTambahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuruTambahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuruTambahView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuruTambahView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_guruTambah_batal;
    private javax.swing.JPanel btn_guruTambah_batal_div;
    private javax.swing.JLabel btn_guruTambah_tambah;
    private javax.swing.JPanel btn_guruTambah_tambah_div;
    private javax.swing.JComboBox cb_guruTambah_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_guruTambah_email;
    private javax.swing.JTextField tf_guruTambah_idGuru;
    private javax.swing.JTextField tf_guruTambah_nama;
    private javax.swing.JTextField tf_guruTambah_tanggalLahir;
    private javax.swing.JTextField tf_guruTambah_telepon;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(GuruModel listener) {
        /*kita bisa mengisi apa yg dilakukan | ketika data berubah maka 
         tampilannyapun akan berubah
         *kita bisa set value yg sudah kita buat | nge-set dengan nge-get model
         */
        
        tf_guruTambah_idGuru.setText(model.getId_guru());
        tf_guruTambah_nama.setText(model.getId_guru());
        tf_guruTambah_email.setText(model.getId_guru());
        tf_guruTambah_tanggalLahir.setText(model.getId_guru());
        tf_guruTambah_telepon.setText(model.getId_guru());
        cb_guruTambah_status.setSelectedItem(model.getStatus());
    }
}