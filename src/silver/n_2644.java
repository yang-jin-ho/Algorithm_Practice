package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n_2644 {
    static int[][] family;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(br.readLine());

        family = new int[A+1][A+1];
        visited = new boolean[A+1];

        while (N>0){
            st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            family[a][b] = family[b][a] =1;
            N--;
        }
        System.out.println(dfs(start,end,0));


    }

    static int dfs(int start,int end,int cnt){
        if(start==end) return cnt;
        visited[start] = true;

        for(int i=1; i< visited.length; i++){
            if(family[start][i]==1&&!visited[i]){
                int temp = dfs(i,end,cnt+1);
                if(temp!=-1) return temp;
            }
        }

        return -1;
    }
}

