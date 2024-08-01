import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
extends JFrame
implements ActionListener
{
	Container con;
	JRadioButton rb1,rb2,rb3;
	JLabel l1,l2;
	ButtonGroup bg1;
	
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
		rb2=getRadioButton("GREEN",50,100);
		rb3=getRadioButton("BLUE",50,150);
		
		bg1=new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		
		l2=getLabel("",200,150);
		
		
		l1=getLabel("",150,100);
		l1.setOpaque(true);
		Color c=new Color(255);
		l1.setBackground(Color.RED);
		l2.setText("Color is RED");
		l2.setForeground(Color.RED);
		rb1.setSelected(true);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(rb1.isSelected())
		{
			l1.setBackground(Color.RED);
			l2.setForeground(Color.RED);
			l2.setText("Color is RED");
		}
		
		if(rb2.isSelected())
		{
			l1.setBackground(Color.GREEN);
			l2.setForeground(Color.GREEN);
			l2.setText("Color is GREEN");
		}
		
		if(rb3.isSelected())
		{
			l1.setBackground(Color.BLUE);
			l2.setForeground(Color.BLUE);
			l2.setText("Color is BLUE");
		}
	}
}

class p107
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}


		
		