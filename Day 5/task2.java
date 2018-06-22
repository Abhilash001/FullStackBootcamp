import java.io.*;
import java.util.*;
public class task2 {

	public static void main(String[] args) throws IOException {
		String s = "In this one we think we've reached the main verb when we get to raced but instead we are inside a reduced relative clause Reduced relative clauses let us say the speech given this morning instead of the speech that was given this morning Or inn this case the horse raced past the barn instead of the horse that was raced past the barn";
		String words[] = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String string : words)
			map.put(string, 0);
		for (String string : words) 
			map.put(string, map.get(string)+1);
		System.out.println(map);
	}
}