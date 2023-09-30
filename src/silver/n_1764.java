package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class n_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]); // 듣도 못한 사람의 수
        int M = Integer.parseInt(NM[1]); // 보도 못한 사람의 수

        HashSet<String> unheardSet = new HashSet<>();
        HashSet<String> unseenSet = new HashSet<>();

        // 듣도 못한 사람 명단 입력
        for (int i = 0; i < N; i++) {
            unheardSet.add(br.readLine());
        }

        // 보도 못한 사람 명단 입력 및 듣보잡 체크
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (unheardSet.contains(name)) {
                unseenSet.add(name);
            }
        }

        br.close();

        // 듣보잡의 수와 명단 출력
        String[] result = unseenSet.toArray(new String[unseenSet.size()]);
        Arrays.sort(result);

        System.out.println(result.length);
        for (String name : result) {
            System.out.println(name);
        }
    }
}
