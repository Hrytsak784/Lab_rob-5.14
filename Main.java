import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть п'ять слів:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();
        String word5 = scanner.next();

        String sentence = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5).concat(".");

        System.out.println("Результат: " + sentence);
        System.out.println("Завдання 2");
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Введіть п'ять слів:");
        String word11 = scanner.next();
        String word12 = scanner.next();
        String word13 = scanner.next();
        String word14 = scanner.next();
        String word15 = scanner.next();

        char firstLetter1 = word1.substring(0, 1).charAt(0);
        char firstLetter2 = word2.substring(0, 1).charAt(0);
        char firstLetter3 = word3.substring(0, 1).charAt(0);
        char firstLetter4 = word4.substring(0, 1).charAt(0);
        char firstLetter5 = word5.substring(0, 1).charAt(0);

        System.out.println("Перші літери введених слів: " + firstLetter1 + ", " + firstLetter2 + ", " + firstLetter3 + ", " + firstLetter4 + ", " + firstLetter5);
        System.out.println("Завдання 3");
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Введіть три дробові числа:");
        double num1, num2, num3;

        try {
            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();
            num3 = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Помилка у введенні чисел! Будь ласка, введіть дробові числа.");
            return;
        }

        double max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Найбільше введене число: " + max);
        System.out.println("Завдання 4");
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Введіть перше ім'я:");
        String name1 = scanner.nextLine();

        System.out.println("Введіть друге ім'я:");
        String name2 = scanner.nextLine();

        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена не ідентичні.");
        }
        System.out.println("Завдання 5");
        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Введіть перший рядок: ");
        String firstString = scanner.nextLine();
        System.out.print("Введіть другий рядок: ");
        String secondString = scanner.nextLine();
        if (firstString.length() > secondString.length()) {
            System.out.println("Перший рядок має більше символів.");
        } else if (firstString.length() < secondString.length()) {
            System.out.println("Другий рядок має більше символів.");
        } else {
            System.out.println("Рядки мають однакову кількість символів.");
        }



    }
}