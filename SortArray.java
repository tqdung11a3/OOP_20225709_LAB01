import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu trong mang: ");
		int n = sc.nextInt();
		ArrayList<Double> arr = new ArrayList<>();
		System.out.println("Nhap cac phan tu trong mang");
		for (int i = 0; i<n; i++) {
			double value = sc.nextDouble();
			arr.add(value);
		}
		
		Collections.sort(arr);
		
		System.out.println("Mang sau khi sap xep: ");
		
		for (double x : arr) {
			System.out.printf("%.1f ", x);
		}
		
		System.out.println();
		
		double sum = 0;
		
		for (double x : arr) {
			sum += x;
		}
		
		System.out.printf("Tong la %.2f\n", sum);
		
		double avg = sum / arr.size();
		System.out.printf("Trung binh la %.2f\n", avg);
	}
}
