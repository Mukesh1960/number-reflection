import java.util.*;

public class numMirT {

    public static Scanner scn = new Scanner(System.in);

    public static void numMirPattern(int n) {
        int nst = 1;
        int nsp = (n * 2) - 3;
        for (int row = 1; row <= n; row++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(cst + "\t");
            }

            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cstt = row; cstt >= 1; cstt--) {

                if (cstt == n) {
                    continue;
                } else {
                    System.out.print(cstt + "\t");
                }
            }

            nsp -= 2;
            nst++;
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        numMirPattern(scn.nextInt());
    }

}
