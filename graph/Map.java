package graph;

public class Map<K, V>{
	
	private LinkedList<Entry<K, LinkedList<V>>> buckets;
		
	public Map() {
		this.buckets = new LinkedList<>();
	}
		
	public LinkedList<V> put(K key, V value) {
		Node<Entry<K, LinkedList<V>>> temp = this.buckets.getHead();
		
		while (temp != null) {
			if (temp.getValue().getKey().equals(key)) {
				LinkedList<V> previousValue = temp.getValue().getValue();
				temp.getValue().getValue().addLast(value);
				return previousValue;
			}
			temp = temp.getNext();
		}
		
		Entry<K, LinkedList<V>> newEntry = new Entry<K, LinkedList<V>>(key, new LinkedList<V>());
		newEntry.getValue().addLast(value);
		this.buckets.addFirst(newEntry);
		return null;
	}
	
	public LinkedList<V> get(K key) {
		Node<Entry<K, LinkedList<V>>> temp = this.buckets.getHead();
		
		while (temp != null) {
			if (temp.getValue().getKey().equals(key))
				return temp.getValue().getValue();			
			temp = temp.getNext();
		}
		return null;
	}
	
	public LinkedList<V> remove(K key) {
		Node<Entry<K, LinkedList<V>>> temp = this.buckets.getHead();
		
		while (temp != null) {
			if (temp.getValue().getKey().equals(key)) {
				return temp.getValue().getValue();
			}
			temp = temp.getNext();
		}		
		return null;
		
	}
	
	public static void main(String[] args) {
		Map<String, Integer> map = new Map<>();
		map.put("a",1);
		map.put("a",2);
		map.put("b",200);
		System.out.println(map.get("a").getHead().getValue());
		System.out.println(map.get("a").getTail().getValue());	
		System.out.println(map.get("b").getTail().getValue());
	}
	
}
