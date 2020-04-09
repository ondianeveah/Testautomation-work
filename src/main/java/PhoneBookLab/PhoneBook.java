package PhoneBookLab;

import java.util.*;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> map;

    public PhoneBook(Map<String, List<String>> map) {
        this.map = map;
    }

    public PhoneBook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        List<String> addList = new ArrayList<>();
        addList.add(phoneNumber);
        map.put(name, addList);
    }

    public void addAll(String name, String... phoneNumbers) {
        map.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        map.remove(name);
    }

    public Boolean hasEntry(String name) {
        return map.containsKey(name);
    }

    public List<String> lookup(String name) {
        return map.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        String output = "";
        for (Map.Entry<String, List<String>> key : map.entrySet()){
            if(key.getValue().contains(phoneNumber)){
                output+=key.getKey();
            }
        }

        return output;
    }

    public List<String> getAllContactNames() {
         List<String> getList = new ArrayList<>();
         for(Map.Entry<String, List<String>> key : map.entrySet()){
             getList.add(key.getKey());
         }
        return null;
    }

    public Map<String, List<String>> getMap() {
        map.entrySet();
        return null;
    }
}
