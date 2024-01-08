import java.util.Scanner;
public class Area{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        double area=Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",area);
    }
}