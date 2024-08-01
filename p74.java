 class Student
{
	private String name;
	private double per;
	public Student(String n,double p)
	{
		name=n;
		per=p;
	}
	public String toString()
	{
		return "Name:" + name + "\nPer:" + per;
	}
}

	
	class p74
	{
		public static void main(String cp[])
		{
			Student s1=new Student("Ravi",90.99);
			System.out.println(s1);
			
			int x=5;
			String str1=x+ " ";
			System.out.println(str1);
			
			String str2=s1+ " ";
			System.out.println(str2);
		}
		
	}
	
