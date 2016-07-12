import java.util.Scanner;

public class Задача2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numberA:");
		int numberA = sc.nextInt();
		System.out.println("Enter numberrB:");
		int numberB = sc.nextInt();

		System.out.println("A+B=" + (numberA + numberB));
		System.out.println("A-B=" + (numberA - numberB));
		System.out.println("A*B=" + (numberA * numberB));
		System.out.println("A%B=" + (numberA % numberB));
		System.out.println("A/B=" + (numberA / numberB));

	}

}
