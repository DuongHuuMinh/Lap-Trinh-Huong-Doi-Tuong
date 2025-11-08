import java.util.Scanner;
public class Bt1 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("nhap a");
		a = sc.nextInt();
		System.out.print("nhap b");
		b = sc.nextInt();
		if(a>b)
			System.out.print(a);
		else
			System.out.print(b);
	}

}
