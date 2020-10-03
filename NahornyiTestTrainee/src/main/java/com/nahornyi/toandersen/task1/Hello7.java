/**
 * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 *
 * вопросы для 1 задания, ответы на которые не были получены в скайпе:
 * 1. должен ли код быть оформлен методом, возвращающим строку или метод void, который выводит в консоль строку "Привет"?
 * 2. если void, то при вводе числа <=7, игнорировать такой ввод и ничего не делать?
 * 3. если методом, возвращающим строку, то что вернуть при вводе числа <7?
 *  (пустая строка/строка вида "неПривет", но заранее согласованная - лучший вариант
 *  исключени - если да, то какого типа и с каким сообщением
 *  NULL - скомпилируется, но очень плохой вариант)
 * 4. аргумент какого типа мы ждем? примитивный или класс-обертку?
 * 5. если примитивный, то какого типа? если целочисленнный, то какой из byte/short/int/long? если дробный, то double/float?
 * 6. если класс-обертка, то как регировать на NULL-аргумент? оставить NullPointerException или проверить аргумент на NULL и вывести сообщение о некорректном вводе? или NULL посчитать значением "не большим 7" (не лучшее решение) и отреагировать как на арг меньше 7?
 * 7. как отреагировать на аргумент неправильного типа (если консольный ввод не числа, а буквы/спец.символа?)? исключение дальше или обработка и сообщениев консоль? если исключение, то какого типа и с каким сообщением?
 */

package com.nahornyi.toandersen.task1;

import java.util.Scanner;

public class Hello7 {
    private final static int TRIGGER = 7;
    private final static String ANSWER_IF_MORE = "Привет";

    public static void main(String[] args) {
        System.out.println();//to separate service information and output
        hello7();
    }//main

    public static void hello7() {
        int arg;
        String line;
        System.out.println("Hello! Enter an integer please. If your number more than 7 you'll see \"Привет\".");
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter number: ");
        line = scanner.nextLine(); //++ интерактивный ввод значений для обработки и вывод обработаных данных (например, через консоль)
        try {
            arg = Integer.parseInt(line);
            if (arg > TRIGGER) {
                System.out.println(ANSWER_IF_MORE);
            }
        } catch (NumberFormatException e) {
            System.out.println("bad argument. try again");
        }

    }//hello7

}//class
