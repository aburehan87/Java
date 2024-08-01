import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
extends JFrame
implements ActionListener
{
	Container con;
	JButton b1;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	
	JLabel getLabel(String text,int x,int y)
	{
		JLabel ob=new JLabel(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		return ob;
	}
	
	JTextField getTextField(int x,int y)
	{
		JTextField ob=new JTextField();
		ob.setBounds(x,y,100,30);
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
		
		l1=getLabel("NUMBER 1:",50,50);
		t1=getTextField(150,50);
		l2=getLabel("NUMBER 2:",50,100);
		t2=getTextField(150,100);
		b1=getButton("ADD",150,150);
		l3=getLabel("",150,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int x=Integer.parseInt(t1.getText());
			int y=Integer.parseInt(t2.getText());
			l3.setText("Addition is:" + (x+y));
			
		}
		
	}
	
}

class p101
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
	
}
