
public class Задача14 {

	public static void main(String[] args) {

		byte x1 = 2;
		byte y1 = 2;
		byte x2 = 3;
		byte y2 = 2;

		if (((x1 + y1) % 2) == ((x2 + y2) % 2)) {
			System.out.println("Позициите са с различен цвят");
		} else {
			System.out.println("Позициите са с еднакъв цвят");
		}

	}

}
