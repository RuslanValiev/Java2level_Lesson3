package practicalTask3;

import java.util.*;

/**
 * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи.
 * С помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class Phonebook {
    Map<String, ArrayList<Integer>> map = new HashMap<>();
    ArrayList<Integer> listValue;


    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Ivanov", 234);
        phonebook.add("Ivanov", 235);
        phonebook.add("Ivanov", 236);
        phonebook.add("Ivanov", 237);
        phonebook.add("Ivanov", 239);
        phonebook.add("Sidorov", 789);
        phonebook.add("Ivanov", 785);
        phonebook.add("Petrov", 456);


        System.out.println(phonebook.map);

        System.out.println();

        phonebook.get("Sidorov");
        phonebook.get("Ivanov");
        phonebook.get("Petrov");
    }

    void add(String s, Integer integer) {

        if (map.containsKey(s)) {
            ArrayList<Integer> temp = map.get(s);
            temp.add(integer);
            map.put(s, temp);
        } else {
            listValue = new ArrayList<>();
            listValue.add(integer);
            map.put(s, listValue);
        }
        System.out.println(listValue);
    }

    void get(String s) {
        System.out.println(s + "'s numbers - " + map.get(s));
    }
}
