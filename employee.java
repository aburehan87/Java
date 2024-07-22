public class employee 
{
       String name;
       int age;
        employee(String name, int age)//this is a parameterised constructor
        {
            this.name=name;
            this.age=age;
        }
    public static void main(String[] args) 
    {
        employee e1=new employee("Rehan", 22);
        System.out.println(e1);
    }    
}
