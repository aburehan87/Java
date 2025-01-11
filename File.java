import java.io.File;

class file 
{
    public static void main(String[] args)
     {
        File file=new File("files.txt");
        if(file.exists())
        {
            System.out.println("File exists");
        }
        else
        {
            try{
            file.createNewFile();
            System.out.println("File does not exists, hence created");
            }catch(Exception e)
            {
                System.out.println("File not found exception");
            }
        }
    }
    
}
