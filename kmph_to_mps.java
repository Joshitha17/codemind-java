import java.util.Scanner;
public class Bridge{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        float y=x*0.277777f;
        System.out.printf("%.2f",y);
    }
}