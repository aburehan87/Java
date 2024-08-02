import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class p117
extends InfoFrame
implements ActionListener
{
	JButton b1;
	JList<String> lst1,lst2;
	JScrollPane jsp1,jsp2;
	DefaultListModel<String> dlm2;
	
	public p117()
	{
		setSize(600,300);
		String s[]={"RED","GREEN","BLUE"};
		lst1=new JList<String>(s);
		jsp1=getScrollPane(lst1,50,50);
		b1=getButton(">",250,100);
		b1.addActionListener(this);
		
		dlm2=new DefaultListModel<String>();
		lst2=new JList<String>(dlm2);
		jsp2=getScrollPane(lst2,400,50);
		l1.setOpaque(true);
		setVisible(true);
		lst1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Object ob[]=lst1.getSelectedValuesList().toArray();
			dlm2.removeAllElements();
			for(Object x:ob)
			{
				dlm2.addElement((String) x);
			}
		}
	}
	public static void main(String cp[])
	{
		new p117();
	}
}

		
		