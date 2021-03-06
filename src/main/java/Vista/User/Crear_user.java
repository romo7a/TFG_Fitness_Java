/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.User;

import Controlador.CRUD;
import Controlador.CalculaNif;
import Controlador.Utilidades;
import Modelo.Rutina;
import Modelo.Usuarios;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public class Crear_user extends javax.swing.JFrame {

    private CRUD crud;
    private List<Rutina> lista_rutinas;
    private ImageIcon icon;
    private Utilidades utilidades;
    private CalculaNif NIF;

    public Crear_user(CRUD crud) {
        initComponents();
        this.crud = crud;
        rellenar_campos();
        this.setExtendedState(MAXIMIZED_BOTH);
        utilidades = new Utilidades();
        lbl_imagen_user.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_imagen_user.setVerticalAlignment(SwingConstants.CENTER);
        lbl_imagen_user.setFont(new Font("SansSerif", Font.ITALIC, 20));
        NIF = new CalculaNif();
    }

    /**
     * Creates new form Crear_user
     */
    public Crear_user() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        utilidades = new Utilidades();
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
        jLabel8 = new javax.swing.JLabel();
        txf_email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cb_rutina = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lbl_imagen_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(272, 280));
        jPanel1.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1);
        jPanel1.add(txf_nombre);

        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2);
        jPanel1.add(txf_apellido);

        jLabel4.setText("DNI");
        jPanel1.add(jLabel4);

        txf_DNI.setToolTipText("N??mero de NIF");
        txf_DNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_DNIActionPerformed(evt);
            }
        });
        jPanel1.add(txf_DNI);

        jLabel5.setText("Fecha Nacimiento");
        jPanel1.add(jLabel5);

        txf_fecha_nace.setToolTipText("dd-MM-yyyy");
        jPanel1.add(txf_fecha_nace);

        jLabel6.setText("Direccion");
        jPanel1.add(jLabel6);
        jPanel1.add(txf_direccion);

        jLabel8.setText("e-mail");
        jPanel1.add(jLabel8);

        txf_email.setText("correo@gmail.com");
        jPanel1.add(txf_email);

        jLabel7.setText("Seleccionar Rutina");
        jPanel1.add(jLabel7);

        cb_rutina.setPreferredSize(new java.awt.Dimension(134, 15));
        jPanel1.add(cb_rutina);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("Crear Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_imagen_user.setText("A??ade tu imagen");
        lbl_imagen_user.setToolTipText("A??ade la imagen del usuario");
        lbl_imagen_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lbl_imagen_user.setVerifyInputWhenFocusTarget(false);
        lbl_imagen_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imagen_userMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(lbl_imagen_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(429, 429, 429))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lbl_imagen_user, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1098, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {

            if (!chequearFecha(txf_fecha_nace.getText().trim())) {
                JOptionPane.showMessageDialog(this, "Formato de fecha incorrecto");
                return;
            }
            if (!utilidades.validarEmail(txf_email.getText().trim())) {
                JOptionPane.showMessageDialog(this, "Email incorrecto");
                return;
            }
            Usuarios u = new Usuarios();
            u.setNombre(txf_nombre.getText().trim());
            u.setApellido(txf_apellido.getText().trim());
            if (txf_DNI.getText().length() < 9) {
                JOptionPane.showMessageDialog(this, "DNI no v??lido");
                return;
            }
            if (!NIF.isvalido(txf_DNI.getText().trim())) {
                JOptionPane.showMessageDialog(this, "DNI no v??lido");
                return;
            }

            u.setDni(txf_DNI.getText().trim());
            u.setEmail(txf_email.getText().trim());
            u.setDireccion(txf_direccion.getText().trim());
            u.setFechaNacimiento(txf_fecha_nace.getText().trim());
            if (lista_rutinas.size() <= 0) {
                JOptionPane.showMessageDialog(this, "Cree o seleccione una rutina antes de crear el usuario");
                return;
            }
            u.setIdRutina(lista_rutinas.get(cb_rutina.getSelectedIndex()));

            if (icon != null) {
                u.setImagenPerfil(utilidades.imageToByte(utilidades.iconToImage(icon)));
            }

            if (crud.InsertarUser(u)) {
                JOptionPane.showMessageDialog(this, "Usuario creado correctamente");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Fallo al crear el usuario");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txf_DNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_DNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_DNIActionPerformed

    private void lbl_imagen_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imagen_userMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG, JPG", "png", "jpg");
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
            java.util.logging.Logger.getLogger(Crear_user.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_user.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_user.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_user.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_user().setVisible(true);
            }
        });
    }

    private void rellenar_campos() {
        this.lista_rutinas = crud.ListarRutinas();
        for (Rutina rutina : lista_rutinas) {
            cb_rutina.addItem(rutina.getNombre());
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_rutina;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_imagen_user;
    private javax.swing.JTextField txf_DNI;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_direccion;
    private javax.swing.JTextField txf_email;
    private javax.swing.JTextField txf_fecha_nace;
    private javax.swing.JTextField txf_nombre;
    // End of variables declaration//GEN-END:variables

    private boolean chequearFecha(String fecha) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaLocal = LocalDate.parse(fecha, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
