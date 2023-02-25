package BidangDatar.Coba;

public class BelahKetupat {
	double sisidiagonal, diagonal1, diagonal2;

	public BelahKetupat() {
	}

	public BelahKetupat(double sisidiagonal, double diagonal1, double diagonal2) {
		super();
		this.sisidiagonal = sisidiagonal;
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}

	public double getSisidiagonal() {
		return sisidiagonal;
	}

	public void setSisidiagonal(double sisidiagonal) throws Exception {
		if (sisidiagonal > 0) {
			this.sisidiagonal = sisidiagonal;
		} else {
			throw new Exception("Nilai Sisi Diagonal tidak boleh kurang dari 0");
		}
	}

	public double getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(double diagonal1) throws Exception {
		if (diagonal1 > 0) {
			this.diagonal1 = diagonal1;
		} else {
			throw new Exception("Nilai Diagonal 1 tidak boleh kurang dari 0");
		}
	}

	public double getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(double diagonal2) throws Exception{
		if (diagonal2>0) {
		this.diagonal2 = diagonal2;}
		else {throw new Exception ("Nilai Diagonal 2 tidak boleh kurang dari 0");}
	}

	// Menghitung Keliling Belah Ketupat
	public double kelilingBelahKetupat(double sisidiagonal) {
		double hasil;
		hasil = 4 * sisidiagonal;
		return hasil;
	}

	// Menghitung Luas Belah Ketupat
	public double luasBelahKetupat(double diagonal1, double diagonal2) {
		double hasil;
		hasil = (diagonal1 * diagonal2) * 0.5;
		return hasil;
	}

}
