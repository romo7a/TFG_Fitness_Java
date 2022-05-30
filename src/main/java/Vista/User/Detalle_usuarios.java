/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.User;

import Controlador.CRUD;
import Modelo.Usuarios;
import Vista.Mediciones.Ver_Mediciones;
import Vista.Rutina.Ver_rutina_user;
import Vista.VentanaPrincipal;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class Detalle_usuarios extends javax.swing.JFrame {

    private Usuarios user;
    private CRUD crud;

    public void setCrud(CRUD crud) {
        this.crud = crud;
    }

    /**
     * Creates new form Detalle_usuarios
     */
    public Detalle_usuarios() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    public void setUser(Usuarios user) {
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_ver_rutina = new javax.swing.JButton();
        lbl_image = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txf_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txf_edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txf_DNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txf_fecha_nace = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txf_direccion = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_mediciones = new javax.swing.JMenuItem();
        jmi_rutina = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmi_editar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_ver_rutina.setText("Ver Rutina Actual");
        btn_ver_rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_rutinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addGap(344, 344, 344))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_ver_rutina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_image, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_ver_rutina, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1);

        txf_nombre.setEditable(false);
        txf_nombre.setText("jTextField2");
        jPanel1.add(txf_nombre);

        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2);

        txf_apellido.setEditable(false);
        txf_apellido.setText("jTextField3");
        jPanel1.add(txf_apellido);

        jLabel3.setText("Edad");
        jPanel1.add(jLabel3);

        txf_edad.setEditable(false);
        txf_edad.setText("jTextField3");
        jPanel1.add(txf_edad);

        jLabel4.setText("DNI");
        jPanel1.add(jLabel4);

        txf_DNI.setEditable(false);
        txf_DNI.setText("jTextField3");
        jPanel1.add(txf_DNI);

        jLabel5.setText("Fecha Nacimiento");
        jPanel1.add(jLabel5);

        txf_fecha_nace.setEditable(false);
        txf_fecha_nace.setText("jTextField3");
        jPanel1.add(txf_fecha_nace);

        jLabel6.setText("Direccion");
        jPanel1.add(jLabel6);

        txf_direccion.setEditable(false);
        txf_direccion.setText("jTextField3");
        jPanel1.add(txf_direccion);

        jMenu1.setText("Ver");

        jmi_mediciones.setText("Mediciones");
        jmi_mediciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_medicionesActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_mediciones);

        jmi_rutina.setText("Rutina");
        jmi_rutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_rutinaActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_rutina);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jmi_editar.setText("Editar Usuario");
        jMenu2.add(jmi_editar);

        jmi_eliminar.setText("Eliminar Usuario");
        jmi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminarActionPerformed(evt);
            }
        });
        jMenu2.add(jmi_eliminar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        rellenar_campos();
        cargarImagen();
    }//GEN-LAST:event_formWindowOpened

    private void jmi_medicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_medicionesActionPerformed
        // TODO add your handling code here:
        Ver_Mediciones v_mediciones = new Ver_Mediciones(crud, user);
        v_mediciones.setVisible(true);
    }//GEN-LAST:event_jmi_medicionesActionPerformed

    private void jmi_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_rutinaActionPerformed
        // TODO add your handling code here:
        Ver_rutina_user rutina = new Ver_rutina_user(user, crud);
        rutina.setVisible(true);
    }//GEN-LAST:event_jmi_rutinaActionPerformed

    private void btn_ver_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_rutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ver_rutinaActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        // TODO add your handling code here:user
//        yes = 0, no = 1 , cancel = 2
        int option = JOptionPane.showConfirmDialog(this, "Desea eleminar el usuario " + this.user.getNombre());
        switch (option) {
            case 0:               
                if (crud.eliminarUsuario(this.user)) {
                    JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
                }                
                this.dispose();
                break;
            default:
                break;
        }

    }//GEN-LAST:event_jmi_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Detalle_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Detalle_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Detalle_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Detalle_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Detalle_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ver_rutina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem jmi_editar;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_mediciones;
    private javax.swing.JMenuItem jmi_rutina;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField txf_DNI;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_direccion;
    private javax.swing.JTextField txf_edad;
    private javax.swing.JTextField txf_fecha_nace;
    private javax.swing.JTextField txf_nombre;
    // End of variables declaration//GEN-END:variables

    private void rellenar_campos() {
        txf_nombre.setText(user.getNombre());
        txf_apellido.setText(user.getApellido());
        txf_DNI.setText(user.getDni());
        txf_direccion.setText(user.getDireccion());
        txf_edad.setText(user.getEdad().toString());
        txf_fecha_nace.setText(user.getFechaNacimiento());
    }

    private void cargarImagen() {
        if (user.getImagenPerfil() != null) {
            lbl_image.setIcon(new ImageIcon(new ImageIcon(user.getImagenPerfil()).getImage().getScaledInstance(lbl_image.getWidth(), lbl_image.getHeight(), Image.SCALE_DEFAULT)));
        } else {
            lbl_image.setIcon(new ImageIcon());
        }
    }
}
