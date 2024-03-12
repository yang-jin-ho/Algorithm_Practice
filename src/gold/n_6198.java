package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class n_6198 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
/*
6


10
3
7
4
12
2
 */
        //s 10 7  4
        // 1 + 1  + 2 + 1 =5

        long result = 0;
        Stack<Integer> s = new Stack<>();
        //'i번째 건물에서 보이는 다른 건물의 수'가 아니라 'i번째 건물을 볼 수 있는 다른 건물의 수'
        for(int i=1; i<=n; i++) {
            while(!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            s.push(arr[i]);
            result += s.size()-1;
        }

        System.out.println(result);
    }
}
