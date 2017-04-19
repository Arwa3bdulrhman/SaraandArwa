
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import javax.swing.*;
import java.util.Calendar;
import java.text.DateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class GetCurrentIndex {
   /* public static void roundTimeQuarterHour(Date time) {
  Date timeToReturn = new Date(time);

    timeToReturn.setMilliseconds(Math.round(time.getMilliseconds() / 1000) * 1000);
    timeToReturn.setSeconds(Math.round(timeToReturn.getSeconds() / 60) * 60);
    timeToReturn.setMinutes(Math.round(timeToReturn.getMinutes() / 15) * 15);
   System.out.println(timeToReturn) ;
}*/
     public static void main(String[]args){
   /*      DateFormat dateFormat=new SimpleDateFormat("HH");
   Date currentDate=new Date();
 Date nearestSecond = DateUtils.round(currentDate, Calendar.SECOND);
//String houre=currentDate('HH');
//Date newDate=((currentDate+(15*60*100/2))/(15*60*100/2))*(15*60*100/2);
String formattedDate;

        formattedDate = dateFormat.format(currentDate);
        
        /*
         Calendar calendar = Calendar.getInstance();
calendar.setTime(currentDate);
//((value + 29) / 30) * 30
int unroundedMinutes = calendar.get(Calendar.MINUTE);
int mod = unroundedMinutes % 15;
calendar.add(Calendar.MINUTE, mod < 8 ? -mod : (15-mod));
         calendar.set(Calendar.MINUTE, unroundedMinutes + mod);
         System.out.println("unroundedMinutes = "+unroundedMinutes);
          System.out.println("mod = "+mod);
         System.out.println("calendar = "+ (calendar.set(Calendar.MINUTE, unroundedMinutes + mod)));
     *//*حل ممتاز
   SimpleDateFormat sdf = new SimpleDateFormat("HH:MM");
     long timeMs = System.currentTimeMillis();       
    long roundedtimeMs = Math.round( (double)( (double)timeMs/(double)(15*60*1000) ) ) * (15*60*1000);

    Date myDt = new Date(roundedtimeMs);

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(myDt);

    if(calendar.before(new Date())) {
        calendar.add(Calendar.MINUTE, -30);
    }
//String S_currentDate = sdf.format(calendar.getTime());
    System.out.println(calendar.getTime());
    
    */
    DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
   Date currentDate=new Date();

String formattedDate;

        formattedDate = dateFormat.format(currentDate);
     //   formattedDate="2017-04-13"; السطر هذا للتيست فقط
     int toMinuteInterval=0;
     LocalTime time=LocalTime.now();
       System.out.println("time is "+time);
     int m=time.getMinute();
       System.out.println("m is "+m);
     int total=m+30;
     int rm;
      int h=time.getHour();
     if (m>30) {rm=00;
     h=h+1;
     }
     else{ 
         
         rm=30;}
    
       System.out.println("h is "+h);
     Time near=new Time(h,rm,0); 
       SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
       String formattedTime;

        formattedTime = sdf.format(near);
      System.out.println("near is "+formattedTime);
       int currentIndex=0;
      try{
      Class.forName("com.mysql.jdbc.Driver");
    
        String user="root";
         String pass="1234";
          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hc",user,pass);//بعدها الباث حق القاعدة 
          JOptionPane.showMessageDialog(null, "successfully connected");
          System.out.print("connected ....");
           Statement stmt=con.createStatement();
   

    ResultSet rs=null;
    String sql= "SELECT uniteTimeIndix FROM task  WHERE ( date='"+formattedDate+"' and startTime='"+formattedTime+"' ) ";
       rs=stmt.executeQuery(sql);
       if(rs.next()){
      
       currentIndex=rs.getInt("uniteTimeIndix");
       }
      
        System.out.print("currentIndex is "+currentIndex);
      }catch(Exception e){}
     /*int slotNo= 0;
     slotNo= (int)(time.Now.TimeOfDay.TotalMilliseconds() / ((double)toMinuteInterval * 60 * 1000));
    int slotsPerHour = 60 / toMinuteInterval;
    int h = slotNo / slotsPerHour;*
    int m = toMinuteInterval * (slotNo % slotsPerHour);
    return new LocalTime(h, m);*/
     }
    
}
