/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

//NETBEANS
import javax.swing.JOptionPane;

//PROYECTO
import static Controller.Controlador.*;
import DAO_Controller.DAOSQL;
import Excepcion.DAO_Excep;
import Excepcion.SerExcepcion;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Baja extends javax.swing.JDialog {

    boolean ejecutaUsuario = false;

    /**
     * Creates new form Baja
     */
    public Baja(javax.swing.JFrame parent, boolean modal) throws DAO_Excep {
        super(parent, modal);
        DAOSQL d = new DAOSQL();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        //Por defecto carga los planetas
        for (Planeta planeta : d.obtainPlanets()) {
            nombreslista.addItem(planeta.getName());
        }
        ejecutaUsuario = true;

        String nombre = (String) nombreslista.getSelectedItem();
        System.out.println(nombre);
        Planeta p = d.getPlanet(new Planeta(nombre));
        System.out.println(p);
        info.setText(p.toString());
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

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreslista = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        filtro = new javax.swing.JComboBox<>();
        eliminarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo.setText(" Planeta/Ciudadano ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel1.add(titulo, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText(" Nombre: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 40, 10, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        nombreslista.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nombreslistaItemStateChanged(evt);
            }
        });
        nombreslista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreslistaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(nombreslista, gridBagConstraints);

        info.setEditable(false);
        info.setFocusable(false);
        jScrollPane1.setViewportView(info);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 200;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText(" Filtro: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel1.add(jLabel3, gridBagConstraints);

        filtro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Planetas", "Ciudadanos" }));
        filtro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filtroItemStateChanged(evt);
            }
        });
        filtro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 40);
        jPanel1.add(filtro, gridBagConstraints);

        eliminarButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 40, 10);
        jPanel1.add(eliminarButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here: 
        DAOSQL d = new DAOSQL();
        int resultadoConfirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas eliminar el ciudadano"
                + " / planeta seleccionado?", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
        if (resultadoConfirmacion == 0) {
            String nombre = (String) nombreslista.getSelectedItem();
            if (filtro.getSelectedItem().equals("Planetas")) {
                Planeta p = null;
                try {
                    p = d.getPlanet(new Planeta(nombre));
                } catch (DAO_Excep ex) {
                    Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    d.deletepla(p);
                    dispose();
                } catch (DAO_Excep ex) {
                    Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            } else if (filtro.getSelectedItem().equals("Ciudadanos")) {
                Ser s = null;
                try {
                    s = d.getSer(new Ser(nombre));
                } catch (DAO_Excep ex) {
                    Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    deleteser(s);
                    dispose();
                } catch (SerExcepcion ex) {
                    Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DAO_Excep ex) {
                    Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void filtroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filtroItemStateChanged
        ejecutaUsuario = false;
        DAOSQL d = new DAOSQL();
        nombreslista.removeAllItems();
        if (filtro.getSelectedItem().toString().equals("Planetas")) {
            try {
                for (Planeta planeta : d.obtainPlanets()) {
                    nombreslista.addItem(planeta.getName());
                }
            } catch (DAO_Excep ex) {
                Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
            }
            info.setText("");
            try {
                info.setText(d.getPlanet(new Planeta((String) nombreslista.getSelectedItem())).toString());
            } catch (DAO_Excep ex) {
                Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (filtro.getSelectedItem().toString().equals("Ciudadanos")) {
            try {
                for (Ser s : d.obtainSeres()) {
                    nombreslista.addItem(s.getName());
                }
            } catch (DAO_Excep ex) {
                Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
            }
            info.setText("");
            try {
                info.setText(d.getSer(new Ser((String) nombreslista.getSelectedItem())).toString()
                        + "\n" + d.getPlanetaSer(new Ser((String) nombreslista.getSelectedItem())));
            } catch (DAO_Excep ex) {
                Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ejecutaUsuario = true;
    }//GEN-LAST:event_filtroItemStateChanged

    private void nombreslistaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nombreslistaItemStateChanged
        if (!ejecutaUsuario) {

        } else {
            DAOSQL d = new DAOSQL();
            info.setText("");
            if (filtro.getSelectedItem().toString().equals("Planetas")) {
                String nombre = nombreslista.getSelectedItem().toString();
                try {
                    info.setText(d.getPlanet(new Planeta(nombre)).toString());
                } catch (DAO_Excep ex) {
                    Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (filtro.getSelectedItem().toString().equals("Ciudadanos")) {
                String nombre = nombreslista.getSelectedItem().toString();
                try {
                    info.setText(d.getSer(new Ser(nombre)).toString()
                            + "\n" + d.getPlanetaSer(new Ser(nombre)));
                } catch (DAO_Excep ex) {
                    Logger.getLogger(Baja.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_nombreslistaItemStateChanged

    private void filtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtroActionPerformed

    private void nombreslistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreslistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreslistaActionPerformed

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
            java.util.logging.Logger.getLogger(Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                Baja dialog = new Baja(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminarButton;
    private javax.swing.JComboBox<String> filtro;
    private javax.swing.JTextPane info;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nombreslista;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
