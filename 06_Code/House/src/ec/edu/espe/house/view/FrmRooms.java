
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

        jpnRooms = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnReturn = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        CmbLivingRoom = new javax.swing.JComboBox<>();
        lblLivingRoom = new javax.swing.JLabel();
        lblKitchen = new javax.swing.JLabel();
        CmbKitchen = new javax.swing.JComboBox<>();
        lblBathroom = new javax.swing.JLabel();
        CmbBathroom = new javax.swing.JComboBox<>();
        lblBedroom1 = new javax.swing.JLabel();
        lblBedroom2 = new javax.swing.JLabel();
        lblBedroom3 = new javax.swing.JLabel();
        CbmBedroom1 = new javax.swing.JComboBox<>();
        CmbBedroom2 = new javax.swing.JComboBox<>();
        CmbBedroom3 = new javax.swing.JComboBox<>();
        lblLivingRoomImage = new javax.swing.JLabel();
        lblKitchenImage = new javax.swing.JLabel();
        lblBathroomImage = new javax.swing.JLabel();
        lblBedroom1Image = new javax.swing.JLabel();
        lblBedroom2Image = new javax.swing.JLabel();
        lblBedroom3Image = new javax.swing.JLabel();

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

        lblLivingRoom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblLivingRoom.setText("Living Room");

        lblKitchen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblKitchen.setText("Kitchen");

        CmbKitchen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Door" }));
        CmbKitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbKitchenActionPerformed(evt);
            }
        });

        lblBathroom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBathroom.setText("Bathroom");

        CmbBathroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Light", "Door" }));
        CmbBathroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbBathroomActionPerformed(evt);
            }
        });

        lblBedroom1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBedroom1.setText("Bedroom 1");

        lblBedroom2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBedroom2.setText("Bedroom 2");

        lblBedroom3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBedroom3.setText("Bedroom 3");

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

        lblLivingRoomImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Living_Room_icon-icons.com_54168.png"))); // NOI18N

        lblKitchenImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Utensils_icon-icons.com_53182.png"))); // NOI18N

        lblBathroomImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/toilet_wc_restroom_sanitary_bathroom_icon_196769.png"))); // NOI18N

        lblBedroom1Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bed_moon_night_bedroom_furniture_icon_196771.png"))); // NOI18N

        lblBedroom2Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bedroom_icon-icons.com_63554.png"))); // NOI18N

        lblBedroom3Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/iconfindersleepbedhotelnighthostelwellnessslumberfurnitureandhouseholdsleepyzzzsleepingholidays4394841-115905_115876.png"))); // NOI18N

        javax.swing.GroupLayout jpnRoomsLayout = new javax.swing.GroupLayout(jpnRooms);
        jpnRooms.setLayout(jpnRoomsLayout);
        jpnRoomsLayout.setHorizontalGroup(
            jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoomsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLivingRoom)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRoomsLayout.createSequentialGroup()
                        .addComponent(CmbLivingRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(lblLivingRoomImage))
                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRoomsLayout.createSequentialGroup()
                        .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRoomsLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(lblKitchen))
                            .addGroup(jpnRoomsLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKitchenImage)
                                    .addComponent(CmbKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnRoomsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CbmBedroom1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRoomsLayout.createSequentialGroup()
                                        .addComponent(lblBathroom)
                                        .addGap(102, 102, 102)
                                        .addComponent(lblBedroom1))))
                            .addGroup(jpnRoomsLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(lblBathroomImage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBedroom1Image)))
                        .addGap(60, 60, 60)
                        .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnRoomsLayout.createSequentialGroup()
                                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jpnRoomsLayout.createSequentialGroup()
                                        .addComponent(CmbBedroom2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CmbBedroom3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jpnRoomsLayout.createSequentialGroup()
                                        .addComponent(lblBedroom2)
                                        .addGap(63, 63, 63)
                                        .addComponent(lblBedroom3)))
                                .addGap(41, 41, 41))
                            .addGroup(jpnRoomsLayout.createSequentialGroup()
                                .addComponent(lblBedroom2Image, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(lblBedroom3Image)
                                .addGap(33, 33, 33))))
                    .addGroup(jpnRoomsLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnReturn)
                            .addComponent(CmbBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRoomsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(458, 458, 458))
        );
        jpnRoomsLayout.setVerticalGroup(
            jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRoomsLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRoomsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblKitchenImage)
                        .addGap(12, 12, 12))
                    .addGroup(jpnRoomsLayout.createSequentialGroup()
                        .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLivingRoom)
                            .addComponent(lblKitchen)
                            .addComponent(lblBathroom)
                            .addComponent(lblBedroom1)
                            .addComponent(lblBedroom2)
                            .addComponent(lblBedroom3))
                        .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRoomsLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLivingRoomImage, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBathroomImage, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(1, 1, 1))
                            .addGroup(jpnRoomsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblBedroom3Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpnRoomsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBedroom1Image)
                                    .addComponent(lblBedroom2Image))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(29, 29, 29)
                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CmbLivingRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbBathroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbmBedroom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbBedroom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CmbBedroom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jpnRoomsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addComponent(jpnRooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpnRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
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

                  JOptionPane.showMessageDialog(this, "You have closed the door of the Living Room");    //Mensaje en NO           
            
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

                  JOptionPane.showMessageDialog(this, "You have closed the door of the Kitchen");    //Mensaje en NO           
            
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

                  JOptionPane.showMessageDialog(this, "You have closed the door of the Bathroom");    //Mensaje en NO           
            
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

                  JOptionPane.showMessageDialog(this, "You have closed the door of the Bedroom 1");    //Mensaje en NO           
            
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

                  JOptionPane.showMessageDialog(this, "You have closed the door of the Bedroom 2");    //Mensaje en NO           
            
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

                  JOptionPane.showMessageDialog(this, "You have closed the door of the Bedroom 3");    //Mensaje en NO           
            
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
    private javax.swing.JPanel jpnRooms;
    private javax.swing.JLabel lblBathroom;
    private javax.swing.JLabel lblBathroomImage;
    private javax.swing.JLabel lblBedroom1;
    private javax.swing.JLabel lblBedroom1Image;
    private javax.swing.JLabel lblBedroom2;
    private javax.swing.JLabel lblBedroom2Image;
    private javax.swing.JLabel lblBedroom3;
    private javax.swing.JLabel lblBedroom3Image;
    private javax.swing.JLabel lblKitchen;
    private javax.swing.JLabel lblKitchenImage;
    private javax.swing.JLabel lblLivingRoom;
    private javax.swing.JLabel lblLivingRoomImage;
    // End of variables declaration//GEN-END:variables
}
