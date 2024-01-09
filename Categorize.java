import java.util.Scanner;
public class Solution{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        if(a<=150.0f)
        {
            System.out.println("The person is Dwarf.");
        }
        else if(a>150.0f && a<=165.0f)
        {
            System.out.println("The person is average heighted.");
        }
        else if(a>165.0f && a<=195.0f)
        {
            System.out.println("The person is taller.");
        }
        else
        {
            System.out.println("Abnormal height.");
        }
        
    }
}