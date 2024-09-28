import java.util.Scanner;

public class SumMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so hang, so cot cua ma tran 2 chieu: ");
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] c = new int[n][m];
		
		System.out.println("Cac phan tu cua mang 1: ");
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Cac phan tu cua mang 2: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				b[i][j] = sc.nextInt();
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("Tong la: ");
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
