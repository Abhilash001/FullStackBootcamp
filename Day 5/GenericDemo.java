import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
		
		List<String> data = new ArrayList<>();
		data.add("jon snow");
		data.add("ned stark");
		System.out.println(data.get(0).toUpperCase());
	}
}