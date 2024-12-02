/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora_zaragozacarlos;

import java.awt.Color;

/**
 *
 * @author usumaniana
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    private String valor1 = "";
    private String valor2 = "";
    private String operation = "";
    private String resultado;
    private double memoria = 0.0;

    public interfaz() {
        initComponents();
        bg_modes.add(rb_dark);
        bg_modes.add(rb_light);

        rb_light.setSelected(true);
        lbl_mem.setText(memoria + "");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_modes = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        main_panel = new javax.swing.JPanel();
        result_panel = new javax.swing.JLabel();
        options_panel = new javax.swing.JPanel();
        rb_light = new javax.swing.JRadioButton();
        lbl_dato_memoria = new javax.swing.JLabel();
        rb_dark = new javax.swing.JRadioButton();
        lbl_mem = new javax.swing.JLabel();
        second_panel = new javax.swing.JPanel();
        panel_keys = new javax.swing.JPanel();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_plus = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_minus = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn_result = new javax.swing.JButton();
        btn_divide = new javax.swing.JButton();
        btn_mem_plus = new javax.swing.JButton();
        btn_mem_minus = new javax.swing.JButton();
        btn_mem_c = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txa_resultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        main_panel.setLayout(new java.awt.GridLayout(1, 2));

        result_panel.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        result_panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result_panel.setText("0.0");
        main_panel.add(result_panel);

        options_panel.setLayout(new java.awt.GridLayout(2, 2));

        rb_light.setText("Light Mode");
        rb_light.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_lightStateChanged(evt);
            }
        });
        rb_light.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_lightMouseClicked(evt);
            }
        });
        options_panel.add(rb_light);

        lbl_dato_memoria.setText("Dato en memoria:");
        options_panel.add(lbl_dato_memoria);

        rb_dark.setText("Dark Mode");
        rb_dark.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rb_darkStateChanged(evt);
            }
        });
        rb_dark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_darkMouseClicked(evt);
            }
        });
        options_panel.add(rb_dark);
        options_panel.add(lbl_mem);

        main_panel.add(options_panel);

        jSplitPane1.setLeftComponent(main_panel);

        second_panel.setLayout(new java.awt.GridLayout());

        panel_keys.setLayout(new java.awt.GridLayout(5, 4, 20, 20));

        btn_1.setText("1");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_1);

        btn_2.setText("2");
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_2);

        btn_3.setText("3");
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_3);

        btn_plus.setText("+");
        btn_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plusActionPerformed(evt);
            }
        });
        panel_keys.add(btn_plus);

        btn_4.setText("4");
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_4);

        btn_5.setText("5");
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_5);

        btn_6.setText("6");
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_6);

        btn_minus.setText("-");
        btn_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minusActionPerformed(evt);
            }
        });
        panel_keys.add(btn_minus);

        btn_7.setText("7");
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_7);

        btn_8.setText("8");
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_8);

        btn_9.setText("9");
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_9);

        btn_mul.setText("*");
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });
        panel_keys.add(btn_mul);

        btn_0.setText("0");
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        panel_keys.add(btn_0);

        btn_dot.setText(".");
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        panel_keys.add(btn_dot);

        btn_result.setText("=");
        btn_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resultActionPerformed(evt);
            }
        });
        panel_keys.add(btn_result);

        btn_divide.setText("/");
        btn_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divideActionPerformed(evt);
            }
        });
        panel_keys.add(btn_divide);

        btn_mem_plus.setText("M+");
        btn_mem_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mem_plusActionPerformed(evt);
            }
        });
        panel_keys.add(btn_mem_plus);

        btn_mem_minus.setText("M-");
        btn_mem_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mem_minusActionPerformed(evt);
            }
        });
        panel_keys.add(btn_mem_minus);

        btn_mem_c.setText("MC");
        btn_mem_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mem_cActionPerformed(evt);
            }
        });
        panel_keys.add(btn_mem_c);

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        panel_keys.add(btn_reset);

        second_panel.add(panel_keys);

        txa_resultados.setColumns(20);
        txa_resultados.setRows(5);
        jScrollPane1.setViewportView(txa_resultados);

        second_panel.add(jScrollPane1);

        jSplitPane1.setRightComponent(second_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        // TODO add your handling code here:

        insertarValor("1");


    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
        insertarValor("2");

    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        // TODO add your handling code here:
        insertarValor("3");
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
        insertarValor("4");
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
        insertarValor("5");
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
        insertarValor("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:

        insertarValor("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
        insertarValor("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        // TODO add your handling code here:
        insertarValor("9");
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        // TODO add your handling code here:
        insertarValor("0");
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
        // TODO add your handling code here:
        insertarValor(".");
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plusActionPerformed
        // TODO add your handling code here:
        insertarOperacion("+");
    }//GEN-LAST:event_btn_plusActionPerformed

    private void btn_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minusActionPerformed
        // TODO add your handling code here:
        insertarOperacion("-");
    }//GEN-LAST:event_btn_minusActionPerformed

    private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed
        // TODO add your handling code here:
        insertarOperacion("*");
    }//GEN-LAST:event_btn_mulActionPerformed

    private void btn_divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divideActionPerformed
        // TODO add your handling code here:
        insertarOperacion("/");
    }//GEN-LAST:event_btn_divideActionPerformed

    private void btn_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resultActionPerformed
        // TODO add your handling code here:
        calculate();
    }//GEN-LAST:event_btn_resultActionPerformed

    private void rb_lightStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_lightStateChanged
        // TODO add your handling code here:
        if (rb_light.isSelected()) {
            changeLight();
        }
    }//GEN-LAST:event_rb_lightStateChanged

    private void rb_lightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_lightMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_rb_lightMouseClicked

    private void rb_darkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_darkMouseClicked

    }//GEN-LAST:event_rb_darkMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_mem_plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mem_plusActionPerformed
        // TODO add your handling code here:
        guardarEnMemoria();
    }//GEN-LAST:event_btn_mem_plusActionPerformed

    private void btn_mem_minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mem_minusActionPerformed
        // TODO add your handling code here:
        restarMemoria();
    }//GEN-LAST:event_btn_mem_minusActionPerformed

    private void btn_mem_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mem_cActionPerformed
        // TODO add your handling code here:
        mostrarMemoria();
    }//GEN-LAST:event_btn_mem_cActionPerformed

    private void rb_darkStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rb_darkStateChanged
        // TODO add your handling code here:
        if (rb_dark.isSelected()) {
            changeDark();
        }
    }//GEN-LAST:event_rb_darkStateChanged

    private void mostrarMemoria() {
        reset();
        valor1 = memoria + "";
        result_panel.setText(valor1);

    }

    private void guardarEnMemoria() {

        memoria += Double.parseDouble(valor1);
        lbl_mem.setText(memoria + "");

    }

    private void restarMemoria() {
        memoria -= Double.parseDouble(valor1);
        lbl_mem.setText(memoria + "");
    }

    private void reset() {
        valor1 = "";
        valor2 = "";

        operation = "";
        result_panel.setText("");

    }

    private void changeDark() {
        main_panel.setBackground(Color.black);
        result_panel.setForeground(Color.white);
        options_panel.setBackground(Color.black);
        rb_dark.setForeground(Color.white);
        rb_light.setForeground(Color.white);

        rb_dark.setBackground(Color.black);
        rb_light.setBackground(Color.black);

        lbl_dato_memoria.setForeground(Color.white);
        lbl_mem.setForeground(Color.white);

        second_panel.setBackground(Color.gray);
        panel_keys.setBackground(Color.gray);

        btn_0.setBackground(Color.black);
        btn_0.setForeground(Color.white);

        btn_1.setBackground(Color.black);
        btn_1.setForeground(Color.white);

        btn_2.setBackground(Color.black);
        btn_2.setForeground(Color.white);

        btn_3.setBackground(Color.black);
        btn_3.setForeground(Color.white);

        btn_4.setBackground(Color.black);
        btn_4.setForeground(Color.white);

        btn_5.setBackground(Color.black);
        btn_5.setForeground(Color.white);

        btn_6.setBackground(Color.black);
        btn_6.setForeground(Color.white);

        btn_7.setBackground(Color.black);
        btn_7.setForeground(Color.white);

        btn_8.setBackground(Color.black);
        btn_8.setForeground(Color.white);

        btn_9.setBackground(Color.black);
        btn_9.setForeground(Color.white);

        btn_divide.setBackground(Color.black);
        btn_divide.setForeground(Color.white);

        btn_dot.setBackground(Color.black);
        btn_dot.setForeground(Color.white);

        btn_mem_c.setBackground(Color.black);
        btn_mem_c.setForeground(Color.white);

        btn_mem_minus.setBackground(Color.black);
        btn_mem_minus.setForeground(Color.white);

        btn_mem_plus.setBackground(Color.black);
        btn_mem_plus.setForeground(Color.white);

        btn_reset.setBackground(Color.black);
        btn_reset.setForeground(Color.white);

        btn_result.setBackground(Color.black);
        btn_result.setForeground(Color.white);

        btn_plus.setBackground(Color.black);
        btn_plus.setForeground(Color.white);

        btn_minus.setBackground(Color.black);
        btn_minus.setForeground(Color.white);

        btn_mul.setBackground(Color.black);
        btn_mul.setForeground(Color.white);

    }

    private void changeLight() {

        main_panel.setBackground(Color.white);
        result_panel.setForeground(Color.black);
        options_panel.setBackground(Color.white);
        rb_dark.setForeground(Color.black);
        rb_light.setForeground(Color.black);
        second_panel.setBackground(Color.white);
        panel_keys.setBackground(Color.white);
        lbl_dato_memoria.setForeground(Color.black);
        lbl_mem.setForeground(Color.black);

        rb_dark.setBackground(Color.white);
        rb_light.setBackground(Color.white);

        btn_0.setForeground(Color.black);
        btn_0.setBackground(Color.white);

        btn_1.setForeground(Color.black);
        btn_1.setBackground(Color.white);

        btn_2.setForeground(Color.black);
        btn_2.setBackground(Color.white);

        btn_3.setForeground(Color.black);
        btn_3.setBackground(Color.white);

        btn_4.setForeground(Color.black);
        btn_4.setBackground(Color.white);

        btn_5.setForeground(Color.black);
        btn_5.setBackground(Color.white);

        btn_6.setForeground(Color.black);
        btn_6.setBackground(Color.white);

        btn_7.setForeground(Color.black);
        btn_7.setBackground(Color.white);

        btn_8.setForeground(Color.black);
        btn_8.setBackground(Color.white);

        btn_9.setForeground(Color.black);
        btn_9.setBackground(Color.white);

        btn_divide.setForeground(Color.black);
        btn_divide.setBackground(Color.white);

        btn_dot.setForeground(Color.black);
        btn_dot.setBackground(Color.white);

        btn_mem_c.setForeground(Color.black);
        btn_mem_c.setBackground(Color.white);

        btn_mem_minus.setForeground(Color.black);
        btn_mem_minus.setBackground(Color.white);

        btn_mem_plus.setForeground(Color.black);
        btn_mem_plus.setBackground(Color.white);

        btn_reset.setForeground(Color.black);
        btn_reset.setBackground(Color.white);

        btn_result.setForeground(Color.black);
        btn_result.setBackground(Color.white);

        btn_plus.setForeground(Color.black);
        btn_plus.setBackground(Color.white);

        btn_minus.setForeground(Color.black);
        btn_minus.setBackground(Color.white);

        btn_mul.setForeground(Color.black);
        btn_mul.setBackground(Color.white);
    }

    private void calculate() {

        if (valor2.length() != 0) {
            double vl1 = Double.parseDouble(valor1);
            double vl2 = Double.parseDouble(valor2);
            double rs = 0.0;

            switch (operation) {

                case "+":
                    rs = vl1 + vl2;
                    break;

                case "-":
                    rs = vl1 - vl2;
                    break;

                case "*":
                    rs = vl1 * vl2;
                    break;

                case "/":
                    rs = vl1 / vl2;
                    break;

            }

            txa_resultados.append(valor1 + " " + operation + " " + valor2 + "= " + rs + "\n");

            result_panel.setText(rs + "");
            valor1 = "";
            valor2 = "";
            resultado = "";
            operation = "";

        }
    }

    private void insertarOperacion(String op) {
        if (valor1.length() > 0) {
            operation = op;
            result_panel.setText(valor1 + " " + operation);
        }
    }

    private void insertarValor(String numero) {

        if (operation.length() == 0 && valor1.length() < 15) {
            valor1 += numero;
            result_panel.setText(valor1);

        } else if (operation.length() == 1 && valor2.length() < 15) {
            valor2 += numero;
            resultado = valor1 + " " + operation + " " + valor2;
            result_panel.setText(resultado);
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
    private javax.swing.ButtonGroup bg_modes;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_mem_c;
    private javax.swing.JButton btn_mem_minus;
    private javax.swing.JButton btn_mem_plus;
    private javax.swing.JButton btn_minus;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_plus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_result;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbl_dato_memoria;
    private javax.swing.JLabel lbl_mem;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel options_panel;
    private javax.swing.JPanel panel_keys;
    private javax.swing.JRadioButton rb_dark;
    private javax.swing.JRadioButton rb_light;
    private javax.swing.JLabel result_panel;
    private javax.swing.JPanel second_panel;
    private javax.swing.JTextArea txa_resultados;
    // End of variables declaration//GEN-END:variables
}