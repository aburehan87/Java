//for run time polymorphism there has to be a fn in base class and an overided fn in derived class//
 class Courses
{
	public void duration()
	{
		System.out.println("All courses: 24 Months");
	}
}
 class CPP extends Courses
{
	public void duration()//overrided fn//
	{
		System.out.println("CPP : 3 Months");
	}	
}
 class Java extends Courses
{
	public void duration()//override function//
	{
		System.out.println("Java: 5 Months");
	}
}
 class p84
{
	public static void main(String cp[])
	{
		Courses c=new Courses();//here we define c for all classes hence it is used only in start for Courses c=new Course();//
		c.duration();
		
		c=new CPP();
		c.duration();
		
		c=new Java();
		c.duration();
		
	}
	
}

	