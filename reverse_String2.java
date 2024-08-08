public class reverse_String2
{
    // Leetcode Prob 344: Reverse String
    // Write a function that reverses a string. The input string is given as an array of characters s.
// You must do this by modifying the input array in-place with O(1) extra memory. 
    public static void reverseString(char[] c)
    {
        // for this we define two pointers right and left
        int left=0;
        int right=c.length-1;
        while(left<right)
        {
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args)
    {   
        char[] input={'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original string "+ new String(input));// this new String input will convert the char array into the string
        reverseString(input);
        System.out.println("The Reversed String: "+ new String(input));
    }

}
