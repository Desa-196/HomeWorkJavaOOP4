/*
Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает максимальное значение из них.

В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, ограниченных интерфейсом Comparable. 
Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.

В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double) и строку (String). 
В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.

Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, сохраняя при этом безопасность типов.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getMax(5, 5));
        System.out.println(getMax(5, 15));
        System.out.println(getMax(10, 5));
    }

    public static <T extends Comparable<T>> T getMax(T element1, T element2) {
        // Если больше нуля значит element1 > element2 - возвращаем element1, если 0 то
        // просто вернём один из элементов - element1
        if (element1.compareTo(element2) >= 0)
            return element1;
        else
            return element2;
    }
}