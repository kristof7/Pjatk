package zadanie_9;

public class S23813_zestaw9 {

	public static void main(String[] args) {
		S23813_zestaw9 s23813_zestaw9=new S23813_zestaw9();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw9.cwiczenie_01();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw9.cwiczenie_02();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw9.cwiczenie_03();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw9.cwiczenie_04();
		System.out.println("\n------------------------------------------------");
		s23813_zestaw9.cwiczenie_05();

	}

	public void cwiczenie_01() {
		System.out.println("Cwiczenie_01\n");
		MethodCurrier methodCurrier=new MethodCurrier();

		int intValue=1;
		float floatValue=1f;
		char charValue=1;
		byte byteValue=1;

		methodCurrier.setValue(intValue);
		methodCurrier.setValue(floatValue);
		methodCurrier.setValue(charValue);
		methodCurrier.setValue(byteValue);

	}

	public void cwiczenie_02() {
		System.out.println("Cwiczenie_02\n");

		int intValue=1;
		float floatValue=1f;
		char charValue=1;
		byte byteValue=1;

		MethodCurrier2 methodCurrier2=new MethodCurrier2();

		methodCurrier2.setValue(intValue);
		methodCurrier2.setValue(floatValue);
		methodCurrier2.setValue(charValue);
		methodCurrier2.setValue(byteValue);

	}

	public void cwiczenie_03() {
		System.out.println("Cwiczenie_03\n");

		Osoba osoba=new Osoba();

		osoba.setImie("Genon");
		osoba.setNazwisko("Stivens");
		osoba.setRokUrodzenia(1111);

		System.out.println(osoba.getImie());
		System.out.println(osoba.getNazwisko());
		System.out.println(osoba.getRokUrodzenia());

	}

	public void cwiczenie_04() {
		System.out.println("Cwiczenie_04\n");

		Osoba o = new Osoba("Steve", "NoJobs", 2222);
		System.out.println(o.show());
	}

	public void cwiczenie_05() {
		System.out.println("Cwiczenie_05\n");

		Clpx clpx=new Clpx(4, 3);
		clpx.add(clpx);
		System.out.println("liczby:");
		System.out.println(clpx.add(clpx));
		System.out.println(clpx.sub(clpx));
		System.out.println(clpx.mul(clpx));
		System.out.println("Liczba zespolona: " + clpx.show(clpx));
		clpx.inc(clpx);
		System.out.println("");
		System.out.println("liczby zwiększone o 1:");
		System.out.println(clpx.add(clpx));
		System.out.println(clpx.sub(clpx));
		System.out.println(clpx.mul(clpx));
		System.out.println("Liczba zespolona: " + clpx.show(clpx));
		clpx.inc(clpx);
		System.out.println("");
		System.out.println("liczby zwiększone ponownie o 1:");
		System.out.println(clpx.add(clpx));
		System.out.println(clpx.sub(clpx));
		System.out.println(clpx.mul(clpx));
		System.out.println("Liczba zespolona: " + clpx.show(clpx));

	}
}

class MethodCurrier {

	void setValue(int value) {
		System.out.println("wartość podanej zmiennej wynosi " + value + " i jest typu int");
	}

	void setValue(float value) {
		System.out.println("wartość podanej zmiennej wynosi " + value + " i jest typu float");
	}
}

class MethodCurrier2 {

	void setValue(int value) {
		System.out.println("wartość zmiennej: " + value + " i jest typu int");
		Number n=new Number();
		n.setValue(value);
		n.showValue();
	}

	void setValue(float value) {
		System.out.println("wartość zmiennej: " + value + " i jest typu float");
		Number n=new Number();
		n.setValue((int) value);
		n.showValue();
	}

	void setValue(Number value) {
		System.out.println("wartość zmiennej: " + value);
	}
	// zmienne zostały zmienione z wartości 1 do wartości 7
}

class Number {

	int intValue=7;

	void setValue(int value) {
		value=intValue;
	}

	void showValue() {
		System.out.println("wartość zmodyfikowanej zmiennej: " + intValue);
	}

}

class Osoba {

	String imie;
	String nazwisko;
	int rokUrodzenia;

	public Osoba(String imie, String nazwisko, int rokUrodzenia) {
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.rokUrodzenia=rokUrodzenia;
	}

	public Osoba() {

	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie=imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko=nazwisko;
	}

	public int getRokUrodzenia() {
		return rokUrodzenia;
	}

	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia=rokUrodzenia;
	}

	public String show() {
		return "Osoba{" +
				"imie='" + imie + '\'' +
				", nazwisko='" + nazwisko + '\'' +
				", rokUrodzenia=" + rokUrodzenia +
				'}';
	}
}

class Clpx {

	private double val1;
	private double val2;

	public Clpx(double val1, double val2) {
		this.val1=val1;
		this.val2=val2;
	}

	public double add(Clpx clpx) {
		double result=clpx.val1 + clpx.val2;
		return result;
	}

	public double sub(Clpx clpx) {
		double result=clpx.val1 - clpx.val2;
		return result;
	}

	public double mul(Clpx clpx) {
		double result=clpx.val1 * clpx.val2;
		return result;
	}

	public void inc(Clpx clpx) {
		clpx.val1+=1;
		clpx.val2+=1;
	}

	public double show(Clpx clpx) {
		double result=4 + 5 * (clpx.val1);
		return result;
	}

}

