
package ec.edu.espe.house.view;

import javax.swing.JOptionPane;

/**
 *
 * @author malvarez, altamiranoc, almachea, andradea, andrangoa
 */
public class FrmRooms extends javax.swing.JFrame {

    /**
     * Creates new form FrmDevice
     */
    public FrmRooms() {
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
        BtnReturn = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        CmbLivingRoom = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CmbKitchen = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        CmbBathroom = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CbmBedroom1 = new javax.swing.JComboBox<>();
        CmbBedroom2 = new javax.swing.JComboBox<>();
        CmbBedroom3 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("ROOMS");

        BtnReturn.setBackground(new java.awt.Color(102, 204, 255));
        BtnReturn.setText("Return");
        BtnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReturnActionPerformed(evt);
            }
        });

        BtnExit.setBackground(new java.awt.Color(255, 153, 153));
        BtnExit.setText("Exit");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });

        CmbLivingRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Door" }));
        CmbLivingRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbLivingRoomActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Living Room");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Kitchen");

        CmbKitchen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Door" }));
        CmbKitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbKitchenActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Bathroom");

        CmbBathroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Room" }));
        CmbBathroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBathroomActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Bedroom 1");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Bedroom 2");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Bedroom 3");

        CbmBedroom1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Door" }));
        CbmBedroom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbmBedroom1ActionPerformed(evt);
            }
        });

        CmbBedroom2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Door" }));
        CmbBedroom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBedroom2ActionPerformed(evt);
            }
        });

        CmbBedroom3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Door" }));
        CmbBedroom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBedroom3ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Living_Room_icon-icons.com_54168.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Utensils_icon-icons.com_53182.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toilet_wc_restroom_sanitary_bathroom_icon_196769.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bed_moon_night_bedroom_furniture_icon_196771.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bedroom_icon-icons.com_63554.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfindersleepbedhotelnighthostelwellnessslumberfurnitureandhouseholdsleepyzzzsleepingholidays4394841-115905_115876.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CmbLivingRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(CmbKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CbmBedroom1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel5))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel10)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel11)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CmbBedroom2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CmbBedroom3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel7)))
                                .addGap(41, 41, 41))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel13)
                                .addGap(33, 33, 33))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnReturn)
                            .addComponent(CmbBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(458, 458, 458))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel11))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbLivingRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbmBedroom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbBedroom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbBedroom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnReturn)
                    .addComponent(BtnExit))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReturnActionPerformed
        this.setVisible(false); 
        new FrmController().setVisible(true);

    }//GEN-LAST:event_BtnReturnActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_BtnExitActionPerformed

    private void CmbLivingRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbLivingRoomActionPerformed
        
        Object selected = CmbLivingRoom.getSelectedItem();
        if(selected.toString().equals("Light")){
        
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the Light of the Living Room?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have turned on the Light of the Living Room");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have turned off the Light of the Living Room");    //Mensaje en NO
            
        }else if(selected.toString().equals("Door")){
            
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to open the door of the Living Room?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have opened the door of the Living Room");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have opened the door of the Living Room");    //Mensaje en NO           
            
        }
 
    }//GEN-LAST:event_CmbLivingRoomActionPerformed

    private void CmbKitchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbKitchenActionPerformed
        
        Object selected = CmbKitchen.getSelectedItem();
        if(selected.toString().equals("Light")){
        
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the Light of the Kitchen?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have turned on the Light of the Kitchen");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have turned off the Light of the Kitchen");    //Mensaje en NO
            
        }else if(selected.toString().equals("Door")){
            
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to open the door of the Kitchen?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have opened the door of the Kitchen");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have opened the door of the Kitchen");    //Mensaje en NO           
            
        }
        
    }//GEN-LAST:event_CmbKitchenActionPerformed

    private void CmbBathroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbBathroomActionPerformed
        Object selected = CmbBathroom.getSelectedItem();
        if(selected.toString().equals("Light")){
        
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the Light of the Bathroom?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have turned on the Light of the Bathroom");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have turned off the Light of the Bathroom");    //Mensaje en NO
            
        }else if(selected.toString().equals("Door")){
            
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to open the door of the Bathroom?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have opened the door of the Bathroom");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have opened the door of the Bathroom");    //Mensaje en NO           
            
        }
    }//GEN-LAST:event_CmbBathroomActionPerformed

    private void CbmBedroom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbmBedroom1ActionPerformed
        Object selected = CbmBedroom1.getSelectedItem();
        if(selected.toString().equals("Light")){
        
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the Light of the Bedroom 1?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have turned on the Light of the Bedroom 1");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have turned off the Light of the Bedroom 1");    //Mensaje en NO
            
        }else if(selected.toString().equals("Door")){
            
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to open the door of the Bedroom 1?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have opened the door of the Bedroom 1");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have opened the door of the Bedroom 1");    //Mensaje en NO           
            
        }
    }//GEN-LAST:event_CbmBedroom1ActionPerformed

    private void CmbBedroom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbBedroom2ActionPerformed
        Object selected = CmbBedroom2.getSelectedItem();
        if(selected.toString().equals("Light")){
        
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the Light of the Bedroom 2?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have turned on the Light of the Bedroom 2");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have turned off the Light of the Bedroom 2");    //Mensaje en NO
            
        }else if(selected.toString().equals("Door")){
            
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to open the door of the Bedroom 2?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have opened the door of the Bedroom 2");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have opened the door of the Bedroom 2");    //Mensaje en NO           
            
        }
    }//GEN-LAST:event_CmbBedroom2ActionPerformed

    private void CmbBedroom3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbBedroom3ActionPerformed
        Object selected = CmbBedroom3.getSelectedItem();
        if(selected.toString().equals("Light")){
        
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to turn on the Light of the Bedroom 3?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have turned on the Light of the Bedroom 3");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have turned off the Light of the Bedroom 3");    //Mensaje en NO
            
        }else if(selected.toString().equals("Door")){
            
                 FrmWelcome FrmWelcome = new FrmWelcome();
                 int result = JOptionPane.showConfirmDialog(FrmWelcome, "Would you like to open the door of the Bedroom 3?");        //Pregunta
        
                 if (result == 0){
                 JOptionPane.showMessageDialog(this, "You have opened the door of the Bedroom 3");   //Mensaje en YES
                 }    
                 else if (result == 1)

                  JOptionPane.showMessageDialog(this, "You have opened the door of the Bedroom 3");    //Mensaje en NO           
            
        }
    }//GEN-LAST:event_CmbBedroom3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExit;
    private javax.swing.JButton BtnReturn;
    private javax.swing.JComboBox<String> CbmBedroom1;
    private javax.swing.JComboBox<String> CmbBathroom;
    private javax.swing.JComboBox<String> CmbBedroom2;
    private javax.swing.JComboBox<String> CmbBedroom3;
    private javax.swing.JComboBox<String> CmbKitchen;
    private javax.swing.JComboBox<String> CmbLivingRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
