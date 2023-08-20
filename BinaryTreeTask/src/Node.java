public class Node <T extends Comparable <T>>{
    public Node<T> left;
    public Node<T> right;
    public T data;

    public Node(T data){
        this.data = data;
    }
}
