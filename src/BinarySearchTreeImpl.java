public class BinarySearchTreeImpl<K extends Comparable<K>, T> implements MyBinarySearchTree<K, T> {

    NodoBST root = new NodoBST(null, null, null, null);

    NodoBST rootArbol = root;

    private NodoBST<K, T> findNode(K key, NodoBST<K, T> root) {
        NodoBST<K, T> resultado = this.root;

        // Traverse until root reaches to dead end
        while (resultado != null) {
            // pass right subtree as new tree
            if (key.compareTo(resultado.getKey()) > 0)
                resultado = resultado.getRightChild();

                // pass left subtree as new tree
            else if (key.compareTo(resultado.getKey()) < 0)
                resultado = resultado.getLeftChild();
            else
                return resultado; // if the key is found return 1
        }
        return null;
    }

    @Override
    public T find(K key) {
        return (T) findNode(key, root).getData();
    }

    @Override
    public void insert(K key, T data) {
        NodoBST<K, T> nodoActual = rootArbol;
        if (root.getKey() == null) { //aca va rootArbol
            NodoBST<K, T> nodoNuevo = new NodoBST<>(key, data, null, null);
            root = nodoNuevo;
            rootArbol=nodoNuevo;
            System.out.println("Insertado");
            return;
        } else {
            if (key.compareTo(nodoActual.getKey()) > 0) {
                //rootArbol = nodoActual;
                //nodoActual = nodoActual.getRightChild();
                if (nodoActual.getRightChild() == null) {
                    NodoBST<K, T> nodoNuevo = new NodoBST<K, T>(key, data, null, null);
                    nodoActual.setRightChild(nodoNuevo);
                    System.out.println("Insertado");
                    rootArbol = root;
                    return;
                } else {
                    rootArbol = nodoActual;
                    insert(key, data);
                }
            }

            // pass left subtree as new tree
            else if (key.compareTo(nodoActual.getKey()) < 0) {
                //rootArbol = nodoActual;
                //nodoActual = nodoActual.getLeftChild();
                if (nodoActual.getLeftChild() == null) {
                    NodoBST<K, T> nodoNuevo = new NodoBST<>(key, data, null, null);
                    nodoActual.setLeftChild(nodoNuevo);
                    System.out.println("Insertado");
                    rootArbol = root;
                    return;
                } else {
                    rootArbol = nodoActual;
                    insert(key, data);
                }
            }
        }
    }

    @Override
    public void delete(K key) {

    }

}
