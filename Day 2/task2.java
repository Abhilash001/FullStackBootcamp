
public class task2 {

	public static void main(String[] args) {
		String s="";
		for(int i=1; i<=100; i++)
		{
			s="";
			if(i%3==0) s+="Johnny";
			if(i%5==0) s+="Walker";
			System.out.println((s.length()==0)?i:s);
		}
	}

}
