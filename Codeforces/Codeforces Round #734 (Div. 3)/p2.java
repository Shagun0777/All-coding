import java.util.*;
import java.io.*;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int k = 0, m = 0, sum = 0;
            int c[] = new int[26];
            for (int i = 0; i < n; i++) {
                c[(s.charAt(i)) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if (c[i] == 1)
                    k++;
                if (c[i] > 1)
                    m++;
            }
            sum = k / 2 + m;
            System.out.println(sum);
        }

    }

}
