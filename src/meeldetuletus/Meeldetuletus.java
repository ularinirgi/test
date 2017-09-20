package meeldetuletus;

import java.util.HashMap;

public class Meeldetuletus {
	public static void main(String[] args) {
		Meeldetuletus app = new Meeldetuletus();
		// System.out.println(app.translateNumberToWord(9));
		// System.out.println(app.hasUpperBeg("Marko"));
		// System.out.println(app.compareBigSmall("uhuhiHASIDHishdIU"));
		System.out.println(app.assertBothValues(6, null));
	}

	// 1 Sisendiks sõne , väljundiks tõeväärtus +
	// Teha kindlaks, kas sõna algab suure tähega +
	// Teha kindlaks, kas suuri tähti on rohkem kui väikseid +
	// 2 Sisendiks sõne ja number, väljundiks tõeväärtus
	// Otsustada, kas etteantud sõna “tõlgitult” on sama, mis teine parameetril
	// (number)
	// isNumberSameStringNumber("kolm", 3) -> true
	// isNumberSameStringNumber("kolm", 1) -> false
	private boolean hasUpperBeg(String str) {
		char firstChar = str.charAt(0);
		return Character.isUpperCase(firstChar);
	}

	private String compareBigSmall(String str) {
		int up = 0;
		int low = 0;
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			// System.out.println(c + " - " + Character.isUpperCase(c));
			if (Character.isUpperCase(c)) {
				up++;
			} else {
				low++;
			}
		}

		if (up > low) {
			result = "Kõige rohkem on suure tähega tähte";
		} else if (up == low) {
			result = "Mõlemad on võrdsed";
		} else {
			result = "Kõige rohkem on väikse tähega tähte";
		}

		return result;
	}

	// translateNumberToWord(2) -> "kaks"
	public String translateNumberToWord(int num) {
		HashMap<Integer, String> numbers = new HashMap<>();
		numbers.put(0, "null");
		numbers.put(1, "üks");
		numbers.put(2, "kaks");
		numbers.put(3, "kolm");
		numbers.put(4, "neli");
		numbers.put(5, "viis");
		numbers.put(6, "kuus");
		numbers.put(7, "seitse");
		numbers.put(8, "kaheksa");
		numbers.put(9, "üheksa");

		String output = numbers.get(num);
		return output;
	}

	// isSameNumberValues(4, "neli") -> true
	// isSameNumberValues(5, "neli") -> false
	public boolean assertBothValues(int num, String numString) {
		String translated = translateNumberToWord(num);
	System.out.println(translated);
	boolean comparison = translated.equals(numString);
		return comparison;

	}

}