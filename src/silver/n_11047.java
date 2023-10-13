package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[] coinList = new int[N];
        for(int i=0; i<N; i++){
            coinList[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        while(M>0){
            if(M-coinList[N-1] < 0) N--;
           else {
                M = M - coinList[N-1];
                count++;
            }
        }
        System.out.println(count);
    }
}
