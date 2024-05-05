import inf.HomePage;
import inf.Login;
import inf.NewJFrame;
import inf.NewJFrame3;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MyOrders extends javax.swing.JFrame {

    public MyOrders() {
        initComponents();
        fetchDataFromDatabase();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        orderNowButtonHeader1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        myLabel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        System.out.println("fsfs");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
    

        
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        

        
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
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 210, 40));

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jLabel2.setText("FOODIEsfdsff");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 110, -1));

        jButton1.setText("About Us");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 70, -1));

        jButton3.setText("My Ordersss");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 80, -1));

        orderNowButtonHeader1.setText("Home");
        orderNowButtonHeader1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        orderNowButtonHeader1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderNowButtonHeader1ActionPerformed(evt);
            }
        });
        jPanel1.add(orderNowButtonHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1010, 1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText(" My Orders");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 940, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel1.setText(" Show :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 30));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setVisibleRowCount(1);
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 70, 30));

       // main label
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 680));
        
        JScrollPane jScrollPane = new JScrollPane(jPanel1); // Wrap jPanel1 in a JScrollPane

        // Add jScrollPane to the content pane
        //getContentPane().setLayout(new BorderLayout());
        getContentPane().add(jScrollPane,new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1033, 700));
        
        pack();
        setLocationRelativeTo(null);
        System.out.println("fsfs");
    }

    private void fetchDataFromDatabase() {
        try {
            // Connect to your database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/foodorderingsystem", "root", "");

            // Query to retrieve data
            String query = "SELECT productName, quantity, price ,date FROM userproducts";

            // Create statement and execute query
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Loop through the result set
            int yPosition = 180; // Initial Y position for JPanel
           
            while (resultSet.next()) {
                String productName = resultSet.getString("productName");
                int quantity = resultSet.getInt("quantity");
                Date orderDate = resultSet.getDate("date");
                Double price=resultSet.getDouble("price");
                
                // Create and configure JPanel
                JPanel panel = createPanel(productName, quantity, orderDate,yPosition,price);
                System.out.println(productName+Integer.toString(quantity)+orderDate.toString());
                System.out.println("hello 1");
                
                // Add JPanel to jPanel1
                //jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, yPosition, 700, 240));
                System.out.println("hello 1");
                // Increment Y position for next JPanel
                yPosition += 250; // Adjust as needed
              

            }

            // Close connection
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private JPanel createPanel(String productName, int quantity, Date orderDate,int position,Double price) {
        JPanel myLabel=new JPanel();
        myLabel.setBackground(java.awt.SystemColor.control);
        myLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLabel jLabel3=new JLabel();
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Order");
        
        JLabel jLabel5=new JLabel();
        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setText("1");
        
        JLabel jLabel6=new JLabel();
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orderMenuImages/R (1).jpeg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLabel jLabel7=new JLabel();
        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Placed on:");

        JLabel jLabel8=new JLabel();
        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText(orderDate.toString());

        JLabel jLabel9=new JLabel();
        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel9.setText(productName);

        JLabel jLabel10=new JLabel();
        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Quantity :");

        JLabel jLabel11=new JLabel();
        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel11.setText(Integer.toString(quantity));
        
        JLabel jLabel12=new JLabel();
        jLabel12.setBackground(new java.awt.Color(102, 102, 102));
        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Price :");
        
        JLabel jLabel13=new JLabel();
        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        int value=(int)(price/quantity);
        jLabel13.setText(Integer.toString(value));
        
        System.out.println("fsfs");
        javax.swing.GroupLayout myLabelLayout = new javax.swing.GroupLayout(myLabel);
        JSeparator jSeparator1=new JSeparator();
        myLabel.setLayout(myLabelLayout);
        myLabelLayout.setHorizontalGroup(
            myLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(myLabelLayout.createSequentialGroup()
                .addGroup(myLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(myLabelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(myLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(myLabelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(myLabelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        myLabelLayout.setVerticalGroup(
            myLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(myLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(myLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(myLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(myLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(myLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        System.out.println("fsfs");
        jPanel1.add(myLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, position, 700, 230));


        
        System.out.println("one");
        return myLabel;
    }

    // Your other action event methods and main method
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        NewJFrame3 myOrders=new NewJFrame3();
        myOrders.setVisible(true);
        this.dispose();
    }                                        

    private void orderNowButtonHeader1ActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        HomePage home=new HomePage();
        home.setVisible(true);
        this.dispose();
    }                                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        NewJFrame aboutUs=new NewJFrame();
        aboutUs.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(inf.MyOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inf.MyOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inf.MyOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inf.MyOrders.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyOrders().setVisible(true);
            }
        });
    }

     private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel myLabel;
    private javax.swing.JButton orderNowButtonHeader1;
}
