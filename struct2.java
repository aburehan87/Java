import java.util.Scanner;



class data2{
    String name;
    int age;
    double marks;

}
public class struct2 {
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        data2 d=new data2();

        System.out.println("Enter name:");
        d.name=sf.nextLine();

        System.out.println("Enter age:");
        d.age=sf.nextInt();

        System.out.println("Enter marks:");
        d.marks=sf.nextDouble();

        System.out.println("Name:"+ d.name+"\t"+"Age:"+ d.age+"\t"+"Marks:"+d.marks+"\t");
    }
}
