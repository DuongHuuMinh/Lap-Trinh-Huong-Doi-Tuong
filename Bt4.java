import java.util.Scanner;
public class Bt4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 1, n;
		System.out.print("nhap n");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			s=s*i;
		}
		System.out.print("kq " + s);
	}

}
