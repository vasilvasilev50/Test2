import java.util.Scanner;

public class Задача1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter A:");
		double numberA = sc.nextDouble();
		System.out.println("Enter B:");
		double numberB = sc.nextDouble();
		System.out.println("Enter C:");
		double numberC = sc.nextDouble();
		
		if (((numberC > numberA) && (numberC < numberB)) || ((numberC < numberA) && (numberC > numberB))) {
			System.out.println("Number " + numberC + " is between " + numberA + " and " + numberB);
			
		} else 
			System.out.println("Number " + numberC + " is not between " + numberA + " i " + numberB);
		}
	}


