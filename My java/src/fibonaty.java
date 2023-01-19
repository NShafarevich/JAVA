public class fibonaty {
    public static void main(String[] args) {
        int a=1;
        int a1=1;
        int d;
        System.out.print(a + " " + a1 + " ");
        for(int f=3; f<= 11; f++) {
            d = a + a1;
            System.out.print(d +" ");
            a=a1;
            a1=d;
        }
            System.out.println();
        }
    }


