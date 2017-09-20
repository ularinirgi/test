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

	// 1 Sisendiks s�ne , v�ljundiks t�ev��rtus +
	// Teha kindlaks, kas s�na algab suure t�hega +
	// Teha kindlaks, kas suuri t�hti on rohkem kui v�ikseid +
	// 2 Sisendiks s�ne ja number, v�ljundiks t�ev��rtus
	// Otsustada, kas etteantud s�na �t�lgitult� on sama, mis teine parameetril
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
			result = "K�ige rohkem on suure t�hega t�hte";
		} else if (up == low) {
			result = "M�lemad on v�rdsed";
		} else {
			result = "K�ige rohkem on v�ikse t�hega t�hte";
		}

		return result;
	}

	// translateNumberToWord(2) -> "kaks"
	public String translateNumberToWord(int num) {
		HashMap<Integer, String> numbers = new HashMap<>();
		numbers.put(0, "null");
		numbers.put(1, "�ks");
		numbers.put(2, "kaks");
		numbers.put(3, "kolm");
		numbers.put(4, "neli");
		numbers.put(5, "viis");
		numbers.put(6, "kuus");
		numbers.put(7, "seitse");
		numbers.put(8, "kaheksa");
		numbers.put(9, "�heksa");

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