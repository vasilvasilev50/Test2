import java.util.Scanner;

public class Задача8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 4 digit number");
		int numberA = sc.nextInt();

		int numberB = ((numberA / 1000) * 10 + (numberA % 10));

		System.out.println(numberB);

		int numberC = (numberA % 1000 / 10);
		System.out.println(numberC);

		if (numberB < numberC) {
			System.out.println(numberB + "<" + numberC);
		} else {
			if (numberB == numberC) {
				System.out.println(numberB + "=" + numberC);
			} else {

				System.out.println(numberB + ">" + numberC);
			}
		}

	}

}
