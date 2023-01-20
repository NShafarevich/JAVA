public class Olya14 {
    public static void main(String[] args) {
        int[][] matrice =    {{10,12,13,14,15},
                              {14,15,16,23,25},
                              {71,83,92,56,78},
                              {81,83,82,86,88},
                              {61,63,62,66,68},
                              {51,53,52,56,58},
                              {41,43,42,46,48},
                              {31,33,32,36,38}};
        for (int i=0; i<matrice.length; i++) {
            for (int j=0; j<matrice[i].length; j++) {
        System.out.print(matrice[i][j] + " ");
        }
            System.out.println();
        }
}
}
