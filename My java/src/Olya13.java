public class Olya13 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i=0; i<numbers.length; i++) {
            if (i<2) {
                numbers[i] = 1;
            } else {
                numbers[i] = numbers[i-2] + numbers[i-1];
            }
            System.out.print(numbers[i] + " ");
        }
    }
}


