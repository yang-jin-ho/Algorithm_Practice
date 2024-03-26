package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n_1107 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int channel = Integer.parseInt(br.readLine());
        int X = Integer.parseInt(br.readLine());

        if (X == 0) {
           System.out.println(Math.min(String.valueOf(channel).length(), Math.abs(channel - 100)));
            return;
        }

        boolean[] XB = new boolean[11];

        String [] inputs = br.readLine().split(" ");
        for (int i = 0; i < X; i++) {
            XB[Integer.parseInt(inputs[i])] = true;
        }

        int result = Math.abs(channel - 100);

        if(result == 0) {
            System.out.println(result);
            return;
        }
        else {
            for(int i = 0; i <= 1000000; i++) {
                char[] num = Integer.toString(i).toCharArray();
                boolean make = true;	//채널을 만들 수 있는지 여부
                int count = 0;	//버튼 누른 횟수

                for (int j = 0; j < num.length; j++) {
                    if (!XB[(int)(num[j] - '0')]) {
                        count++;
                    }
                    else {
                        make = false;
                        break;
                    }
                }
                if (make) {
                    result = Math.min(result, Math.abs(channel - i) + count);
                }
            }
        }
        System.out.println(result);
    }
}
