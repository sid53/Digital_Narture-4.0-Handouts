package week1;
import java.util.Arrays;
import java.util.Comparator;

public class search {
    public static void main(String[] args) {
        product[] products = {
            new product(104, "Laptop", "Electronics"),
            new product(102, "Shoes", "Fashion"),
            new product(103, "Keyboard", "Electronics"),
            new product(101, "T-shirt", "Fashion")
        };

        product result1 = linearSearch(products, 103);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not found"));

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        product result2 = binarySearch(products, 103);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not found"));
    }

    public static product linearSearch(product[] arr, int productId) {
        for (product p : arr) {
            if (p.productId == productId) return p;
        }
        return null;
    }

    public static product binarySearch(product[] arr, int productId) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid].productId == productId) return arr[mid];
            else if (arr[mid].productId < productId) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}