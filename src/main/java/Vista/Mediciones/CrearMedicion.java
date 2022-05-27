/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Mediciones;

import Controlador.CRUD;
import Modelo.Mediciones;
import Modelo.Usuarios;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro Romo Villarreal
 */
public class CrearMedicion extends javax.swing.JFrame {

    private Mediciones medicion;
    private CRUD crud;
    private Usuarios user;

    public CrearMedicion(CRUD crud, Usuarios user) {
        initComponents();
        this.crud = crud;
        this.user = user;
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * Creates new form CrearMedicion
     */
    public CrearMedicion() {
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
        lb_peso = new javax.swing.JLabel();
        txf_peso = new javax.swing.JTextField();
        txf_altura = new javax.swing.JTextField();
        lb_altura = new javax.swing.JLabel();
        txf_cuello = new javax.swing.JTextField();
        lb_cuello = new javax.swing.JLabel();
        lb_hombros = new javax.swing.JLabel();
        txf_hombros = new javax.swing.JTextField();
        lb_pecho = new javax.swing.JLabel();
        txf_pecho = new javax.swing.JTextField();
        tb_cintura = new javax.swing.JLabel();
        txf_cintura = new javax.swing.JTextField();
        lb_muslo = new javax.swing.JLabel();
        txf_muslo = new javax.swing.JTextField();
        lb_pantorrillas = new javax.swing.JLabel();
        txf_pantorillas = new javax.swing.JTextField();
        lbl_biceps = new javax.swing.JLabel();
        txf_biceps = new javax.swing.JTextField();
        lbl_gluteos = new javax.swing.JLabel();
        txf_gluteos = new javax.swing.JTextField();
        btn_aniadir_medicion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lb_peso.setText("Peso (En Kilos):");

        lb_altura.setText("Altura ");

        lb_cuello.setText("Cuello");

        lb_hombros.setText("Hombros");

        lb_pecho.setText("Pecho");

        tb_cintura.setText("Cintura");

        lb_muslo.setText("Muslo");

        lb_pantorrillas.setText("Pantorrillas");

        lbl_biceps.setText("Biceps");

        lbl_gluteos.setText("Gluteos");

        btn_aniadir_medicion.setText("Añadir Medición");
        btn_aniadir_medicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aniadir_medicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_aniadir_medicion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_gluteos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_biceps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_pantorrillas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_muslo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb_cintura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_pecho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_hombros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_cuello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_altura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_peso, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txf_peso)
                            .addComponent(txf_altura, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(txf_cuello, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(txf_hombros, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(txf_pecho, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(txf_cintura, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(txf_muslo, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(txf_pantorillas, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(txf_biceps, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
                            .addComponent(txf_gluteos, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_peso, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(lb_peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_altura)
                    .addComponent(lb_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_cuello)
                    .addComponent(lb_cuello, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_hombros)
                    .addComponent(lb_hombros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_pecho)
                    .addComponent(lb_pecho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_cintura)
                    .addComponent(tb_cintura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_muslo)
                    .addComponent(lb_muslo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_pantorillas)
                    .addComponent(lb_pantorrillas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_biceps)
                    .addComponent(lbl_biceps, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txf_gluteos)
                    .addComponent(lbl_gluteos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btn_aniadir_medicion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

    private void btn_aniadir_medicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aniadir_medicionActionPerformed
        // TODO add your handling code here:
        try {
            if (txf_peso.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo del peso ");
                return;
            } else if (txf_altura.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo de altura");
                return;
            } else if (txf_cuello.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo del cuello");
                return;
            } else if (txf_hombros.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo de los hombros");
                return;
            } else if (txf_pecho.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo de las pantorrillas");
                return;
            } else if (txf_cintura.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo de la cintura");
                return;
            } else if (txf_muslo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo del muslo");
                return;
            } else if (txf_pantorillas.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo de las pantorrillas");
                return;
            } else if (txf_biceps.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo de biceps");
                return;
            } else if (txf_gluteos.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Rellene el campo de gluteo");
                return;
            }

            medicion = new Mediciones();
            long altura = Long.parseLong(txf_altura.getText().trim());
            medicion.setAltura(altura);
            medicion.setBiceps(Integer.parseInt(txf_biceps.getText().trim()));
            medicion.setCintura(Integer.parseInt(txf_cintura.getText().trim()));
            medicion.setCuello(Long.parseLong(txf_cuello.getText().trim()));
            medicion.setGluteos(Integer.parseInt(txf_gluteos.getText().trim()));
            medicion.setHombros(Integer.parseInt(txf_hombros.getText().trim()));
            medicion.setIdUsuario(user);
            medicion.setMuslo(Integer.parseInt(txf_muslo.getText().trim()));
            medicion.setPantorrillas(Integer.parseInt(txf_pantorillas.getText().trim()));
            medicion.setPecho(Integer.parseInt(txf_pecho.getText().trim()));
            long peso = Long.parseLong(txf_peso.getText().trim());
            medicion.setPeso(peso);
            medicion.setFechaMedicion(LocalDateTime.now().toString());
//  IMC            Fórmula: peso (kg) / [estatura (m)]2

            medicion.setImc(peso+(altura*altura));

            crud.InsertarMedicion(medicion);            

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los datos deben ser numéricos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No se han podido guardar tus mediciones");
        }
    }//GEN-LAST:event_btn_aniadir_medicionActionPerformed

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
            java.util.logging.Logger.getLogger(CrearMedicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMedicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMedicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMedicion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMedicion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aniadir_medicion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_altura;
    private javax.swing.JLabel lb_cuello;
    private javax.swing.JLabel lb_hombros;
    private javax.swing.JLabel lb_muslo;
    private javax.swing.JLabel lb_pantorrillas;
    private javax.swing.JLabel lb_pecho;
    private javax.swing.JLabel lb_peso;
    private javax.swing.JLabel lbl_biceps;
    private javax.swing.JLabel lbl_gluteos;
    private javax.swing.JLabel tb_cintura;
    private javax.swing.JTextField txf_altura;
    private javax.swing.JTextField txf_biceps;
    private javax.swing.JTextField txf_cintura;
    private javax.swing.JTextField txf_cuello;
    private javax.swing.JTextField txf_gluteos;
    private javax.swing.JTextField txf_hombros;
    private javax.swing.JTextField txf_muslo;
    private javax.swing.JTextField txf_pantorillas;
    private javax.swing.JTextField txf_pecho;
    private javax.swing.JTextField txf_peso;
    // End of variables declaration//GEN-END:variables
}
