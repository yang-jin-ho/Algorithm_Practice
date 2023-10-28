package silver;

public class n_4673 {
    public static void main(String[] args) {
    boolean[] check = new boolean[10001];
    for(int i=1; i<10001; i++){
        int n = selfnum(i);

        if(n<10001) check[n] = true;
    }

    for(int j=1; j<10001; j++){
        if(!check[j]) System.out.println(j);
    }



    }
    public static int selfnum(int num){
        int sum = num;
        while (num != 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }

}

