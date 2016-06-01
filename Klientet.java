import javax.swing.*;
class Klientet
{
   String e_klientit;
   String adr_k;
   int id_nr;
   int[] nr_katalog;
   int[] nr_katalog1;
   String teksti="";
   String katalogjet;
   
   
   Klientet()
   {
   //Number of catalogs
      nr_katalog =new int[6];
      nr_katalog[0]=0;
      nr_katalog[1]=0;
      nr_katalog[2]=0;
   
      nr_katalog1 =new int[10];
      for(int k=0;k<10;k++)
      {nr_katalog1[k]=0;}
   }
   
/* klient_ri construct client name and addres
    *@param nr_klientit - is number of the client
    */
   void klient_ri(int nr_klientit)
   {   
      String s="";
      s=JOptionPane.showInputDialog("Write the client name");//Customer name
      e_klientit = s;
      s=JOptionPane.showInputDialog("Write the client address");//Customer addrees
      adr_k = s;
      id_nr=nr_klientit;
      katalogjet = "";
   }
   
   /* shtyp_klientin construct client detalis
    *@param i - is number of clients
    */
   void shtyp_klientin(int i)
   {
      i=i+1;
      JOptionPane.showMessageDialog(null, "Client "+i+"\n"+"Client name: "+e_klientit+"\n"+"Address: "+adr_k+"\n"+"Client ID  "+id_nr+"\n"+"Number of catalogs: "+katalogjet+"\n");      
   }

/* trego_klientin construct clients catalog
    *@param i - is number of clients
    */
   String trego_klientin(int i)
   {
      teksti ="";
      i=i+1;
      teksti=teksti+ " Client: "+e_klientit+"  "+"Address: "+adr_k+"  "+"Client ID "+id_nr+"  "+"Number of catalogs: "+katalogjet+"  \n";
      return teksti; 
   }
}

