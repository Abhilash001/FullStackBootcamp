import java.util.*;

public class ListDemo
{
	public static void main(String args[])
	{
		List data = new ArrayList();
		data.add("Hello");
		data.add(007);
		data.add(6.9f);
		data.add(false);
		
		System.out.println(data);
		/*for(int i=0; i<data.size(); i++)
		{
			System.out.println(data.get(i));
		}*/
		for (Object item : data) {
			System.out.println(item);
		}
	}
}