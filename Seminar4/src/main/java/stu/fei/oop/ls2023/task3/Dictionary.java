package stu.fei.oop.ls2023.task3;

import java.util.*;

public class Dictionary implements Map<String, String> {

    ArrayList<String> keyList;
    ArrayList<String> valueList;
    Scanner scanner;

    public Dictionary() {
        this.scanner = new Scanner(System.in);
        this.keyList = new ArrayList<>();
        this.valueList = new ArrayList<>();
        this.put("yes", "áno");
        this.put("no", "nie");
        this.put("object oriented programming", "objektovo orientované programovanie");

    }

    public ArrayList<String> getKeyList() {
        return keyList;
    }

    public ArrayList<String> getValueList() {
        return valueList;
    }

    @Override
    public int size() {
        return this.keyList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.keyList.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.keyList.contains((String) key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.valueList.contains((String) value);
    }

    @Override
    public String get(Object key) {
        if (this.keyList.contains((String) key)) {
            return this.valueList.get(this.keyList.indexOf((String) key));
        } else {
            throw new IllegalArgumentException("Key does not exist");
        }
    }

    @Override
    public String put(String key, String value) {
        if (!this.keyList.contains(key)) {
            this.keyList.add(key);
            this.valueList.add(this.keyList.indexOf(key), value);
        } else {
            throw new IllegalArgumentException("Key already exists");
        }
        return value;
    }

    @Override
    public String remove(Object key) {
        if (this.keyList.contains((String) key)) {
            this.valueList.remove((String) key);
            this.keyList.remove((String) key);
        } else {
            throw new IllegalArgumentException("Key does not exist");
        }
        return (String) key;
    }

    @Override
    public void putAll(Map<? extends String, ? extends String> m) {

    }


    @Override
    public void clear() {
        this.keyList.clear();
        this.valueList.clear();
    }

    @Override
    public Set<String> keySet() {
        return null;
    }

    @Override
    public Collection<String> values() {
        return null;
    }

    @Override
    public Set<Entry<String, String>> entrySet() {
        return null;
    }

    public void addWord() {
        System.out.println("Enter english word: ");
        String key = scanner.nextLine();
        System.out.println("Enter slovak translation: ");
        String value = scanner.nextLine();
        try {
            this.put(key, value);
            System.out.println("Word added to dictionary!");
        } catch (Exception e) {
            System.out.println("Word already exists in dictionary!");
        }
    }

    public void readWord() {
        System.out.println("Enter english word: ");
        String key = scanner.nextLine();
        try {
            System.out.println("Slovak translation: " + this.get(key));
        } catch (Exception e) {
            System.out.println("Word does not exist in dictionary!");
        }
    }

    public void removeWord() {
        System.out.println("Enter english word: ");
        String key = scanner.nextLine();
        try {
            this.remove(key);
            System.out.println("Word removed from dictionary!");
        } catch (Exception e) {
            System.out.println("Word does not exist in dictionary!");
        }
    }

    public void printDictionary() {
        for (int i = 0; i < this.keyList.size(); i++) {
            System.out.println(this.keyList.get(i) + " - " + this.valueList.get(i));
        }
    }

    public void printKeys() {
        for (int i = 0; i < this.keyList.size(); i++) {
            System.out.println(this.keyList.get(i));
        }
    }

    public void findSubstring(String substring) {
        for (int i = 0; i < this.keyList.size(); i++) {
            if (this.keyList.get(i).contains(substring) ||
                    this.valueList.get(i).contains(substring)) {
                System.out.println(this.keyList.get(i) + " - " + this.valueList.get(i));
            }
        }
    }
}
