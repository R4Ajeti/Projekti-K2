import javax.swing.*;
import java.util.*;
import java.text.*;

public class Librat
{
   String e_libres="";
   String author;
   int id_katalog;
   int id_person;
   String data;
   int nr_huazimeve;
   GregorianCalendar data1=new GregorianCalendar();
   /* liber_ri convert the name and addres of the book
    *@param nr_librave - is the id of katalog
    */
   void liber_ri(int nr_librave)
   {
      String s="";
      s=JOptionPane.showInputDialog("Write the name of the Book");
      e_libres = s;//name of the book
   
      s=JOptionPane.showInputDialog("Write the address of the Book");
      author = s;//address of the book
   
      id_katalog = nr_librave;
      data="";//date
      nr_huazimeve = 0;//number of the borrowed book
   }

    /* shtyp_librat write the book
     *@param i - is number of books
     */
   void shtyp_librat(int i)
   {
      i=i+1;
      JOptionPane.showMessageDialog(null, "Book "+i+"\n"+"Title: "+e_libres+"\n"+"Author: "+author+"\n"+"Id: "+id_katalog+"\n"+"Client ID: "+id_person+"\n"+"Date for the book to be returned: "+data+"\n"+"Number of times the book has been borrowed: "+nr_huazimeve+"\n");    
   }  
   
   String teksti =""; 
  /* trego_librat construct the book details
   *@param i - is number of books
   */
   String trego_librat(int i)
   {
      teksti ="";
      i=i+1;
      teksti =" Id "+id_katalog+" "+" Libri "+i+" "+" Emri: "+e_libres+" "+" Autori: "+author+" "+" ID personit "+id_person+" "+" Data e kthimit: "+data+" "+" Nr huazimeve: "+nr_huazimeve+"\n";
      
      return teksti;
   }
   
   String teksti1 ="";
   
   /* trego_librat construct books
    *@param i - is number of books
    */
   String trego_librat_l(int i)
   {
      teksti1 ="";
      i=i+1;
      teksti1 =" "+" Libri: "+e_libres+" "+" Autori: "+author+" \n";
      
      return teksti1;
   }

   /* perditso_librin construct details about berrow books
    *@param id_p - is id of the person
    */   
   void perditso_librin(int id_p)
   {
      id_person = id_p;
      nr_huazimeve +=1;
   
      DateFormat df = new SimpleDateFormat("dd/MM/yyyy");  
   
      data1.getTime();
      data1.add(data1.DATE, 14);
      String data2=df.format(data1.getTime());
      data = data2;
   }
}

