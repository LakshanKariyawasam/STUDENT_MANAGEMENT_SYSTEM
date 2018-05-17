package student_management_system;

import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.util.TimerTask;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frm_Login extends javax.swing.JFrame {

    frm_SetDB sd = new frm_SetDB();
    Database db = new Database();
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    frm_Home h=new frm_Home();
    
    public frm_Login() 
    {
        initComponents();        
        loginPanel.setBackground(new Color(0,0,0,0));
        img_loader.setVisible(false);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        this.setSize(x,y);
        db.setConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        loginPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        txt_uname = new javax.swing.JTextField();
        btn_Login = new javax.swing.JButton();
        btn_Settings = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loader = new javax.swing.JPanel();
        img_loader = new javax.swing.JLabel();
        lbl_loader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);
        getContentPane().setLayout(null);

        loginPanel.setBackground(new java.awt.Color(0, 0, 0));
        loginPanel.setToolTipText("");
        loginPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                loginPanelComponentShown(evt);
            }
        });
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 3));
        loginPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 250, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");
        loginPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setToolTipText("");
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 3));
        loginPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 250, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        loginPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student Management System");
        loginPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 360, 50));

        txt_pass.setBackground(new java.awt.Color(102, 102, 102));
        txt_pass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(153, 153, 153));
        txt_pass.setText("jPasswordField2");
        txt_pass.setBorder(null);
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passMouseClicked(evt);
            }
        });
        loginPanel.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 250, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Wellcome...");
        loginPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 290, 50));

        txt_uname.setBackground(new java.awt.Color(102, 102, 102));
        txt_uname.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_uname.setForeground(new java.awt.Color(255, 255, 255));
        txt_uname.setText("Enter user name here");
        txt_uname.setBorder(null);
        txt_uname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_unameMouseClicked(evt);
            }
        });
        loginPanel.add(txt_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 250, 30));

        btn_Login.setBackground(new java.awt.Color(51, 102, 255));
        btn_Login.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(255, 255, 255));
        btn_Login.setText("LOGIN");
        btn_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_LoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_LoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_LoginMouseReleased(evt);
            }
        });
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        loginPanel.add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 250, 40));

        btn_Settings.setBackground(new java.awt.Color(0, 0, 51));
        btn_Settings.setForeground(new java.awt.Color(0, 0, 102));
        btn_Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Settings_40px_1.png"))); // NOI18N
        btn_Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SettingsActionPerformed(evt);
            }
        });
        loginPanel.add(btn_Settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 40, 40));

        getContentPane().add(loginPanel);
        loginPanel.setBounds(70, 240, 400, 500);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("About");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(1000, 0, 80, 80);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Help");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(1090, 20, 50, 40);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Privacy & Terms");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1170, 20, 120, 40);

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Close_Window_25px.png"))); // NOI18N
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exitMousePressed(evt);
            }
        });
        getContentPane().add(btn_exit);
        btn_exit.setBounds(1310, 30, 25, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mouse-computer-black-keyboard-sunglasses-table-black-and-white.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1380, 800);

        loader.setBackground(new java.awt.Color(55, 57, 64));

        img_loader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tumblr_o0wyzo6rAA1syz1nro1_500.gif"))); // NOI18N

        lbl_loader.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_loader.setForeground(new java.awt.Color(166, 245, 253));
        lbl_loader.setText("Loading.... Please wait...");

        javax.swing.GroupLayout loaderLayout = new javax.swing.GroupLayout(loader);
        loader.setLayout(loaderLayout);
        loaderLayout.setHorizontalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaderLayout.createSequentialGroup()
                .addGroup(loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loaderLayout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(img_loader))
                    .addGroup(loaderLayout.createSequentialGroup()
                        .addGap(581, 581, 581)
                        .addComponent(lbl_loader)))
                .addContainerGap(468, Short.MAX_VALUE))
        );
        loaderLayout.setVerticalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaderLayout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(img_loader)
                .addGap(27, 27, 27)
                .addComponent(lbl_loader)
                .addGap(206, 206, 206))
        );

        getContentPane().add(loader);
        loader.setBounds(0, 0, 1380, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseClicked
        txt_pass.setText("");
    }//GEN-LAST:event_txt_passMouseClicked

    private void loginPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_loginPanelComponentShown
        
    }//GEN-LAST:event_loginPanelComponentShown

    private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btn_exitMousePressed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        String usr = txt_uname.getText();
        String pwd  = txt_pass.getText();
        String qur = "select * from tbl_login where uname ='"+usr+"' and password = '"+pwd+"'";
        try 
        {
            con=db.setConnection();
            ps = con.prepareStatement(qur);
        } catch (SQLException ex) 
        {
            Logger.getLogger(frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        try 
        {
            rs = ps.executeQuery();
            if (rs.next()) 
            {
                String user = rs.getString("uname");
                String pass = rs.getString("password");
                if (user.equals(txt_uname.getText()) && pass.equals(txt_pass.getText()))
                {
                    
                    loginPanel.setVisible(false);
                    jLabel9.setVisible(false);
                    jLabel10.setVisible(false);
                    jLabel6.setVisible(false);
                    jLabel3.setVisible(false);
                    btn_exit.setVisible(false);
                    loader.setVisible(true);
                    img_loader.setVisible(true);
                    new java.util.Timer().schedule(new TimerTask() 
                     {
                         @Override
                         public void run() 
                        {
                            
                            h.setExtendedState(MAXIMIZED_BOTH);
                            h.setVisible(true);

                            dispose();
                            
               
                        }

                        private void dispose() 
                        {
                            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                    },1000*10);
                   
                    //JOptionPane.showMessageDialog(null,"You are succesfully loged in");
                    
                }               
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Incorrect user name or password...");
            }
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(frm_Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMouseClicked
        
    }//GEN-LAST:event_btn_LoginMouseClicked

    private void btn_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMouseEntered
        btn_Login.setBackground(new Color(20, 74, 237));
    }//GEN-LAST:event_btn_LoginMouseEntered

    private void btn_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMouseExited
        btn_Login.setBackground(new Color(51,102,255));
    }//GEN-LAST:event_btn_LoginMouseExited

    private void btn_LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMousePressed
        btn_Login.setBackground(new Color(101, 99, 238));
    }//GEN-LAST:event_btn_LoginMousePressed

    private void btn_LoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LoginMouseReleased
        btn_Login.setBackground(new Color(20, 74, 237));
    }//GEN-LAST:event_btn_LoginMouseReleased

    private void txt_unameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_unameMouseClicked
        txt_uname.setText("");
    }//GEN-LAST:event_txt_unameMouseClicked

    private void btn_SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SettingsActionPerformed
        
        sd.setVisible(true);
    }//GEN-LAST:event_btn_SettingsActionPerformed

    public static void main(String args[]) throws SQLException
    {
         
        java.awt.EventQueue.invokeLater(() -> {
            new frm_Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Settings;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel img_loader;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_loader;
    private javax.swing.JPanel loader;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_uname;
    // End of variables declaration//GEN-END:variables
}
