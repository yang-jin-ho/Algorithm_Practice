package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n_11497 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int left = 0;
            int right = N-1;
            int[] arr2 = new int[N];
            for(int k=0; k<N; k++){
                if(k%2==0){
                    arr2[left] = arr[k];
                    left++;
                }
                else{
                    arr2[right] = arr[k];
                    right--;
                }
            }
            int result = Math.abs(arr2[0]-arr2[N-1]);

            for(int m=1; m<N; m++){
                result = Math.max(result, Math.abs(arr2[m]-arr2[m-1]));
            }
            System.out.println(result);
        }
    }
}
