import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame 
implements ActionListener
{
	JLabel l1;
	JButton b1,b2;
	Container con;
	
	public MyFrame()
	{
		super("Button Demo");
		con=getContentPane();
		con.setLayout(null);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		l1=new JLabel("");
		l1.setBounds(50,50,200,30);
		con.add(l1);
		b1=new JButton("JIM");
		b1.setBounds(50,100,100,30);
		b1.setForeground(Color.BLUE);
		Font f1=new Font("Arial",Font.BOLD,20);
		con.add(b1);
		b1.addActionListener(this);
		
		
		b2=new JButton("JOE");
		b2.setBounds(50,150,100,30);
		b2.setForeground(Color.RED);
		Font f2=new Font("Cambria",Font.PLAIN,30);
		con.add(b2);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			l1.setText("JIM is clicked in BLUE");
		}
		if(ae.getSource()==b2)
		{
			l1.setText("JOE is clicked in RED");
		}
	}
	
}

 class p97
 {
	 public static void main(String cp[])
	 {
		 new MyFrame();
	 }
	 
 }
 
 