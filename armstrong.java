import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Sayı:");
        int s = i.nextInt();
        int a = 0;

        while (s != 0) {
            a = a + s % 10;
            s = s / 10;
        }
        System.out.println(a);
    }
}
