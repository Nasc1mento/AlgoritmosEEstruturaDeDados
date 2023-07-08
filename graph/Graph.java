package graph;

public class Graph <T>{
	
	private Map<Vertex<T>, Vertex<T>> adjVertices;
	
	public Graph() {
		this.adjVertices = new Map<>();
	}
	
	public void addVertex(T label) {
		this.adjVertices.put(new Vertex<T>(label), new Vertex<T>(label));
	}
	
	public void removeVertex(T label) {
		Vertex<T> v = new Vertex<T>(label);
		this.adjVertices.remove(new Vertex<T>(label));
		
	}
	
	public void addEdge(T label1, T label2) {
		Vertex<T> vertex1 = new Vertex<>(label1);
		Vertex<T> vertex2 = new Vertex<>(label2);	
		this.adjVertices.get(vertex1).addLast(vertex2);
	}
	
	public void removeEdge(T label1, T label2) {
		Vertex<T> vertex1 = new Vertex<>(label1);
		Vertex<T> vertex2 = new Vertex<>(label2);	
		LinkedList<Vertex<T>> edgeV1 = adjVertices.get(vertex1);
	    LinkedList<Vertex<T>> edgeV2 = adjVertices.get(vertex2);
	    if (edgeV1 != null) {
	    	edgeV1.remove(vertex2);
	    }
	        
	    if (edgeV2 != null) {
	    	edgeV2.remove(vertex1);
	    }
	        
	}
	
	public Map<Vertex<T>, Vertex<T>> getAdjVertices() {
		return this.adjVertices;
	}

	public static void main(String[] args) {
	 	Graph graph = new Graph();
	    graph.addVertex("Bob");
	    graph.addVertex("Alice");
	    graph.addVertex("Mark");
	    graph.addVertex("Rob");
	    graph.addVertex("Maria");
	    graph.addEdge("Bob", "Alice");
	    graph.addEdge("Bob", "Rob");
	    graph.addEdge("Alice", "Mark");
	    graph.addEdge("Rob", "Mark");
	    graph.addEdge("Alice", "Maria");
	    graph.addEdge("Rob", "Maria");
	    
	    Vertex<String> v =  (Vertex<String>) graph.getAdjVertices().get(new Vertex<String>("Bob")).getTail().getValue();
	    System.out.println(v.getLabel());
	}
}
