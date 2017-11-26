package interfaces;

public class BackwardsString extends SpecialString implements TextFunkifier {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String text) {
		String backwards = "";
		for (int i = text.length(); i > 0; i--) {
			backwards += text.substring(i - 1, i);
		}
		return backwards;
	}

}
