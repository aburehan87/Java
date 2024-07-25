import java.util.Scanner;
class p21
{
public static void main(String cp[])
{
Scanner sf=new Scanner(System.in);
System.out.print("1:India\n2:Japan\n3:Exit\nch");
int ch=sf.nextInt();

switch(ch)
{
case 1 :System.out.print("New Delhi");break;
case 2 :System.out.print("Tokyo");break;
case 3 :System.out.print("Programme ends");break;
default:System.out.print("Wrong choice");break;
}
}
}

