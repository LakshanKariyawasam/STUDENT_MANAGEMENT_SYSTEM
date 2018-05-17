package student_management_system;

public class OpenFrame 
{
    frm_Payments pay = new frm_Payments();
    frm_StudentRegistration stu = new frm_StudentRegistration();
    frm_Attendance att = new frm_Attendance();
    
    private int oframe;

    public void showForm(int no)
    {
        oframe = no;
        
        if(no == 1)
        {
            stu.setVisible(true);
            pay.setVisible(false);
            att.setVisible(false);
        }
        else if(no == 2)
        {
            pay.setVisible(true);
            att.setVisible(false);
            stu.setVisible(false);
        }
        else
        {
            att.setVisible(true);
            stu.setVisible(false);
            pay.setVisible(false);
        }      
    }
    
    public void alwaysTop()
    {
        if(oframe == 1)
        {
            stu.setVisible(true);
        }
        else if(oframe == 2)
        {
            pay.setVisible(true);
        }
        else
        {
            att.setVisible(true);
        }      
    }
    
    
}
