/**
 * Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 *
 * вопросы для 3 задания, ответы на которые не были получены в скайпе:
 * 0. нужно решение вида
 * int[] method(int[]){
 * return int[];
 * }
 * или
 * void method (int[]){
 * sout(result)
 * } ?
 * 1. массив одномерный? если нет, сколько измерений имеет?
 * 2. какого типа данные ожидать во входном массиве?
 * 3. снова вопрос null-аргумента. что делаем?
 */

package com.nahornyi.toandersen.task3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayOfMultipleOf3 {

    public static void main(String[] args) {

        //initialization of the input array
        int[] arg = new int[31];
        for (int i = 0; i <= 30; i++) {
            arg[i] = i;
        }

        System.out.println();
        System.out.println("task 3: print array elements that are multiples of 3");
        System.out.println("below you can see original array and filtered through loops and stream API:");
        System.out.println(Arrays.toString(arg));
        System.out.println(Arrays.toString(filterArrayWithCycle(arg)));
        System.out.println(Arrays.toString(filterArrayWithStreamAPI(arg)));
    }

    public static int[] filterArrayWithCycle(int[] arg) {
        if (arg == null) throw new IllegalArgumentException("bad argument");
        int count = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] % 3 == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] % 3 == 0) {
                result[count++] = arg[i];
            }
        }
        return result;
    }

    public static int[] filterArrayWithStreamAPI(int[] arg) {
        if (arg == null) throw new IllegalArgumentException("bad argument");
        IntStream intStream = Arrays.stream(arg);
        return intStream.filter(num -> num % 3 == 0).toArray();
    }
}
