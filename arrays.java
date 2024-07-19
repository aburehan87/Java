import java.util.Scanner;
public class arrays {
    public static void main(String cp[])
    {
        Scanner sf=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the elements in the array :");
        //this is read and write
        for(int i=0;i<a.length;i++)
        {
            a[i]=sf.nextInt();
        }
        System.out.println("The elements in the array are:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        //now we see read only
//        for(int x:a)//x goes in the array a and only reads the  elements of array a
//        {
//            System.out.println(x);
//        }
    }
}
