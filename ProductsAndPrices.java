public class ProductsAndPrices {
    String[] products = {"Apple Watch", "Iphone", "TV"};
    int[] prices = {10_000, 45_000, 150_000};
    int[] count = new int[products.length];

    public void showMenu() {
        for (int i = 0; i < products.length; i++) {
           System.out.println(i + 1 + "." + products[i] + " " + prices[i] + " " + "руб/шт");
        }
    }
}
