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
public class Guitar extends javax.swing.JFrame {

    /**
     * Creates new form Guitar
     */
    public Guitar() {
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

        jPanel1.setBackground(new java.awt.Color(194, 133, 56));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("SEJARAH ALAT MUSIK GUITAR");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\Electric-Guitar-02.png")); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Kata ‘gitar’ atau guitar dalam bahasa Inggris, pada \nmulanya diambil dari nama alat musik petik kuno di \nwilayah Persia pada kira-kira tahun 1500 SM yang \ndikenal sebagai citar atau sehtar. Alat musik ini \nkemudian berkembang menjadi berbagai macam model \ngitar kuno yang dikenal dengan istilah umum tanbur. \nPada tahun 300 SM Tanbur Persia dikembangkan oleh \nbangsa Yunani dan enam abad kemudian oleh bangsa Romawi \n(Bellow, 1970:54-55). Pada tahun 476M alat musik ini\n dibawa oleh bangsa Romawi ke Spanyol dan bertransformasi \nmenjadi: (1) guitarra Morisca yang berfungsi sebagai\n pembawa melodi, dan (2) Guitarra Latina untuk memainkan \nakor. Tiga abad kemudian bangsa Arab membawa semacam\n gitar gambus dengan sebutan al ud ke Spanyol \n(Summerfield, 1982:12). Berdasarkan konstruksi al ud\nArab dan kedua model gitar dari Romawi tersebut, \nbangsa Spanyol kemudian membuat alat musiknya \nsendiri yang disebut vihuela. Sebagai hasilnya, vihuela\n menjadi populer di Spanyol sementara alat-alat musik \npendahulunya sedikit demi sedikit ditinggalkan. \nWalaupun demikian al ud dibawa orang ke negara-negara\nEropa Barat dan menyaingi popularitas vihuela di Spanyol. \nDi Eropa al ud disambut dengan baik dan berkembang \nmenjadi berbagai model lute Eropa hingga kira-kira \nakhir abad ke-17. Sementara itu vihuela berkembang \nterus menjadi berbagai macam gitar selama berabad-\nabad hingga akhirnya menjadi gitar klasik yang digunakan\n pada saat ini.\n\nKeaslian gitar tidak dapat dilihat dari keantikannya. \nBeberapa ahli merasa alat ini berasal dari benua Afrika, \ndi mana banyak replika modern dalam bentuk kotak bulat \nseperti kulit kerang dengan Gut / benang benang sutera, \ndi banyak daerah benua itu. Ahli lain menemukan alat ini\ndalam bentuk kaca di relief relief batu tua di zaman Asia\n Tengah dan Asia Kuno. Bahan pemikiran lain juga timbul \ndengan ditemukannya vas vas Yunani Kuno yang bercorak. \nGreek Strings mungkin adalah alat pertama yang dikatagori\nkan sebagai gitar. Gitar modern kemungkinan berakar dari \ngitar Spanyol, tetapi berbagai jenis gitar seperti \ninstrumen instrumen yang kita bisa saksikan dilukisan \nlukisan pada zaman Medieval dan Renaiassance yang banyak \nterdapat diseluruh Eropa");
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
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel1)
                        .addGap(0, 177, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

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
            java.util.logging.Logger.getLogger(Guitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guitar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guitar().setVisible(true);
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
