public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("Введите что-нибудь"); // "Введите какое-нибудь число"
        String string = s.nextLine(); // int t = s.nextint()
        System.out.println("Вы ввели " +string); // +t
        }
    }


