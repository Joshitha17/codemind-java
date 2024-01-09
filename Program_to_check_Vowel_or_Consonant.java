import java.util.Scanner;
public class solution
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        char n=s.next().charAt(0);
        n=Character.toUpperCase(n);
        if(n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
        {
            System.out.println("Vowel");
        } 
        else
        {
            System.out.println("Consonant");
        } 
    }
}