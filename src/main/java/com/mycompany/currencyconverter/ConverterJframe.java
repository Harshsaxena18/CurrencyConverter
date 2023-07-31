/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.currencyconverter;

/**
 *
 * @author naved
 */
public class ConverterJframe extends javax.swing.JFrame {

    /**
     * Creates new form ConverterJframe
     */
    public ConverterJframe() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        from = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        to = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        convert = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setText("Currency Converter");

        jLabel2.setForeground(new java.awt.Color(63, 63, 63));
        jLabel2.setText("From");

        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indian Rupee", "Kuwaiti Dinar", "Pound Sterling", "Singapore Dollar", "United States Dollar" }));

        jLabel3.setBackground(new java.awt.Color(63, 63, 63));
        jLabel3.setForeground(new java.awt.Color(63, 63, 63));
        jLabel3.setText("To");

        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indian Rupee", "Kuwaiti Dinar", "Pound Sterling", "Singapore Dollar", "United States Dollar" }));

        jLabel4.setForeground(new java.awt.Color(63, 63, 63));
        jLabel4.setText("Amount");

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        convert.setText("CONVERT");
        convert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertMouseClicked(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(63, 63, 63));
        jLabel5.setText("Result");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(from, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(to, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amount)
                    .addComponent(convert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(result))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void convertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertMouseClicked
        String fromCurrency = from.getSelectedItem().toString();
        String toCurrency = to.getSelectedItem().toString();
        double inputAmount = Double.parseDouble(amount.getText());
        
        double convertedAmount = convertCurrency(fromCurrency, toCurrency, inputAmount);
        result.setText(String.valueOf(convertedAmount));
    }//GEN-LAST:event_convertMouseClicked
        
    private double convertCurrency(String fromCurrency, String toCurrency, double amount) {       
        if (fromCurrency.equals("Indian Rupee") && toCurrency.equals("Kuwaiti Dinar")) {
            return amount * 0.0037;
        } else if (fromCurrency.equals("Indian Rupee") && toCurrency.equals("Pound Sterling")) {
            return amount * 0.0095;
        } else if (fromCurrency.equals("Indian Rupee") && toCurrency.equals("Singapore Dollar")) {
            return amount * 0.016;
        } else if (fromCurrency.equals("Indian Rupee") && toCurrency.equals("United States Dollar")) {
            return amount * 0.012;
        }
        
        else if (fromCurrency.equals("Kuwaiti Dinar") && toCurrency.equals("Indian Rupee")) {
            return amount * 267.07;
        } else if (fromCurrency.equals("Kuwaiti Dinar") && toCurrency.equals("Pound Sterling")) {
            return amount * 2.53;
        } else if (fromCurrency.equals("Kuwaiti Dinar") && toCurrency.equals("Singapore Dollar")) {
            return amount * 4.33;
        } else if (fromCurrency.equals("Kuwaiti Dinar") && toCurrency.equals("United States Dollar")) {
            return amount * 3.26;
        }
        
        else if (fromCurrency.equals("Pound Sterling") && toCurrency.equals("Indian Rupee")) {
            return amount * 105.47;
        } else if (fromCurrency.equals("Pound Sterling") && toCurrency.equals("Kuwaiti Dinar")) {
            return amount * 0.39;
        } else if (fromCurrency.equals("Pound Sterling") && toCurrency.equals("Singapore Dollar")) {
            return amount * 1.71;
        } else if (fromCurrency.equals("Pound Sterling") && toCurrency.equals("United States Dollar")) {
            return amount * 1.29;
        }
        
        else if (fromCurrency.equals("Singapore Dollar") && toCurrency.equals("Indian Rupee")) {
            return amount * 61.65;
        } else if (fromCurrency.equals("Singapore Dollar") && toCurrency.equals("Kuwaiti Dinar")) {
            return amount * 0.23;
        } else if (fromCurrency.equals("Singapore Dollar") && toCurrency.equals("Pound Sterling")) {
            return amount * 0.58;
        } else if (fromCurrency.equals("Singapore Dollar") && toCurrency.equals("United States Dollar")) {
            return amount * 0.75;
        }
        
        else if (fromCurrency.equals("United States Dollar") && toCurrency.equals("Indian Rupee")) {
            return amount * 82.01;
        } else if (fromCurrency.equals("United States Dollar") && toCurrency.equals("Kuwaiti Dinar")) {
            return amount * 0.31;
        } else if (fromCurrency.equals("United States Dollar") && toCurrency.equals("Pound Sterling")) {
            return amount * 0.78;
        } else if (fromCurrency.equals("United States Dollar") && toCurrency.equals("Singapore Dollar")) {
            return amount * 1.33;
        } else {
            return amount;
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
            java.util.logging.Logger.getLogger(ConverterJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConverterJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConverterJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConverterJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton convert;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField result;
    private javax.swing.JComboBox<String> to;
    // End of variables declaration//GEN-END:variables
}
