
public class Задача11 {

	public static void main(String[] args) {
		// x = treeDigitNumber
		int x = 488;

		if (((x % (x / 100)) == 0) && (x % ((x % 100) / 10) == 0) && (x % (x % 10) == 0)) {
			System.out.println(x + " e kratno na vsqka svoya cifra");
		} else {
			System.out.println(x + " ne e kratno na vsqka svoya cifra");
		}

	}

}
