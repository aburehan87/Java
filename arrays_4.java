import java.util.Scanner;
public class arrays_4 {
    public static void main(String[] args) {

        Scanner  sf=new Scanner(System.in);
//
//        int []arr={1,2,3,4,5,6};
//        int l=arr.length;
//        int n=Math.floorDiv(l,2);
//        System.out.println("The elements are:");
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }
//
//        int temp;
//
//        for(int i=0;i<n;i++)
//        {
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        System.out.println("The reversed elements are:");
//        for(int element:arr)
//        {
//            System.out.print(element+ " ");
//        }
        //Problem 6: to find a maximum number in an array

//        int []arr={11,99,29,97,100,110,109,111};
//        System.out.println("The numbers are:");
//        for(int read:arr)
//        {
//            System.out.print(read+ " ");
//        }
//        int max=0;
//        for(int element:arr)
//        {
//            if(element>max)
//            {
//                max=element;//if element finds any number greater than max then it  will be stored in max;
//            }
//        }
//        System.out.println("\nThe maximum number in the array is: "+ max);


        //Problem 7: to find a minimum number in an array

//        int []arr={99,87,76,66,55,54};
//        System.out.println("The elements are:");
//        for(int read:arr)
//        {
//            System.out.println(read+ " ");
//        }
//        int min=arr[0];//it will start from first number in the array
//        for(int element:arr)
//        {
//            if(element<min)
//            {
//                min=element;
//            }
//        }
//        System.out.println("The minimum number in the array is:"+ min);

        //Problem 9: to check whether the given array  is sorted or not

        int  []arr={1,22,33,44,55,66,77};
        boolean isSorted=true;

        for(int i=0;i<arr.length-1;i++)//length-1 because we cannot compare the  last element with any other element, hence we use length-1;
        {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("The given array is sorted");
        }
        else
        {
            System.out.println("The given array is not sorted");
        }
    }
}
