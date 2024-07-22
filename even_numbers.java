import java.util.Scanner;

public class even_numbers {
    public static void main(String[] args) {
        Scanner sf = new Scanner(System.in);
//        int n = 3;
//        int sum=0;
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("the numbers are:" + (2*n));
//            sum=sum+(2*n);
//        }
//        System.out.println("THe sum of the first n even numbers is:"+ sum);

        System.out.println("Enter the number:");
        int n=sf.nextInt();

        System.out.println("The table of " + n +" is ");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d\n ",n,i,n*i);
        }

    }

}