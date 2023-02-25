package Matric;

public class soalD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					System.out.print(2*i-1 + " ");
				} else if (i + j == n + 1) {
					System.out.print(2*j-1 + " ");

				}

				else {
					System.out.print(" " + " ");

				}
			}
			System.out.println("");
		}
	}

}
