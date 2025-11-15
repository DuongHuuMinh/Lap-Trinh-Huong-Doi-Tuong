import java.util.Scanner;
public class Bt6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("nhap a");
		a = sc.nextInt();
		System.out.print("nhap b");
		b = sc.nextInt();
		System.out.print("nhap c");
		c = sc.nextInt();
		if(a>b&&a>c){
			System.out.println("So lon nhat la " + a);
		}
		else if(b>c){
			System.out.println("So lon nhat la " + b);
		}
		else
			System.out.println("So lon nhat la " + c);
	}

}
