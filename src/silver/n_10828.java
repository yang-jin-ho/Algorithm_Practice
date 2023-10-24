package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Stack;

public class n_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<a; i++) {
            String[] NM = br.readLine().split(" ");
            if(Objects.equals(NM[0], "push")){
                stack.push(Integer.parseInt(NM[1]));
            }
            if(Objects.equals(NM[0],"pop")){
                if(stack.isEmpty()) System.out.println(-1);
                else {
                    int b = stack.pop();
                    System.out.println(b);
                }
            }
            if(Objects.equals(NM[0],"size")){
                System.out.println(stack.size());
            }
            if(Objects.equals(NM[0],"empty")){
                if(stack.isEmpty()) System.out.println(1);
                else System.out.println(0);
            }
            if(Objects.equals(NM[0],"top")){
                if(stack.isEmpty()) System.out.println(-1);
                else System.out.println(stack.peek());

            }
        }
    }
}
