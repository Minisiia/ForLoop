import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть N");
        int N = scanner.nextInt();
        double sum = 0;
        double j = 1;
        for (int i = 1; i <= N; i++) {
            j *= i;
            sum += 1 / j;
        }
        System.out.println("sum = " + sum);
    }
}
