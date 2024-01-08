import java.util.Scanner;
public class Sphere{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int area=r*r;
        int peri=4*r;
        System.out.println(area+" "+peri);
    }
}