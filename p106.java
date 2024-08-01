import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class MyFrame 
extends JFrame
implements ItemListener
{
	Container con;
	JCheckBox cb1,cb2,cb3;
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
		setSize(500,400);
		con=getContentPane();
		con.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cb1=getCheckBox("RED",50,50);
		cb2=getCheckBox("GREEN",50,100);
		cb3=getCheckBox("BLUE",50,150);
		l1=getLabel("",50,200);
		l1.setOpaque(true);
		l1.setBackground(Color.BLACK);
		
		
		setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		int r=cb1.isSelected()?250:0;
		int g=cb2.isSelected()?250:0;
		int b=cb3.isSelected()?250:0;
		l1.setBackground(new Color(r,g,b));
	}
}
class p105
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}

	