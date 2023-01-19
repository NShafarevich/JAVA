public class Olya10 {
    public static void main(String[] args) {
        int b = 5;
        int r = (int) (Math.random() *b+1);
        int result = 1;
        for (int i = 1; i <=r; i ++){
            result = result*i;
        }
        System.out.println(result);
    }
   }

