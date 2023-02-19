package BidangDatar.Coba;

import java.util.Scanner;

public class BidangDatar {
	
	public static void main(String[] args) {

		String[] BidangDatar = { "Segitiga", "Persegi", "Lingkaran", "Belah Ketupat" };
		Segitiga s = new Segitiga();
		Persegi p = new Persegi();
		Lingkaran l = new Lingkaran();
		BelahKetupat b = new BelahKetupat();

		try (Scanner masuk = new Scanner(System.in)) {
			{

				System.out.println("Selamat Datang di Bidang Datar");
				System.out.println("");

				System.out.println("Bidang Datar Segitiga");
				System.out.print("Masukan Nilai Alas Segitiga=");
				try {
					s.alas = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("Masukan Nilai Tinggi Segitiga=");
				try {
					s.tinggi = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("Masukan Nilai Sisi Segitiga A=");
				try {
					s.sisiA = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("Masukan Nilai Sisi Segitia B=");
				try {
					s.sisiB = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("Masukan Nilai Sisi Segitiga C=");
				try {
					s.sisiC = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("");
				System.out.println("Bidang Datar Persegi");
				System.out.print("Masukan Nilai Sisi Persegi=");
				try {
					p.sisiD = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("");
				System.out.println("Bidang Datar Lingkaran");
				System.out.print("Masukan Nilai Jari-Jari Lingkaran=");
				try {
					l.jariJari = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("");
				System.out.println("Bidang Datar Belah Ketupat");
				System.out.print("Masukan Nilai Sisi Diagonal Belah Ketupat=");
				try {
					b.sisidiagonal = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("Masukan Nilai Diagonal 1=");
				try {
					b.diagonal1 = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.print("Masukan Nilai Diagonal 2=");
				try {
					b.diagonal2 = masuk.nextDouble();
				} catch (Exception e) {
					e.printStackTrace();
				}

				System.out.println("");
				System.out.println("-Hasil Perhitungan Keliling-");
				double kelilingBangunDatar[] = new double[4];
				kelilingBangunDatar[0] = s.kelilingSegitiga(s.getSisiA(), s.getSisiB(), s.getSisiC());
				kelilingBangunDatar[1] = p.kelilingPersegi(p.getSisiD());
				kelilingBangunDatar[2] = l.kelilingLingkaran(l.getJariJari());
				kelilingBangunDatar[3] = b.kelilingBelahKetupat(b.getSisidiagonal());
				for (int i = 0; i < kelilingBangunDatar.length; i++) {
					System.out.println("Keliling " + BidangDatar[i] + " : " + kelilingBangunDatar[i]);
				}

				System.out.println("");
				System.out.println("-Hasil Perhitungan Luas-");
				double luasBangunDatar[] = new double[4];
				luasBangunDatar[0] = s.luasSegitiga(s.getAlas(), s.getTinggi());
				luasBangunDatar[1] = p.luasPersegi(p.getSisiD());
				luasBangunDatar[2] = l.luasLingkaran(l.getJariJari());
				luasBangunDatar[3] = b.luasBelahKetupat(b.getDiagonal1(), b.getDiagonal2());
				for (int i = 0; i < luasBangunDatar.length; i++) {
					System.out.println("Luas " + BidangDatar[i] + " : " + luasBangunDatar[i]);
				}
			}
		}
	}
}
