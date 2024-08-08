import java.util.*;

public class varargs {

    static int sum(int ...arr)// ...arr is the varargs which will take all the numbers from the user and put it into an array
    {
        int result=0;
        for(int a:arr)
        {
            result+=a;

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        System.out.println("the sum of all the numbers included is "+ sum(1,20,30));//here all these values are added in an array with the help of VARARGS
        System.out.println("The sum of all numbers included is "+ sum(200,100,99,188));//same here
        //When we create a method of same name and pass the values and overload it with different values then we need to overload the values one by one
        //VARARGS(...arr) this method will automatically add all the values in an array and give us the output
    }
}
