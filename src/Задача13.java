
public class Задача13 {

	public static void main(String[] args) {

		int degreeCelsius = 26;

		// Входни данни: цяло число от интервала [-100..100].

		if (degreeCelsius < -20) {
			System.out.println("ledeno studeno");
		}
		if ((degreeCelsius > -20) && (degreeCelsius < 0)) {
			System.out.println("studeno");
		}
		if ((degreeCelsius > 0) && (degreeCelsius < 15)) {
			System.out.println("hladno");
		}
		if ((degreeCelsius > 15) && (degreeCelsius < 25)) {
			System.out.println("toplo");
		}
		if (degreeCelsius > 25) {
			System.out.println("goreshto");
		}

	}

}
