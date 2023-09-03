public class Main {
    public static void main(String[] args) {
        //В данной программе я использовал DRY перенеся повторяющийся код в метод и принципы SOLID.
        ProductsAndPrices productsAndPrices = new ProductsAndPrices();
        productsAndPrices.showMenu();

        Cart cart = new Cart();
        cart.Cart(productsAndPrices.prices, productsAndPrices.products, productsAndPrices.count);

    }
}
