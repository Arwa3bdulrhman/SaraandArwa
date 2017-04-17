
package reschedule.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;


public class reschedule_2 {

        public static int reminder_availabiliy()
        {
            int result=0;
            return result;
        }
         public static int make_decision(String Task_name,int period_1,Date deadline_1, int priority_1 , String femplyee_id_1,String semplyee_id_1, Date added_date_1)
        {
            //انت مؤقتة
            int result_1=0;
            return result_1;
        }
         //public static shift(index_start_put,task_ID,period,Task_name,first_emplyee_id,second_emplyee_id,Deadline,periorty ,Tj_save[no_of_culomns],terminal)

    
    //public static void //current time
    public static void Task_Reschedule(int start_index_search, int period, String Task_ID,String current_emplyee_id, String femplyee_id, String semplyee_id, Date Deadline,int priority)
    {
         
        int terminal= 0;
        int comp;
        start_index_search=1;
        terminal=start_index_search + period -1;
        int selected_id=0;
        boolean reschudle_finished=false;
        int index_start_put;
        for(int i=start_index_search; i <= terminal; i++)
        {
            ////////////////////////////////////////////////////////////////////////// 1
            //if(Tj_ID == comp|| Tj_priority = 0)
            int Tj_ID = 0;
            int Tj_priority = 0;
            try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hc","root","1234");
            JOptionPane.showMessageDialog(null, "successfully connected");
            System.out.print("connected");  
            Statement stmt1=con.createStatement();
            ResultSet rs1 = null;
          
            String sql= "SELECT * WHERE uniteTimeIndix = '"+start_index_search+1+"' AND idFemployee = '"+emplyee_id+"'";
            
            if(rs1.next())
            {
                Tj_priority = rs1.getInt("priority");
                Tj_ID = rs1.getInt("idTask"); 
                
            }
            
            

          
    }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, "fail inserted "+ex);
        
        ///////////////////////////////////////////////////////////////////////// 2
         int pre_Tj_ID =0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/hc","root","1234");
            JOptionPane.showMessageDialog(null, "successfully connected");
            System.out.print("connected");  
            ResultSet rs2 = null;
             int x = i-1;
            String sql2= "SELECT * WHERE uniteTimeIndix = '"+--i+"' AND idFemployee = '"+emplyee_id+"'";
            Statement stmt2=con2.createStatement();
            if(rs2.next())
            {
                //pre_Tj_priority = rs2.getInt("priority");
                pre_Tj_ID = rs2.getInt("idTask");
                
               
            }
            
        }
        catch(Exception ex2){
        JOptionPane.showMessageDialog(null, "fail inserted "+ex2);}
        
        ///////////////////////////////////////////////////////////////////////// 3
        int post_Tj_ID = 0; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con3= DriverManager.getConnection("jdbc:mysql://localhost:3306/hc","root","1234");
            JOptionPane.showMessageDialog(null, "successfully connected");
            System.out.print("connected");  
            ResultSet rs3 = null;
            
            int y = i+1;
            String sql3= "SELECT * WHERE uniteTimeIndix = '"+ ++i+"' AND idFemployee = '"+current_emplyee_id+"'";
            Statement stmt3=con3.createStatement();
            if(rs3.next())
            {
                //pre_Tj_priority = rs2.getInt("priority");
                post_Tj_ID = rs3.getInt("idTask"); 
                
               
            }
            
        }
        catch(Exception ex3){
        JOptionPane.showMessageDialog(null, "fail inserted "+ex3);}
        
        //////////////////////////////////////////////////////////////////////////////////
//      ****************************   ALGORITHM
        
      
        if (i==terminal)  
                {
                    comp = pre_Tj_ID;
                }
        else
                    comp= post_Tj_ID; //يقارن الاندكس باللي بعده ما عدا اذا وصل لاخر اندكس في الفترة يقارن به مع اللي قبله 
                    if(selected_id==0)
                        continue;
                    else {
                        if(Tj_ID == comp || Tj_priority == 0)
                        {
                            if(Tj_priority < priority)
                            {
                                selected_id=0;
                                if(Tj_priority == 6 && reminder_availabiliy()<=0)
                                {
                                    selected_id=0;
                                    if(current_emplyee_id==femplyee_id)
                                    {
                                        current_emplyee_id=semplyee_id;
                                        Task_Reschedule(start_index_search,period,Task_ID,current_emplyee_id,femplyee_id,semplyee_id,Deadline,priority);
                                    }
                                    else
                                    {
                                        //make_decision(Task_name_1, period_1, deadline_1, priority_1 , femplyee_id_1, semplyee_id_1, added_date_1);// مااسندنا قيمة صفرية
                                    }
                                    break;
                                }
                                    if(Tj_priority!=0)
                                    {
                                        selected_id=Tj_ID; //temporary
                                    }
                                    if (i==terminal)
                                    {
                                        index_start_put=start_index_search; // just in 7, 8 priority
                                        //Tj_save[no_of_culomns]=selected_id;//ناقصها تكون زي المخزن يحفظ كامل معلومات التي جي عشان ما نفقدها ونوديها تسوي ريسكجول
                                        //temp column
                                        //shift(index_start_put,task_ID,period,Task_name,first_emplyee_id,second_emplyee_id,Deadline,periorty ,Tj_save[no_of_culomns],terminal);
                                        reschudle_finished=true;
                                        break;
                                    }
                            }
                            else
                            {
                                if(Tj_priority < priority)
                                {
                                }
                                
                            }
                          
                                        

                                            
                                            
                                            
                                            /*
                             else if (Tj[j].periorty==Ts_periorty) {
selected_id=0;
if (current_emplyee_id==femplyee_id){
current_emplyee_id=semplyee_id;

reschudle(start_index_search,period,Task_ID,current_emplyee_id,femplyee_id,semplyee_id,Deadline,periorty);

}else { make_ decision(Task_name,period,deadline,priority , femplyee_id,semplyee_id,added_date); }
exit;//خروج لكن الشرط انتفى بالتالي اذا فيه لوب قبل مفترض تكمل بالاي بلس ون
}

                                    
*/
                                }
                            
                                
                        }
                    }
//if ( Tj[j].periorty==6&&reminder_availabiliy()<=0) //ما حطينا هنا المتغيرات اللي لازم تتمرر

//selected_id=0;
//if (current_emplyee_id==femplyee_id){
//current_emplyee_id=semplyee_id;


                    
                
    
    
}
            //
            
            // if(Tj[unit_time_index-1] == Tj[unit_time_index]  \\ لما يعارض ID tasks معه, راح يوقف
            //if(Ts[priority] > Tj[priority])//  بتكون قبل الشرط الاساسي
            //Tnew = Tj;  \\ call function
            //Tj = Ts;
            //Ts = Tnew;

        }
        }

        
        
       
   
public static void main(String args[]) {
    
}
}
