package student_management_system;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;

import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import student_management_system.prog.BillPrintable;

public class frm_Payments extends javax.swing.JFrame {
      
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int sHeight = screenSize.height;
    int sWidth = screenSize.width;
     
    Database db = new Database();
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    
    public frm_Payments() {
        initComponents();
        this.setSize((sWidth/5)*4, sHeight-100);
        this.setLocation(sWidth/5, 40); 
        con = db.setConnection();
        //chb_print.
    }

    
 public PageFormat getPageFormat(PrinterJob pj)
{
    
    PageFormat pf = pj.defaultPage();
    Paper paper = pf.getPaper();    

    double middleHeight =8.0;  
    double headerHeight = 2.0;                  
    double footerHeight = 2.0;                  
    double width = convert_CM_To_PPI(8);      //printer know only point per inch.default value is 72ppi
    double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
    paper.setSize(width, height);
    paper.setImageableArea(                    
        0,
        10,
        width,            
        height - convert_CM_To_PPI(1)
    );   //define boarder size    after that print area width is about 180 points
            
    pf.setOrientation(PageFormat.PORTRAIT);      //select orientation portrait or landscape but for this time portrait
    pf.setPaper(paper);    

    return pf;
}
    
protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
}
    
protected static double toPPI(double inch) {            
	        return inch * 72d;            
}

public class BillPrintable implements Printable {
     
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
      
                
        
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    

            double width = pageFormat.getImageableWidth();                    
           
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 

            ////////// code by alqama//////////////

            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
            int idLength=metrics.stringWidth("000");
            int amtLength=metrics.stringWidth("000000");
            int qtyLength=metrics.stringWidth("00000");
            int priceLength=metrics.stringWidth("000000");
            int prodLength=(int)width - idLength - amtLength - qtyLength - priceLength-17;

        //    int idPosition=0;
        //    int productPosition=idPosition + idLength + 2;
        //    int pricePosition=productPosition + prodLength +10;
        //    int qtyPosition=pricePosition + priceLength + 2;
        //    int amtPosition=qtyPosition + qtyLength + 2;
            
            int productPosition = 0;
            int discountPosition= prodLength+5;
            int pricePosition = discountPosition +idLength+10;
            int qtyPosition=pricePosition + priceLength + 4;
            int amtPosition=qtyPosition + qtyLength;
            
            
              
        try{
            /*Draw Header*/
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            int headerRectHeighta=40;
            
            ///////////////// Product names Get ///////////
                String  pId=txt_payId.getText();
                String stdId=txt_stdId.getText();
                String amt=txt_amt.getText();
                String pAmt=txt_pAmt.getText();
                
                int no1 = Integer.parseInt(amt);
                int no2 = Integer.parseInt(pAmt);
                
                int balance = no1-no2;
                
                String blnc = String.valueOf(balance);
                txt_blc.setText(blnc);
            ///////////////// Product names Get ///////////
                
            
            /*///////////////// Product price Get ///////////
                int pp1a=Integer.valueOf(pp1.getText());
                int pp2a=Integer.valueOf(pp2.getText());
                int pp3a=Integer.valueOf(pp3.getText());
                int pp4a=Integer.valueOf(pp4.getText());
                int sum=pp1a+pp2a+pp3a+pp4a;
            ///////////////// Product price Get ///////////*/
                
             g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawString("----------------------------------",12,y);y+=yShift;
            g2d.drawString("          NIBM        ",12,y);y+=yShift;
            g2d.drawString("     Payment Invoice",12,y);y+=headerRectHeight;
      
            g2d.drawString("----------------------------------",10,y);y+=yShift;
            g2d.drawString("  Student ID  "+stdId+"  ",10,y);y+=yShift;
            g2d.drawString("  Payment ID  "+pId+"  ",10,y);y+=yShift;
            g2d.drawString("----------------------------------",10,y);y+=headerRectHeight;           
            g2d.drawString("  Amount      "+amt+"  ",10,y);y+=yShift;
            g2d.drawString("  Paid Amount "+pAmt+"  ",10,y);y+=yShift;
            g2d.drawString("----------------------------------",10,y);y+=yShift;
            g2d.drawString("  Balnce:     "+blnc+"            ",10,y);y+=yShift;
            g2d.drawString("----------------------------------",10,y);y+=yShift;
            g2d.drawString("   Emergency Contact         ",10,y);y+=yShift;
            g2d.drawString("      0766295259             ",10,y);y+=yShift;
            g2d.drawString("**********************************",10,y);y+=yShift;
            g2d.drawString("   Keep this bill..  ",10,y);y+=yShift;
            g2d.drawString("**********************************",10,y);y+=yShift;
                   
                                              
//            g2d.setFont(new Font("Monospaced",Font.BOLD,10));
//            g2d.drawString("Customer Shopping Invoice", 30,y);y+=yShift; 
          

    }
    catch(Exception r){
    r.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }
   }
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_Pay = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txt_payId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_stdId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_stdFName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_amt = new javax.swing.JTextField();
        txt_stdLName1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_pAmt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_blc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_desc = new javax.swing.JTextField();
        chb_print = new javax.swing.JCheckBox();
        btn_pPay = new javax.swing.JButton();
        btn_pClr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Payments");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1090, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jp_Pay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Payments");

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Payment ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Student Name");

        txt_stdFName.setText("First Name");
        txt_stdFName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_stdFNameMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Amount");

        txt_stdLName1.setText("Last Name");
        txt_stdLName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_stdLName1MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Paid Amount");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Balance");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Description");

        chb_print.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chb_print.setText("Print Recipt");

        btn_pPay.setBackground(new java.awt.Color(102, 102, 102));
        btn_pPay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_pPay.setText("  Pay");
        btn_pPay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pPay.setIconTextGap(15);
        btn_pPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pPayActionPerformed(evt);
            }
        });

        btn_pClr.setBackground(new java.awt.Color(102, 102, 102));
        btn_pClr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_pClr.setText("  Clear");
        btn_pClr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_pClr.setIconTextGap(15);
        btn_pClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pClrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_PayLayout = new javax.swing.GroupLayout(jp_Pay);
        jp_Pay.setLayout(jp_PayLayout);
        jp_PayLayout.setHorizontalGroup(
            jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_PayLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_PayLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btn_pPay, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(btn_pClr))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addGroup(jp_PayLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(chb_print))
                    .addGroup(jp_PayLayout.createSequentialGroup()
                        .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(65, 65, 65)
                        .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_amt, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_stdId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_payId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jp_PayLayout.createSequentialGroup()
                                .addComponent(txt_stdFName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txt_stdLName1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_pAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_blc, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        jp_PayLayout.setVerticalGroup(
            jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_PayLayout.createSequentialGroup()
                .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_PayLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txt_payId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_stdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_PayLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_stdFName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stdLName1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_PayLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4))
                    .addGroup(jp_PayLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txt_amt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_pAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_blc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(txt_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(chb_print)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jp_PayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pPay)
                    .addComponent(btn_pClr))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jp_Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_stdFNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_stdFNameMouseClicked

        txt_stdFName.setText("");
    }//GEN-LAST:event_txt_stdFNameMouseClicked

    private void txt_stdLName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_stdLName1MouseClicked
        txt_stdLName1.setText("");
    }//GEN-LAST:event_txt_stdLName1MouseClicked

    private void btn_pPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pPayActionPerformed
        
        String payID,stuID,remarks,amt,payAMt,bal,date,fn,ln;
        
    payID=    txt_payId.getText();
      stuID=  txt_stdId.getText();
    fn=    txt_stdFName.getText();
     ln=   txt_stdLName1.getText();
      amt=  txt_amt.getText();
      payAMt=  txt_pAmt.getText();
      
      remarks=  txt_desc.getText();
        
      int tot = Integer.valueOf(amt) - Integer.valueOf(payAMt);
      String tot2 = String.valueOf(tot);
      txt_blc.setText(tot2);
      
        try{
        Statement st = con.createStatement();
        st.executeUpdate("insert into tbl_Payment (pay_ID,stu_ID,pay_remarks,amt,pay_amt,balance) values ('"+payID+"','"+stuID+"','"+remarks+"','"+amt+"','"+payAMt+"','"+tot2+"') ");
        JOptionPane.showMessageDialog(null,"Payment Updated Succesfully...");
        }catch(SQLException e)
        {
        
        }
        
        
         if(chb_print.isSelected())
        {
        PrinterJob pj = PrinterJob.getPrinterJob();        
        pj.setPrintable(new frm_Payments.BillPrintable(),getPageFormat(pj));
        try {
             pj.print();
          
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        }
        }
        else
        {
        
        }
         
         
    }//GEN-LAST:event_btn_pPayActionPerformed

    private void btn_pClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pClrActionPerformed
        
        txt_payId.setText("");
        txt_stdId.setText("");
        txt_stdFName.setText("");
        txt_stdLName1.setText("");
        txt_amt.setText("");
        txt_pAmt.setText("");
        txt_blc.setText("");
        txt_desc.setText("");
       
    }//GEN-LAST:event_btn_pClrActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pClr;
    private javax.swing.JButton btn_pPay;
    private javax.swing.JCheckBox chb_print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jp_Pay;
    private javax.swing.JTextField txt_amt;
    private javax.swing.JTextField txt_blc;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_pAmt;
    private javax.swing.JTextField txt_payId;
    private javax.swing.JTextField txt_stdFName;
    private javax.swing.JTextField txt_stdId;
    private javax.swing.JTextField txt_stdLName1;
    // End of variables declaration//GEN-END:variables

}
