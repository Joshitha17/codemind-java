import java.util.Scanner;
public class Inches{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        float cm=x*2.54f;
        System.out.printf("%.2f",cm);
    }
}