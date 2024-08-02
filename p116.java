import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class p116
extends InfoFrame
implements ActionEvent
{
	JButton b1;
	JScrollPane jsp1;
	JList<String>lst1;
	DefaultListModel<String>dlm;
	
	public p116()
	{
		b1=getButton("DELETE",50,50);
		b1.addActionListener(this);
		
		dlm=new DefaultListModel<String> dlm;
		lst1=new JList(dlm);
		jsp1=new JScrollPane(lst1);
		jsp1.setBounds(100,100,150,200);
		con.add(jsp1);
		
		dlm.addElement("GREEN");
		dlm.addElement("BLUE");
		dlm.insertElementAt("RED",2);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if(lst1.getSelectedIndex()!=-1)
			{
				String s=(String).lst1.getSelectedValue();
				dlm.removeElement();
				if(dlm.getSize()==0)
				{
					setEnabled(false);
				}
			}
		}
		
	}
	public static void main(String cp[])
	{
		new p116();
	}
}

	