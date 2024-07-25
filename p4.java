import java.util.Scanner;
public class p4 {
    public static void main(String[] args)
    {
        Scanner sf=new Scanner(System.in);//should be defined to take ip from the keyboard
        System.out.println("Enter number A:");

        int a=sf.nextInt();//used to take input
        System.out.println("Enter number B:");
        int b=sf.nextInt();//used to take input(sf.next())
        int c=a+b;
        System.out.println("The addition of two numbers is :");
        System.out.println(c);

        String str1=sf.next();//this will only print the initial string
        System.out.println(str1);

        String str2=sf.nextLine();//this will print a string even after spaces
        System.out.println(str2);
    }
}