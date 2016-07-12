import java.util.Scanner;

public class Задача15 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("vavedete kragal chas");
		byte x = sc.nextByte();
		
		if ((x>=18) || (x<4)) {
			System.out.println("Dobar vecher");
		}
		if ((x>=4)&&(x<9)) {
			System.out.println("Dobro utro");
		}
		if ((x>=9)&&(x<18)) {
			System.out.println("Dobar den");
		}
		
	}

}
