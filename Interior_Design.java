import java.util.Scanner;
public class Solution{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if((a+b)>(c+d))
        {
            System.out.println(c+d);
        }
        else
        {
            System.out.println(a+b);
        }
    }
}