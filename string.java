import java.util.Scanner;
public class string {
    public static  void main(String cp[])
    {
        Scanner sf= new Scanner(System.in);
        System.out.println("Enter a  number:");
        int num=sf.nextInt();

        if(num>0)
        {
            System.out.println(num + " is positive");
        }
        else
        {
            if(num<0)
            {
                System.out.println(num + " is negative");
            }
            else
            {
                System.out.println("It is zero");
            }
        }

    }
}
