import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class p126
extends InfoFrame
implements ItemListener
{
	JComboBox<String> cb1;
	Color color;
	
	public p126()//constructor
	{
		setSize(600,400);
		String s[]={"RED","GREEN","BLUE"};
		cb1=getComboBox(s,50,50);
		color=Color.RED;
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(color);
		g.fillRect(500,50,200,200);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb1)
		{
			if(cb1.getSelectedIndex()==0)
			{
				color=Color.RED;repaint();return;
			}
			
			if(cb1.getSelectedIndex()==1)
			{
				color=Color.GREEN;repaint();return;
			}
			
			if(cb1.getSelectedIndex()==2)
			{
				color=Color.BLUE;repaint();return;
			}
		}
		
	}
	public static void main(String cp[])
	{
		new p126();
	}
}
