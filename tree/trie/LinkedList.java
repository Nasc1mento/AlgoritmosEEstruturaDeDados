package tree.trie;

public class LinkedList <T>{

    protected NodeLL<T> head;
    private NodeLL<T> tail;

    public LinkedList() {
        this.head = this.tail = null;
    }

    public void add(T value) {
        NodeLL<T> newNode = new NodeLL<>(value);
        if (isEmpty()) {
            this.head = this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = tail.getNext();
        }
    }

    public NodeLL<T> getHead() {
        return this.head;
    }
    
    public boolean isEmpty() {
        return this.head == null;
    }
}
