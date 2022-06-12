/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Ejercicio;

import Controlador.CRUD;
import Controlador.Utilidades;
import Modelo.Ejercicio;
import Modelo.TipoEjercicio;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class Crear_ejercicio extends javax.swing.JFrame {

    private CRUD crud;
    private Utilidades utilidades;
    private ImageIcon icon;
    private List<TipoEjercicio> listaTipoEjercicios;

    public Crear_ejercicio(CRUD crud) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.crud = crud;
        listaTipoEjercicios = new ArrayList<TipoEjercicio>();
        rellenar_cb();
        utilidades = new Utilidades();
        lbl_imagen.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_imagen.setVerticalAlignment(SwingConstants.CENTER);
        lbl_imagen.setFont(new Font("SansSerif", Font.ITALIC, 20));
    }

    /**
     * Creates new form Crear_ejercicio
     */
    public Crear_ejercicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txf_descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_descanso = new javax.swing.JTextField();
        txf_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_tipo_ejercicio = new javax.swing.JComboBox<>();
        lbl_imagen = new javax.swing.JLabel();
        btn_guardar_ejercicio = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Descripción:");
        jLabel2.setMaximumSize(new java.awt.Dimension(51, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(51, 16));
        jLabel2.setPreferredSize(new java.awt.Dimension(51, 16));

        jLabel3.setText("Descanso:");
        jLabel3.setMaximumSize(new java.awt.Dimension(51, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(51, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(51, 16));

        jLabel4.setText("Nombre");
        jLabel4.setMaximumSize(new java.awt.Dimension(51, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(51, 16));
        jLabel4.setPreferredSize(new java.awt.Dimension(51, 16));

        jLabel5.setText("Tipo Ejercicio");
        jLabel5.setMaximumSize(new java.awt.Dimension(51, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(51, 16));
        jLabel5.setPreferredSize(new java.awt.Dimension(51, 16));

        lbl_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_imagen.setText("AÑADIR IMAGEN");
        lbl_imagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        lbl_imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imagenMouseClicked(evt);
            }
        });

        btn_guardar_ejercicio.setText("Guardar Ejercicio");
        btn_guardar_ejercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_ejercicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txf_descripcion)
                    .addComponent(txf_descanso)
                    .addComponent(txf_nombre)
                    .addComponent(cb_tipo_ejercicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(lbl_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(295, 295, 295))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_guardar_ejercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txf_descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txf_descanso, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_tipo_ejercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardar_ejercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Crear Nuevo Tipo de Ejercicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_imagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imagenMouseClicked
        // TODO add your handling code here:

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(false);
        fileChooser.setCurrentDirectory(new File("./"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG, JPG", "png", "jpg");
        fileChooser.addChoosableFileFilter(filter);

        int seleccion = fileChooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                lbl_imagen.setText("");
                lbl_imagen.setBorder(null);
                String archivo = fileChooser.getSelectedFile().getAbsolutePath();
                File imagenFile = new File(archivo);
                BufferedImage img = ImageIO.read(imagenFile);
                BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_BGR);
                Graphics2D g = dest.createGraphics();
                AffineTransform at = AffineTransform.getScaleInstance(img.getWidth() / img.getWidth(), img.getHeight() / img.getHeight());
                g.drawRenderedImage(img, at);
                icon = new ImageIcon(archivo);
                icon = new ImageIcon(dest);
                lbl_imagen.setIcon(new ImageIcon(new ImageIcon(dest).getImage().getScaledInstance(lbl_imagen.getWidth(), lbl_imagen.getHeight(), Image.SCALE_DEFAULT)));
                icon.getIconHeight();
                JOptionPane.showMessageDialog(this, "Imagen cargada correctamente");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al cargar la imagen" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_lbl_imagenMouseClicked

    private void btn_guardar_ejercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_ejercicioActionPerformed
        // TODO add your handling code here:
        if (txf_nombre.getText().trim().isEmpty() || txf_descanso.getText().trim().isEmpty() || txf_descripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete los tres campos para crear un ejercicio correctamente");            
            return;
        }
        Ejercicio e = new Ejercicio();
        e.setNombre(txf_nombre.getText().trim());
        e.setDescripcion(txf_descripcion.getText().trim());
        e.setDescanso(txf_descanso.getText().trim());
        if (icon != null) {
            e.setImagen(utilidades.imageToByte(utilidades.iconToImage(icon)));
        }
        if (cb_tipo_ejercicio.getSelectedIndex() != -1) {
            e.setIdTipoEjercicio(listaTipoEjercicios.get(cb_tipo_ejercicio.getSelectedIndex()));
        }
        if (crud.InsertarEjercicio(e)) {
            JOptionPane.showMessageDialog(this, "Ejercicio Insertado Correctamente");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "El ejercicio no se ha podido insertar");
        }

    }//GEN-LAST:event_btn_guardar_ejercicioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        utilidades.crearNuevoTipoEjercicio(crud);
        rellenar_cb();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Crear_ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_ejercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar_ejercicio;
    private javax.swing.JComboBox<String> cb_tipo_ejercicio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JTextField txf_descanso;
    private javax.swing.JTextField txf_descripcion;
    private javax.swing.JTextField txf_nombre;
    // End of variables declaration//GEN-END:variables

    private void rellenar_cb() {
        listaTipoEjercicios.clear();
        cb_tipo_ejercicio.removeAllItems();
        listaTipoEjercicios = crud.ListarTipoEjercicios();
        for (TipoEjercicio ej : listaTipoEjercicios) {
            cb_tipo_ejercicio.addItem(ej.getTipoEjercicio());
        }

    }
}
