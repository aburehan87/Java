import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
extends JFrame
implements ActionListener
{
	Container con;
	JRadioButton rb1,rb2,rb3,rb4;
	ButtonGroup bg1,bg2;
	JLabel l1,l2;
	
	JLabel getLabel(String text,int x,int y)
	{
		JLabel ob=new JLabel(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		return ob;
	}
	
	JRadioButton getRadioButton(String text,int x,int y)
	{
		JRadioButton ob=new JRadioButton(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		ob.addActionListener(this);
		return ob;
	}
	
	public MyFrame()
	{
		super("");
		con=getContentPane();
		con.setLayout(null);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		rb1=getRadioButton("RED",50,50);
		rb2=getRadioButton("YELLOW",50,100);
		
		bg1=new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		
		rb3=getRadioButton("ROSE",200,50);
		rb4=getRadioButton("SUNFLOWER",200,100);
		
		bg2=new ButtonGroup();
		bg2.add(rb3);
		bg2.add(rb4);
		
		l1=getLabel("",50,150);
		l2=getLabel("",200,150);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(rb1.isSelected())
		{
			l1.setText("RED");
			l1.setForeground(Color.RED);
		}
		else
		{
			l1.setText("YELLOW");
			l1.setForeground(Color.YELLOW);
		}
		
		if(rb3.isSelected())
		{
			l2.setText("ROSE");
		}
		else
		{
			l2.setText("SUNFLOWER");
		}
	}
	
}

class p108
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}