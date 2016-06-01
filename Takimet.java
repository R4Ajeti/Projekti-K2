import javax.swing.*;
import java.util.*;
import java.text.*;

public class Takimet
{
   String d_takimit="";
   String t_day="";
   String topik;
   int nr_takimeve;int o_t=0;int d_t=0;int j_t=0;
   int id_katalog;String msg="";
   String data;String data3;
   String startDate = "20/05/2016 00:00";
   String endDate = "20/05/2017 00:00";

   GregorianCalendar data1=new GregorianCalendar();
   DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); 
   DateFormat ora = new SimpleDateFormat("00:00");  

/* takimi_ri construct details about the topic
    *@param nr_takimeve - is number of date
    */
   void takimi_ri(int nr_takimeve)
   {
      String s="";
      s=JOptionPane.showInputDialog("Write the topic that has to do with meeting?  "+msg);
      if(8<s.length())//topic length most be bigger then 8 
      {
         topik = s;
         s=JOptionPane.showInputDialog("Write the date on which wants to reserve the meeting. Form most be (dd/mm/yyyy): ");
         if(s.length()==10)
         {
            d_takimit = s;
            s=JOptionPane.showInputDialog("Write hour of meeting certain. Form most be (hh:mm) ");
            t_day = s;
         }
         else{msg ="Data entry error in the date or topic!";int c =nr_takimeve;takimi_ri(c);}
      }
      else{msg ="Data entry error in the date or topic!";int c =nr_takimeve;takimi_ri(c);}
      id_katalog = nr_takimeve;
   }
   
/* shtyp_takimet construct the metting date
    *@param i - is number of metting
    */
   void shtyp_takimet(int i)
   {
      i=i+1;
      JOptionPane.showMessageDialog(null, "Meeting "+(id_katalog+1)+"\n"+"Topic : "+topik+"\n"+"Meeting date: "+d_takimit+"Time: "+t_day+"\n"+"\n");    
   }
   
   String teksti ="";
   
   /* trego_takimet construct the repeated metting
    *@param i - is number of metting
    */
   String trego_takimet(int i)
   {
      teksti ="";
      i=i+1;
      teksti= "Meeting"+i+"\n"+"Topic : "+topik+"\n"+"Meeting date: "+d_takimit+"\n"+"Id "+id_katalog+"\n"+"The number of repeated meetings: "+nr_takimeve+"\n";
      
      return teksti;
   }  
}

