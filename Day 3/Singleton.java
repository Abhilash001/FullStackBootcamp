
class Singleton {
	private static Singleton ob;
	private Singleton(){}
	
	public static Singleton getInstance()
	{	
		if(ob==null) ob = new Singleton();
		return ob;
	}

}

class SingletonTest
{
	public static void main(String[] args) {
		Singleton ob1 = Singleton.getInstance();
		System.out.println("Hashcode = "+ob1.hashCode());
		Singleton ob2 = Singleton.getInstance();
		System.out.println("Hashcode = "+ob2.hashCode());
	}
}
