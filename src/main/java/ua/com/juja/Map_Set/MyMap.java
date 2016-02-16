package ua.com.juja.Map_Set;

import java.util.*;

/**
 * Created by serzh on 2/16/16.
 */
public class MyMap<K, V> extends AbstractMap<K, V> {
    private Set<Entry<K, V>> entries = new HashSet<>();

    private class EntryImpl<K, V> implements Entry<K, V> {


        private V value;
        private K key;

        public EntryImpl(K key, V value) {

            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            EntryImpl<?, ?> entry = (EntryImpl<?, ?>) o;

            if (value != null ? !value.equals(entry.value) : entry.value != null) return false;
            return key != null ? key.equals(entry.key) : entry.key == null;

        }

        @Override
        public int hashCode() {
            int result = value != null ? value.hashCode() : 0;
            result = 31 * result + (key != null ? key.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return "{" + key + "=" + value + '}';
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return entries;
//        return entries.add(K key, V value);
    }

    @Override
    public V put(K key, V value) {
        EntryImpl<K, V> newEntry = new EntryImpl<K, V>(key, value);
        V oldValue = null;
        for (Map.Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                oldValue = entry.getValue();
            }
        }
        entries.add(newEntry);
        return oldValue;
    }

//    @Override
//    public V remove(Object key) {
//        V remove = super.remove(key);
//        EntryImpl<K, V> newEntry = new EntryImpl<K, V>((K) key, remove);
//        entries.remove(newEntry);
//        return remove;
//    }
}
