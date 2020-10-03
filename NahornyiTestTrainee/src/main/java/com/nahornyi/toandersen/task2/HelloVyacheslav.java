/**
 * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
 *
 * вопросы для 2 задания:
 * 1. снова вопрос об оформлении методом, возвращающим строку или метод void, который выводит в консоль ответ?
 * 2. нужна ли валидация вводимого имени? реакция на спец. символы, цифры? минимальная и максимальная длина?
 * 3. метод ждет строго ввода "Вячеслав" или он нечувствителен к регистру? ("вячеслав"/"ВяЧеЧлАв")?
 * 4. если оформить методом, котороый получается строку и отдает строку, то как быть с NULL-аргументом? оставить NullPointerException, проверить на Null и выдать сообщение (если да, то какого содержания?), бросить свое исключение(какого типа и сообщения?), вернуть NULL (считаю плохим вариантом)?
 */

package com.nahornyi.toandersen.task2;

import java.util.Scanner;

public class HelloVyacheslav {
    private final static String ANSWER_IF_EXPECTED_NAME = "Привет, Вячеслав";
    private final static String EXPECTED_NAME = "Вячеслав";
    private final static String ANSWER_IF_UNEXPECTED_NAME = "Нет такого имени";

    public static void main(String[] args) {
        System.out.println();//to separate service information and output
        helloVyacheslavMethod();
    }//main

    public static void helloVyacheslavMethod() {
        String line;
        System.out.println("Hello! Enter your name please. You will see \"Привет, Вячеслав\" if your name is \"Вячеслав\".");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter name: ");
        line = scanner.nextLine();//++ интерактивный ввод значений для обработки и вывод обработаных данных (например, через консоль)
        if (line.equals(EXPECTED_NAME)) {
            System.out.println(ANSWER_IF_EXPECTED_NAME);
        } else {
            System.out.println(ANSWER_IF_UNEXPECTED_NAME);
        }

    }

}//class
