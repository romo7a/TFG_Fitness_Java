/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.User;

import Controlador.CRUD;
import Modelo.Usuarios;
import java.awt.Button;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class Ver_Usuarios extends javax.swing.JFrame {

    private List<Usuarios> users_list;
    private DefaultTableModel dtm;
    private Button btn_detalle;
    private CRUD crud;

    public Ver_Usuarios(CRUD crud) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.crud = crud;
        this.users_list = new ArrayList<Usuarios>();
        this.dtm = (DefaultTableModel) tabla_users.getModel();
        cargarDatos();

    }

    public Ver_Usuarios() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_users = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tabla_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "DNI", "Dirección"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_users.setToolTipText("Haz click para ver los detalles");
        tabla_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_users.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_usersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_users);

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Exportar PDF");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_usersMouseClicked
        // TODO add your handling code here:

        if (tabla_users.getSelectedRow() != -1) {
            Detalle_usuarios detalle_usuarios = new Detalle_usuarios();
            detalle_usuarios.setUser(users_list.get(tabla_users.getSelectedRow()));
            detalle_usuarios.setCrud(crud);
            detalle_usuarios.setVisible(true);
        }

    }//GEN-LAST:event_tabla_usersMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int rows = tabla_users.getRowCount();
        int cols = tabla_users.getColumnCount();
//            Creamos un documento            
        PDDocument documento = new PDDocument();
//            Creamos la página, que le decimos que tiene el tamaño a4
        PDPage pagina = new PDPage(PDRectangle.A4);
        documento.addPage(pagina);

        try (PDPageContentStream contentStream = new PDPageContentStream(documento, pagina, PDPageContentStream.AppendMode.APPEND, true, true)) {
            float x = 30f;
            float y = pagina.getMediaBox().getUpperRightY() - 30f;
//            Altura de la línea
            float rowHeight = 15.0f;
            float colWidth = 40.0f;
            contentStream.saveGraphicsState();

//
////            Le añadimos a nuestro documento el formato de la página
//            documento.addPage(pagina);
////            Creamos este objeto que nos va a permitir escribir dentro de nuestra página
////            PDPageContentStream contentStream = new PDPageContentStream(documento, pagina);
////            Le indicamos que vamos a empezar a escribir en la parte de arriba del documento
//            contentStream.beginText();
////            Le indicamos el tipo de letra de nuestro documento y el tamaño de esta 
//            contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
////            Le indicamos la línea donde queremos que empiece a escribir
//            contentStream.newLineAtOffset(20, pagina.getMediaBox().getHeight() - 52);
            //Color de linea
            contentStream.setStrokingColor(Color.BLACK);
            //Grosor de línea
            contentStream.setLineWidth(0.5f);
            //drawTable

            //drawTable
            for (int row = 0; row <= rows; row++) {
                float xStart = x;
                float yStart = y - row * rowHeight;
                float xEnd = xStart + cols * colWidth;
                float yEnd = yStart;
                contentStream.moveTo(xStart, yStart);
                contentStream.lineTo(xEnd, yEnd);
            }
            for (int col = 0; col <= cols; col++) {
                float xStart = x + col * colWidth;
                float yStart = y;
                float xEnd = xStart;
                float yEnd = yStart - rows * rowHeight;
                contentStream.moveTo(xStart, yStart);
                contentStream.lineTo(xEnd, yEnd);
            }
            contentStream.stroke();
            contentStream.restoreGraphicsState();

            contentStream.close();
            documento.save(new File("./DocumentosGenerados/archivo.pdf"));
            documento.close();
            JOptionPane.showMessageDialog(this, "PDF generado correctamente");

        } catch (IOException ex) {
            Logger.getLogger(Ver_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al generar el PDF");
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        cargarDatos();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Ver_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ver_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ver_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ver_Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ver_Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_users;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
//        try {
            users_list.clear();
            dtm.setRowCount(0);
            users_list = crud.ConsultarUsuario();
            dtm = (DefaultTableModel) tabla_users.getModel();
            for (Usuarios user : users_list) {
                dtm.addRow(new Object[]{user.getNombre(), user.getApellido(), user.getDni(), user.getDireccion(), (Button) btn_detalle});
            }
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }

    }
}
