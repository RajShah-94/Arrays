public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        double[] a = new double[args.length - 1];
        double[] S = new double[args.length - 1];
        S[0] = 0;
        int n = 1;
        double A = 0;
        int[] r = new int[m];
        for (int i = 0; i < (args.length - 1); i++) {
            a[i] = Integer.parseInt(args[n]);
            n++;
        }
        for (int j = 0; j < (args.length - 1); j++) {
            S[j] = A + a[j];
            A = S[j];
        }
        int x = 0;
        double s = S[args.length - 2];
        while (x < m) {
            int z = (int) (Math.random() * s);
            for (int y = 0; y < (args.length - 1); y++) {
                if (z < S[y]) {
                    r[y] = y + 1;
                    System.out.print(r[y] + " ");
                    y = args.length - 1;
                }
            }
            x++;
        }
    }
}
