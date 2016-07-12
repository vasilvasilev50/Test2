
public class Задача12 {

	public static void main(String[] args) {

		int day = 29;
		int month = 2;
		int year = 1996;

		if ((day < 1) || (day > 31)) {
			System.out.println("nqma takava data");
		} else {

			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:

				if (day == 31) {
					day = 0;
					month = ++month;

				}
				System.out.println(++day + ", " + month + "," + year);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (day > 30) {
					System.out.println("nqma takava data");
				} else {
					if (day == 30) {
						day = 0;
						month = ++month;
					}
				}
				System.out.println(++day + ", " + month + "," + year);
				break;
			case 12:
				if (day == 31) {
					day = 0;
					month = 1;
					year = ++year;
				}
				System.out.println(++day + ", " + month + "," + year);
				break;
			case 2:
				if (day > 29) {
					System.out.println("nqma takava data");
				} else {
					if ((year % 4 == 0) ^ ((year % 100 == 0) ^ (year % 400 == 0))) {
						if (day == 29) {
							day = 0;
							month = ++month;
						}
						System.out.println(++day + ", " + month + "," + year);
					} else {
						if (day > 28) {
							System.out.println("nqma takava data");
						} else {
							if (day == 28) {
								day = 0;
								month = ++month;
							}
							System.out.println(++day + ", " + month + "," + year);
						}
					}
				}

				break;

			default:
				System.out.println("Nqma takyv mesec");
			}

		}

		// "sigurno ima i po prost nachin ???????"

	}

}
