/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reschedule.pkg1;

/**
 *
 * @author w10
 */
public class Reschedule1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int Ts_periorty;
        int start_index_search;
        int cuurent_index;
        int terminal;
        int Ts_period;
        boolean reschudle_finished;
        int selected_id;
        int comp;
        //int Tj[];
        //int Ts[];
        //reminder_avilability;
        //current_emplyee_id;
        //femplyee_id;
        //semplyee_id;
        
        start_index_search = cuurent_index+1;
        terminal = start_index_search +Ts_period -1;
        selected_id=0;
        reschudle_finished=false;
        for(i= start_index_search to i=terminal,i++)
        {
             if (i==terminal)
                 comp=Tj[i-1].id;
             else 
                 comp=Tj[i+1].id; //يقارن الاندكس باللي بعده ما عدا اذا وصل لاخر اندكس في الفترة يقارن به مع اللي قبله 
             if(selected_id==0)////?????????????????????????????????
                 continue;
             else 
             {
                 if (Tj[i].id==comp || Tj[i].periority==0)
                 {
                     
                 }
             }


       
        }

       
    }
    
}


