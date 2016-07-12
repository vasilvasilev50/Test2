import java.util.Scanner;

public class Задача9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int product = a * b;

		System.out.println(product);

		int lastDigit = product % 10;

		System.out.println(lastDigit);

		if (lastDigit % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
