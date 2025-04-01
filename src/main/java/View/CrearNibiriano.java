package View;

//NETBENAS
import javax.swing.JOptionPane;

//PROYECTO
import static Controller.Controlador.*;
import DAO_Controller.DAOSQL;
import Excepcion.DAO_Excep;
import Excepcion.SerExcepcion;
import Model.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearNibiriano extends javax.swing.JDialog {

    /**
     * Crear clase CrearNibiriano
     *
     * @param parent
     * @param modal
     */
    public CrearNibiriano(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
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
        crearnibiriano.setText("Alta nibiriano");
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

        //Variables de las propiedades de la especie
        String name = nombreciudadano.getText();
        String comida = (String) grupoalimenticio.getSelectedItem();
        String planeta = (String) nombreplaneta.getSelectedItem();

        //Creacion de objeto Planeta y Ser
        Planeta p = null;
        try {
            p = getPlanet(new Planeta(planeta));
        } catch (DAO_Excep ex) {
            Logger.getLogger(CrearNibiriano.class.getName()).log(Level.SEVERE, null, ex);
        }
        Ser s = new Nibiriano(comida, name);

        //Si el nombre NO esta vacio ejecuta lo que esta dentro del IF
        if (!(name.isEmpty())) {
            //Si el nombre es más pequeño o igual a 3 muestra el siguiente mensaje
            if (name.length() <= 3) {
                JOptionPane.showMessageDialog(this, "La longitud del nombre"
                        + " no es correcto (4)",
                        "Nombre incorrecto", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    //Llama la funcion createser y añado los objetos
                    createser(s, p);
                    JOptionPane.showMessageDialog(this, "Se ha registrado correctamente el ciudadano",
                            "Ciudadano Registrado", JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                } catch (SerExcepcion ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),
                            "Ciudadano No Registrado", JOptionPane.ERROR_MESSAGE);
                } catch (DAO_Excep ex) {
                    Logger.getLogger(CrearNibiriano.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            //Si el nombre esta vacio muestra el siguiente mensaje
            JOptionPane.showMessageDialog(this, "No se permite campos vacios",
                    "Datos vacios", JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_crearnibirianoActionPerformed

    /**
     * Cuando la ventana es el focus
     *
     * @param evt
     */
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

    //===============================================================================================//
    //||                                                                                           ||//
    //===============================================================================================//
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
            java.util.logging.Logger.getLogger(CrearNibiriano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearNibiriano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearNibiriano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearNibiriano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrearNibiriano dialog = new CrearNibiriano(new javax.swing.JDialog(), true);
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
