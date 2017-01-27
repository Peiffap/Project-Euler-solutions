/**
 * Created by admin on 27/01/17.
 * Validated.
 */
public class P14 {

    private static int[] lengths = new int[1000000];

    public static int coll (int in) {
        double n = in;
        int length = 1;
        while (n != 1) {
            if (n%2 == 0) {
                n /= 2;
            } else {
                n = 3*n + 1;
            }
            length++;
            if (n < in) {
                return length-1+lengths[(int) n]; // Smaller numbers are all filled in.
            }
        }
        return length;
    }
    public static void main (String[] args) {
        long s = System.nanoTime();
        int maxL = 0;
        int maxN = 0;
        for (int i = 1; i < 1000000; i++) {
            lengths[i] = coll(i);
            if (lengths[i] > maxL) {
                maxL = lengths[i];
                maxN = i;
            }
        }
        System.out.println(maxN);
        long e = System.nanoTime();
        System.out.println((e-s)/1000000000.0);
    }
}