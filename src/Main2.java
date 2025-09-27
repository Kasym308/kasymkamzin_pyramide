import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Число n для пирамиды: ");
        int n = scanner.nextInt();

        printPyramid(n);
    }

    public static void printPyramid(int n) {
        System.out.println("Пирамида: ");
        int a = 1;
        while (a <= n) {
            int b = 1;
            while (b <= a) {
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
            a++;
        }
    }
}
