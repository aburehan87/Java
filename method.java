//methods in java are just like functions
//methods should be defined in the main class only, defined separately in another class will give error
import java.util.*;
    public class method {
        static int add(int x, int y) {
            int z;
            z = x + y;
            return z;
     }

     static void change(int [] num){
            num[1]=100;
     }



         public static void main(String[] args) {

             Scanner sf = new Scanner(System.in);
             int  a = 10;
             int b = 20;

             int c=add(a,b);
            //if we dont want to use static and access the  method using class then this method can be done!
             //here to call a method we first need to create an object in which the  method exists i.e c, then it should be called
            // method obj=new method();
             // c=obj.add(a,b);

             //System.out.println("The addition of both the numbers is:");
             //System.out.println(c);

             int [] num={1,2,3,4,5};
             change(num);
             System.out.println("The number changed is:");
             System.out.println(num[1]);



         }

     }



