import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double gs;

        if (a <= 10000) {
            gs = a + a * 0.8 + a * 0.2;
        } else if (a <= 20000) {
            gs = a + a * 0.9 + a * 0.25;
        } else {
            gs = a + a * 0.95 + a * 0.3;
        }

        System.out.printf("%.2f",gs);
    }
}