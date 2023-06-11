package tree.trie;

public class NodeTT<T> {
    private TTLinkedList children;
    private char key;
    private boolean isEndOfWord;

    public NodeTT() {
        this.children = new TTLinkedList();
    }

    public TTLinkedList getChildren() {
        return this.children;
    }

    public void setEndOfWord(boolean isEndOfWord) {
        this.isEndOfWord = isEndOfWord;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }
    public char getKey() {
        return key;
    }
    public void setKey(char key) {
        this.key = key;
    }
}
