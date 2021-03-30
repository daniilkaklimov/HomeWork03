package homework03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    //Задание 1
    private static void Random() {
        Scanner input = new Scanner(System.in);
        Random numbers = new Random();
        int attempt = 0;
        int random = numbers.nextInt(9);
        System.out.println("Угадайте число за три попытки");
        while (attempt < 3) {
            System.out.println("Введите число от 0 до 9: ");
            int number = input.nextInt();
            if (number > random) {
                System.out.println("Неверно! Введите число поменьше");
            } else if (number < random) {
                System.out.println("Неверно! Введите число побольше");
            } else if (number == random) {
                System.out.println("Верно! Вы отгадали!");
                attempt++;
            }
        }
    }

    //Задание 2
    private static void Words() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random randomValue = new Random();
        int wordIndex = randomValue.nextInt(words.length);
        String word = words[wordIndex];
        Scanner scanner = new Scanner(System.in);

        System.out.println(word);
        System.out.println("Было загадано слово из данного списка, ваша задача его угадать:" + "apple, orange, lemon, banana, apricot, avocado, broccoli, carrot," + "cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut, olive, pea, peanut, pear, pepper," + "ineapple, pumpkin, potato");
        String userAnswer = "";

        while (scanner.hasNext("\n")) {
            userAnswer = scanner.nextLine();
        }

        if (userAnswer == word) {
            System.out.println("Поздравляем, вы отгадали слово!");
        } else {
            System.out.println("Вы не угадали");
        }
    }
}
