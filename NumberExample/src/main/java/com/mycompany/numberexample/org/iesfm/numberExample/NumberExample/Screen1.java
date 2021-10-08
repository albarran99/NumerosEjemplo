/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.numberexample.org.iesfm.numberExample.NumberExample;


public class Screen1 extends javax.swing.JFrame {

   
    public Screen1() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTextNumber1 = new javax.swing.JLabel();
        jLabelTextNumber2 = new javax.swing.JLabel();
        jTextFieldNumber1 = new javax.swing.JTextField();
        jTextFieldNumber2 = new javax.swing.JTextField();
        jBtnBuy = new javax.swing.JButton();
        jLabelText1 = new javax.swing.JLabel();
        jLabelresult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compare Numbers");

        jLabelTextNumber1.setText("Introduce el primer numero");

        jLabelTextNumber2.setText("Introduce el segundo numero");

        jTextFieldNumber1.setText("                   ");
        jTextFieldNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumber1ActionPerformed(evt);
            }
        });

        jTextFieldNumber2.setText("                   ");
        jTextFieldNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumber2ActionPerformed(evt);
            }
        });

        jBtnBuy.setText("Comprar");
        jBtnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuyActionPerformed(evt);
            }
        });

        jLabelText1.setText("Comparacion de numeros");

        jLabelresult.setText("          ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnBuy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelresult)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTextNumber1)
                            .addComponent(jLabelTextNumber2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(72, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextNumber1)
                    .addComponent(jTextFieldNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTextNumber2)
                    .addComponent(jTextFieldNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jBtnBuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelText1)
                    .addComponent(jLabelresult))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnBuyActionPerformed
        String numberText1 = jTextFieldNumber1.getText();
        
        String numberText2 = jTextFieldNumber2.getText();
        
        String number1new = numberText1.replace(",", ".");
        
        String number2new = numberText2.replace(",", ".");
        
        double number1 = Double.parseDouble(number1new);
        
        double number2 = Double.parseDouble(number2new);
        
       
        
        if (number1 < number2) {
            jLabelresult.setText("El numero 1 es " + number1new + " y el numero 2 es " + number2new + "el numero 1 es menor que el numero 2");
        } else if(number1 > number2){
            jLabelresult.setText("El numero 1 es " + number1new + " y el numero 2 es " + number2new + "el numero 1 es mayor que el numero 2");
        } else {
            jLabelresult.setText("El numero 1 es " + number1new + " y el numero 2 es " + number2new + "el numero 1 es igual al numero 2");
        }
        
    }//GEN-LAST:event_jBtnBuyActionPerformed

    private void jTextFieldNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumber2ActionPerformed
        
    }//GEN-LAST:event_jTextFieldNumber2ActionPerformed

    private void jTextFieldNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumber1ActionPerformed
        
    }//GEN-LAST:event_jTextFieldNumber1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuy;
    private javax.swing.JLabel jLabelText1;
    private javax.swing.JLabel jLabelTextNumber1;
    private javax.swing.JLabel jLabelTextNumber2;
    private javax.swing.JLabel jLabelresult;
    private javax.swing.JTextField jTextFieldNumber1;
    private javax.swing.JTextField jTextFieldNumber2;
    // End of variables declaration//GEN-END:variables
}
