import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class p124
extends InfoFrame
{
	public p124()
	{
		setSize(600,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawRoundRect(50,50,200,100,25,25);//(x,y,width,length,x radius,y radius);
		
		g.fillRoundRect(300,50,200,100,25,25);
		
		g.drawArc(50,200,100,100,90,90);//(x,y,width,length,start_angle,sweep_angle);
		
		g.drawArc(200,200, 100,100,180,180);
		
	}
	
	public static void main(String cp[])
	{
		new p124();
	}
}

		