public class BinaerBaum <T extends Comparable <T>>{
    Node<T> root;

    public void hinzufuegen(T data){
        if (root == null){
            root = new Node<>(data);
        }
        else {
            insert(root, data);
        }
    }

    private void insert(Node<T> parent, T data){
        if (data.compareTo(parent.data) <= 0){
            if (parent.left == null) {
                parent.left = new Node<>(data);
            }
            else{
                insert(parent.left, data);
            }
        }
        else{
            if (parent.right == null){
                parent.right = new Node<>(data);
            }
            else{
                insert(parent.right, data);
            }
        }

    }



    public T finden(Comparable<T> value){
        return findRecursive(root, value);
    }

    private T findRecursive(Node<T> current, Comparable<T> value) {
        if (current == null) {
            return null;
        }

        if (value.compareTo(current.data) == 0) {
            return current.data;
        } else if (value.compareTo(current.data) < 0) {
            return findRecursive(current.left, value);
        } else {
            return findRecursive(current.right, value);
        }
    }



}
