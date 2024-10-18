import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя число
        System.out.print("Введите число для вывода таблицы умножения: ");
        int number = scanner.nextInt();

        // Выводим таблицу умножения
        System.out.println("Таблица умножения для числа " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        // Закрываем сканер
        scanner.close();
    }
}
