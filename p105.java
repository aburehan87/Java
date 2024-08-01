import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class MyFrame 
extends JFrame

{
	Container con;
	JLabel l1;
	
	JLabel getLabel(String text,int x,int y)
	{
		JLabel ob=new JLabel(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		return ob;
	}
	
	public MyFrame()
	{
		super("");
		con=getContentPane();
		con.setLayout(null);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=getLabel("RED COLOUR",50,50);
		l1.setOpaque(true);
		Color c=new Color(255,0,00);
		l1.setBackground(c);
		setVisible(true);
	}
}
class p105
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}
