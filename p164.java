import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class p164 
extends InfoFrame

{
	JComboBox<String> cb1;
	JLabel l1;
	JButton b1;
	public p164()
	{
		b1=getButton("Click Me",50,50);
		l1=getLabel("",50,100);
		String s[]={"RED","GREEN","BLUE"};
		cb1=getComboBox(s,50,150);
		b1.addActionListener
		(
			(ae)->
			{
				try
				{
					for(int i=1;i<=3;i++)
					{
						Thread.sleep(1000);
						System.out.println(i);
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		);
		setVisible(true);
	}
	public static void main(String cp[])
	{
		new p164();
	}
}

						