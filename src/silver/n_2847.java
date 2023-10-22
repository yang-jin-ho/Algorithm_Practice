package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] score = new int[a];
        int result = 0;

        for(int i=0; i<a; i++){
            score[i] = Integer.parseInt(br.readLine());
        }

        for(int j=a; j>1;){
            if(score[j-1]<=score[j-2]){
                score[j-2] = score[j-2] -1;
                result++;
            }
            else{
                j--;
            }
        }
        System.out.println(result);
    }
}
