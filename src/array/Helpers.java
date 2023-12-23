package array;

public class Helpers {

    public static int fibonnaci(int n) {
        int i, c = 0, a = -1, b = 1;
        for (i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

}
