import javax.swing.*;
import java.util.*;
import java.text.*;


public class Libraria{
   public static void main(String[] args){
      GregorianCalendar data1=new GregorianCalendar();
      int i=0, id_b=0, id_b_k=0; boolean ex1=false, ex2=false;int j=0;int id_b_t=0;
      int nr_librave = 5;int nr_takimeve = 0; int nr_klientit = 0;int nr_produkteve=0;
      int nr_aktual_l=0; int nr_aktual_t=0; int nr_aktual_k=0;int nr_aktual_p=0;
      
      int s; String  e_librit,  e_autorit, e_klient;
      String teksti1="";String teksti2="";String teksti3="";
      Takimet[] tema = new Takimet[10];
      Librat[] libri = new Librat[10] ;//{"Libri i gabimeve", "Luli i vocer", "Pipi qorapegjata", "Ferri", "Prilli i thyer"}
      Klientet[] klienti = new Klientet[10];
      R4store[] r4= new R4store[10];
      
      for(int y=0; y<tema.length;y++)
      { tema[y] = new Takimet();}
      
      
      for(int x=0; x<libri.length;x++)
      { libri[x] = new Librat();}
         
      for(int p=0; p<klienti.length;p++)
      { klienti[p] = new Klientet();}
   
      libri[0].e_libres= "Libri i gabimeve"; 
      libri[1].e_libres= "Luli i vocer";
      libri[2].e_libres= "Te mjeret";
      libri[3].e_libres= "Ferri";
      libri[4].e_libres= "Prilli i thyer";
      
      for(int p=1;p<=4;p++)
      {
         libri[p].id_katalog =p;
      }
      
      libri[0].author= "Xhani Rodari";
      libri[1].author= "Migjeni";
      libri[2].author= "Viktor Hygo";
      libri[3].author= "Dante Aligeri";
      libri[4].author= "Ismail Kadare";
      
      while (true)
      {
         s=new Integer(JOptionPane.showInputDialog("TYPE: \n1 to add a book \n2 to add a client\n3 to show the books \n4 to show our client(s)\n5 to borrow a book\n6 to register a appointment \n7 to show appointment\n8 to add a product\n9 to show product \n\n")).intValue();
         if (s==1)
         {
            libri[nr_librave] = new Librat();
            libri[nr_librave].liber_ri(nr_librave);
            nr_librave = nr_librave + 1;         
         }
         else if (s==2)
         {
            klienti[nr_klientit] = new Klientet();
            klienti[nr_klientit].klient_ri(nr_klientit);
            nr_klientit = nr_klientit + 1;
         }
         else if (s==3)
         {
            i=0;
            nr_aktual_l=nr_librave;
            while (nr_aktual_l>0)
            {
               libri[i].shtyp_librat(i);
               i+=1;
               nr_aktual_l-=1;
            }
         }
         else if (s==4)
         {
            i=0;
            nr_aktual_k=nr_klientit;
            while (nr_aktual_k>0)
            {
               klienti[i].shtyp_klientin(i);
               i+=1;
               nr_aktual_k-=1;
            }
         }
         else if (s==5)
         {
            teksti1="";teksti2="";teksti3=""; e_librit="";e_autorit="";e_klient="";
            for(int k=0;k<=nr_librave-1;k++)
            {
               teksti1 = teksti1 + libri[k].trego_librat(k);
            }
            for(int k=0;k<=nr_librave-1;k++)
            {
               teksti2 = teksti2 + libri[k].trego_librat_l(k);
            }
            for(int k=0;k<=nr_klientit-1;k++)
            {
               teksti3 = teksti3 + klienti[k].trego_klientin(k);
            }
            JOptionPane.showMessageDialog(null, "Books in our library are:\n"+ teksti1);
         
            e_librit=JOptionPane.showInputDialog(teksti2+"\n\n Writte the name of borrowed book ");
            e_autorit=JOptionPane.showInputDialog(teksti2+"\n\n Writte the author of borrowed book");
            e_klient=JOptionPane.showInputDialog(teksti3+"\n Write clients name");
            if(e_librit==null||e_autorit==null||e_klient.equals(null)){JOptionPane.showMessageDialog(null, "You can not type 'null' !!"); }
            else
            {
               i=0; nr_aktual_l=nr_librave;
               while (nr_aktual_l>0)
               {
                  if ((libri[i].e_libres.toLowerCase().equals(e_librit.toLowerCase())) && (libri[i].author.toLowerCase().equals(e_autorit.toLowerCase())) )
                  {
                     ex1=true;
                     id_b = i;
                  }
                  i+=1;
                  nr_aktual_l-=1;
               }
               i=0; nr_aktual_k=nr_klientit;
               while (nr_aktual_k>0)
               {
                  if (klienti[i].e_klientit.toLowerCase().equals(e_klient.toLowerCase())) 
                  {
                     ex2=true;
                     id_b_k = i;
                  }
                  i+=1;
                  nr_aktual_k-=1;
               }
               if(5<klienti[id_b_k].nr_katalog1[id_b_k])
               {JOptionPane.showMessageDialog(null, "You have completed the maximum allowed books!");}
               else 
               {
                  if (ex1==true)
                  {
                     if (ex2==true)
                     {
                        libri[id_b].perditso_librin(klienti[id_b_k].id_nr);
                        klienti[id_b_k].katalogjet = klienti[id_b_k].katalogjet + " "+libri[id_b].id_katalog;
                        klienti[id_b_k].nr_katalog1[id_b_k]=klienti[id_b_k].nr_katalog1[id_b_k]+1;
                     }
                     else            
                     {
                        JOptionPane.showMessageDialog(null, "Client does not exist!");
                     }
                  }
                  else 
                  {
                     JOptionPane.showMessageDialog(null, "The book does not exist!");
                  }
               }
            }
         }
         else if (s==6)
         {
            tema[nr_takimeve] = new Takimet();
            tema[nr_takimeve].takimi_ri(nr_takimeve);
            nr_takimeve = nr_takimeve + 1;
         }
         else if (s==7)
         {
            j=0;
            nr_aktual_t=nr_takimeve;
            while (nr_aktual_t>0)
            {
               tema[j].shtyp_takimet(j);
               j+=1;
               nr_aktual_t-=1;
            }
         }
         
         else if (s==8)
         {
            r4[nr_produkteve] = new R4store();
            r4[nr_produkteve].prod_new(nr_produkteve);
            nr_produkteve = nr_produkteve + 1;
         
         }
         else if(s==9){
            i=0;
            nr_aktual_p=nr_produkteve;
            while (nr_aktual_p>0)
            {
               r4[i].shtyp_prod(i);
               i+=1;
               nr_aktual_p-=1;     
            } 
         }
                        
      }
   }
}