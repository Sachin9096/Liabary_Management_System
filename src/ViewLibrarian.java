import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class ViewLibrarian  extends JFrame
{
	String x[]= {"Id","Name","Password","Email","Contact","Address","City"};
	JButton bt;
	String y[][]=new String[20][7];
	int i=0,j=0;
	JTable t;
	Font f,f1;
	
	ViewLibrarian()
	{
		 super("Librarian information");
		 setLocation(1,1);
		 setSize(1000,400);
		 
		 f=new Font("Arial",Font.BOLD,15);
		 
		 try
		 {
			 ConnectionClass obj=new ConnectionClass();
			 String q="select * from librarian";
			 ResultSet rest=obj.stm.executeQuery(q);
			 while(rest.next())
			 {
				 y[i][j++]=rest.getString("Lid");
				 y[i][j++]=rest.getString("Name");
				 y[i][j++]=rest.getString("Password");
				 y[i][j++]=rest.getString("Email");
				 y[i][j++]=rest.getString("Contact");
				 y[i][j++]=rest.getString("Address");
				 y[i][j++]=rest.getString("City");
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
		new ViewLibrarian().setVisible(true);
	}
}
