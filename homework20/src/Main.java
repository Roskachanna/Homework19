import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        //task1(list);
        //task2(list);
        List<String> words = new ArrayList<>(List.of("земля", "вода", "воздух", "вода", "ветер"));
        task4(words);

    }
    public static void task1(List<Integer> list) {
        for (Integer integer : list) {
            if (integer % 2 == 1) {
                System.out.print(integer + ", ");
            }
        }
    }
    public static void task2(List<Integer> list) {
        Collections.sort(list);
        Set<Integer> alreadyPrintedNumbers = new HashSet<>();
        for (Integer integer : list) {
            if(!alreadyPrintedNumbers.contains(integer)) {
                if (integer % 2 == 0) {
                    System.out.print(integer + ", ");
                    alreadyPrintedNumbers.add(integer);
                }
            }
        }
    }
    public static void task3(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }
    public static void task4(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println("Слово " + key + "встречаеться " + map.get(key) + "раз.");
        }
    }
}