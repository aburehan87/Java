import java.util.Scanner;
public class conditional {
    public static void main(String cp[])
    {
        Scanner sf=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int x=sf.nextInt();
        int y=sf.nextInt();
        int z=sf.nextInt();

        if(x>y&&x>z)
        {
            System.out.println(x+" is greatest");
        }
        else
        {
            if(y>z)
            {
                System.out.println(y+" is greatest");
            }
            else
            {
                System.out.println(z+" is greatest");
            }
        }
    }
}
