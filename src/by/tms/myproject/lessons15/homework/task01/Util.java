package by.tms.myproject.lessons15.homework.task01;

/**
 * Задан текст на английском языке. Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 */

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Util {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        IntStream.range(0, 1).forEach(i -> {
            list.add("i can see balls and bats and cars.");
            list.add("I Can See boats and planes. I can see carts,");
            list.add("skipping ropes, dolls. I can see ships and trains.");
            list.add("I Can see games and tops and lorries.");
            list.add("I can see bears and bikes.");
            list.add("i can see swings and slides and skates.");
            list.add("I can see drums and kites.");
            list.add("Of all the toys I can see,");
            list.add("I want one for me!");
        });

            // stream() - Возвращает последовательный поток с этой коллекцией в качестве источника.
        list.stream()
                /** разбиваем строки на слова */
                // Stream - Последовательность элементов, поддерживающих последовательные и параллельные агрегатные операции.
                // of - Возвращает последовательный упорядоченный поток, элементами которого являются заданные значения.
                // flatMap - возвращает по стриму для каждого объекта в первоначальном стриме, а затем результирующие потоки объединяются в исходный стрим.
                .flatMap(line -> Stream.of(line.split(" ")))
                /** выкидываем небуквенные символы */
                // map - Возвращает поток, состоящий из результатов применения данной функции к элементам этого потока.
                // replaceAll - Заменяет каждую подстроку этой строки, которая соответствует данному регулярному выражению, на данную замену.
                // Регулярное выражение [^A-Za-z] меняем все кроме от А до z
                .map(word -> word.replaceAll("[^A-Za-z]+",""))
               /** слова длиной 1 и больше букв*/
                // filter - Возвращает поток, состоящий из элементов этого потока, которые соответствуют данному предикату
                .filter(word -> word.length() >= 1)
                /** собираем в Map<String, Integer> и считаем количество вхождений */
                // collect - Выполняет операцию мутационного восстановления элементов этого потока с помощью Коллектора.
                // toMap - сбирает Stream s в экземпляр Map
                .collect(Collectors.toMap(key -> key, val -> 1, Integer::sum))
                // Метод entrySet(), объявленный интерфейсом Map, возвращает Set, содержащий записи Map
                .entrySet().stream()
                /** возвращаем слова встречающиеся не реже чем 1 раза */
                .filter(entry -> entry.getValue() >= 1)
                // выводим при помощи forEach
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}