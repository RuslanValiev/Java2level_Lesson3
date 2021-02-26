package practicalTask3;


import java.util.*;

/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать сколько раз встречается каждое слово.
 */

public class ArrayToSet {
    public static void main(String[] args) {

        String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "2", "3", "3"};
        System.out.println("Создал массив с набором слов (10-20 слов, должны встречаться повторяющиеся) \n" + Arrays.toString(arr));

        HashSet<String> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        System.out.println("Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем) \n " + hashSet);

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int n = hashMap.get(arr[i]);
                hashMap.put(arr[i], n + 1);
            } else hashMap.put(arr[i], 1);
        }

        System.out.println("Считаем сколько раз встречается каждое слово.");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {

            System.out.println("Строка " + " \"" + entry.getKey() +"\"" + " встречается " + entry.getValue() + " раз");

        }
    }
}
