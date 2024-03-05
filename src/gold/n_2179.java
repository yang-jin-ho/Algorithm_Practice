package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n_2179 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        int maxPrefixLength = 0;
        String firstWord = "";
        String secondWord = "";

        // 모든 단어 쌍에 대해 접두사 길이 비교
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // 현재 비교하는 단어 쌍의 접두사 길이 구하기
                int prefixLength = getPrefixLength(arr[i], arr[j]);

                // 현재까지 최대 접두사 길이보다 길다면 업데이트
                if (prefixLength > maxPrefixLength) {
                    maxPrefixLength = prefixLength;
                    firstWord = arr[i];
                    secondWord = arr[j];
                }
            }
        }

        // 결과 출력
        System.out.println(firstWord);
        System.out.println(secondWord);



    }

    public static int getPrefixLength(String word1, String word2) {
        int length = Math.min(word1.length(), word2.length());
        int prefixLength = 0;
        for (int i = 0; i < length; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                break;
            }
            prefixLength++;
        }
        return prefixLength;
    }
}
