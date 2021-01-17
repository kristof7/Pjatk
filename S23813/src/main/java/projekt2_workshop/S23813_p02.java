package projekt2_workshop;

import java.util.Arrays;

public class S23813_p02 {
	public static void main(String[] args) {

		Workshop workshop=new Workshop();

		Wardrobe wardrobe=new Wardrobe();
		wardrobe.elements[0]=workshop.getBolts();
		wardrobe.elements[1]=workshop.getScrews();
		wardrobe.elements[2]=workshop.getNuts();
		wardrobe.elements[3]=workshop.getPads();


		for(int i=0; i < 4; i++) {
			for(int j=0; j < 3; j++) {
				if(i == 0)
					wardrobe.elements[i][j]=wardrobe.getBolts()[j];
				if(i == 1)
					wardrobe.elements[i][j]=wardrobe.getScrews()[j];
				if(i == 2)
					wardrobe.elements[i][j]=wardrobe.getNuts()[j];
				if(i == 3) {
					wardrobe.elements[i][j]=wardrobe.getPads()[j];
				}
			}
		}
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 3; j++) {
				System.out.println(wardrobe.elements[i][j]);
			}
		}
	}
}

class Wardrobe extends Workshop {

	Element[][] elements=new Element[4][3];

}

class Workshop {

	Bolt[] bolts=new Bolt[3];
	Screw[] screws=new Screw[3];
	Nut[] nuts=new Nut[3];
	Pad[] pads=new Pad[3];

	Bolt bolt1=new Bolt("DIN912", "steel", 8.8, "acid-resistant");
	Bolt bolt2=new Bolt("DIN7380", "steel", 10.9, "acid-resistant");
	Bolt bolt3=new Bolt("DIN933", "brass", 5.6, "galvanized");
	Screw screw1=new Screw("DIN963", "aluminium", 5.8, "galvanized");
	Screw screw2=new Screw("DIN84", "brass", 5.8, "unsecured");
	Screw screw3=new Screw("DIN965A", "steel", 8.8, "unsecured");
	Nut nut1=new Nut("DIN934", "brass", 5.6, "unsecured");
	Nut nut2=new Nut("DIN985", "steel", 5.8, "galvanized");
	Nut nut3=new Nut("DIN1587", "steel", 5.6, "galvanized");
	Pad pad=new Pad("DIN9021", "steel", 5.6, "galvanized");


	public Bolt[] getBolts() {
		this.bolts[0]=bolt1;
		this.bolts[1]=bolt2;
		this.bolts[2]=bolt3;
		return bolts;
	}

	public Screw[] getScrews() {
		this.screws[0]=screw1;
		this.screws[1]=screw2;
		this.screws[2]=screw3;
		return screws;
	}

	public Nut[] getNuts() {
		this.nuts[0]=nut1;
		this.nuts[1]=nut2;
		this.nuts[2]=nut3;
		return nuts;
	}

	public Pad[] getPads() {
		this.pads[0]=pad;
		return pads;
	}

	@Override
	public String toString() {
		return "Workshop{" +
				"bolts=" + Arrays.toString(bolts) +
				", bolt1=" + bolt1.toString() +
				", bolt2=" + bolt2.toString() +
				", bolt3=" + bolt3.toString() +
				'}';
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

class Bolt extends Element {

	public Bolt(String nazwa, String material, Double materialClass, String corrosionProtection) {
		super(nazwa, material, materialClass, corrosionProtection);
	}


	@Override
	public String toString() {
		return "Bolt{" +
				"nazwa='" + nazwa + '\'' +
				", material='" + material + '\'' +
				", materialClass=" + materialClass +
				", corrosionProtection='" + corrosionProtection + '\'' +
				'}';
	}
}

class Screw extends Element {

	public Screw(String nazwa, String material, Double materialClass, String corrosionProtection) {
		super(nazwa, material, materialClass, corrosionProtection);
	}

	@Override
	public String toString() {
		return "Screw{" +
				"nazwa='" + nazwa + '\'' +
				", material='" + material + '\'' +
				", materialClass=" + materialClass +
				", corrosionProtection='" + corrosionProtection + '\'' +
				'}';
	}
}

class Nut extends Element {

	public Nut(String nazwa, String material, Double materialClass, String corrosionProtection) {
		super(nazwa, material, materialClass, corrosionProtection);
	}

	@Override
	public String toString() {
		return "Nut{" +
				"nazwa='" + nazwa + '\'' +
				", material='" + material + '\'' +
				", materialClass=" + materialClass +
				", corrosionProtection='" + corrosionProtection + '\'' +
				'}';
	}
}

class Pad extends Element {

	public Pad(String nazwa, String material, Double materialClass, String corrosionProtection) {
		super(nazwa, material, materialClass, corrosionProtection);
	}

	@Override
	public String toString() {
		return "Pad{" +
				"nazwa='" + nazwa + '\'' +
				", material='" + material + '\'' +
				", materialClass=" + materialClass +
				", corrosionProtection='" + corrosionProtection + '\'' +
				'}';
	}
}