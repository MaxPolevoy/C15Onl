package by.tms.myproject.lessons17.homework;

/**
 * Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
 * Пример: список {5, 2, 4, 2, 1}
 * Результирующая строка: "52421"
 */


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class IntegersOutputString {
    public static void main(String[] args) {

        List<String> strings = Stream.of(5, 2, 4, 2, 1)
                .map(String::valueOf)// собираем строки в список
                .toList();// собираем строки в список .collect(Collectors.toList());
        strings.forEach(System.out::print); // strings.forEach(num-> System.out.print(num));

//        List<String> strings = Stream.of(5,2,4,2,1)
//                .filter(num -> num>3) // фильтруем список
//                .map(String::valueOf)
//                .collect(Collectors.toList());
//        strings.forEach(System.out::println);

    }

}

