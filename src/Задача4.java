import java.util.Scanner;

public class Задача4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number A");
		int A = sc.nextInt();
		System.out.println("Enter number B");
		int B = sc.nextInt();

		if (A > B) {
			System.out.println(B + ", " + A);
		} else {
			System.out.println(A + ", " + B);
		}

	}

}
