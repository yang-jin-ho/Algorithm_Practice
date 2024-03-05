package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class n_2295 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        HashSet<Integer> sum = new HashSet<Integer>();
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum.add(arr[i]+arr[j]);
            }
        }
        int res = -1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int k = arr[i]-arr[j];
                if(sum.contains(k)){
                    res = Math.max(arr[i],res);
                }
            }
        }
        System.out.println(res);
    }
}
