package Tugas3;

import java.util.Scanner;

public class Soal6 {
	
	
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in)) {
			int jmla = 0;
			int jmli = 0;
			int jmlu = 0;
			int jmle = 0;
			int jmlo = 0;
			
			System.out.print("Tuliskan sebuah kalimat:");
			String kalimat = "";
			
			kalimat = sc.nextLine();
			for (int i = 0; i <kalimat.length(); i++) {
				if (kalimat.charAt(i)=='a' || kalimat.charAt(i)=='A') {
					jmla++;
				} else if (kalimat.charAt(i)=='i'|| kalimat.charAt(i)=='I') {
					jmli++;
				} else if (kalimat.charAt(i)=='u' || kalimat.charAt(i)=='U') {
					jmlu++;
				} else if (kalimat.charAt(i)== 'e'|| kalimat.charAt(i)== 'E') {
					jmle++;
				} else if (kalimat.charAt(i)== 'o' || kalimat.charAt(i)== 'O') {
					jmlo++;
				}
			}
			
			System.out.println("Ada sebanyak a :" +jmla);
			System.out.println("Ada sebanyak i :" +jmli);
			System.out.println("Ada sebanyak u :" +jmlu);
			System.out.println("Ada sebanyak e :" +jmle);
			System.out.println("Ada sebanyak o :" +jmlo);
		}
		
	}

}
