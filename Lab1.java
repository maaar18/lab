import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab;
        int cd;

        System.out.print("Введите число:");
        int a = sc.nextInt();
        System.out.print("Введите число:");
        int b = sc.nextInt();
        System.out.print("Введите число:");
        int c = sc.nextInt();
        System.out.print("Введите число:");
        int d = sc.nextInt();

        if (a < b) {
            ab = a;
        }
        else{
            ab = b;
        }

        if (c < d) {
            cd = c;
        }
        else{
            cd = d;
        }

        if (ab < cd) {
            System.out.println("Наименьшее число:" + ab);
        }
        else{
            System.out.println("Наименьшее число:" + cd);
        }
        sc.close();
    }

}
