import java.util.Scanner;
public class arrays_1 {
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);

        int [][] marks =new int[2][3];
        System.out.println("Enter the numbers in an array:");
        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks[i].length;j++)
            {
                marks[i][j]=sf.nextInt();
            }

        }
        System.out.println("The entered numbers are:");
        for(int i=0;i<marks.length;i++)
        {
            for(int j=0;j<marks[i].length;j++)
            {
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
