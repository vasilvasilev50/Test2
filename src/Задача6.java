import java.util.Scanner;

public class Задача6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number a1");
		int a1 = sc.nextInt();
		System.out.println("Enter number a2");
		int a2 = sc.nextInt();
		System.out.println("Enter number a3");
		int a3 = sc.nextInt();

		int x = a1;
		a1 = a2;
		a2 = a3;
		a3 = x;

		System.out.println("Novite stoinosti sa: " + "a1 = " +a1 + ",  a2 = " + a2 + ",  a3 = " + a3);

	}

}
