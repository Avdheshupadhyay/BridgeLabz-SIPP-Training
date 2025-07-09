import java.util.*;

class Entry<K, V> {
    K key;
    V value;
    Entry<K, V> next;
    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class CustomHashMap<K, V> {
    private int size = 16;
    private Entry<K, V>[] table;

    public CustomHashMap() {
        table = new Entry[size];
    }

    private int hash(K key) {
        return (key == null) ? 0 : Math.abs(key.hashCode() % size);
    }

    public void put(K key, V value) {
        int idx = hash(key);
        Entry<K, V> head = table[idx];
        while (head != null) {
            if (Objects.equals(head.key, key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = table[idx];
        table[idx] = newEntry;
    }

    public V get(K key) {
        int idx = hash(key);
        Entry<K, V> head = table[idx];
        while (head != null) {
            if (Objects.equals(head.key, key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        int idx = hash(key);
        Entry<K, V> head = table[idx];
        Entry<K, V> prev = null;
        while (head != null) {
            if (Objects.equals(head.key, key)) {
                if (prev == null) table[idx] = head.next;
                else prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println("Value for 'two': " + map.get("two"));
        map.remove("two");
        System.out.println("Value for 'two' after removal: " + map.get("two"));
    }
}
