/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inf;


import codes.DBConnect;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author DELL
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    Connection conn=null;
    public HomePage() {
        conn=DBConnect.connect();
        initComponents();
        if (Login.userNameDisplay.equals("Sign Up")){
            logOutButton.setVisible(false);
        }
        else{
            logOutButton.setVisible(true);
        }
    }
    
   
    public void showUserToLogin(){
        if (Login.userNameDisplay.equals("Sign Up")){
            JOptionPane.showMessageDialog(null, "Please sign up to continue");
        }
        else{
            OrderNowPage orderNow=new OrderNowPage();
            orderNow.setVisible(true);
            this.dispose();
           
        }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        logOutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        orderNowButtonHeader = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        orderNowButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 0), new java.awt.Dimension(50, 32767));
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        orderNowButtonFooter = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log out.jpeg"))); // NOI18N
        logOutButton.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        orderNowButtonHeader.setBorderPainted(false);
        logOutButton.setBorderPainted(false);
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        jPanel2.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 40, 40));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel1.setText("FOODIE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 110, -1));

        orderNowButtonHeader.setText("Order Now");
        orderNowButtonHeader.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        orderNowButtonHeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowButtonHeaderActionPerformed(evt);
            }
        });
        jPanel2.add(orderNowButtonHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, -1));

        jButton3.setText("My Orders");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 80, -1));

        orderNowButton.setBackground(new java.awt.Color(0, 0, 0));
        orderNowButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        orderNowButton.setForeground(new java.awt.Color(255, 255, 255));
        orderNowButton.setText("Order Now");
        orderNowButton.setBorder(null);
        orderNowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowButtonActionPerformed(evt);
            }
        });
        jPanel2.add(orderNowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 90, 40));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 600, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1010, 3));

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        jLabel2.setText("<html>Satisfy your cravings<br> with our wide selection of mouthwatering dishes<br>delivered right to your doorstep. </html>");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 430, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setText("<html>\nDiscover Delicious<br>Food at Your<br>Fingertips\n</html>");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 360, 180));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Learn More ");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 90, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OIP (2).jpeg"))); // NOI18N
        jLabel4.setText(" ");
        jLabel4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/R.jpeg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 480, 340));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 20, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 20, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 20, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 20, 20));

        jLabel10.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel10.setText("5+ years expiriences");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 180, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 20, 20));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 20, 20));

        jLabel17.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel17.setText("Special Discounts");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 180, 20));

        jLabel18.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel18.setText("Diverse Options");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 180, 20));

        jLabel19.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel19.setText("Fast Delivery");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 180, 20));

        jLabel20.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel20.setText("Order Online");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 180, 20));

        jLabel21.setFont(new java.awt.Font("Sitka Small", 3, 14)); // NOI18N
        jLabel21.setText("Credit/Debit");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 180, 20));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText(Login.userNameDisplay);
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 210, 40));

        orderNowButtonFooter.setBackground(new java.awt.Color(0, 0, 0));
        orderNowButtonFooter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        orderNowButtonFooter.setForeground(new java.awt.Color(255, 255, 255));
        orderNowButtonFooter.setText("Try Now");
        orderNowButtonFooter.setBorder(null);
        orderNowButtonFooter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowButtonFooterActionPerformed(evt);
            }
        });
        jPanel2.add(orderNowButtonFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 90, 40));

        jButton2.setText("About Us");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 70, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        if (Login.userNameDisplay.equals("Sign Up")){
            JOptionPane.showMessageDialog(null, "Please sign up to Log Out");
            
        }
        else {
            Login.userNameDisplay="Sign Up";
            HomePage home=new HomePage();
            home.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void orderNowButtonHeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNowButtonHeaderActionPerformed
        showUserToLogin();
        
        
    }//GEN-LAST:event_orderNowButtonHeaderActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if (Login.userNameDisplay.equals("Sign Up")){
            JOptionPane.showMessageDialog(null, "Please sign up to continue");
        }
        else {
            try{
            // Query to retrieve data
                String query = "SELECT distinct date FROM userproducts where userName='"+Login.userNameDisplay+"'";

                // Create statement and execute query
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                if (resultSet.next()){
                    MyOrders myOrders=new MyOrders();
                    myOrders.setVisible(true);
                    this.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Please Order at least one item");
                }
            
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            } 
            
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void orderNowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNowButtonActionPerformed
        showUserToLogin();
        
        
    }//GEN-LAST:event_orderNowButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        NewJFrame aboutUs=new NewJFrame();
        aboutUs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void orderNowButtonFooterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderNowButtonFooterActionPerformed
        showUserToLogin();
        
        
    }//GEN-LAST:event_orderNowButtonFooterActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NewJFrame feedback=new NewJFrame();
        feedback.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton orderNowButton;
    private javax.swing.JButton orderNowButtonFooter;
    private javax.swing.JButton orderNowButtonHeader;
    // End of variables declaration//GEN-END:variables
}
