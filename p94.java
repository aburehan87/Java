//CREATING JFRAME AND JLABEL
import javax.swing.*;
import java.awt.*;
 class MyFrame
 extends JFrame
{	
	JLabel l1,l2;
	Container con;
	public MyFrame()//A CONSTRUCTOR
	{
		super("2nd Frame");
		
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		setVisible(true);
		
		con=getContentPane();
		con.setLayout(null);
		
		JLabel l1=new JLabel("Hello");
		
		l1.setBounds(50,50,100,30);
		con.add(l1);
		
		JLabel l2=new JLabel();
		l2.setText("World");
		l2.setLocation(50,100);
		l2.setSize(100,30);
		con.add(l2);
		
		
	}
}

 class p94
 {
	public static void main(String cp[])
	{
		new MyFrame();
	}
 }
 
	