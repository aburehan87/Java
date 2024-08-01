import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class MyFrame
extends JFrame
implements ActionListener
{
	Container con;
	JButton b1;
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField t2;
	
	JLabel getLabel(String text,int x,int y)
	{
		JLabel ob=new JLabel(text);
		ob.setBounds(x,y,150,30);
		con.add(ob);
		return ob;
	}
	
	JTextField getTextField(int x,int y)
	{
		JTextField ob=new JTextField();
		ob.setBounds(x,y,150,30);
		con.add(ob);
		return ob;
	}
	
	JButton getButton(String text,int x,int y)
	{
		JButton ob=new JButton(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		ob.addActionListener(this);
		return ob;
	}
	
	public MyFrame()
	{
		super("");
		con=getContentPane();
		con.setLayout(null);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=getLabel("USERNAME:",50,50);
		t1=getTextField(150,50);
		l2=getLabel("PASSWORD:",50,100);
		t2=new JPasswordField();
		t2.setBounds(150,100,150,30);
		con.add(t2);
		b1=getButton("LOGIN",150,150);
		l3=getLabel("",150,200);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String u=t1.getText();
			String p=new String(t2.getPassword());
			if(u.equals("REHAN")&&p.equals("aburehan"))
			{
				l3.setText("Welcome Rehan");
			}
			else
			{
				l3.setText("Sorry INTRUDER");
			}
		}
	}
	
}

class p103
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}

			
		
	