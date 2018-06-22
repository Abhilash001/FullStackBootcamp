import java.util.*;

public class PQDemo {
	public static void main(String[] args) {
		
		PriorityQueue<String> pr = new PriorityQueue<>();
		pr.add("World");
		pr.add("Hello");
		pr.forEach(System.out::println);
	}
}
