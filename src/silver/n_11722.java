package silver;

import java.io.*;
import java.util.*;

public class n_11722 {
    static int [] array;
    static int [] dp;
    public static void main(String[] args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        array = new int[N];
        for (int i = N-1; i >= 0 ; i--) {
            array[i]= Integer.parseInt(st.nextToken());
        }

        dp = new int[N];
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {

                if(array[i] > array[j] && dp[i] < dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
        }
        Arrays.sort(dp);
        System.out.print(dp[N-1]);
    }
}
