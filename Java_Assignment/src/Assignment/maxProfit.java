package Assignment;

public class maxProfit {
	

	    public static void main(String[] args) {
	        
	        int[] prices = {7, 1, 5, 3, 6, 4};
	        int maxProfit = calculateMaxProfit(prices);
	        System.out.println("Maximum profit: " + maxProfit);
	    }
	
	    

	//Function to calculate maximum profit
	public static int calculateMaxProfit(int[] prices) {
	   
	    if (prices == null || prices.length < 2) {
	        return 0;
	    }

	    // Initialize minPrice to the first price and maxProfit to 0
	    int minPrice = prices[0];
	    int maxProfit = 0;

	    // Iterate through the array of prices
	    for (int i = 1; i < prices.length; i++) {
	        // Update minPrice to the lowest price seen so far
	        if (prices[i] < minPrice) {
	            minPrice = prices[i];
	        }

	        // Calculate the potential profit with the current price
	        int potentialProfit = prices[i] - minPrice;

	        // Update maxProfit if the potential profit is higher
	        if (potentialProfit > maxProfit) {
	            maxProfit = potentialProfit;
	        }
	    }

	    return maxProfit;
	}
}



