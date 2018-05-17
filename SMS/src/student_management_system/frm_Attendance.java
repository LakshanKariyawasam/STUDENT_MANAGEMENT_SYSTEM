package student_management_system;

import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class frm_Attendance extends javax.swing.JFrame 
{
    Database db = new Database();
    private DefaultTableModel tbl = new DefaultTableModel();
    ResultSet rs;
    Connection con;
    Statement st;
    PreparedStatement pst;        
    private Object tableModel;
           
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int sHeight = screenSize.height;
    int sWidth = screenSize.width;
    
    public frm_Attendance() 
    {
        initComponents();
        this.setSize((sWidth/5)*4, sHeight-100);
        this.setLocation(sWidth/5, 40);
        db.setConnection();
        tableModel();
    }
    
    public String getDateTime()
    {
        java.util.Date dNow = new java.util.Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("hh:mm:ss a, yyyy-MM-dd");
        String dat = ft.format(dNow);
        return dat;
    }
    
    public void tableModel()
    {
       tbl.addColumn("Stu ID");
       tbl.addColumn("Name");
       tbl.addColumn("Payments");
       tbl.addColumn("Attendance");
       Table1.setModel(tbl);       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Atte = new javax.swing.JPanel();
        btn_Exit = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPay = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Attendance Marking");
        setIconImages(null);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1090, 670));

        jp_Atte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Table1);

        jLabel3.setText("Payment");

        jLabel1.setText("Student ID");

        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Attendance Marking Portal");

        javax.swing.GroupLayout jp_AtteLayout = new javax.swing.GroupLayout(jp_Atte);
        jp_Atte.setLayout(jp_AtteLayout);
        jp_AtteLayout.setHorizontalGroup(
            jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AtteLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_AtteLayout.createSequentialGroup()
                        .addGroup(jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36)
                        .addGroup(jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPay)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jp_AtteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Exit)
                        .addGap(30, 30, 30))))
            .addGroup(jp_AtteLayout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp_AtteLayout.setVerticalGroup(
            jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_AtteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AtteLayout.createSequentialGroup()
                        .addComponent(btn_Exit)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_AtteLayout.createSequentialGroup()
                        .addGroup(jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_AtteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Atte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_Atte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        this.hide();
        
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
            try 
        {
             
            rs = db.getResult("SELECT s.stu_FName, p.amt FROM tbl_payment p, tbl_student s WHERE s.stu_ID = p.stu_ID AND s.stu_ID = '"+ txtID.getText() +"' ");
            
            while(rs.next())
            {
                txtName.setText(rs.getString(1));
                txtPay.setText(String.valueOf(rs.getDouble(2)));                 
            }
            
            String[] row = {txtID.getText(), txtName.getText(), txtPay.getText(), getDateTime()};
            tbl.addRow(row);
            Table1.setModel(tbl);
            txtID.setText("");
            
            int z = db.getMaxID("SELECT MAX(att_ID) FROM tbl_atendance");
            
            String Name,Pay;
            
            Pay = txtPay.getText();
            Name = txtName.getText();
            
            
            st = con.createStatement();
            st.executeUpdate("insert into tbl_atendance (att_ID,stu_ID,intime) values ('"+z+"','"+Pay+"','"+Name+"')");
            
            //db.save_delete_update("INSERT INTO tbl_atendance(att_ID, stu_ID, intime) VALUES( '"+ z +"' '"+txtID.getText()+"', '"+getDateTime()+"' )");
            //txtName.setText("");
            //txtPay.setText("");         
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(frm_Attendance.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Cannot get Auto ID");
        }
            
        
    }//GEN-LAST:event_txtIDActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_Atte;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPay;
    // End of variables declaration//GEN-END:variables
}
