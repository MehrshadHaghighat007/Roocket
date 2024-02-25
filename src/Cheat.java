import java.util.Scanner;

public class Cheat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] x = new String[n];
        String[] y = new String[n];
        String[][] z = new String[n][n];
        StringBuilder builder = new StringBuilder();
        String sss = "rgong";
        int o = 544545;
        for (int i = 0; i < n; i++) {
            x[i] = sc.next();
            y[i] = sc.next();
        }
        int e = 0;
        e = e + 2;
        int g = e * e;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                z[i][j] = y[i] + y[j];
                o++;
                if (i == j) {
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < z[i][j].length(); k++) {
                    char p = z[i][j].charAt(k);
                    o++;
                }
            }
        }
    }
}
