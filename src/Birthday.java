public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int [] totals = new int[n + 2];
        for (int trials = 0; trials < Integer.parseInt(args[1]); trials++) {
            int x = 0;
            boolean [] birthday = new boolean[n + 2];
            for (int i = 0; x < 1; i++) {

                int r = (int) (Math.random() * n) + 1;
                // System.out.println(r);
                if (!birthday[r]) {
                    birthday[r] = true;
                }
                else {
                    // System.out.println(i);
                    totals[i]++;
                    // System.out.println(" i = " + i + " ");
                    // System.out.println(i + "+" + totals[i]);
                    x++;
                }
            }
        }

        double[] test = new double [n + 2];
        double[] fraction = new double [n + 1];
        test [0] = totals[0];
        fraction [0] = test [0];
        for (int c = 1; c < n + 1; c++) {
            test[c] = totals[c] + test[c-1];
            fraction[c] = test[c] / Integer.parseInt(args[1]);
        }
        for (int t = 1; fraction[t - 1] < 0.5; t++) {
            System.out.println(t + "  " + totals[t] + "  " + (fraction[t]));
        }


    }
}
