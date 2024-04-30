public class ArrQ2 {
    public static void main(String args[]) {
        int i, j;
        int a[][] = {{1, 2, 5}, {2, 4, 1}};
        int b[][] = {{0, 2, 5}, {3, 5, 0}};
        int c[][] = new int[a.length][a[0].length]; // specifying dimensions for c[][]

        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " "); // print each element of c[][]
            }
            System.out.println(); // move to the next line after printing each row
        }
    }
}
