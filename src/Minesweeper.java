public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int z = 0;
        boolean [][] mines = new boolean [m+2][n+2];
        int[][] matrix = new int[m][n];
        while (z < k) {
            int a = (int) (Math.random() * m) + 1;
            int b = (int) (Math.random() * n) + 1;
            if (!mines[a][b]) {
                mines[a][b] = true;
                z++;
            }
        }
        for (int y = 0; y < (n); y++) {
            for (int x = 0; x < (m); x++) {
                if (mines[x + 1][y + 1]) {
                    matrix[x][y] = 9;
                    System.out.print("*  ");
                }
                else {
                    if (mines[x][y]) {
                        matrix[x][y]++;
                    }
                    if (mines[x + 1][y]) {
                        matrix[x][y]++;
                    }
                    if (mines[x + 2][y]) {
                        matrix[x][y]++;
                    }
                    if (mines[x][y + 1]) {
                        matrix[x][y]++;
                    }
                    if (mines[x + 2][y + 1]) {
                        matrix[x][y]++;
                    }
                    if (mines[x][y + 2]) {
                        matrix[x][y]++;
                    }
                    if (mines[x + 1][y + 2]) {
                        matrix[x][y]++;
                    }
                    if (mines[x + 2][y + 2]) {
                        matrix[x][y]++;
                    }
                    System.out.print(matrix[x][y] + "  ");
                }
            }
            System.out.println("");
        }
    }
}