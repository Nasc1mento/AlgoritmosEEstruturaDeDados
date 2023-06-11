package tree.trie;

public class TrieTree<T> {

    private NodeTT<T> root;

    public TrieTree() {
        this.root = new NodeTT<>();
    }

    public void insert(String word) {
        TTLinkedList currentChildren = root.getChildren();
        char[] wordArray = word.toCharArray();

        for (int i = 0; i < wordArray.length; i++) {
            NodeTT currentNode = currentChildren.get(wordArray[i]);
            if (currentNode != null) {
                currentNode = currentChildren.get(wordArray[i]);
            } else {
                currentNode = new NodeTT();
                currentChildren.put(wordArray[i], currentNode);
            }
            currentChildren = currentNode.getChildren();
            if (i == wordArray.length - 1) {
                currentNode.setEndOfWord(true);
            }
        }
    }

    public boolean search(String word) {
        TTLinkedList currentChildren = root.getChildren();

        for (Character c : word.toCharArray()) {
            NodeTT currentNode = currentChildren.get(c);
            if (currentNode != null) {
                currentChildren = currentNode.getChildren();
            } else {
                return false;
            }
        }
        return true;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        print(root, new String(), sb);
        return sb.toString();
    }

    private void print(NodeTT node, String word, StringBuilder sb) {
//        if (node.isEndOfWord())
            sb.append(word).append("\n");
        TTLinkedList children = node.getChildren();
        NodeLL<NodeTT> currentNode = children.getHead();
        while (currentNode != null) {
            print(currentNode.getValue(), word + currentNode.getValue().getKey(), sb);
            currentNode = currentNode.getNext();
        }
    }
}

