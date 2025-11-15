import java.util.Scanner;
public class Bt13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0, n;
		System.out.print("nhap n");
		n = sc.nextInt();
		for(int i = 0; i<=n; i=i+2){
			s=s+i;
		}
		System.out.print("kq " + s);
	}

}