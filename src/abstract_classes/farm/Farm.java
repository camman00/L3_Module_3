package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	private ArrayList<Animal> animals = new ArrayList<Animal>();

	public static void main(String[] args) {
		Farm farm = new Farm();
	}

	private class Cow extends Animal {

		@Override
		public void makeNoise() {
			s("Moooooooooo");
		}

		@Override
		public void hurtMe() {
			s("OW");

		}

	}

	private class Chicken extends Animal {

		@Override
		public void makeNoise() {
			s("bork ok bok bokbokbokbokbokbokobkobkobkobkobkokbokbok");

		}

		@Override
		public void hurtMe() {
			s("bok");

		}

	}

	private class Eli extends Animal {

		@Override
		public void makeNoise() {
			s("CHILL!");

		}

		@Override
		public void hurtMe() {
			s("chill bro");
		}

	}

	private class WildDante extends Animal {

		@Override
		public void makeNoise() {
			s("OWOWOWOWOOWW");

		}

		@Override
		public void hurtMe() {
			s("Mooooooo im a dante");

		}

	}

	public Farm() {
		animals.add(new Cow());
		animals.add(new Chicken());
		animals.add(new Eli());
		animals.add(new WildDante());
		for (Animal a : animals) {
			s(a.toString());
			a.makeNoise();
			a.hurtMe();
		}
	}

	public void s(String s) {
		System.out.println(s);
	}

}
