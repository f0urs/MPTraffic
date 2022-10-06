/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.Lanes;
import Backend.Mediator;
import Backend.Vehicle;
import Backend.VehiclesABS;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TrafficInfo extends javax.swing.JFrame {

    /**
     * Creates new form TrafficInfo
     */
    Mediator mediator;//creating the mediator object
    VehiclesABS vehicle1;
    VehiclesABS vehicle2;
    VehiclesABS vehicle3;
    VehiclesABS vehicle4;
    VehiclesABS vehicle5;
    VehiclesABS vehicle6;
    VehiclesABS vehicle7;
    VehiclesABS vehicle8;
    
    public TrafficInfo() {
        initComponents();
        
        mediator = new Lanes();
        vehicle1 = new Vehicle(mediator, "abc123");// creating the vehicle objects
        vehicle2 = new Vehicle(mediator, "def123");
        vehicle3 = new Vehicle(mediator, "jkl123");
        vehicle4 = new Vehicle(mediator, "mno123");
        vehicle5 = new Vehicle(mediator, "pqr123");
        vehicle6 = new Vehicle(mediator, "stu123");
        vehicle7 = new Vehicle(mediator, ""); //the object used for the registered vehicle
        vehicle8 = new Vehicle(mediator, "vwx123");
        
        
        mediator.addToLane1(vehicle1);//assigning the vehicle objects to their lanes using the mediator object
        mediator.addToLane2(vehicle2);
        mediator.addToLane2(vehicle3);
        mediator.addToLane3(vehicle4);
        mediator.addToLane3(vehicle5);
        mediator.addToLane3(vehicle6);
        mediator.addToLane3(vehicle7);
        mediator.addToLane3(vehicle8);
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
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(105, 112, 96));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Noto Sans", 0, 21)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText(" LANE 1");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Noto Sans", 0, 21)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText(" LANE 2");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Noto Sans", 0, 21)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText(" LANE 3");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jButton1.setBackground(new java.awt.Color(135, 150, 118));
        jButton1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(105, 111, 99));
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        jPanel2.setBackground(new java.awt.Color(105, 112, 96));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(135, 150, 118)));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(186, 201, 169));
        jLabel1.setText("No of Vehicles: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 40, 30));

        jLabel3.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(186, 201, 169));
        jLabel3.setText("Traffic Level: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 80, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 492, 158, 51));

        jLabel8.setFont(new java.awt.Font("ROG Fonts v1.6", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(186, 201, 169));
        jLabel8.setText("Traffic Control System");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 6, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/output-onlinepngtools(10).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        jButton2.setBackground(new java.awt.Color(135, 150, 118));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(105, 111, 99));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jLabel5.setText(vehicle7.getVehicleName());
        int vehicleCount = 0;
        String lanes = whatLane();
        vehicleCount = vehicle7.viewTraffic(lanes);//getting the number of vehicles in the specified lane
        jLabel2.setText(String.valueOf(vehicleCount));
        
        if (vehicleCount>=4) {
            
            jPanel2.setBackground(Color.red);
            jLabel4.setText("High");
            
        }else if(vehicleCount<4 && vehicleCount>1){
            jPanel2.setBackground(Color.orange);
            jLabel4.setText("Medium");
            
        }else if(vehicleCount<2){
            jPanel2.setBackground(Color.green);
            jLabel4.setText("Low");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseClicked

    public void userVehicle(String name){//changing the objects name to registered vehicle number
        
        vehicle7  = new Vehicle(mediator, name);
        
    }
    
    public String whatLane(){
        
       if(jRadioButton1.isSelected()){//choosing the lane
           return "lane1";
       }else if(jRadioButton2.isSelected()){
           return "lane2";
       }else if(jRadioButton3.isSelected()){
           return "lane3";
       }else{
           System.out.println(" Error");
       }
       return null;
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
            java.util.logging.Logger.getLogger(TrafficInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrafficInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrafficInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrafficInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrafficInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
