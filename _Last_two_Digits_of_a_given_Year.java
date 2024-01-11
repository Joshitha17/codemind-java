import java.util.Scanner;
public class Solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int year=x%100;
        System.out.printf("%02d",year);
    }
}