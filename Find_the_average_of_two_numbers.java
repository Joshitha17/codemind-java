import java.util.Scanner;
public class Average{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=(a+b)/2.0f;
        System.out.printf("%.4f",c);
    }
}