import java.util.Scanner;
public class Olya11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день недели");
      String b = scanner.next();
        switch (b) {
            case "понедельник":
            System.out.println("День недели понедельник");
            break;
            case "вторник":
                System.out.println("День недели вторник");
                break;
            case "среда":
            System.out.println("День недели среда");
            break;
            case "четверг":
                System.out.println("День недели четверг");
                break;
            case "пятница":
                System.out.println("День недели пятница");
                break;
            case "суббота":
                System.out.println("День недели суббота");
                break;
            case "воскресенье":
                System.out.println("День недели воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
            }

}
