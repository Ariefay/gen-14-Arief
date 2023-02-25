package BidangDatar.Coba;

public class Lingkaran {
	double jariJari;
	final double phi = 3.14;

	public Lingkaran() {
	}

	public Lingkaran(double jariJari) {
		super();
		this.jariJari = jariJari;

	}

	public double getJariJari() {
		return jariJari;
	}

	public void setJariJari(double jariJari) throws Exception {
		if (jariJari > 0) {
			this.jariJari = jariJari;
		} else {
			throw new Exception("Nilai Jari-Jari tidak boleh kurang dari 0");
		}
	}

	// Menghitung Keliling Lingkaran
	public double kelilingLingkaran(double jariJari) {
		double hasil;
		hasil = (int) (2 * this.phi * jariJari);
		return hasil;
	}

	// Menghitung Luas Lingkaran
	public double luasLingkaran(double jariJari) {
		double hasil;
		hasil = (double) (this.phi * (jariJari * jariJari));
		return hasil;
	}
}
