package View;

import javax.swing.JOptionPane;

import static Controller.Controlador.*;
import DAO_Controller.DAOSQL;
import Excepcion.DAO_Excep;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModificarNibiriano extends javax.swing.JDialog {

    /**
     * Crear clase CrearNibiriano
     *
     * @param parent
     * @param modal
     */
    public ModificarNibiriano(javax.swing.JDialog parent, boolean modal, Nibiriano c) {
        super(parent, modal);
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);

        nombreciudadano.setText(c.getName());
        nombreciudadano.setEnabled(false);
        nombreplaneta.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        nombreciudadano = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        grupoalimenticio = new javax.swing.JComboBox<>();
        crearnibiriano = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nombreplaneta = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText(" Nombre: ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(153, 153, 153)));
        jLabel1.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 10, 10);
        getContentPane().add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 10);
        getContentPane().add(nombreciudadano, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText(" Grupo: ");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(153, 153, 153)));
        jLabel2.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 10, 10);
        getContentPane().add(jLabel2, gridBagConstraints);

        grupoalimenticio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carnivoro", "Vegetariano" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 10);
        getContentPane().add(grupoalimenticio, gridBagConstraints);

        crearnibiriano.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crearnibiriano.setForeground(new java.awt.Color(0, 0, 0));
        crearnibiriano.setText("Modificar nibiriano");
        crearnibiriano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearnibirianoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(40, 20, 20, 20);
        getContentPane().add(crearnibiriano, gridBagConstraints);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText(" Reside: ");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(153, 153, 153)));
        jLabel4.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(20, 40, 10, 10);
        getContentPane().add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 10, 40);
        getContentPane().add(nombreplaneta, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //===============================================================================================//
    //||                                                                                           ||//
    //===============================================================================================//
    /**
     * Esta funcion es el boton y sirve para crear el ciudadano
     *
     * @param evt
     */
    private void crearnibirianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearnibirianoActionPerformed
        // TODO add your handling code here:

        //Variables de las propiedades de Humano
        String name = nombreciudadano.getText();
        String planeta = (String) nombreplaneta.getSelectedItem();

        //Variable que se modifica
        String comida = (String) grupoalimenticio.getSelectedItem();

        //Conseguimos el hashcode mediante el nombre
        Ser s = null;
        try {
            s = getSer(new Ser(name));
        } catch (DAO_Excep ex) {
            Logger.getLogger(ModificarNibiriano.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Creamos una variable Nibiriano sn que equivale a Ser s
        Nibiriano sn = (Nibiriano) s;

        //ACtualizamos la informacion
        sn.setFloraOrFish(comida);

        JOptionPane.showMessageDialog(this, "Se ha modificado correctamente el ciudadano",
                "Ciudadano Modificado", JOptionPane.INFORMATION_MESSAGE);
        dispose();


    }//GEN-LAST:event_crearnibirianoActionPerformed
    //===============================================================================================//
    //||                                                                                           ||//
    //===============================================================================================//


    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        DAOSQL d = new DAOSQL();
        nombreplaneta.removeAllItems();
        try {
            for (Planeta p : d.obtainPlanets()) {
                nombreplaneta.addItem(p.getName());
            }
        } catch (DAO_Excep ex) {
            Logger.getLogger(CrearFerengi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ModificarNibiriano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ModificarNibiriano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ModificarNibiriano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ModificarNibiriano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ModificarNibiriano dialog = new ModificarNibiriano(new javax.swing.JDialog(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearnibiriano;
    private javax.swing.JComboBox<String> grupoalimenticio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreciudadano;
    private javax.swing.JComboBox<String> nombreplaneta;
    // End of variables declaration//GEN-END:variables
}
