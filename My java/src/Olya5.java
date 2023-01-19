import java.util.Scanner;
public class Olya5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        double r = scanner.nextDouble();
        if (r%1!=0) {
            System.out.println("Ошибка");
        } else if (r%2==0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели нечетное число");
        }
    }
}
