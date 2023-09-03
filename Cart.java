import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart implements Delivery {
    public void Cart(int[] prices, String[] products, int[] count) {
        Estimates estimate = new Estimates();
        Scanner scanner = new Scanner(System.in);
        int productNumber = 0;
        int productCount = 0;
        int sumProducts = 0;
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            if (input.equals("end")) {
                for (int i = 0; i < count.length; i++) {
                    if (count[i] > 0) {
                        System.out.println(products[i] + " " + count[i] + "шт" + " " + prices[i] + " " + "руб/шт" + " " + prices[i] * count[i] + " " + "руб в сумме");
                    }
                }
                System.out.println("Итого: " + sumProducts + " рублей");

                System.out.println("Выберите город доставки");
                List<String> cities = new ArrayList<>(List.of("Москва", "Санкт - Петербург", "Казань"));
                List<Integer> pricesDelivery = new ArrayList<>(List.of(2_000, 1_500, 4_000));
                for (int i = 0; i < cities.size(); i++) {
                    System.out.println(i + 1 + "." + cities.get(i) + " " + pricesDelivery.get(i) + " " + "руб");
                }
                String inputDelivery = scanner.nextLine();

                switch (inputDelivery) {
                    case "1":
                        String address = null;
                        delivery("Москва", address);
                        address = scanner.nextLine();
                        String feedback = null;
                        estimate.estimate();
                        break;
                    case "2":
                        String addressPiter = null;
                        delivery("Санкт - Петербург", addressPiter);
                        addressPiter = scanner.nextLine();
                        estimate.estimate();
                        break;
                    case "3":
                        String addressKazan = null;
                        delivery("Казань", addressKazan);
                        addressKazan = scanner.nextLine();
                        estimate.estimate();
                        break;
                    default:
                        System.out.println("Неверно введены значения");
                        break;
                }
            }
            productNumber = Integer.parseInt(parts[0]) - 1;
            productCount = Integer.parseInt(parts[1]);
            count[productNumber] += productCount;
            sumProducts += count[productNumber] * prices[productNumber];
        }
    }
    @Override
    public void delivery(String city, String address) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите свой адрес: ");
        address = scanner.nextLine();
        System.out.println("Заказ был успешно создан. Город " + city + ", адрес - " + address + " Введите `end`.");
    }
}