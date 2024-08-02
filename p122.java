import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class p122
extends InfoFrame
{
	public p122()
	{
		setSize(600,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawLine(50,50,200,200);//g.drawLine(startx,starty,endx,endy);
		g.setColor(Color.RED);
		g.drawLine(200,50,50,200);
		
		g.setColor(Color.GREEN);
		g.drawRect(300,50,200,100);//g.drawLine(x,y,width,height);
		
	}
	public static void main(String cp[])
	{
		new p122();
	}
}
