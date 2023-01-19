public class for4 {
    public static void main(String[] args) {
        System.out.print("Введите какое-нибудь целое число");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        for (int s=1; s<=t; s++) {
            sum = sum + s;
            }
        System.out.println(sum);
    }
}

