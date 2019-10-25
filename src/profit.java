import java.util.ArrayList;
    class Interval {
        int buy, sell;
    }
    class StockBuySell {
        int stockBuySell(int price[], int n) {
            if (n<=1)
                return 0;
            ArrayList <Interval> solution = new ArrayList<>();
            int i=0;
            int count =0;
            int profit=0;
            int buy ; int sell;
            while(i<n-1){
                while ((i<n-1) && price[i+1]<=price[i])
                    i++;
                if (i ==n-1)
                break;
                Interval e = new Interval ();
                e.buy = price[i++];

                while ((i<n-1) && price[i+1]>=price[i])
                    i++;
                e.sell = price[i];
                solution.add(e);
                count ++;

            }
            if (count ==0 )
                return 0;

            for (int j=0;j<count ;j++){
                System.out.println("Buy on day: " + solution.get(j).buy
                        + "        "
                        + "Sell on day : " + solution.get(j).sell);
                profit = profit + (solution.get(j).sell-solution.get(j).buy);
            }
            return profit;
        }



        public static void main(String args[]) {
            StockBuySell stock = new StockBuySell();
            int price[] = {7,1,5,3,6,4};
            int n = price.length;
            System.out.println( stock.stockBuySell(price, n));
        }
    }


