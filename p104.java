import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

//CHECKBOX//
class MyFrame 
extends JFrame
implements ItemListener
{
	Container con;
	JCheckBox cb1;
	JLabel l1;
	
	JLabel getLabel(String text,int x,int y)
	{
		JLabel ob=new JLabel(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		return ob;
	}
	
	JCheckBox getCheckBox(String text,int x,int y)
	{
		JCheckBox ob=new JCheckBox(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		ob.addItemListener(this);
		return ob;
	}
	
	public MyFrame()
	{
		super("");
		con=getContentPane();
		con.setLayout(null);
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cb1=getCheckBox("NRI",50,50);
		l1=getLabel("",50,100);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb1)
		{
			if(cb1.isSelected())
			{
				l1.setText("YOU ARE NRI");
			}
			
		}
		if(cb1.isSelected())
		{
			l1.setText("YOU R AN INDIAN");
		}
		
	}
}

class p104
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}
