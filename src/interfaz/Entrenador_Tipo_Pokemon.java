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
public class Entrenador_Tipo_Pokemon extends javax.swing.JFrame {

    /**
     * Creates new form Entrenador_Tipo_Pokemon
     */
    public Entrenador_Tipo_Pokemon() {
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

        jLabel2 = new javax.swing.JLabel();
        btnReporte = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 410));
        setPreferredSize(new java.awt.Dimension(710, 410));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Elige tipo de pokémon");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 60, 160, 21);

        btnReporte.setBackground(java.awt.Color.orange);
        btnReporte.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(102, 62, 0));
        btnReporte.setText("Reporte");
        getContentPane().add(btnReporte);
        btnReporte.setBounds(600, 70, 90, 23);

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(460, 60, 130, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 100, 170, 200);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/26.gif"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 100, 180, 160);

        btnRegresar.setBackground(java.awt.Color.orange);
        btnRegresar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(102, 62, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(560, 340, 90, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonRegresar.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 280, 50, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btnEntrenador.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(620, 20, 50, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 120, 350, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panel1.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 110, 380, 160);

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
        btnMenu.setBounds(410, 340, 65, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonMenu.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 280, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/12EntrenadorTipoPokemon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 699, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        // TODO add your handling code here:
        PantallaPrincipal pantPrincipal= new PantallaPrincipal();
        pantPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Entrenador_Tipo_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrenador_Tipo_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrenador_Tipo_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrenador_Tipo_Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrenador_Tipo_Pokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}