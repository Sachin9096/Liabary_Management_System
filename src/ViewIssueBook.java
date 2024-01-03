import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class ViewIssueBook extends JFrame
{

	String x[]= {"Book Id","Book No","Book name","Student Id","Student Name","Student Contact","Book Quntity"};
	JButton bt;
	String y[][]=new String[20][7];
	int i=0,j=0;
	JTable t;
	Font f;

	ViewIssueBook()
	{
		 super("Issue Book information");
		 setLocation(1,1);
		 setSize(1000,400);
		 
		 f=new Font("Arial",Font.BOLD,15);
		 
		 try
		 {
			 ConnectionClass obj=new ConnectionClass();
			 String q="select * from issuebook";
			 ResultSet rest=obj.stm.executeQuery(q);
			 while(rest.next())
			 {
				// y[i][j++]=rest.getString("id");
				 y[i][j++]=rest.getString("BookId");
				 y[i][j++]=rest.getString("BookNo");
				 y[i][j++]=rest.getString("BookName");
				 y[i][j++]=rest.getString("StudentId");
				 y[i][j++]=rest.getString("StudentName");
				 y[i][j++]=rest.getString("StudentContact");
				 y[i][j++]=rest.getString("Quantity");
				 i++;
				 j=0;


			 }
			 t=new JTable(y,x);
			 t.setFont(f);
		 }
		 catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		
		 t.setBackground(Color.BLACK);
		 t.setForeground(Color.WHITE);
		 
		 JScrollPane Jp=new JScrollPane(t);
		 add(Jp);
	}
	public static void main (String args[]) 
	{
		new ViewIssueBook().setVisible(true);
	}
}
