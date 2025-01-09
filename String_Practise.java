import java.util.Scanner;
public class String_Practise {
    public static void main(String[] args) {
        Scanner sf=new Scanner(System.in);

//        System.out.println("Enter your name:");
//        String name=sf.nextLine();
//        System.out.println(name.toUpperCase());
//        String name="Rehan Nasir Waddo";
//        name=name.replace(" ","_");//.replace will help in replacing any item in the string
//        System.out.println(name);
//
//        String letter="Dear name, thanks a lot";
//        letter=letter.replace("name","Rehan");
//        System.out.println(letter);

        System.out.println("Enter name of the website:");
        String website=sf.nextLine();

        if(website.endsWith(".org"))
        {
            System.out.println("IT is an  organizational website");
        }
        else
        {
            if(website.endsWith(".com"))
            {
                System.out.println("it is a commercial website");
            }
            else
            {
                if(website.endsWith(".in"))
                {
                    System.out.println("It is an Indian website");

                }
                else
                {
                    System.out.println("Unrecognized");
                }
            }
        }

    }
}
