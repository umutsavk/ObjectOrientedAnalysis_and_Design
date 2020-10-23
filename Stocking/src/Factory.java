
public class Factory {
	
public static Product productFactory( String productType , int numberOfProduct , double unitPurchasePrice , double unitSalePrice) {
		Product ret = null;
		if (productType.equalsIgnoreCase("food")) {
			ret = new Food(productType, numberOfProduct ,unitPurchasePrice,unitSalePrice);
		}
		else if (productType.equalsIgnoreCase("drink")) {
			ret = new Drink(productType, numberOfProduct ,unitPurchasePrice,unitSalePrice);
		}
		else if (productType.equalsIgnoreCase("other")) {
			ret = new Other(productType, numberOfProduct ,unitPurchasePrice,unitSalePrice);
		}
		
		
		return ret;
	}

}
