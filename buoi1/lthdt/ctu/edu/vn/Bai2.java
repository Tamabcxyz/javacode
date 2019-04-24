package buoi1.lthdt.ctu.edu.vn;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
		int num1 = scanner.nextInt();
		System.out.println("Input 1 accepted");
		int num2 = scanner.nextInt();
		System.out.println("Input 2 accepted");
		} catch (Exception e) {
		System.out.println("Invalid Entry");
		}

	}

}