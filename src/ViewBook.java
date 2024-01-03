import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class ViewBook  extends JFrame
{
	String x[]= {"Id","Book No","Book name","Author","Publisher","Quntity","Issuebook","Date"};
	JButton bt;
	String y[][]=new String[20][8];
	int i=0,j=0;
	JTable t;
	Font f,f1;

	ViewBook()
	{
		 super("Book information");
		 setLocation(1,1);
		 setSize(1000,400);
		 
		 f=new Font("Arial",Font.BOLD,15);
		 
		 try
		 {
			 ConnectionClass obj=new ConnectionClass();
			 String q="select * from addbook";
			 ResultSet rest=obj.stm.executeQuery(q);
			 while(rest.next())
			 {
				 y[i][j++]=rest.getString("id");
				 y[i][j++]=rest.getString("BookNo");
				 y[i][j++]=rest.getString("BookName");
				 y[i][j++]=rest.getString("author");
				 y[i][j++]=rest.getString("publisher");
				 y[i][j++]=rest.getString("quantity");
				 y[i][j++]=rest.getString("issuebook");
				 y[i][j++]=rest.getString("date");
				 i++;
				 j=0;


			 }
			 t=new JTable(y,x);
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		 t.setFont(f);
		 t.setBackground(Color.BLACK);
		 t.setForeground(Color.WHITE);
		 
		 JScrollPane Jp=new JScrollPane(t);
		 add(Jp);
	}
	public static void main (String args[]) 
	{
		new ViewBook().setVisible(true);
	}
}
