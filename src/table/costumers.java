
package table;

import javax.swing.JOptionPane;
import javax.swing.*;

public class costumers extends javax.swing.JFrame {

    
    public costumers() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jText = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckB = new javax.swing.JCheckBox();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("USERNAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, -1));
        jPanel1.add(jText, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 150, -1));
        jPanel1.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 150, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Win10\\Downloads\\ARSMOS__1_-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 490, 390));

        jCheckB.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jCheckB.setForeground(new java.awt.Color(255, 255, 255));
        jCheckB.setText("SHOW PASSWORD?");
        jCheckB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckB, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jB1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jB1.setText("ENTER");
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, -1, 40));

        jB2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 14)); // NOI18N
        jB2.setText("CLEAR");
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        jPanel1.add(jB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Win10\\Downloads\\Restaurant-Cropped-_0000_Wendys-Boot-Ranch-Palm-Harbor-FL-Exterior-Storefront (1).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
       String user = jText.getText();
       String pass = jPass.getText();
       
       if(user.equals("Table1")&&(pass.equals("Admin"))){
           new menu().setVisible(true);
           this.setVisible(false);
           
       } else{
           JOptionPane.showMessageDialog(this, "Username and password are not matched, please try again.");
       }
    }//GEN-LAST:event_jB1ActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        jText.setText("");
        jPass.setText("");
        
    }//GEN-LAST:event_jB2ActionPerformed

    private void jCheckBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBActionPerformed
       
    }//GEN-LAST:event_jCheckBActionPerformed

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
            java.util.logging.Logger.getLogger(costumers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(costumers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(costumers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(costumers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new costumers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB1;
    private javax.swing.JButton jB2;
    private javax.swing.JCheckBox jCheckB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JTextField jText;
    // End of variables declaration//GEN-END:variables
}
