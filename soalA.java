package Matric;

import java.util.*;

public class soalA {

	public static void main(String[] args) {

		try (Scanner Input = new Scanner(System.in)) {
			{
				System.out.println("Silahkan masukan nilai N:");
				System.out.print("N=");
				int n = Input.nextInt();

				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {

						System.out.print(" * ");
					}
					System.out.println(" ");
				}

			}
		}

	}

}