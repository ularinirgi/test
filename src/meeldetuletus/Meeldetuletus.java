package meeldetuletus;
import java.util.HashMap;
import org.json.simple.JSONObject;


public class Meeldetuletus {
	public static void main(String[] args) {
		Meeldetuletus app = new Meeldetuletus();
		// System.out.println(app.translateNumberToWord(9));
		// System.out.println(app.hasUpperBeg("Marko"));
		// System.out.println(app.compareBigSmall("uhuhiHASIDHishdIU"));
		System.out.println(app.assertBothValues(6, null));
		
		
	}

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

	public boolean assertBothValues(int num, String numString) {
		String translated = translateNumberToWord(num);
		System.out.println(translated);
		boolean comparison = translated.equals(numString);
		return comparison;

	}
//	3. Sisendiks json( ja sõne), väljundiks sõne(valida mõne atribuudi väärtus.
	private String jsonString(String[] args) {
		JSONObject strattr = new JSONObject();
		strattr.put("refridgerator", "food");
		System.out.println(strattr);
		return "";
		
	}
}