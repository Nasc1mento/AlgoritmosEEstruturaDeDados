package tree.trie;

public class Main {
	public static void main(String[] args) {
        TrieTree<String> trie = new TrieTree<>();
        trie.insert("teclado");
        trie.insert("caju");
        trie.insert("socket");
        trie.insert("tecla");
        trie.insert("alma");
        trie.insert("sagui");

        System.out.println(trie.search("teclado"));
        System.out.println(trie.search("caju"));
        System.out.println(trie.search("agua"));
        System.out.println(trie.search("socket"));
        System.out.println(trie.search("tecla"));
        System.out.println(trie.search("ta"));
        System.out.println(trie.search("aguaa"));
        System.out.println("----");
        System.out.println(trie.print());



    }
}
