import java.util.*;
public class inc_order {
    public static void inc(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }

        inc(n-1);
        System.out.print(n+" ");

    }

    public static void main(String[] args) {

        Scanner sf=new Scanner(System.in);
        int n=10;
        inc(n);


    }
}
