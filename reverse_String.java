import java.util.*;
public class reverse_String 
{
    public static void main(String[] args)
    {
        // STRING PROBLEM 1(GFG String Problems)
        //write a pgm to reverse the sequence of words
        // input: Harry is my name
        // output: name my is Harry
        Scanner sf= new Scanner(System.in);
        String str="My name is Rehan";
        // first we need to convert the string into a string array
        String a[]=str.split(" ");  // this will split the words after every space
        System.out.println("The reversed sequence is: ");
        for(int i=a.length-1;i>=0;i--) //Loop runs from last element
        {
            System.out.print(a[i]+ " ");
        }
       
    }
    


}
