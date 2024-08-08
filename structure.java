import java.util.Scanner;
    //Structures in java//
class data{//in this class we can define the variables as well as we can assign them and just call them from the main class
    /*
    String name;//defining the data types of the variables
    int age;
    double marks;
    */

    String name="abc";//initializing and defining the variables
    int age=19;
    double marks=88.60;

}
public class structure {
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);
        data d=new data();//here we create an object for data class
        /*
        d.name="Rehan";
        d,age=19;//here we are assigning values to the variables
        d.marks=88.60;
        */

        System.out.println("Name:"+ d.name+ "\t" + "Age:" + d.age+ "\t"+ "MArks:" +d.marks);//here we are calling the assigned variables from the main class
    }
}
