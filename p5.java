import java.util.Scanner;

public class p5 {
    public static void main(String[] args)
    {
        Scanner sf=new Scanner(System.in);//should be defined to take ip from the keyboard
        System.out.println("Enter marks in M,S,C,,E");
        float M=sf.nextInt();
        float S=sf.nextInt();
        float H=sf.nextInt();
        float C=sf.nextInt();
        float E=sf.nextInt();

        float total=M+S+H+C+E;
        float result= (total/500)*100;
        System.out.println(total);
        System.out.println(result);
    }
}