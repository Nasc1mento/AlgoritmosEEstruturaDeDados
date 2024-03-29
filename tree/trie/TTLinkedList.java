package tree.trie;

public class TTLinkedList extends LinkedList<NodeTT> {


    public TTLinkedList() {
        super();
    }
    public NodeTT get(char key) {
        NodeLL<NodeTT> currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.getValue().getKey() == key)
                return currentNode.getValue();

            currentNode = currentNode.getNext();
        }
        return null;
    }

    public void put(char key, NodeTT node) {
        this.add(node);
        node.setKey(key);
    }
}

