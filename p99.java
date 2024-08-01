import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame
implements ActionListener
{
	JLabel l1,l2;
	JButton b1;
	JTextField t1;
	Container con;
	
	public MyFrame()
	{
		super("5th frame");
		con=getContentPane();
		con.setLayout(null);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=new JLabel("NAME");
		l1.setBounds(50,50,100,30);
		con.add(l1);
		
		t1=new JTextField("");
		t1.setBounds(150,50,100,30);
		con.add(t1);
		
		b1=new JButton("GREET");
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
			String n=t1.getText();
			l2.setText("Hello " + n);
			
		}
		
	}
	
}

 class p99
 {
	 public static void main(String cp[])
	 {
		 new MyFrame();
	 }
	 
 }
 
 