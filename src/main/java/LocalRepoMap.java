package src.main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class LocalRepoMap {

    private static final HashMap<String, String> map = new HashMap<>();

    public static void addToPhoneBook(String name, String phoneNumber) {
        map.put(name, phoneNumber);
    }

    public static void editPhoneBook(String name, String phoneNumber) {
        if (map.containsKey(name)) {
            map.put(name, phoneNumber);
        }
        addToPhoneBook(name, phoneNumber);
    }

    public static void deletePhoneBook(String name) {map.remove(name);}

    public static void findByName(String name) {System.out.println(map.get(name));
    }

    public static void show() {
        Map<String, String> swapped = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        System.out.println(swapped);
    }

    public static void findByPhoneNumber(String phoneNumber) {
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> pair : entrySet) {
            if (phoneNumber.equals(pair.getValue())) {
                System.out.println(pair.getKey());
            }
        }
    }
}