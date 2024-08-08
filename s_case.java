import java.util.Scanner;
public class s_case {
    public static void main(String cp[])
    {
        Scanner sf= new Scanner(System.in);
        System.out.println("\n1:India\n2:Japan\n3:Exit\n4:Choice:");
        System.out.println("enter your choice:");
        int ch=sf.nextInt();

        switch(ch)
        {
            case 1:
               System.out.println("Delhi");
               break;
            case 2:
                System.out.println("Tokyo");
                break;
            case 3:
                System.out.println("Programme ends");
                break;
            default:
                System.out.println("Wrong choice");


        }
    }

}
