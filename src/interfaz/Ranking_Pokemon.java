/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author home
 */
public class Ranking_Pokemon extends javax.swing.JFrame {

    /**
     * Creates new form Ranking_Pokemon
     */
    public Ranking_Pokemon() {
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

        btnConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 410));
        setPreferredSize(new java.awt.Dimension(710, 410));
        getContentPane().setLayout(null);

        btnConsultar.setBackground(java.awt.Color.orange);
        btnConsultar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(102, 62, 0));
        btnConsultar.setText("Reporte");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(20, 330, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ClearGranularDuckling-max-1mb.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 20, 460, 320);

        btnRegresar.setBackground(java.awt.Color.orange);
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(102, 62, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(230, 330, 90, 23);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnRanking.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 270, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonRegresar.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 270, 50, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 60, 330, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panel1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 50, 350, 210);

        btnRegresar1.setBackground(java.awt.Color.orange);
        btnRegresar1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegresar1.setForeground(new java.awt.Color(102, 62, 0));
        btnRegresar1.setText("Menú");
        btnRegresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresar1MouseClicked(evt);
            }
        });
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar1);
        btnRegresar1.setBounds(130, 330, 70, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonMenu.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 270, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/11RankingPokemon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void btnRegresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresar1MouseClicked
        // TODO add your handling code here:
        PantallaPrincipal pantPrincipal= new PantallaPrincipal();
        pantPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresar1MouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
        Reportes_Menu reportes= new Reportes_Menu();
        reportes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

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
            java.util.logging.Logger.getLogger(Ranking_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ranking_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ranking_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ranking_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ranking_Pokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}