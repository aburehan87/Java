import java.util.Scanner;
public class arrays_2 {
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        //Problem 1:Create an array of 5 float numbers and calculate their sum;


//        float []num=new float[5];
//        System.out.println("enter 5 elements:");
//        for(int i=0;i<num.length;i++)
//        {
//            num[i]=sf.nextFloat();
//        }
//
//        System.out.println("The elements are:");
//        float sum=0;
//        for(int i=0;i<num.length;i++)
//        {
//            System.out.print(num[i]);
//            System.out.println(" ");
//
//        }
//
//
//        for(float x:num)//this is read only;;
//        {
//            sum=sum+x;
//
//        }
//        System.out.println("The value of the sum is:"+ sum);

        //Problem 2:To check whether a number is present in an array or not
        

        int []marks=new int[4];

        System.out.println("Enter the  elements:");
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=sf.nextInt();
        }
       int num=22;

        boolean isInArray=false;

        for(int element:marks)//we created int element to read the array marks
        {
            if(num==element)
            {
                isInArray=true;
                break;
            }

        }

        if(isInArray)
        {
            System.out.println("The number "+ num+" is present in the array");
        }

        else
        {
            System.out.println("The number "+ num+" is not present in the array");
        }


    }
}
