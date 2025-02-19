
package Controlador;

public class ListaPedido extends javax.swing.JDialog {

    public ListaPedido(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Mikhuna");
        this.setSize(1000, 600);
        this.setResizable(false);
        setLocationRelativeTo(null);
        jtbl_listaPedidoP.getTableHeader().setPreferredSize(new java.awt.Dimension(0,30));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_listaPedidoP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jbtn_verLP = new javax.swing.JButton();
        jbtn_agregarLP = new javax.swing.JButton();
        jbtn_editarLP = new javax.swing.JButton();
        jbtn_anularLP = new javax.swing.JButton();
        jbtn_cobrarLP = new javax.swing.JButton();
        jbtn_facturaLP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jtbl_listaPedidoP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtbl_listaPedidoP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "MESA", "DIRECCION", "MONTO", "ESTADO", "FECHA INICIO", "FECHA COCINADO"
            }
        ));
        jtbl_listaPedidoP.getTableHeader().setResizingAllowed(false);
        jtbl_listaPedidoP.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtbl_listaPedidoP);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 930, 390);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("LISTA DE PEDIDOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 30, 140, 17);

        jbtn_verLP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_verLP.setText("VER");
        getContentPane().add(jbtn_verLP);
        jbtn_verLP.setBounds(410, 510, 100, 30);

        jbtn_agregarLP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_agregarLP.setText("AGREGAR");
        getContentPane().add(jbtn_agregarLP);
        jbtn_agregarLP.setBounds(50, 510, 100, 30);

        jbtn_editarLP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_editarLP.setText("EDITAR");
        getContentPane().add(jbtn_editarLP);
        jbtn_editarLP.setBounds(170, 510, 100, 30);

        jbtn_anularLP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_anularLP.setText("ANULAR");
        getContentPane().add(jbtn_anularLP);
        jbtn_anularLP.setBounds(290, 510, 100, 30);

        jbtn_cobrarLP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_cobrarLP.setText("COBRAR");
        getContentPane().add(jbtn_cobrarLP);
        jbtn_cobrarLP.setBounds(830, 510, 100, 30);

        jbtn_facturaLP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtn_facturaLP.setText("FACTURA");
        getContentPane().add(jbtn_facturaLP);
        jbtn_facturaLP.setBounds(710, 510, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ListaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListaPedido dialog = new ListaPedido(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtn_agregarLP;
    private javax.swing.JButton jbtn_anularLP;
    private javax.swing.JButton jbtn_cobrarLP;
    private javax.swing.JButton jbtn_editarLP;
    private javax.swing.JButton jbtn_facturaLP;
    private javax.swing.JButton jbtn_verLP;
    private javax.swing.JTable jtbl_listaPedidoP;
    // End of variables declaration//GEN-END:variables
}
