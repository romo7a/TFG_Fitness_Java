/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.User;

import Controlador.CRUD;
import Controlador.Utilidades;
import Modelo.Usuarios;
import Vista.Mediciones.Ver_Mediciones;
import Vista.Rutina.Ver_rutina_user;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class Detalle_usuarios extends javax.swing.JFrame {

    private Usuarios user_updated;
    private CRUD crud;
    private ImageIcon icon;
    private Utilidades utilidades;
    private boolean modo_editar;
    private static Usuarios user_original;

    public void setCrud(CRUD crud) {
        this.crud = crud;
    }

    /**
     * Creates new form Detalle_usuarios
     */
    public Detalle_usuarios() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        btn_guardar_edit.setVisible(false);
        utilidades = new Utilidades();
        modo_editar = false;
        jmn_desactivar_editar.setVisible(false);

    }

    public void setUser(Usuarios user) {
        this.user_updated = user;
        this.user_original = user;
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
        btn_guardar_edit = new javax.swing.JButton();
        lbl_imagen_user = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txf_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txf_apellido = new javax.swing.JTextField();
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
        jmn_editar = new javax.swing.JMenuItem();
        jmn_desactivar_editar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmi_eliminar = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_guardar_edit.setText("Guardar Cambios");
        btn_guardar_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_editActionPerformed(evt);
            }
        });

        lbl_imagen_user.setBorder(new javax.swing.border.MatteBorder(null));
        lbl_imagen_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imagen_userMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_guardar_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(370, 370, 370)
                .addComponent(lbl_imagen_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(373, 373, 373))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_guardar_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_imagen_user, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
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

        jmn_editar.setText("Activar Modo Editar");
        jmn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_editarActionPerformed(evt);
            }
        });
        jMenu2.add(jmn_editar);

        jmn_desactivar_editar.setText("Desactivar Modo Editar");
        jmn_desactivar_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmn_desactivar_editarActionPerformed(evt);
            }
        });
        jMenu2.add(jmn_desactivar_editar);
        jMenu2.add(jSeparator1);

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
        Ver_Mediciones v_mediciones = new Ver_Mediciones(crud, user_updated);
        v_mediciones.setVisible(true);
    }//GEN-LAST:event_jmi_medicionesActionPerformed

    private void jmi_rutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_rutinaActionPerformed
        // TODO add your handling code here:
        Ver_rutina_user rutina = new Ver_rutina_user(user_updated, crud);
        rutina.setVisible(true);
    }//GEN-LAST:event_jmi_rutinaActionPerformed

    private void btn_guardar_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_editActionPerformed
        // TODO add your handling code here:
        if (txf_nombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo nombre es obligatorio");
            return;
        } else if (txf_apellido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo apellido es obligatorio");
            return;
        } else if (txf_DNI.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo DNI es obligatorio");
            return;
        } else if (txf_fecha_nace.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo fecha de nacimiento es obligatorio");
            return;
        }
        int option = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios?");
//      yes = 0, no = 1 , cancel = 2
        switch (option) {
            case 0:
                updateUser();
                if (crud.actualizarUsuario(user_updated)) {
                    JOptionPane.showMessageDialog(this, "Usuario Actualizado Correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al actualizar el usuario");
                }
                this.dispose();
                break;
            default:
                break;
        }

        editableFalse();

    }//GEN-LAST:event_btn_guardar_editActionPerformed

    private void jmi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminarActionPerformed
        // TODO add your handling code here:user_updated
//        yes = 0, no = 1 , cancel = 2
        int option = JOptionPane.showConfirmDialog(this, "Desea eleminar el usuario " + this.user_updated.getNombre());
        switch (option) {
            case 0:
                if (crud.eliminarUsuario(this.user_updated)) {
                    JOptionPane.showMessageDialog(this, "Usuario eliminado correctamente");
                }
                this.dispose();
                break;
            default:
                break;
        }

    }//GEN-LAST:event_jmi_eliminarActionPerformed

    private void jmn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmn_editarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Modo edición activado");
        editableTrue();
    }//GEN-LAST:event_jmn_editarActionPerformed

    private void jmn_desactivar_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmn_desactivar_editarActionPerformed
        // TODO add your handling code here:
        //        yes = 0, no = 1 , cancel = 2
        int option = JOptionPane.showConfirmDialog(this, "¿Desea salir del modo edición sin guardar cambios?\nSe volverán a cargar"
                + "los datos del usuario original ");
        switch (option) {
            case 0:
                cargarOriginal();
                break;
            default:
                break;
        }

        editableFalse();
        JOptionPane.showMessageDialog(this, "Modo editar Desactivado");
    }//GEN-LAST:event_jmn_desactivar_editarActionPerformed

    private void lbl_imagen_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imagen_userMouseClicked
        // TODO add your handling code here:
        if (modo_editar == true) {

            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG, JPG", "png");
            fileChooser.setMultiSelectionEnabled(false);
            fileChooser.setCurrentDirectory(new File("./"));
            fileChooser.addChoosableFileFilter(filter);
            int seleccion = fileChooser.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                try {
                    lbl_imagen_user.setText("");
                    lbl_imagen_user.setBorder(null);
                    String archivo = fileChooser.getSelectedFile().getAbsolutePath();
                    File imagenFile = new File(archivo);
                    BufferedImage img = ImageIO.read(imagenFile);
                    BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_BGR);
                    Graphics2D g = dest.createGraphics();
                    AffineTransform at = AffineTransform.getScaleInstance(img.getWidth() / img.getWidth(), img.getHeight() / img.getHeight());
                    g.drawRenderedImage(img, at);
                    icon = new ImageIcon(archivo);
                    icon = new ImageIcon(dest);
                    lbl_imagen_user.setIcon(new ImageIcon(new ImageIcon(dest).getImage().getScaledInstance(lbl_imagen_user.getWidth(), lbl_imagen_user.getHeight(), Image.SCALE_DEFAULT)));
                    icon.getIconHeight();
                    JOptionPane.showMessageDialog(this, "Imagen cargada correctamente");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error al cargar la imagen" + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_lbl_imagen_userMouseClicked

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
    private javax.swing.JButton btn_guardar_edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_mediciones;
    private javax.swing.JMenuItem jmi_rutina;
    private javax.swing.JMenuItem jmn_desactivar_editar;
    private javax.swing.JMenuItem jmn_editar;
    private javax.swing.JLabel lbl_imagen_user;
    private javax.swing.JTextField txf_DNI;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_direccion;
    private javax.swing.JTextField txf_fecha_nace;
    private javax.swing.JTextField txf_nombre;
    // End of variables declaration//GEN-END:variables

    private void rellenar_campos() {
        txf_nombre.setText(user_updated.getNombre());
        txf_apellido.setText(user_updated.getApellido());
        txf_DNI.setText(user_updated.getDni());
        txf_direccion.setText(user_updated.getDireccion());
        txf_fecha_nace.setText(user_updated.getFechaNacimiento());
    }

    private void cargarImagen() {
        if (user_updated.getImagenPerfil() != null) {
            lbl_imagen_user.setText("");
            lbl_imagen_user.setIcon(new ImageIcon(new ImageIcon(user_updated.getImagenPerfil()).getImage().getScaledInstance(lbl_imagen_user.getWidth(), lbl_imagen_user.getHeight(), Image.SCALE_DEFAULT)));
        } else {
            lbl_imagen_user.setText("Añada una Imagen");
            lbl_imagen_user.setHorizontalAlignment(SwingConstants.CENTER);
            lbl_imagen_user.setVerticalAlignment(SwingConstants.CENTER);
            lbl_imagen_user.setFont(new Font("SansSerif", Font.ITALIC, 20));
            lbl_imagen_user.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, true));
        }
    }

    private void editableTrue() {
        //Activar y desactivar botones de menú
        jmn_editar.setVisible(false);
        jmn_desactivar_editar.setVisible(true);

        txf_DNI.setEditable(true);
        txf_apellido.setEditable(true);
        txf_direccion.setEditable(true);
        txf_fecha_nace.setEditable(true);
        txf_nombre.setEditable(true);
        btn_guardar_edit.setVisible(true);
        modo_editar = true;
    }

    private void editableFalse() {
        //Activar y desactivar botones de menú
        jmn_editar.setVisible(true);
        jmn_desactivar_editar.setVisible(false);
        
        txf_DNI.setEditable(false);
        txf_apellido.setEditable(false);
        txf_direccion.setEditable(false);
        txf_fecha_nace.setEditable(false);
        txf_nombre.setEditable(false);
        btn_guardar_edit.setVisible(false);
        modo_editar = false;
    }

    private void updateUser() {
        user_updated.setNombre(txf_nombre.getText().trim());
        user_updated.setApellido(txf_apellido.getText().trim());
        user_updated.setDireccion(txf_direccion.getText().trim());
        user_updated.setDni(txf_DNI.getText().trim());
        user_updated.setFechaNacimiento(txf_fecha_nace.getText().trim());
        if (icon != null) {
            user_updated.setImagenPerfil(utilidades.imageToByte(utilidades.iconToImage(icon)));
        }
    }

    private void cargarOriginal() {
        txf_nombre.setText(user_original.getNombre());
        txf_apellido.setText(user_original.getApellido());
        txf_DNI.setText(user_original.getDni());
        txf_direccion.setText(user_original.getDireccion());
        txf_fecha_nace.setText(user_original.getFechaNacimiento());
    }
}
