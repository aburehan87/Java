import javax.swing.*;
import java.awt.*;

class p125
extends InfoFrame
{
	public p125()
	{
		setSize(600,400);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawArc(50,50,100,100,270,90);
		
		g.drawArc(300,50,100,100,0,45);
		
		g.drawArc(50,200,100,100,270,180);
	}
	public static void main(String cp[])
	{
		new p125();
	}
}
