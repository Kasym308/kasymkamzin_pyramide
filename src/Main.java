import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Квадраты: ");
        int nSquares = scanner.nextInt();

        System.out.println("Квадраты чисел от 1 до " + nSquares + ":");
        int i = 1;
        while (i <= nSquares) {
            System.out.println(i * i);
            i++;
        }

        System.out.print("Число n для пирамиды: ");
        int nWhile = scanner.nextInt();

        System.out.println("Пирамида: ");
        int a = 1;
        while (a <= nWhile) {
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
