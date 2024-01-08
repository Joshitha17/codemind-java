import java.util.Scanner;
public class Area{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int avg=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int a=(avg*3)-b-c;
        System.out.println(a);
        
    }
}