package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class n_11576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int o = Integer.parseInt(br.readLine());

        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        st = new StringTokenizer(br.readLine());
        for(int i=o; i>0; i--){
            int k = Integer.parseInt(st.nextToken());
            sum = sum + (k * (int)Math.pow(n,i-1));
        }
        while (sum !=0){
            stack.push(sum%m);
            sum = sum/m;
        }
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }
}