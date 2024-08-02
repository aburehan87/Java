import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

class p115
extends InfoFrame
implements ListSelectionListener
{
	JLabel l1;
	JList<String> lst1;
	JScrollPane jsp1;
	
	public p115()
	{
		String s[]={"RED","Green","BLUE","ORANGE"};
		lst1=new JList<String>(s);
		jsp1=new JScrollPane(lst1);
		jsp1.setBounds(50,50,150,200);
		con.add(jsp1);
		lst1.addListSelectionListener(this);
		l1=getLabel("",50,300);
		setVisible(true);
	}
	
	public void valueChanged(ListSelectionEvent e)
	{
		if(e.getSource()==lst1)
		{
			l1.setText((String)lst1.getSelectedValue());
			{
				if(lst1.getSelectedIndex()==0)
				{
					l1.setForeground(Color.RED);
				}
				if(lst1.getSelectedIndex()==1)
				{
					l1.setForeground(Color.GREEN);
				}
				if(lst1.getSelectedIndex()==2)
				{
					l1.setForeground(Color.BLUE);
				}
				if(lst1.getSelectedIndex()==3)
				{
					l1.setForeground(Color.ORANGE);
				}
			
			}
		}
	}
	public static void main(String cp[])
	{
		new p115();
	}
}

	
	
		