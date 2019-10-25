public class knapack {
    public static int solveKnapsack (int [] values, int [] weights, int maxCap){
        int v= values.length;
        int [][] table = new int [v+1][maxCap+1];
        for (int i=0;i<maxCap+1;i++){
            table[0][i]=0;
        }
        for (int i=0;i<=v;i++){
            table[i][0]=0;
        }
        for (int i =1; i<=v;i++){
            for (int j=1;j<=maxCap;j++){
                if (weights[i-1]>j){
                    table[i][j]=table [i-1][j];
                }
                else {
                    if (i!=1 && (weights[i-1]+weights[i-2] <=j)){
                        table [i][j] = values[i-1]+table[i-1][j-weights[i-1]];
                    }
                    else {
                        table [i][j]= Math.max(table[i-1][j],values[i-1]);

                    }

                }
            }
        }


        for (int i =0; i<=v;i++) {
            for (int j = 0; j <= maxCap; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        return table[v][maxCap];

    }

    public static void main(String[] args) {
        int [] values  = new int[] {10,40,30,50};
        int [] weights = new int []{5,4,6,3};
        System.out.println(solveKnapsack(values,weights,10));
    }
}
