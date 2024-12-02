/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui_pruebas_03_zaragoza_carlos.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author carlo
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    private ArrayList<String> colores = new ArrayList<String>();
    
    public interfaz() {
        initComponents();
     
        añadirColoresArray();      
        añadirComboBox();
        
        panel.add(cboxItems, BorderLayout.NORTH);
        panel.add(colors_panel, BorderLayout.CENTER);
        panel.add(btnCerrar, BorderLayout.SOUTH);
        
    }
    

    
    private void añadirComboBox(){
        for(String i:colores){
            cboxItems.addItem(i);
        } 
    }
    private void añadirColoresArray(){
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("amarillo");
        colores.add("negro");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        cerrar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_yes = new javax.swing.JButton();
        btn_no = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        cboxItems = new javax.swing.JComboBox<>();
        colors_panel = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();

        cerrar.setMinimumSize(new java.awt.Dimension(300, 300));

        jLabel1.setText("¿Esta seguro de cerrar la aplicación?");

        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 50, 0));

        btn_yes.setText("Si");
        btn_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yesActionPerformed(evt);
            }
        });
        jPanel3.add(btn_yes);

        btn_no.setText("No");
        btn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noActionPerformed(evt);
            }
        });
        jPanel3.add(btn_no);

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar.getContentPane());
        cerrar.getContentPane().setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarLayout.createSequentialGroup()
                .addGroup(cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cerrarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE))
                    .addGroup(cerrarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Contenido"));
        panel.setLayout(new java.awt.BorderLayout());

        cboxItems.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxItemsItemStateChanged(evt);
            }
        });
        cboxItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboxItemsMouseClicked(evt);
            }
        });
        cboxItems.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cboxItemsPropertyChange(evt);
            }
        });
        panel.add(cboxItems, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout colors_panelLayout = new javax.swing.GroupLayout(colors_panel);
        colors_panel.setLayout(colors_panelLayout);
        colors_panelLayout.setHorizontalGroup(
            colors_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        colors_panelLayout.setVerticalGroup(
            colors_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        panel.add(colors_panel, java.awt.BorderLayout.PAGE_START);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panel.add(btnCerrar, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yesActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_yesActionPerformed

    private void btn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noActionPerformed
        // TODO add your handling code here:
        cerrar.setVisible(false);
    }//GEN-LAST:event_btn_noActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        cerrar.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cboxItemsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cboxItemsPropertyChange
        System.out.println(cboxItems.getSelectedItem());
        System.out.println(cboxItems.getItemAt(cboxItems.getSelectedIndex()));
    }//GEN-LAST:event_cboxItemsPropertyChange

    private void cboxItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboxItemsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxItemsMouseClicked

    private void cboxItemsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxItemsItemStateChanged
        switch(cboxItems.getItemAt(cboxItems.getSelectedIndex())){
            case "rojo":
            colors_panel.setBackground(Color.RED);
            break;
            case "verde":
            colors_panel.setBackground(Color.GREEN);
            break;
            case "azul":
            colors_panel.setBackground(Color.BLUE);
            break;
            case "amarillo":
            colors_panel.setBackground(Color.YELLOW);
            break;
            case "negro":
            colors_panel.setBackground(Color.BLACK);
            break;
        }
    }//GEN-LAST:event_cboxItemsItemStateChanged

    
    
    private void changeColor(String color){
        switch(color){
            case "rojo":
                    colors_panel.setForeground(Color.RED);
                break;
        }
    }
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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btn_no;
    private javax.swing.JButton btn_yes;
    private javax.swing.JComboBox<String> cboxItems;
    private javax.swing.JDialog cerrar;
    private javax.swing.JPanel colors_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}