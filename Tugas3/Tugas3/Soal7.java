package Tugas3;

import java.util.Scanner;

public class Soal7 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] namaBarang = new String [4];
		int [] hargaBarang = new int [4];
		
		namaBarang [0] = "Oreo";
		namaBarang [1] = "Tanggo";
		namaBarang [2] = "Buavita";
		namaBarang [3] = "Aqua";
		
		hargaBarang [0] = 6000;
		hargaBarang [1] = 5000;
		hargaBarang [2] = 7000;
		hargaBarang [3] = 3000;
		
		System.out.println("Selamat datang ditoko online");
		System.out.println("Barang yang tersedia");
		System.out.println("1. Oreo    Rp 6.000,-");
		System.out.println("2. Tanggo  Rp 5.000,-");
		System.out.println("3. Buavita Rp 7.000,-");
		System.out.println("4. Aqua    Rp 3.000,-");
		System.out.println(" ");
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print("Berapa uang yang anda punya: ");
			int money = 0;
			
			money = sc.nextInt();

			int hargaMax = 0;
			int sisa = 0;
			String barangMax="";
			
			for (int i = 0; i<namaBarang.length;i++) {
				if (hargaBarang[i] <= money && hargaBarang[i] > hargaMax) {
					sisa = money - hargaBarang[i];
					hargaMax = hargaBarang [i];
					barangMax = namaBarang[i];

				}
			} 					
			System.out.println("Rekomendasikan untuk anda: " +barangMax);
			System.out.println("Uang kembalian anda: Rp" +sisa +",-");
		} 
				
		
	}

}