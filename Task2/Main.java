/*
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл for-each, 
чтобы пройти по всем элементам массива и вывести их на консоль.

В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. В результате мы получаем вывод на консоль элементов каждого массива.

Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных, обеспечивая повторное использование и гибкость.

Полезные материалы
https://metanit.com/java/tutorial/3.11.php
 */
public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[] { "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь",
                "Девять", "Десять" };
        printArray(stringArray);

        Integer[] intArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArray(intArray);

        Double[] doubleArray = new Double[]{1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6};
        printArray(doubleArray);
    }

    public static <T> void printArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
    }
}