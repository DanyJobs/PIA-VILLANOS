/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author Gustavo
 */
public class ConsultaPokemonEntrenador extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaPokemonEntrenador
     */
    public ConsultaPokemonEntrenador() {
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
        txtFEntrenador = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 410));
        setPreferredSize(new java.awt.Dimension(710, 410));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel2.setText("Entrenador:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 80, 90, 21);

        txtFEntrenador.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        getContentPane().add(txtFEntrenador);
        txtFEntrenador.setBounds(380, 80, 200, 30);

        btnBuscar.setBackground(java.awt.Color.orange);
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(102, 62, 0));
        btnBuscar.setText("Buscar");
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(590, 100, 73, 23);

        btnMenu.setBackground(java.awt.Color.orange);
        btnMenu.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(102, 62, 0));
        btnMenu.setText("Men??");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(570, 240, 90, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonBuscar.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 50, 40, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BotonMenu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(590, 180, 50, 50);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 160, 270, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panel1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(270, 150, 290, 170);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1513007738_tumblr_static_tumblr_mej51ffwsk1qmxcsxo1_250.gif"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-10, 150, 290, 210);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/20ConsultaEntrenadorPokemon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ConsultaPokemonEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaPokemonEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaPokemonEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaPokemonEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPokemonEntrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtFEntrenador;
    // End of variables declaration//GEN-END:variables
}
