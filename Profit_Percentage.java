import java.util.Scanner;
public class Profit{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int p=y-x;
        float pp=(p*100.0f)/x;
        System.out.printf("%.2f",pp);
    }
}