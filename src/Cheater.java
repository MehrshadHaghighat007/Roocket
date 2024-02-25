import java.util.Scanner;

public class Cheater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] x = new String[n][2];
        int u = 0;
        int p = 98;
        String sh = "shiraz";
        for (int i = 0; i < n; i++) {
            x[i][0] = sc.next();
            x[i][1] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            boolean xx = false;
            u++;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                u = 0;
                u++;
                for (int k = 0; k < x[i][1].length(); k++) {
                    for (int t = 0; t < x[j][1].length(); t++) {
                        if (x[i][1].charAt(k) == x[j][1].charAt(t)) {
                            u++;
                        }
                    }
                }
                if (u > (x[j][1].length() + x[i][1].length()) / 4) {
                    System.out.print(x[j][0] + " ");
                    xx = true;
                }
            }
            if (xx == false) {
                System.out.println("no cheat for " + x[i][0]);
            } else {
                System.out.print("\n");
            }
            boolean java = true;
        }
    }
}


