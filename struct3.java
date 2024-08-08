import java.util.Scanner;
class data3{
    String name;
    int marks1,marks2,marks3,marks4;
}
public class struct3 {
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        data3 d=new data3();

        System.out.println("Enter name:");
        d.name=sf.nextLine();

        System.out.println("Enter your marks in following subjects:");

        System.out.println("Maths:");
        d.marks1=sf.nextInt();
        System.out.println("English:");
        d.marks2=sf.nextInt();
        System.out.println("History:");
        d.marks3=sf.nextInt();
        System.out.println("Science:");
        d.marks4=sf.nextInt();

        int sum=0;
        sum=d.marks1+d.marks2+d.marks3+d.marks4;
        System.out.println("The total marks "+ d.name+" has achieved are:"+ sum);
    }
}
