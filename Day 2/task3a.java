//import java.util.Scanner;

public class task3a {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int n = 4;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++) System.out.print(" ");
			for(int j=1; j<=i; j++) 	System.out.print("* ");
			System.out.println();
		}
		for(int i=1; i<n; i++)
		{
			for(int j=0; j<=i; j++)    System.out.print(" ");
			for(int j=1; j<=(n-i); j++) System.out.print("* ");
			System.out.println();
		}
	}

}
