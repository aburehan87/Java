import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JButton b1;
	JTextField t1;
	
	Container con;
	int count=0;
	
	public MyFrame()
	{
		super("");
		con=getContentPane();
		con.setLayout(null);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=new JLabel("NUMBER");
		l1.setBounds(50,50,100,30);
		con.add(l1);
		
		t1=new JTextField();
		t1.setBounds(150,50,80,30);
		con.add(t1);
		
		b1=new JButton("SQUARE");
		b1.setBounds(150,100,100,30);
		con.add(b1);
		b1.addActionListener(this);
		
		l2=new JLabel("");
		l2.setBounds(150,150,100,30);
		con.add(l2);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			String s=t1.getText();
			int x=Integer.parseInt(s);
			l2.setText("Square:" + x*x);
			
		}
	}
	
}

	class p100
	{
		public static void main(String cp[])
		{
			new MyFrame();
		}
	}
	
	