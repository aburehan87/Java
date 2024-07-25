import java.util.*;
public class method_overloading {
    static void num()
    {
        System.out.println("HEllo Rehan");
    }
    static int num(int a)
    {

        System.out.println("hello Rehan "+ a);
        return a;
    }
    static  void num(double a, double b)
    {
                System.out.println(" Hello Rehan " + a + " Hello Adib " + b);

    }

    public static void main(String[] args) {
    Scanner sf= new Scanner(System.in);
    int a,b;
    num();
    num(100);
    num(10,20);
    //MEthod overloading is nothing but creating two or more methods with same name but different parameters


    }
}
