import java.util.*;
public class sum {

    public static int sum(int n)
    {
        if(n==1)//Base Case
        {
            return 1;
        }

        int fnm1=sum(n-1);//n-1 function
        int fn=n+sum(n-1);//main function
        return fn;//return function
    }

    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);

        int n=20;
        System.out.println("The summation of the numbers is:"+ sum(n));
    }
}
