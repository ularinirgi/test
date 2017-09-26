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
			result = "K�ige rohkem on suure t�hega t�hte";
		} else if (up == low) {
			result = "M�lemad on v�rdsed";
		} else {
			result = "K�ige rohkem on v�ikse t�hega t�hte";
		}

		return result;
	}

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

	public boolean assertBothValues(int num, String numString) {
		String translated = translateNumberToWord(num);
		System.out.println(translated);
		boolean comparison = translated.equals(numString);
		return comparison;

	}
//	3. Sisendiks json( ja s�ne), v�ljundiks s�ne(valida m�ne atribuudi v��rtus.
	private String jsonString(String[] args) {
		JSONObject strattr = new JSONObject();
		strattr.put("refridgerator", "food");
		System.out.println(strattr);
		return "";
		
	}
}