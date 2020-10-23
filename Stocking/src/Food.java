public class Food extends Product {

	private static String type = "Food";
	public Food(String productName, int numberOfProduct, double unitPurchasePrice,
			double unitSalePrice) {
		super(productName, numberOfProduct, unitPurchasePrice, unitSalePrice,type);
	}

}