/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harrih.view;

/**
 *
 * @author ASUS
 */
public class Keyboard extends javax.swing.JFrame {

    /**
     * Creates new form Keyboard
     */
    public Keyboard() {
        initComponents();
        setVisible(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(194, 133, 56));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("SEJARAH ALAT MUSIK KEYBOARD");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Piano-01-WF.png")); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Instrumen kibor ini sudah ada sejak zaman kuno. Tidak jelas awalnya yang tepat. Dalam \ntangga nada Barat yang disebut diatonis, tonal terbagi dalam 12 nada. Ada nada penuh \ndan ada nada semi-tone. Pada instrumen kibor kedua kelompok nada ini biasa dibedakan\n dengan kunci berwarna terang dan untuk semi-tone. Susunan deret kunci yang chromatic \n(mencakup 12 nada) muncul di Eropa pada abad ke-14.\nPada awal kemunculannya bilah-bilah masih dalam ukuran sangat lebar. Satu bilah bisa \nbeberapa sentimeter lebarnya hingga tidak banyak nada harmoni bisa dihasilkan. Baru \npada abad ke-16, 200 tahun lamanya, muncul pembakuan lebar bilah. Satu oktaf sebanyak \n12 bilah dibuat totalnya selebar 16,5 sentimeter. Ini artinya nada diatonik bisa dicakup \ndalam lebar satu tangan hingga musik harmonik bisa dihasilkan. Pada perkembangan ini juga \ninovasi kunci putih dan hitam diciptakan.\nPada abad 15 diciptakan instrumen musik berdawai dengan dibunyikan melalui petikan, \nmunculah harpsichord. Harpsichord ini terus berkembang pada abad ke-17 dan ke-18. Suatu \nteknik membunyikan dawai kembali dikembangkan dengan alat pukul kecil yang bekerja. Akibat\nnya pukulan pada bilah kunci bisa dilakukan pelan dan keras. Pelan dalam bahasa Italia \nadalah piano dan keras adalah forte. Instrumen inovasi baru itu sangat populer karena \nvolume nada bisa diatur dengan keras lemahnya memanipulasi papan kunci. Nama alat itu \npun menjadi pianoforte. Lama kelamaan diringkas menjadi piano.\nInstrumen kibor ini yang memungkinkan berkembangnya musik barat dengan spektrum \nharmoni yang bisa dikatakan tidak tertandingi oleh aliran musik lain di bumi ini. \nKomposisi orkes simponi berasal dari kemampuan piano menghasilkan nada-nada harmonik.\nKibor elektronik baru muncul pada abad ke-20. Dipasarkan pertama kali oleh Laurens \nHammond di Amerika Serikat 1935. Sejak itu mulai berkembang instrumen yang sekarang \nini menjadi rajanya alat musik. Suara orkes simponi pun dengan puluhan instrumen \nbisa dihasilkan oleh satu kibor saja.");
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(194, 133, 56));
        jButton1.setForeground(new java.awt.Color(194, 133, 56));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Previous.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)
                        .addGap(0, 167, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Beranda();
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Keyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Keyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Keyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Keyboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Keyboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
