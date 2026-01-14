import java.util.Scanner;

public class OriginalSellingPriceCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input discounted selling price
        System.out.print("Enter discounted selling price: ");
        double discountedPrice = sc.nextDouble();

        // Input discount percentage
        System.out.print("Enter discount percentage: ");
        double discountPercent = sc.nextDouble();

        // Calculate original selling price
        double originalPrice = discountedPrice / (1 - discountPercent / 100);

        // Output
        System.out.println("Original selling price = " + originalPrice);

        sc.close();
    }
}
