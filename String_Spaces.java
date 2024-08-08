public class String_Spaces 
{
    public static void main(String[] args) {
        // CodeWithHarry problem
        // Write a java program to detect the double and triple spaces in a string
        String str="This string contains a double  and a triple space";
        System.out.println("double space is at the index: "+ str.indexOf("  "));
        System.out.println("triple space is at the index: "+str.indexOf("   "));
    }    
}
