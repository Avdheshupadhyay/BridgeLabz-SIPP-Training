//This class calculates profit and profit percentage given cost and selling prices.
public class ProfitAndLossCalculator {
    public static void main(String[] args) {
        // Given prices
        int costPrice = 129;
        int sellingPrice = 191;
        
        // Calculate profit and profit percentage
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double)costPrice) * 100;
        
        // Output the result
		if(profit>=0){
			System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                         "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
		}
		else{
			System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + 
                         "\nThe Loss is INR " + profit + " and the Loss Percentage is " + profitPercentage + "%");
		}
    }
}