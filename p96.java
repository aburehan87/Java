import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
	JLabel l1;    
	JButton b1;
	Container con;
	
	public MyFrame()
	{
		super("Button Demo");
		con = getContentPane();
		con.setLayout(null);
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1 = new JLabel("");
		l1.setBounds(50,50,200,30);
		con.add(l1);
		
		b1 = new JButton("Jim");
		b1.setBounds(50,100,100,30);
		con.add(b1);
		
		b1.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			l1.setText("Jim is clicked");
		}	
	}
}

class P999
{
	public static void main(String cp[])
	{
		new MyFrame();
	}
}