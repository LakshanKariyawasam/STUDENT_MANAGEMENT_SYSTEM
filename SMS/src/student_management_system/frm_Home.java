package student_management_system;

import java.awt.*;
import javax.swing.*;

public class frm_Home extends javax.swing.JFrame 
{ 
    
    OpenFrame op = new OpenFrame();
            
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int sHeight = screenSize.height;
    int sWidth = screenSize.width;
    
    public frm_Home() 
    {       
        initComponents();  
        this.setSize(sWidth, sHeight);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);        
    }   

    @SuppressWarnings("unchecked")     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_Home = new javax.swing.JPanel();
        btn_StuReg = new javax.swing.JButton();
        btn_Payments = new javax.swing.JButton();
        btn_Attendance = new javax.swing.JButton();
        btn_User = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        pnl_Home.setBackground(new java.awt.Color(102, 102, 102));
        pnl_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_HomeMouseClicked(evt);
            }
        });

        btn_StuReg.setBackground(new java.awt.Color(0, 0, 0));
        btn_StuReg.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btn_StuReg.setForeground(new java.awt.Color(255, 255, 255));
        btn_StuReg.setText("Student Registration");
        btn_StuReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StuRegActionPerformed(evt);
            }
        });

        btn_Payments.setBackground(new java.awt.Color(0, 0, 0));
        btn_Payments.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btn_Payments.setForeground(new java.awt.Color(255, 255, 255));
        btn_Payments.setText("Payments");
        btn_Payments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PaymentsActionPerformed(evt);
            }
        });

        btn_Attendance.setBackground(new java.awt.Color(0, 0, 0));
        btn_Attendance.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btn_Attendance.setForeground(new java.awt.Color(255, 255, 255));
        btn_Attendance.setText("Attendance Marking");
        btn_Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AttendanceActionPerformed(evt);
            }
        });

        btn_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Male_User_70px_1.png"))); // NOI18N
        btn_User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_HomeLayout = new javax.swing.GroupLayout(pnl_Home);
        pnl_Home.setLayout(pnl_HomeLayout);
        pnl_HomeLayout.setHorizontalGroup(
            pnl_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_StuReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Payments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_Attendance, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_User)
                .addGap(96, 96, 96))
        );
        pnl_HomeLayout.setVerticalGroup(
            pnl_HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HomeLayout.createSequentialGroup()
                .addComponent(btn_User, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_StuReg, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Payments, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 575, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_StuRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StuRegActionPerformed
        op.showForm(1);
    }//GEN-LAST:event_btn_StuRegActionPerformed

    private void btn_PaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PaymentsActionPerformed
       op.showForm(2);
    }//GEN-LAST:event_btn_PaymentsActionPerformed

    private void btn_AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AttendanceActionPerformed
        op.showForm(3);
    }//GEN-LAST:event_btn_AttendanceActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        op.alwaysTop();
    }//GEN-LAST:event_formMouseClicked

    private void pnl_HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_HomeMouseClicked
        op.alwaysTop();
    }//GEN-LAST:event_pnl_HomeMouseClicked

    private void btn_UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UserMouseClicked
       /* pnl_submain.removeAll();
        pnl_submain.repaint();
        pnl_submain.revalidate();

        pnl_submain.add(pnl_usercup);
        pnl_submain.repaint();
        pnl_submain.revalidate();
        //panel_User.setVisible(true);*/

    }//GEN-LAST:event_btn_UserMouseClicked

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new frm_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Attendance;
    private javax.swing.JButton btn_Payments;
    private javax.swing.JButton btn_StuReg;
    private javax.swing.JLabel btn_User;
    private javax.swing.JPanel pnl_Home;
    // End of variables declaration//GEN-END:variables
}
