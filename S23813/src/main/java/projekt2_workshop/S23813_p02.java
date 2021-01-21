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
		System.out.println("Wardrobe with elements:\n");
		wardrobe.showElements();
		System.out.println("\nSearched elements depend of the given parameter:\n");
		System.out.println(wardrobe.findElement("DIN9"));
		System.out.println(wardrobe.findElement("DIN9", "brass"));
		System.out.println(wardrobe.findElement("DIN9", "brass", 5.6));
		System.out.println(wardrobe.findElement("DIN9", "brass", 5.6, "galvanized"));
	}
}

class Wardrobe extends Workshop {

	Element[][] elements=new Element[4][3];


	public void showElements() {
		for(int i=0; i < 4; i++) {
			for(int j=0; j < 3; j++) {
				System.out.println(elements[i][j]);
			}
		}
	}

	public Element findElement(String name) {
		if(name != null) {
			for(int i=0; i < 4; i++) {
				for(int j=0; j < 3; j++) {
					if(elements[i][j] != null)
						if(elements[i][j].name.contains(name)) {
							return elements[i][j];
						}
				}
			}
		}
		return findElement(name, null);
	}

	public Element findElement(String name, String material) {
		if(name != null) {
			for(int i=0; i < 4; i++) {
				for(int j=0; j < 3; j++) {
					if(elements[i][j] != null)
						if(elements[i][j].material.contains(material)) {
							return elements[i][j];
						}
				}
			}
		}
		return findElement(name, null, null);
	}

	public Element findElement(String name, String material, Double materialClass) {
		if(name != null) {
			for(int i=0; i < 4; i++) {
				for(int j=0; j < 3; j++) {
					if(elements[i][j] != null)
						if(elements[i][j].materialClass.equals(materialClass)) {
							return elements[i][j];
						}
				}
			}
		}
		return findElement(name, null, null, null);
	}

	public Element findElement(String name, String material, Double materialClass, String corrosionProtection) {
		if(name != null) {
			for(int i=0; i < 4; i++) {
				for(int j=0; j < 3; j++) {
					if(elements[i][j] != null)
						if(elements[i][j].corrosionProtection.startsWith(corrosionProtection)) {
							return elements[i][j];
						}
				}
			}
		}
		return null;
	}
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
	String name;
	String material;
	Double materialClass;
	String corrosionProtection;

	public Element(String name, String material, Double materialClass, String corrosionProtection) {
		this.name=name;
		this.material=material;
		this.materialClass=materialClass;
		this.corrosionProtection=corrosionProtection;
	}
}

class Bolt extends Element {

	public Bolt(String name, String material, Double materialClass, String corrosionProtection) {
		super(name, material, materialClass, corrosionProtection);
	}


	@Override
	public String toString() {
		return "Bolt{" +
				"name='" + name + '\'' +
				", material='" + material + '\'' +
				", materialClass=" + materialClass +
				", corrosionProtection='" + corrosionProtection + '\'' +
				'}';
	}
}

class Screw extends Element {

	public Screw(String name, String material, Double materialClass, String corrosionProtection) {
		super(name, material, materialClass, corrosionProtection);
	}

	@Override
	public String toString() {
		return "Screw{" +
				"name='" + name + '\'' +
				", material='" + material + '\'' +
				", materialClass=" + materialClass +
				", corrosionProtection='" + corrosionProtection + '\'' +
				'}';
	}
}

class Nut extends Element {

	public Nut(String name, String material, Double materialClass, String corrosionProtection) {
		super(name, material, materialClass, corrosionProtection);
	}

	@Override
	public String toString() {
		return "Nut{" +
				"name='" + name + '\'' +
				", material='" + material + '\'' +
				", materialClass=" + materialClass +
				", corrosionProtection='" + corrosionProtection + '\'' +
				'}';
	}
}

class Pad extends Element {

	public Pad(String name, String material, Double materialClass, String corrosionProtection) {
		super(name, material, materialClass, corrosionProtection);
	}

	@Override
	public String toString() {
		return "Pad{" +
				"name='" + name + '\'' +
				", material='" + material + '\'' +
				", materialClass=" + materialClass +
				", corrosionProtection='" + corrosionProtection + '\'' +
				'}';
	}
}