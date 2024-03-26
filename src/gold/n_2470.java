package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n_2470 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        int[] solution = new int[N];

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++)
            solution[i] = Integer.parseInt(input[i]);

        Arrays.sort(solution);


        int left = 0;
        int right = N - 1;
        int min = Integer.MAX_VALUE;
        int sol1 = 0;
        int sol2 = 0;

        while (left < right) {

            int value = Math.abs(solution[left] + solution[right]);

            if (value < min) {

                min = value;
                sol1 = left;
                sol2 = right;

                if (value == 0) break;
            }
    //두 용액의 합이 0보다 크다면(절대값이 양수쪽이큼) -> 합이 0에 가까워지려면 -> 양수사이즈를 줄임 -> right--
            if (Math.abs(solution[left]) < Math.abs(solution[right]))
                right--;
            else
                left++;
        }


        System.out.println(solution[sol1] + " " + solution[sol2]);
    }
}
