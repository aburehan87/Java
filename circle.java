import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius=sf.nextDouble();
        double area=3.14*radius*radius;
        System.out.println("The area of the circle is:" + area);
    }
}
