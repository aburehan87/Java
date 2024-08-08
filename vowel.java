import java.util.Scanner;
public class vowel {
    public static void main(String cp[])
    {
        Scanner sf=new Scanner(System.in);
        System.out.println("Enter a character:");
        String s=sf.next();
        char ch1=s.charAt(0);
        char ch2 =Character.toLowerCase(ch1);// Character.toLowerCase: this will convert into lower case

        if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is not a vowel");
        }
    }
}
