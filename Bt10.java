import java.util.Scanner;


public class Bt10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int so;
		do {
			System.out.print("nhap so nguyen");
			so = sc.nextInt();
			sum += so;
		}while( so % 4 != 0);
		System.out.print(sum);
		}
		
	}