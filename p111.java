//JCOMBOBOX

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame 
extends InfoFrame
implements ItemListener
{
	JComboBox<String> cb1;
	JLable l1;
	
	public MyFrame()
	{
		super();
		1l=getLabel("RED",50,50);
		
		String colors[]={"RED","GREEN","BLUE"};
		cb1=getComboBox<String>(colors,50,100);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb1)
		{
			String s=(String)cb1.getSelectedItem();
			l1.setText(S);
		}
	}
}
class p111
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}
