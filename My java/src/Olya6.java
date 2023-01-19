import java.util.Scanner;
public class Olya6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a");
        String a = scanner.nextLine();
        System.out.println("Введите число b");
        String b = scanner.nextLine();
        System.out.println("Введите число c");
        String c = scanner.nextLine();
        double d = Double.parseDouble(a);
        double i = Double.parseDouble(b);
        double f = Double.parseDouble(c);
        double aver = (d+i+f)/3;
        System.out.println("Среднее значение равно " + aver);
        }
}
