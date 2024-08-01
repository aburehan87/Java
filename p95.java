import javax.swing.*;
import java.awt.*;
 class MyFrame
 extends JFrame
{
	JLabel l1,l2;
	Container con;
	
	public MyFrame()
	{
		super("My Third Frame");
		con=getContentPane();
		con.setLayout(null);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		JLabel l1=new JLabel();
		l1.setText("Hello");
		l1.setBounds(50,50,100,30);
		l1.setForeground(Color.RED);
		con.add(l1);
		
		JLabel l2=new JLabel("World");
		l2.setBounds(50,100,100,30);
		Font f=new Font("Arial",Font.PLAIN,20);
		con.add(l2);
		setVisible(true);
	}
}

	
	class p95
	{
		public static void main(String cp[])
		{
			new MyFrame();
		}
	}



	