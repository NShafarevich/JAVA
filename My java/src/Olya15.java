public class Olya15 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] Mas = new int[11];
        for (int i = 0; i < Mas.length; i++) {
            Mas[i] = (int) (Math.random() * 3) - 1;
            System.out.print(Mas[i] + " ");

            if (Mas[i] < 0) a++;
            if (Mas[i] == 0) b++;
            if (Mas[i] > 0) c++;
            if (i == Mas.length - 1) {
            }
        }
        System.out.println();
        System.out.println();
                if (a > b & a > c)
                System.out.println("Чаще встречается -1");
                if (b > a & b > c)
                System.out.println("Чаще встречается 0");
                if (c > a & c > b)
                System.out.println("Чаще встречается 1");
                }
               }






