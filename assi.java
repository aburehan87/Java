import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class p126
extends InfoFrame
implements ItemListener
{
	JComboBox cb1,cb2;
	Color color;
	
	public p126()
	{
		setSize(1000,600);
		String s[]={"RED","GREEN","BLUE"};
		String m[]={"CIRCLE","RECTANGLE"};
		cb1=getComboBox(s,50,50);
		cb1.addItemListener(this);
		cb2=getComboBox(m,50,100);
		color=Color.RED;
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(color);
		g.drawOval(300,50,50,50);
		g.drawRect(400,50,50,50);
		
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

		if(ie.getSource()==cb2)
		{
			if(cb2.getSelectedIndex()==0)
			{
				g.drawOval(300,50,50,50);return;
			}
			if(cb2.getSelectedIndex()==1)
			{
				g.drawRect(400,50,50,50);return;
			}
		}
		
	}
	public static void main(String cp[])
	{
		new p126();
	}

}