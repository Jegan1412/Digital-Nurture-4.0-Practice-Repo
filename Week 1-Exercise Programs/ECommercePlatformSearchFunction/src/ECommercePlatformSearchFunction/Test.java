package ECommercePlatformSearchFunction;

public class Test {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Shoes", "Footwear"),
            new Product(101, "T-Shirt", "Apparel"),
            new Product(109, "Phone", "Electronics"),
            new Product(103, "Book", "Education")
        };

        System.out.println("Linear Search to search by - productId");
        Product result1 = LinearSearch.linearSearch(products, 101);
        System.out.println((result1 != null ? result1 : "Product not found") + "\n");
        
        System.out.println("Linear Search to search by - productName");
        Product result2 = LinearSearch.linearSearch(products, "T-Shirt");
        System.out.println((result2 != null ? result2 : "Product not found") + "\n");

        System.out.println("Binary Search to search by - productId");
        BinarySearch.sortProducts(products);
        Product result3 = BinarySearch.binarySearch(products, 109);
        System.out.println((result3 != null ? result3 : "Product not found") + "\n");
    }
}

