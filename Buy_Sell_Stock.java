public class Buy_Sell_Stock {
    public static void main(String args[]){
        int[] price = {3,4,5,6,7,9,3,1,3,5};
        int minprice = Integer.MAX_VALUE;
        int Buy = 0; 
        int Sell = 0; 
        int maxprofit =0; 
        for(int i = 0; i<price.length;i++){
            if(price[i]<minprice){
                minprice = price[i];
                Buy=i+1;
            }
            int profit =price[i]-minprice;
            if(profit>maxprofit){
                maxprofit = profit;
                Sell=i+1;
            }
        }
        if (maxprofit > 0) {
            System.out.println("Buy on day: " + Buy);
            System.out.println("Sell on day: " + Sell);
            System.out.println("Maximum Profit is: " + maxprofit);
        } else {
            System.out.println("No profit can be made.");
        }
          
    } 
}
