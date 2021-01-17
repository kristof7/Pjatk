package projekt2_workshop;

public class S23813_p02 {
	public static void main(String[] args) {

	}
}

class Element {
	String nazwa;
	String material;
	Double materialClass;
	String corrosionProtection;

	public Element(String nazwa, String material, Double materialClass, String corrosionProtection) {
		this.nazwa=nazwa;
		this.material=material;
		this.materialClass=materialClass;
		this.corrosionProtection=corrosionProtection;
	}
}

class Workshop {

	Bolt bolt1 = new Bolt("DIN912", "steel", 8.8, "acid-resistant");
	Bolt bolt2 = new Bolt("DIN7380", "steel", 10.9, "acid-resistant");
	Bolt bolt3 = new Bolt("DIN933", "brass", 5.6, "galvanized");
	Screw screw1 = new Screw("DIN963", "aluminium", 5.8, "galvanized");
	Screw screw2 = new Screw("DIN84", "brass", 5.8, "unsecured");
	Screw screw3 = new Screw("DIN965A", "steel", 8.8, "unsecured");
	Nut nut1 = new Nut("DIN934", "brass", 5.6, "unsecured");
	Nut nut2 = new Nut("DIN985", "steel", 5.8, "galvanized");
	Nut nut3 = new Nut("DIN1587", "steel", 5.6, "galvanized");
	Pad pad = new Pad("DIN9021", "steel", 5.6, "galvanized");

}

class Bolt extends Element {

	public Bolt(String nazwa, String material, Double materialClass, String corrosionProtection) {
		super(nazwa, material, materialClass, corrosionProtection);
	}
}

class Screw extends Element {

	public Screw(String nazwa, String material, Double materialClass, String corrosionProtection) {
		super(nazwa, material, materialClass, corrosionProtection);
	}
}

class Nut extends Element {

	public Nut(String nazwa, String material, Double materialClass, String corrosionProtection) {
		super(nazwa, material, materialClass, corrosionProtection);
	}
}

class Pad extends Element{

	public Pad(String nazwa, String material, Double materialClass, String corrosionProtection) {
		super(nazwa, material, materialClass, corrosionProtection);
	}
}