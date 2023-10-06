package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n_2669 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] map = new int[101][101];
        int area = 0;

        for(int i=0; i<4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int a=x1; a<x2; a++){

                for(int b=y1; b<y2; b++){
                    map[a][b]=1;
                }
            }
        }
        for(int j =0; j<101; j++){
            for(int k=0; k<101; k++){
                if(map[j][k]==1){
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}
