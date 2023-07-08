package graph;

import java.util.Objects;

public class Vertex<T> {
	
	private T label;
	
	public Vertex(T label) {
		this.label = label;
	}
	
	public T getLabel() {
		return this.label;
	}
	
	public void setLabel(T label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "Vertex [label=" + label + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(label);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex<T> other = (Vertex<T>) obj;
		return Objects.equals(label, other.label);
	}
	
	
}
