import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class p118
extends InfoFrame
implements ActionListener
{
	JLabel l1;
	JMenuBar mb;
	JMenu mcolor;
	JMenuItem mi1,mi2,mi3;
	
	
	public p118()
	{
		l1=getLabel("",50,50);
		
		mi1=new JMenuItem("RED");mi1.addActionListener(this);
		mi2=new JMenuItem("GREEN");mi2.addActionListener(this);
		mi3=new JMenuItem("BLUE");mi3.addActionListener(this);
		
		mcolor=new JMenu("COLOR");
		mcolor.add(mi1);
		mcolor.add(mi2);
		mcolor.add(mi3);
		
		mb=new JMenuBar();
		mb.add(mcolor);
		setJMenuBar(mb);
		l1.setOpaque(true);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==mi1)
		{
			l1.setBackground(Color.RED);
			l1.setText("RED");return;
		}
		if(ae.getSource()==mi2)
		{
			l1.setBackground(Color.GREEN);
			l1.setText("GREEN");return;
		}
		if(ae.getSource()==mi3)
		{
			l1.setBackground(Color.BLUE);
			l1.setText("BLUE");return;
		}
	}
	public static void main(String cp[])
	{
		new p118();
	}
}
