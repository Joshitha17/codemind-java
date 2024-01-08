import java.util.Scanner;
public class DaysToYears{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=x/365;
        int w=(x-(y*365))/7;
        System.out.println(y);
        System.out.println(w);
    }
}