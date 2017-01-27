/**
 * Created by admin on 27/01/17.
 * Validated.
 */

import java.util.ArrayList;

public class P4 {
    public static boolean isPalindrome (int n) {
        String s = n + "";
        String rev = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev.equals(s);
    }
    public static void main(String[] args) {
        long s = System.nanoTime();
        ArrayList<Integer> prods = new ArrayList<Integer>();
        for (int i = 1; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                prods.add(i*j);
            }
        }
        int max = 0;
        for (int i = prods.size()-1; i >= 0; i--) {
            if (isPalindrome(prods.get(i)) && prods.get(i) > max) {
                max = prods.get(i);
            }
        }
        System.out.println(max);
        long e = System.nanoTime();
        System.out.println((e-s)/1000000000.0);
    }
}