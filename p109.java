import javax.swing.*;
import java.awt.*;

class MyFrame
extends InfoFrame
{
	JLabel l1;
	public MyFrame()
	{
		super();
		l1=getLabel("HELLO",50,50);
		setVisible(true);
	}
}
class p109
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}
