import java.util.*;
public class main
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t!=0)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            
           
            System.out.println((a%b)+(a/b));
           
            t-=1;
        }
    }
}