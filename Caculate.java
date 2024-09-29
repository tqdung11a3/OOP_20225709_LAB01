import java.util.Scanner;

public class Caculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble(), num2 = sc.nextDouble();
		if (num2 == 0) {
			System.out.printf("%.2f\n", num1 + num2);
			System.out.printf("%.2f\n", num1 - num2);
			System.out.printf("%.2f\n", num1 + num2);
			System.out.println("Khong the thuc hien phep chia");
		}
		else {
			System.out.printf("%.2f\n", num1 + num2);
			System.out.printf("%.2f\n", num1 - num2);
			System.out.printf("%.2f\n", num1 + num2);
			System.out.printf("%.2f\n", num1/ num2);
		}
	}
}
