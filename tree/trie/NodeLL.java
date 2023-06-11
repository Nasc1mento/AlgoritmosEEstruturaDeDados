package tree.trie;

public class NodeLL <T> {

    private NodeLL<T> next;
    private T value;

    public NodeLL(T value) {
        this.value = value;
        this.next = null;
    }


    public NodeLL<T> getNext() {
        return next;
    }

    public void setNext(NodeLL<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }
}
