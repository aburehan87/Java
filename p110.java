import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame 
extends InfoFrame
implements ActionListener
{
	JButton b1,b2;
	JLabel l1;
	int count;
	
	public MyFrame()
	{
		super();
		l1=getLabel("Count:0",50,50);
		b1=getButton("Click Me",50,100);
		b1.addActionListener(this);
		b2=getButton("Click Me",200,100);
		b2.addActionListener(this);		
		count=0;
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			l1.setText("Count:" + ++count);
		}
		if(ae.getSource()==b2)
		{
			l1.setText("Count:" + --count);
		}
	}
}
class p110
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}

	