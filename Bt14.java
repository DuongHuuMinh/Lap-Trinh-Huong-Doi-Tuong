import java.util.Scanner;
public class Bt14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0,t = 1, n;
		System.out.print("nhap n");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			t=t*i;
			if(i%2!=0) s=s+t;
		}
		System.out.print("kq " + s);
	}
}
