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
public class Reportes_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Reportes_Menu
     */
    public Reportes_Menu() {
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

        btnCandidatos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnPokemonTipo = new javax.swing.JButton();
        btnEntrenadorRango = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();
        btnEntrenadorTipo = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(715, 410));
        setPreferredSize(new java.awt.Dimension(715, 410));
        getContentPane().setLayout(null);

        btnCandidatos.setBackground(java.awt.Color.orange);
        btnCandidatos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnCandidatos.setForeground(new java.awt.Color(102, 62, 0));
        btnCandidatos.setText("Candidatos Liga Pokémon");
        btnCandidatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCandidatosMouseClicked(evt);
            }
        });
        btnCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidatosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCandidatos);
        btnCandidatos.setBounds(80, 180, 185, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pikachu-2 (1).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 100, 90, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/player-1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 100, 90, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/star-1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(520, 100, 80, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrenador tipo (1).png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 220, 140, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/entrenador rango (2).png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 220, 130, 90);

        btnPokemonTipo.setBackground(java.awt.Color.orange);
        btnPokemonTipo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnPokemonTipo.setForeground(new java.awt.Color(102, 62, 0));
        btnPokemonTipo.setText("Pokémon por tipo");
        btnPokemonTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPokemonTipoMouseClicked(evt);
            }
        });
        getContentPane().add(btnPokemonTipo);
        btnPokemonTipo.setBounds(300, 180, 140, 20);

        btnEntrenadorRango.setBackground(java.awt.Color.orange);
        btnEntrenadorRango.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEntrenadorRango.setForeground(new java.awt.Color(102, 62, 0));
        btnEntrenadorRango.setText("Entrenadores por rango de folio");
        btnEntrenadorRango.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrenadorRangoMouseClicked(evt);
            }
        });
        btnEntrenadorRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrenadorRangoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrenadorRango);
        btnEntrenadorRango.setBounds(290, 310, 220, 25);

        btnRanking.setBackground(java.awt.Color.orange);
        btnRanking.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRanking.setForeground(new java.awt.Color(102, 62, 0));
        btnRanking.setText("Ranking Pokémon");
        btnRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRankingMouseClicked(evt);
            }
        });
        getContentPane().add(btnRanking);
        btnRanking.setBounds(490, 180, 140, 25);

        btnEntrenadorTipo.setBackground(java.awt.Color.orange);
        btnEntrenadorTipo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnEntrenadorTipo.setForeground(new java.awt.Color(102, 62, 0));
        btnEntrenadorTipo.setText("Entrenador por tipo pokémon");
        btnEntrenadorTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrenadorTipoMouseClicked(evt);
            }
        });
        getContentPane().add(btnEntrenadorTipo);
        btnEntrenadorTipo.setBounds(60, 310, 210, 25);

        btnMenu.setBackground(java.awt.Color.orange);
        btnMenu.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(102, 62, 0));
        btnMenu.setText("Menú");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(550, 310, 70, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonMenu.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(560, 240, 50, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/08Reportes2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrenadorRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrenadorRangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrenadorRangoActionPerformed

    private void btnCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidatosActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnCandidatosActionPerformed

    private void btnCandidatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCandidatosMouseClicked
        // TODO add your handling code here:
        Candidatos candidatos= new Candidatos();
        candidatos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCandidatosMouseClicked

    private void btnPokemonTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPokemonTipoMouseClicked
        // TODO add your handling code here:
        Pokemon_tipo poketipo= new Pokemon_tipo();
        poketipo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPokemonTipoMouseClicked

    private void btnRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRankingMouseClicked
        // TODO add your handling code here:
        Ranking_Pokemon ranking= new Ranking_Pokemon();
        ranking.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRankingMouseClicked

    private void btnEntrenadorTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrenadorTipoMouseClicked
        // TODO add your handling code here:
        Entrenador_Tipo_Pokemon entTipo= new Entrenador_Tipo_Pokemon();
        entTipo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEntrenadorTipoMouseClicked

    private void btnEntrenadorRangoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrenadorRangoMouseClicked
        // TODO add your handling code here:
        Entrenadores_Rango entRango= new Entrenadores_Rango();
        entRango.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_btnEntrenadorRangoMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        // TODO add your handling code here:
        PantallaPrincipal pantPrincipal= new PantallaPrincipal();
        pantPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Reportes_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCandidatos;
    private javax.swing.JButton btnEntrenadorRango;
    private javax.swing.JButton btnEntrenadorTipo;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPokemonTipo;
    private javax.swing.JButton btnRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
