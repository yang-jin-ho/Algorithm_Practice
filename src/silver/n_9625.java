package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_9625 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int a=0;
        int b=1;
        int sum=0;

        for(int i=1; i<num; i++){
            sum = a+b;
            a=b;
            b=sum;
        }
        System.out.println(a+" "+b);
    }
}
