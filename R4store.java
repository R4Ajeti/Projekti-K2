import javax.swing.*;
import java.util.*;
import java.text.*;
public class R4store
{ // the names of the fields describe their contents:
    String name_item;
    int id_number;
    double retail_price;
    double wholesale_price;
    int quantity_stock;
    double all_cost;

   /** Constructor Record_item constructs the item.
    * @param name - name of a sale item
    * @param num - the item's ID-number
    * @param wprice - whole price of the item
    * @param rprice - retail price of the item
    * @param quantity - the quantity in stock      */
   public void store_m1(String name, int num, double wprice, double rprice, int quantity)
   {   name_item = name;
      id_number = num;
      retail_price = rprice;
      wholesale_price = wprice;
      quantity_stock = quantity;
      
      
   }
   
  /* prod_new construct details about product
    *@param nr_produkteve - is number of products
    */
   void prod_new(int nr_produkteve)
   {
   
      String s="";
      s=JOptionPane.showInputDialog("Write the name of the product");
      name_item = s;//name of product
   
      s=JOptionPane.showInputDialog("Write quantity of product");
      quantity_stock = new Integer(s).intValue();//quantity of product
      
      s=JOptionPane.showInputDialog("Write retail price of the product ");
      retail_price = new Double(s).doubleValue();//retail price of the product
      
      s=JOptionPane.showInputDialog("Write wholesale price of the product");
      wholesale_price = new Double(s).doubleValue();//wholesale price of the product
      
      if(20<=quantity_stock){all_cost=wholesale_price*quantity_stock;}
   else{all_cost=retail_price*quantity_stock;}
      id_number = nr_produkteve+1;
   }
  
   /* shtyp_prod construct details about product
    *@param i - is number of products
    */
   void shtyp_prod(int i)
   {
   i=i+1;
      JOptionPane.showMessageDialog(null, id_number+".  Product: "+name_item+"\n"+"Product Retail Price: "+retail_price+"€\n"+"Product wholesale price: "+wholesale_price+"€\n"+"Quantity: "+quantity_stock+" cope\n"+"All "+name_item+" cost: "+all_cost+"€ \n");    
   }
}