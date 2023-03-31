package queue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		System.out.println(queue);
		System.out.println(queue.peek());
		queue.dequeue();
		System.out.println(queue);
		System.out.println(queue.peek());
	}
}
