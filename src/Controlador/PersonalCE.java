/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.TipoEmpleado;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Alonso
 */
public class PersonalCE extends javax.swing.JDialog {

    /**
     * Creates new form EditarPersonal
     */
    public PersonalCE(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(550, 500);
        this.setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxt_codigoP = new javax.swing.JTextField();
        jtxt_nombreP = new javax.swing.JTextField();
        jbtn_confirmarP = new javax.swing.JButton();
        jbtn_cancelarP = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxt_documentoP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_telefonoP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxt_direccionP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CODIGO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 50, 60, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 100, 50, 15);

        jtxt_codigoP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_codigoP);
        jtxt_codigoP.setBounds(170, 40, 340, 30);

        jtxt_nombreP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_nombreP);
        jtxt_nombreP.setBounds(170, 90, 340, 30);

        jbtn_confirmarP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_confirmarP.setText("CONFIRMAR");
        jbtn_confirmarP.setPreferredSize(new java.awt.Dimension(90, 20));
        jbtn_confirmarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_confirmarPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_confirmarP);
        jbtn_confirmarP.setBounds(160, 410, 100, 40);

        jbtn_cancelarP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_cancelarP.setText("CANCELAR");
        jbtn_cancelarP.setPreferredSize(new java.awt.Dimension(90, 20));
        jbtn_cancelarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarPActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_cancelarP);
        jbtn_cancelarP.setBounds(310, 410, 100, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("DOCUMENTO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 150, 90, 15);

        jtxt_documentoP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_documentoP);
        jtxt_documentoP.setBounds(170, 140, 340, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("TELEFONO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 200, 90, 15);

        jtxt_telefonoP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_telefonoP);
        jtxt_telefonoP.setBounds(170, 190, 340, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("DIRECCION");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 250, 80, 15);

        jtxt_direccionP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(jtxt_direccionP);
        jtxt_direccionP.setBounds(170, 240, 340, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_confirmarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_confirmarPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtn_confirmarPActionPerformed

    private void jbtn_cancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarPActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jbtn_cancelarPActionPerformed

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
            java.util.logging.Logger.getLogger(PersonalCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalCE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PersonalCE dialog = new PersonalCE(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbtn_cancelarP;
    private javax.swing.JButton jbtn_confirmarP;
    private javax.swing.JTextField jtxt_codigoP;
    private javax.swing.JTextField jtxt_direccionP;
    private javax.swing.JTextField jtxt_documentoP;
    private javax.swing.JTextField jtxt_nombreP;
    private javax.swing.JTextField jtxt_telefonoP;
    // End of variables declaration//GEN-END:variables

}
