import java.util.Scanner;

public class Задача5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number A");
		int A = sc.nextInt();
		System.out.println("Enter number B");
		int B = sc.nextInt();
		System.out.println("Enter number C");
		int C = sc.nextInt();

		if ((A >= B) && (B >= C)) {
			System.out.println(A + ", " + B + ", " + C);
		}
		if ((B >= A) && (A >= C)) {
			System.out.println(B + ", " + A + ", " + C);
		}
		if ((C >= A) && (A >= B)) {
			System.out.println(C + ", " + A + ", " + B);
		}
		if ((C >= B) && (B >= A)) {
			System.out.println(C + ", " + B + ", " + A);
		}
		if ((A >= C) && (C >= B)) {
			System.out.println(A + ", " + C + ", " + B);
		}
		if ((B >= C) && (C >= A)) {
			System.out.println(B + ", " + C + ", " + A);
		}

	}

}
