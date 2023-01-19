import java.util.Scanner;
public class Olya7 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число");
            int b = scanner.nextInt();
            if (b>=0 && b<10) {
                System.out.println("Положительное число меньше 10 или ноль");
            } else{
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        }
    }

