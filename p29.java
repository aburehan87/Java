import java.util.Scanner;
class p29
{
public static void main(String cp[])
{
Scanner sf=new Scanner(System.in);
System.out.print("enter three numbers:\n");
int x=sf.nextInt(),y=sf.nextInt(),z=sf.nextInt();

if(x>y&&x>z)
{
System.out.print(x+" is greatest");
}
else
{
if(y>z)
{
System.out.print(y + " is greatest");
}
else
{
System.out.print(z +" is greatest");
}
}
}
}

