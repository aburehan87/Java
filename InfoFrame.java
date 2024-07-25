import javax.swing.*;
import java.awt.*;


class InfoFrame
extends JFrame

{
	Container con;
	public InfoFrame()
	{
		con=getContentPane();
		con.setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,400);
	}
	
	
	JLabel getLabel(String text,int x,int y)
	{
		JLabel ob=new JLabel(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		return ob;
	}
	
	JRadioButton getRadioButton(String text,int x,int y)
	{
		JRadioButton ob=new JRadioButton(text);
		ob.setBounds(x,y,100,30);
		con.add(ob);
		return ob;
	}
	
	JCheckBox getCheckBox(String text,int x,int y)
	{
		JCheckBox ob=new JCheckBox(text);
		ob.setBounds(x,y,100,30);
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
		return ob;
	}
	
	JPasswordField getPasswordField(int x,int y)
	{
		JPasswordField ob=new JPasswordField();
		ob.setBounds(x,y,100,30);
		con.add(ob);
		return ob;
	}
	
	JComboBox getComboBox(String s[],int x,int y)
	{
		JComboBox<String> ob=new JComboBox<String>(s);
		ob.setBounds(x,y,150,30);
		con.add(ob);
		return ob;
	}
	
	
	
}
