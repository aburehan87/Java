public class primeInRange {

    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }

        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void Range(int N)
    {
        for(int i=0;i<=N;i++)
        {
            if(isPrime(i))
            {
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n=15;
        Range(n);
    }
    
}
