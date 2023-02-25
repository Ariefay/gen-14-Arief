package BidangDatar.Coba;

public class Persegi {

	public Persegi() {
		super();
	}

	public double sisiD;

	public double getSisiD() {
		return sisiD;
	}

	public void setSisiD(double sisiD) throws Exception {
		if (sisiD > 0) {
			this.sisiD = sisiD;
		} else {
			throw new Exception("Nilai sisi persegi tidak boleh kurang dari 0");
		}
	}

	// Menghitung Keliling Persegi
	public double kelilingPersegi(double sisiD) {
		double hasil;
		hasil = 4 * sisiD;
		return hasil;
	}

	// Menghitung Luas Persegi
	public double luasPersegi(double sisiD) {
		double hasil;
		hasil = sisiD * sisiD;
		return hasil;
	}
}
