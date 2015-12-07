import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        while(in.hasNextLong()) {
            long x = in.nextLong();
            long y = in.nextLong();
            long res = x;
            while(x++ < y)
                res &= x;
            System.out.println(res);
        }
    }
}
