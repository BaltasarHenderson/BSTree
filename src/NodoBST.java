public class NodoBST <K extends Comparable, T> {
    private K key;
    private T data;
    private NodoBST <K, T> leftChild;
    private NodoBST <K, T> rightChild;

    public NodoBST(K key, T data, NodoBST<K, T> leftChild, NodoBST<K, T> rightChild) {
        this.key = key;
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoBST<K, T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(NodoBST<K, T> leftChild) {
        this.leftChild = leftChild;
    }

    public NodoBST<K, T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(NodoBST<K, T> rightChild) {
        this.rightChild = rightChild;
    }
}
