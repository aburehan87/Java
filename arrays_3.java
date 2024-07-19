import java.util.Scanner;
public class arrays_3 {

    public static void main(String[] args) {

        //Problem 3: Finding average value of the marks using an array;

        Scanner sf=new Scanner(System.in);

//        int []marks={99,100,98,97,88};
//
//        int sum=0;
//
//        for(int element:marks)
//        {
//            sum=sum+element;
//        }
//
//        int average=sum/marks.length;//marks.length is number of subjects;
//
//        System.out.println("The average value of marks is:" + average);

        //Problem 4: Adding 2 matrices and getting addition in the third one!

//        int x[][]=new int [2][2];
//        System.out.println("Enter the  elements in the  matrix:");
//
//        for(int r=0;r<x.length;r++)
//        {
//            for(int c=0;c<x.length;c++)
//            {
//                x[r][c]=sf.nextInt();
//            }
//        }
//
//        int sum=0;
//        for(int r=0;r<x.length;r++)
//        {
//            for(int c=0;c<x.length;c++)
//            {
//                System.out.print(x[r][c]+ "\t");
//            }
//            System.out.println();
//        }

        //Problem 5: Taking 2 matrices as an input and  squaring the matrices in a third one:
        int ROWS=2,COLUMNS=2;
        int x[][]=new int[ROWS][COLUMNS];
        int y[][]=new int[ROWS][COLUMNS];
        System.out.println("Enter elements in the matrix");
        for(int r=0;r<ROWS;r++)
        {
            for(int c=0;c<COLUMNS;c++)
            {
                x[r][c]=sf.nextInt();
            }
        }
        System.out.println("The Square of the martrix is: ");
        for(int r=0;r<ROWS;r++)
        {
            for(int c=0;c<COLUMNS;c++)
            {
                y[r][c]=x[r][c]*x[r][c];
                System.out.print(y[r][c]+"\t");
            }
            System.out.println();
        }



    }
}
