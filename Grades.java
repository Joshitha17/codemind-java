import java.util.Scanner;
public class Solution{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int x=(a+b+c+d+e)/5;
        if(x>=90)
        {
            System.out.println("Grade A");
        }
        else if(x>=80)
        {
            System.out.println("Grade B");
        }
        else if(x>=70)
        {
            System.out.println("Grade C");
        }
        else if(x>=60)
        {
            System.out.println("Grade D");
        }
        else if(x>=40)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}