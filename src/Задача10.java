
public class Задача10 {

	public static void main(String[] args) {

		int kofa1 = 2;
		int kofa2 = 3;

		int cisterna = 204;

		int broiKofi = cisterna / 5;

		if ((cisterna % 5) == 1) {
			System.out.println((broiKofi - 1) + "po 2 litra");
			System.out.println((broiKofi - 1) + "po 3 litra");
			System.out.println("dopalnitelno 2 kofi ot 3 litra");
		} else {
			System.out.println(broiKofi + "po 2 litra");
			System.out.println(broiKofi + "po 3 litra");
		}

		if ((cisterna % 5) == 2) {
			System.out.println("dopalnitelno 1 kofa ot 2 litra");
		}
		if ((cisterna % 5) == 3) {
			System.out.println("dopalnitelno 1 kofa ot 3 litra");
		}
		if ((cisterna % 5) == 4) {
			System.out.println("dopalnitelno 2 kofi ot 2 litra");

		}
	}

}
