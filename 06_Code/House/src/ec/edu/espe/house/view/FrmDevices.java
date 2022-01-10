
package ec.edu.espe.house.view;

import javax.swing.JOptionPane;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class FrmDevices extends javax.swing.JFrame {

    /**
     * Creates new form FrmRoom
     */
    public FrmDevices() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        BtnExit = new javax.swing.JButton();
        BtnReturn = new javax.swing.JButton();
        BtnTelevision = new javax.swing.JButton();
        BtnSoundSystem = new javax.swing.JButton();
        BtnAlarmSignal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("DEVICES");

        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        BtnReturn.setText("Return");
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        BtnTelevision.setText("Television");
        BtnTelevision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTelevisionActionPerformed(evt);
            }
        });

        BtnSoundSystem.setText("Sound System ");
        BtnSoundSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSoundSystemActionPerformed(evt);
            }
        });

        BtnAlarmSignal.setText("Alarm Signal");
        BtnAlarmSignal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlarmSignalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(BtnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAlarmSignal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSoundSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnTelevision, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BtnTelevision)
                .addGap(18, 18, 18)
                .addComponent(BtnSoundSystem)
                .addGap(18, 18, 18)
                .addComponent(BtnAlarmSignal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnExit)
                    .addComponent(BtnReturn))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        FrmController FrmController = new FrmController();
        FrmController.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnReturnActionPerformed

    private void BtnTelevisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTelevisionActionPerformed
        FrmWelcome FrmWelcome = new FrmWelcome();
        int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the TV?");

        if (result == 0)
            System.out.println("You pressed Yes");
            JOptionPane.showMessageDialog(this, "You have turn on the TV");
               
        else if (result == 1)
           System.out.println("You pressed NO");
           JOptionPane.showMessageDialog(this, "You have turn off the TV");
            
      //  else
       //     System.out.println("You pressed Cancel");
    }//GEN-LAST:event_BtnTelevisionActionPerformed

    private void BtnSoundSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSoundSystemActionPerformed
        FrmWelcome FrmWelcome = new FrmWelcome();
        int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the Sound System?");        
        
        if (result == 0)
            System.out.println("You pressed Yes");
            JOptionPane.showMessageDialog(this, "You have turn on the Sound System");
               
        else if (result == 1)
            System.out.println("You pressed NO");
            JOptionPane.showMessageDialog(this, "You have turn off the Sound System");
            
        else
            System.out.println("You pressed Cancel");
    }//GEN-LAST:event_BtnSoundSystemActionPerformed

    private void BtnAlarmSignalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlarmSignalActionPerformed
            FrmWelcome FrmWelcome = new FrmWelcome();
        int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the Alarm Signal?");        
        
        if (result == 0)
            System.out.println("You pressed Yes");
            JOptionPane.showMessageDialog(this, "You have turn on the Alarm Signal");
               
        else if (result == 1)
            System.out.println("You pressed NO");
            JOptionPane.showMessageDialog(this, "You have turn off the Alarm Signal");
    }//GEN-LAST:event_BtnAlarmSignalActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDevices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDevices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDevices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDevices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDevices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlarmSignal;
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JButton BtnSoundSystem;
    private javax.swing.JButton BtnTelevision;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
