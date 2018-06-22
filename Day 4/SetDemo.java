import java.util.*;
public class SetDemo 
{
	public static void main(String[] args) 
	{
		Set set = new HashSet();
		set.add("Hello");
		set.add("Hello");
		set.add(123);
		System.out.println(set);
	}
}