public interface MyBinarySearchTree <K, T> implements Comparable<K>, T> {
    T find(K key);
    void insert (K key, T data);
    void delete (K key);
}
