import  java.util.*;
public class decreasing_order {
    public static void dec_num(int n)
    {
        if(n==1)//it will stop when it comes to 1 and wont print 0
        {
            System.out.print(n);
            return;
        }

        System.out.print(n+ " ");
        dec_num(n-1);//calling the inner function

    }

    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        //print the numbers in decreasing order
        int n=10;
        dec_num(n);


    }
}
