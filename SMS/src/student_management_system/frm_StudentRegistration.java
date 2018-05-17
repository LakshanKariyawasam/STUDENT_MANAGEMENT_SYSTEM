package student_management_system;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class frm_StudentRegistration extends javax.swing.JFrame {
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();    
    int sHeight = screenSize.height;
    int sWidth = screenSize.width;    
    
    Database db = new Database();
    
    public frm_StudentRegistration() 
    {
        initComponents();
        this.setSize((sWidth/5)*4, sHeight-100);
        this.setLocation(sWidth/5, 40);
        db.setConnection();
        txt_sID.setText(String.valueOf((db.getMaxID("SELECT MAX(stu_ID) FROM tbl_student"))+1));
    }
    
    // Resize image
    
    String imgpath = null;
    
    public ImageIcon ResizeImage(String imgpath, byte[] pic)
    {
        ImageIcon img  = null;
        if(imgpath != null )
        {
            img = new ImageIcon(imgpath);
        }
        else
        {
            img = new ImageIcon(pic);
        }
        
        Image i = img.getImage();
        Image is = i.getScaledInstance(lbl_Image.getWidth(), lbl_Image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(is); 
        
        return image;        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jp_StuReg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_sID = new javax.swing.JTextField();
        txt_FName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_LName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_Add1 = new javax.swing.JTextField();
        txt_Add2 = new javax.swing.JTextField();
        txt_Add3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_TP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Parent = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_PTP = new javax.swing.JTextField();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        btn_Save = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        lbl_Image = new javax.swing.JLabel();
        btn_AddImage = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_dob = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_StuReg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jp_StuReg.setPreferredSize(new java.awt.Dimension(1092, 668));

        jLabel1.setText("Student ID");

        txt_sID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sIDActionPerformed(evt);
            }
        });

        txt_FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Student Name");

        jLabel3.setText("Gender");

        jLabel4.setText("Address");

        txt_Add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Add2ActionPerformed(evt);
            }
        });

        txt_Add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Add3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Contact No");

        jLabel6.setText("Email Address");

        jLabel7.setText("Parent Name");

        jLabel8.setText("Parent's Contact No");

        buttonGroup1.add(Male);
        Male.setText("Male");
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(Female);
        Female.setText("Female");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Student Registration");

        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_Clear.setText("Clear");

        lbl_Image.setBackground(new java.awt.Color(153, 255, 255));
        lbl_Image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_AddImage.setText("Add Profile Picture");
        btn_AddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddImageActionPerformed(evt);
            }
        });

        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        jLabel10.setText("DOB");

        javax.swing.GroupLayout jp_StuRegLayout = new javax.swing.GroupLayout(jp_StuReg);
        jp_StuReg.setLayout(jp_StuRegLayout);
        jp_StuRegLayout.setHorizontalGroup(
            jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_StuRegLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jp_StuRegLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jp_StuRegLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Parent))
                                .addGroup(jp_StuRegLayout.createSequentialGroup()
                                    .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_Add1)
                                        .addComponent(txt_Add2)
                                        .addComponent(txt_Add3)
                                        .addComponent(txt_Email)
                                        .addComponent(txt_TP, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jp_StuRegLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jp_StuRegLayout.createSequentialGroup()
                                    .addComponent(btn_Save)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_Clear)
                                    .addGap(38, 38, 38)
                                    .addComponent(btn_Exit))
                                .addComponent(txt_PTP, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jp_StuRegLayout.createSequentialGroup()
                            .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_sID, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_StuRegLayout.createSequentialGroup()
                                    .addComponent(txt_FName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_LName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jp_StuRegLayout.createSequentialGroup()
                                    .addComponent(Male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Female))
                                .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jp_StuRegLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel9))))
                .addGap(81, 81, 81)
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_AddImage, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(lbl_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(473, Short.MAX_VALUE))
        );
        jp_StuRegLayout.setVerticalGroup(
            jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_StuRegLayout.createSequentialGroup()
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_StuRegLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel9)
                        .addGap(35, 35, 35)
                        .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_sID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Male)
                            .addComponent(jLabel3)
                            .addComponent(Female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txt_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_StuRegLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lbl_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_AddImage)))
                .addGap(15, 15, 15)
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Add3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_TP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Parent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_PTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(jp_StuRegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Exit)
                    .addComponent(btn_Clear)
                    .addComponent(btn_Save))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        getContentPane().add(jp_StuReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        this.hide();       
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        
    }//GEN-LAST:event_MaleActionPerformed

    private void txt_Add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Add3ActionPerformed
       
    }//GEN-LAST:event_txt_Add3ActionPerformed

    private void txt_FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FNameActionPerformed
        
    }//GEN-LAST:event_txt_FNameActionPerformed

    private void txt_sIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sIDActionPerformed
        
    }//GEN-LAST:event_txt_sIDActionPerformed

    private void btn_AddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddImageActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbl_Image.setIcon(ResizeImage(path, null));
            String imgpath = path;
        }
        else
        {
            System.out.println("Not image selected...");
        }
    }//GEN-LAST:event_btn_AddImageActionPerformed

    private void txt_Add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Add2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Add2ActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        
        Connection con = db.setConnection();
        
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String addDate = df.format(txt_dob.getDate());
        
        InputStream img = null;
        try 
        {
            //create image object
            img = new FileInputStream(new File(imgpath));
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(frm_StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String gender = buttonGroup1.getElements().nextElement().getText(); 
        
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO tbl_student VALUES('"+ txt_sID.getText() +"', '"+ txt_FName.getText() +"', '"+ txt_LName.getText() +"', '"+ gender +"', '"+ addDate +"', '"+ txt_Add1.getText() +"', '"+ txt_Add2.getText() +"', '"+ txt_Add3.getText() +"', '"+ txt_TP.getText() +"', '"+ txt_Email.getText() +"', '"+ txt_Parent.getText() +"', '"+ txt_PTP.getText() +"', '"+ img +"')");
            ps.executeUpdate();               
                
            JOptionPane.showMessageDialog(null, "Record added successfully...");
            /*if(line == 1)
            {
            JOptionPane.showMessageDialog(null, "Record added successfully...");
            txt_sID.setText(String.valueOf((db.getMaxID("SELECT MAX(stu_ID) FROM tbl_student"))+1));
            txt_FName.setText("");
            txt_LName.setText("");
            txt_dob.setDate(null);
            txt_Add1.setText("");
            txt_Add2.setText("");
            txt_Add3.setText("");
            txt_TP.setText("");
            txt_Email.setText("");
            txt_Parent.setText("");
            txt_PTP.setText("");
            lbl_Image.setIcon(null);
            }
            else
            {
            JOptionPane.showMessageDialog(null, "Error... Record not added...");
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(frm_StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_SaveActionPerformed

    
    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new frm_StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JButton btn_AddImage;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Save;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jp_StuReg;
    private javax.swing.JLabel lbl_Image;
    private javax.swing.JTextField txt_Add1;
    private javax.swing.JTextField txt_Add2;
    private javax.swing.JTextField txt_Add3;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_LName;
    private javax.swing.JTextField txt_PTP;
    private javax.swing.JTextField txt_Parent;
    private javax.swing.JTextField txt_TP;
    private com.toedter.calendar.JDateChooser txt_dob;
    private javax.swing.JTextField txt_sID;
    // End of variables declaration//GEN-END:variables
}
