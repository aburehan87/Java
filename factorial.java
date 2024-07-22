import java.util.*;
public class factorial {

    public static int fact(int n)
    {
        if(n==0)//BAse Case
        {
            return 1;
        }

        int fnm1=fact(n-1);//this  is n-1 func
        int fn=n*fact(n-1);//this is main function
        return fn;//return the main value
    }

    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        int n=6;
        System.out.println(fact(n));


    }
}
