import java.util.Scanner;
public class Sphere{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        float a=(1.333333f)*(3.14f)*r*r*r;
        System.out.printf("%.2f",a);
    }
}