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

		new Prostokat(4, 4).show();
		new Prostopadloscian(4, 4, 5).show();
		new Trojkat(5, 3).show();
		new Ostroslup(3, 3, 4).show();
		new Graniastoslup(4, 3, 3, 3, 3, 3, 3, 3).show();

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

class Prostokat {

	private double bok1;
	private double bok2;

	public Prostokat(double bok1, double bok2) {
		this.bok1=bok1;
		this.bok2=bok2;
	}

	public void show() {
		double polePowierzchni=bok1 * bok2;
		System.out.println("Pole powierzchni prostokątu: " + polePowierzchni);
	}

	public double getBok1() {
		return bok1;
	}

	public double getBok2() {
		return bok2;
	}
}

class Prostopadloscian extends Prostokat {

	private double wysokosc;

	public Prostopadloscian(double bok1, double bok2, double wysokosc) {
		super(bok1, bok2);
		this.wysokosc=wysokosc;
	}

	public void show() {
		double polePowierzchni=2 * (this.wysokosc * super.getBok1()) + 2 * (this.wysokosc * super.getBok2()) + 2 * (super.getBok1() * super.getBok2());
		System.out.println("Pole powierzchni prostopadloscianu: " + polePowierzchni);
	}
}

class Trojkat {

	private double wysokosc;
	private double bok1;
	private double bok2;
	private double podstawa;

	public Trojkat(double wysokosc, double podstawa) {
		this.wysokosc=wysokosc;
		this.podstawa=podstawa;
	}

	public Trojkat(double wysokosc, double bok1, double bok2, double podstawa) {
		this.wysokosc=wysokosc;
		this.bok1=bok1;
		this.bok2=bok2;
		this.podstawa=podstawa;
	}

	public void show() {
		double polePowierzchni=(wysokosc * podstawa) / 2;
		System.out.println("Pole powierzchni trójkąta: " + polePowierzchni);
	}

	public double getPodstawa() {
		return podstawa;
	}
}

class Ostroslup extends Trojkat {

	private double wysokosc;

	public Ostroslup(double wysokosc, double podstawa, double wysokoscOstroslupa) {
		super(wysokosc, podstawa);
		this.wysokosc=wysokoscOstroslupa;
	}

	public void show() {
		double polePowierzchni=(super.getPodstawa() * super.getPodstawa()) * Math.sqrt(3);
		double objetosc=(polePowierzchni * this.wysokosc) / 3;
		System.out.println("Pole powierzchni ostroslupa: " + polePowierzchni);
		System.out.println("Objetosc ostroslupa: " + objetosc);
	}

}

class Graniastoslup extends Trojkat {

	private double wysokosc;
	private double bok1;
	private double bok2;
	private double bok3;
	private double bok1wysokoscTrojkota;
	private double bok2wysokoscTrojkota;
	private double bok3wysokoscTrojkota;

	public Graniastoslup(double wysokosc, double bok1, double bok2, double podstawa, double wysokosc1, double bok1wysokoscTrojkota, double bok2wysokoscTrojkota, double bok3wysokoscTrojkota) {
		super(wysokosc, bok1, bok2, podstawa);
		this.wysokosc=wysokosc1;
		this.bok1=bok1;
		this.bok2=bok2;
		this.bok3=podstawa;
		this.bok1wysokoscTrojkota=bok1wysokoscTrojkota;
		this.bok2wysokoscTrojkota=bok2wysokoscTrojkota;
		this.bok3wysokoscTrojkota=bok3wysokoscTrojkota;
	}

	public void show() {
		double polePowierzchni=2 * (super.getPodstawa() * super.getPodstawa()) * Math.sqrt(3) + (bok1 * bok1wysokoscTrojkota) + (bok2 * bok2wysokoscTrojkota) + (bok3 * bok3wysokoscTrojkota);
		double objetosc=(polePowierzchni * this.wysokosc);
		System.out.println("Pole powierzchni graniastosłupa: " + polePowierzchni);
		System.out.println("Objetosc graniastosłupa: " + objetosc);
	}
}