import java.util.Scanner;
 class Student
{
	private String name;
	private double per;
	
	public Student()
	{
		name="";
		per=0.00;
	}
	 public void input()
	{
		Scanner sf=new Scanner(System.in);
		
		System.out.println("Enter name:");
		name=sf.next();
		
		System.out.println("Enter per:");
		per=sf.nextDouble();
	}
	public void output()
	{
		System.out.println("Name:" + name);
		System.out.println("Percentage:" + per);
	}
	public  void setName(String n)
	{
		name=n;
	}
	public void setPer(double p)
	{
		per=p;
	}
	public String getName()
	{
		return name;
	}
	public double getPer()
	{
		return per;
	}
	
}

 class p73
{
	public static void main(String cp[])
	{
		Student s1=new Student();
		s1.input();
		s1.output();
		
		Student s2=new Student();
		s2.setName("John");
		s2.setPer(90.99);
		s2.output();
		
		if(s1.getPer()>s2.getPer())
		{
			System.out.println(s1.getName() + " has higher percentage");
		}
		else
		{
			System.out.println(s2.getName() + " has higher percentage");
		}
		
	}
}
