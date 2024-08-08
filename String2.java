import java.util.Scanner;
public class String2 {
    public static void main(String cp[])
    {
          Scanner sf=new Scanner(System.in);
//        System.out.println("Enter name:");
//        String name=sf.nextLine();
//        int l=name.length();
//        System.out.println(name+" has a length of "+ l +" letters");
        System.out.println("Enter your name:");
        String name=sf.nextLine();
        for(int i=0;i<name.length();i++)
        {
            System.out.println(name.charAt(i));//charAt(index) outputs the chars at that particular index

        }
        //generating first 5 odd numbers;

        int n=5;
        System.out.println("The first 5 odd numbers are:");
        for(int i=0;i<5;i++)
        {

            System.out.print(2*i+1);


    }
        int m=5;
        System.out.println("The first 5 even numbers are:");
        for(int i=0;i<5;i++)
        {
            System.out.println(2*i);
        }

    }
}
