package zadanie_10;

public class S23813_zestaw10 {
	public static void main(String[] args) {
		S23813_zestaw10 s23813_zestaw10=new S23813_zestaw10();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw10.cwiczenie_01();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw10.cwiczenie_02();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw10.cwiczenie_03();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw10.cwiczenie_04();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw10.cwiczenie_05();

	}

	public void cwiczenie_01() {
		System.out.println("Cwiczenie_01\n");

		new Kwadrat(3);
		new Kwadrat(3).show();

	}

	public void cwiczenie_02() {
		System.out.println("Cwiczenie_02\n");

		new Walec(3, 4);
		new Walec(3, 4).show();

	}

	public void cwiczenie_03() {
		System.out.println("Cwiczenie_03\n");

	}

	public void cwiczenie_04() {
		System.out.println("Cwiczenie_04\n");

	}

	public void cwiczenie_05() {
		System.out.println("Cwiczenie_05\n");

	}

}

class Kwadrat {

	private int bok;

	public Kwadrat(int bok) {
		this.bok=bok;
	}

	public void show() {
		int polePowierzchniKwadratu=this.bok * this.bok;
		int obietoscKwadratu=this.bok * this.bok * this.bok;
		System.out.println("Pole powierzchni kwadratu: " + polePowierzchniKwadratu);
		System.out.println("Objętość kwadratu: " + obietoscKwadratu);
	}
}

class Walec {

	private int promien;
	private int wysokosc;

	public Walec(int promien, int wysokosc) {
		this.promien=promien;
		this.wysokosc=wysokosc;
	}

	public void show() {
		double polePowierzchniPodstawy=(Math.PI * (this.promien * this.promien));
		double obietoscWalca=(Math.PI * (this.promien * this.promien * this.wysokosc));
		System.out.println("Pole powierzchni podstawy walca: " + polePowierzchniPodstawy);
		System.out.println("Objętość walca: " + obietoscWalca);
	}
}
