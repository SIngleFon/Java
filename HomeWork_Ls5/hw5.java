package HomeWork_Ls5;

import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;

public class hw5 {
    // Дан текст. Нужно отсортировать слова по длине (по возрастанию) и вывести
    // статистику на экран.
    // * Регистр слова не имеет значения. Формат вывода произвольный.
    // * Программа-минимум:
    // * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно
    // слово из 8 символов.
    // * 2. Точки и запятые не должны входить в статистику.
    // *
    // * Доп. задание
    // * 1. * Не включать дефис в длину слова. Т.е. каких-то - одно слово из 7
    // символов.
    // *
    // * Пример:
    // *
    // * Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для
    // того, чтобы выполнить тестовое задание GB.
    // * Данный текст не несет в себе какого-либо смысла, он просто содержит набор
    // слов.
    // *
    static void printStats(String text) {
        String[] arr = text.replaceAll("\\.", "").toLowerCase().replaceAll("\\-", "").replaceAll("\\,", "").split(" ");
        Map<Integer, List<String>> stats = new HashMap<>();
        for (int i = 1; i < findLongestName(arr).length() + 1; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j].length() == i) & (!temp.contains(arr[j]))) {
                    temp.add(arr[j]);
                }
                stats.put(i, temp);
            }
        }
        for (Map.Entry<Integer, List<String>> entry : stats.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static String findLongestName(String[] names) {
        return Arrays.stream(names).max(Comparator.comparing(String::length)).get();
    }

    public static void main(String[] args) {
        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. "
                +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";

        printStats(text);
    }
}
