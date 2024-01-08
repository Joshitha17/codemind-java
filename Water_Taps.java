import java.util.Scanner;
public class intro{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
	    int X = sc.nextInt();
	    int Y = sc.nextInt();
        int a=(X*Y)/(X+Y);
        System.out.println(a);
    }
}