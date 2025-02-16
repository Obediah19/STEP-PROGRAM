class profitLoss {
public static void main(String[] args){
	int costPrice = 129;
	int sellingPrice = 191;
	int profit = sellingPrice - costPrice;
	double profitPercentage = (profit/(double)costPrice)*100.0;
	System.out.println("The Cost price is INR "+costPrice+" and Selling Price is "+sellingPrice+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profitPercentage);
}
}