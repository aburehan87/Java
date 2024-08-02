import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class p119
extends InfoFrame
implements ActionListener
{
	JLabel l1,l2;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
	JMenu mcolor,mindia;
	JMenuBar mb;
	
	public p119()
	{
		l1=getLabel("",50,50);
		l2=getLabel("",50,150);
		
		mi1=new JMenuItem("RED");mi1.addActionListener(this);
		mi2=new JMenuItem("GREEN");mi2.addActionListener(this);
		mi3=new JMenuItem("BLUE");mi3.addActionListener(this);
		mi4=new JMenuItem("MP");mi4.addActionListener(this);
		mi5=new JMenuItem("UP");mi5.addActionListener(this);
		mi6=new JMenuItem("AP");mi6.addActionListener(this);
		
		mcolor=new JMenu("COLOR");
		mcolor.add(mi1);
		mcolor.add(mi2);
		mcolor.add(mi3);
		
		mindia=new JMenu("INDIA");
		mindia.add(mi4);
		mindia.add(mi5);
		mindia.add(mi6);
		
		mcolor.add(new JSeparator());
		mcolor.add(mindia);
		
		mb=new JMenuBar();
		mb.add(mcolor);
		setJMenuBar(mb);
		l1.setOpaque(true);
		l2.setOpaque(true);
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
		
		if(ae.getSource()==mi4)
		{
			l2.setBackground(Color.WHITE);
			l2.setText("MP");return;
		}
		
		if(ae.getSource()==mi5)
		{
			l2.setBackground(Color.WHITE);
			l2.setText("UP");return;
		}
		
		if(ae.getSource()==mi6)
		{
			l2.setBackground(Color.WHITE);
			l2.setText("AP");return;
		}
	}
	
	public static void main(String cp[])
	{
		new p119();
	}
}
