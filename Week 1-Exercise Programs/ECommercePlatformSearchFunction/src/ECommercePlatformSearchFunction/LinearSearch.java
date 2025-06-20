package ECommercePlatformSearchFunction;

public class LinearSearch {
	public static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.productId == id) return product;
        }
        return null;
    }
	
	public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName == name) return product;
        }
        return null;
    }
}

