public class ThueMorese {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int x = 1; x < (n - 2);) {
           // boolean[] TM = new boolean[x];
            //TM
            int y = (int) Math.pow(2, x);
            x = y;
            System.out.println(x);
        }
    }
}
