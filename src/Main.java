import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] X = new String[n];
        String [] Y = new String[n];
        int ans[][]=new int[n][n];
        for (int i = 0 ; i<n ; i++){
            X [i] = sc.next();
            Y [i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                String s1 = Y[i] ;
                String s2 = Y[j] ;
                int [] d = new int [26];
                for(int k = 0 ; k<(s1.length()) ; k++){
                    int index=s1.charAt(k)-'a';
                    d[index] = d[index] + 1 ;
                }
                for(int k = 0 ; k<(s2.length()) ; k++){
                    int index=s2.charAt(k)-'a';
                    d[index] = d[index] + 1 ;
                }
                int cnt=0;
                for(int k = 0 ; k<26 ; k++){
                    if (d[k]==2){
                        cnt++;
                    }
                }
                if (Math.floor((s1.length()+s2.length())/4) < cnt){
                    ans [i] [j] = 1;
                    ans [j] [i] = 1;
                }
            }
        }
        for (int i=0;i<n;i++){
            boolean x=false;
            for(int j=0;j<n;j++){
                if(ans [i] [j]==1){
                    System.out.println(X[j]+" ");
                    x=true;
                }
            }
            if(!x){
                System.out.println("no cheat for "+X[i]);
            }
        }
    }

}