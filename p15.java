import java.util.Scanner;
class p15
{
public static void main(String cp[])
{
Scanner sf=new Scanner(System.in);
System.out.print("enter a no:");
int x=sf.nextInt();

if(x>0)
{
System.out.print(x +" is positive");
}
else
{
if(x<0)
{
System.out.print(x +" is negative");
}
else
{
System.out.print("equal");
}
}
}
}
