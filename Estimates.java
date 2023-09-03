import java.util.Scanner;

public class Estimates implements Estimate{

    @Override
    public void estimate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оцените наш сервис от 1 до 10 :)");
        int estimate = scanner.nextInt();
        if (estimate >= 1 && estimate <= 4) {
            System.out.println("Что вам не понравилось?");
            System.out.println("Спасибо за замечание, будем исправлять!");
        } else if(estimate > 4 && estimate <= 7) {
            System.out.println("Спасибо за ваш отзыв, будем исправлять ошибки");
        } else {
            System.out.println("Спасибо за ваш замечательный отзыв :)");
        }
    }
}
