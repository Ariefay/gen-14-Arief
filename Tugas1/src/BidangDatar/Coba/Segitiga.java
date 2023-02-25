package BidangDatar.Coba;

/*
 * 
 * */

public class Segitiga {
	public double alas, tinggi, sisiA, sisiB, sisiC;

	public Segitiga() {
	}

	public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiA = sisiA;
		this.sisiB = sisiB;
		this.sisiC = sisiC;
	}

	public double getAlas() {
		return alas;
	}

	public void setAlas(double alas) throws Exception {
		if (alas > 0) {
			this.alas = alas;
		} else {
			throw new Exception("Nilai tinggi tidak boleh kurang dari 0");
		}
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) throws Exception {
		if (tinggi > 0) {
			this.tinggi = tinggi;
		} else {
			throw new Exception("Nilai tinggi tidak boleh kurang dari 0");
		}
	}

	public double getSisiA() {
		return sisiA;
	}

	public void setSisiA(double sisiA) throws Exception {
		if (sisiA > 0) {
			this.sisiA = sisiA;
		} else {
			throw new Exception("Nilai sisi A tidak boleh kurang dari 0");
		}
	}

	public double getSisiB() {
		return sisiB;
	}

	public void setSisiB(double sisiB) throws Exception {
		if (sisiB > 0) {
			this.sisiB = sisiB;
		} else {
			throw new Exception("Nilai sisi B tidak boleh kurang dari 0");
		}
	}

	public double getSisiC() {
		return sisiC;
	}

	public void setSisiC(double sisiC) throws Exception {
		if (sisiC > 0) {
			this.sisiC = sisiC;
		} else {
			throw new Exception("Nilai sisi C tidak boleh kurang dari 0");
		}
	}

	// Menghitung Keliling Segitiga
	public double kelilingSegitiga(double sisiA, double sisiB, double sisiC) {
		double hasil;
		hasil = sisiA + sisiB + sisiC;
		return hasil;
	}

	// Menghitung Luas Segitiga
	public double luasSegitiga(double alas, double tinggi) {
		double hasil;
		hasil = alas * tinggi * 0.5;
		return hasil;
	}
}
