import java.util.Scanner;
public class KingTours{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int l=x-y;
        float lp=(l*100.0f)/x;
        System.out.printf("%.2f",lp);
    }
}