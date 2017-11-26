package interfaces;

public class MixedCapsString extends SpecialString implements TextFunkifier {

	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String text) {
		String mixedCaps = "";
		int count = 0;
		for (char c : text.toCharArray()) {
			count++;
			if (count % 2 == 0) {
				mixedCaps += String.valueOf(c).toUpperCase();
			} else {
				mixedCaps += String.valueOf(c).toLowerCase();
			}
		}
		return mixedCaps;
	}

}
