class Person
{
	String fname, lname;
	private int age;
	public Person(String fname, String lname, int age)
	{
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person{" + 
			  "fname='" + fname + '\'' + 
			  ", lname='" + lname + '\'' + 
			  ", age='" + age + '}';
	}
    @Override
	public boolean equals(Object ob)
	{
    	Person ob1=(Person)(ob);
		return (this.fname==ob1.fname);
	}

}

class PersonTest {
	public static void main(String args[])
	{
		Person p1 = new Person("Jon", "Snow", 20);
		System.out.println(p1.toString());
		Person p2 = new Person("Jon", "Stark", 30);
		System.out.println(p1.equals(p2));
	}
	
}
