import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame
implements ActionListener
{
	JLabel l1,l2;
	JButton b1,b2;
	Container con;
	int count=0;
	public MyFrame()
	{
		super("Count Demo");
		con=getContentPane();
		con.setLayout(null);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		l1=new JLabel("Count:0");
		l1.setBounds(50,50,100,30);
		con.add(l1);
		
		l2=new JLabel("Count:0");
		l2.setBounds(50,100,100,30);
		con.add(l2);
		
		b1=new JButton("CLICK ME");
		b1.setBounds(50,100,100,30);
		b1.setForeground(Color.RED);
		con.add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("CLICK ME");
		b2.setBounds(200,100,100,30);
		b2.setForeground(Color.RED);
		con.add(b2);
		b2.addActionListener(this);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			++count;
			l1.setText("COUNT:" +count);
		}
		if(ae.getSource()==b2)
		{
			--count;
			l1.setText("COUNT:" +count);
		}
		
	}
	
}

 class p98
 {
	 public  static void main(String cp[])
	 {
		 new MyFrame();
	 }
	 
 }
 
		