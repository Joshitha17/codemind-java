import java.util.Scanner;
public class Solution{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int i,sum=0;
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}