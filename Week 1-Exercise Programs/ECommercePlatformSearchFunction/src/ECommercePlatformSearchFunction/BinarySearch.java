package ECommercePlatformSearchFunction;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
	public static Product binarySearch(Product[] products, int id) {
        int i = 0, j = products.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (products[mid].productId == id) return products[mid];
            else if (products[mid].productId < id) i = mid + 1;
            else  j = mid - 1;
        }
        return null;
    }

    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
    }
}
