import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class p121
extends InfoFrame
implements ActionListener
{
	JLabel l1,l2;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
	JMenu mcolor,mindia;
	JMenuBar mb;
	
	public p121()
	{
		l1=getLabel("",50,50);
		l2=getLabel("",50,150);
		
		mi1=new JMenuItem("RED");
		mi2=new JMenuItem("GREEN");
		mi3=new JMenuItem("BLUE");
		
		mcolor=new JMenu("COLOR");
		mcolor.add(mi1);mcolor.setMnemonic(KeyEvent.VK_R);
		mcolor.add(mi2);mcolor.setMnemonic(KeyEvent.VK_G);
		mcolor.add(mi3);mcolor.setMnemonic(KeyEvent.VK_G);
		
		mi4=new JMenuItem("MP");
		mi5=new JMenuItem("UP");
		mi6=new JMenuItem("AP");
		
		mindia=new JMenu("INDIA");
		mindia.add(mi4);mindia.setMnemonic(KeyEvent.VK_M);
		mindia.add(mi5);mindia.setMnemonic(KeyEvent.VK_U);
		mindia.add(mi6);mindia.setMnemonic(KeyEvent.VK_A);
		
		mcolor.add(new JSeparator());
		mcolor.add(mindia);
		
		mb=new JMenuBar();
		mb.add(mcolor);
		setJMenuBar(mb);
		
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK));
		mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_DOWN_MASK));
		mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, KeyEvent.CTRL_DOWN_MASK));
		mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, KeyEvent.CTRL_DOWN_MASK));
		mi5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.CTRL_DOWN_MASK));
		mi6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
		
		
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mi6.addActionListener(this);
		
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
		new p121();
	}
}
