public class Excpn 
{
    public static void main(String[] args)
    {
        try{
            int a=10;
            int b=20;
            int c=a+b;
            System.out.println("Sum of a and b is "+c);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally{
            System.out.println("This block is always executed !");
        }
        
    }
    
}
